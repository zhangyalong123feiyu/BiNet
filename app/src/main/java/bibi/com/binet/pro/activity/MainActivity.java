package bibi.com.binet.pro.activity;

import android.app.Activity;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Observable;

import bibi.com.binet.R;
import bibi.com.binet.pro.base.presenter.BasePresenter;
import bibi.com.binet.pro.util.SharedPresUtils;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity<P extends BasePresenter> extends BaseActivity {
    @BindView(R.id.bottomhome)
    RelativeLayout bottomhome;
    @BindView(R.id.bottommy)
    RelativeLayout bottommy;
    @BindView(R.id.bottommore)
    RelativeLayout bottommore;
    @BindView(R.id.fragementcontainer)
    RelativeLayout fragementcontainer;
    public static Fragment[] fragments;
    private FragmentHome fragementhome;
    private FragmentHomexx fragementhomex;
    private FragmentHomexx fragementhomexx;
    private FragmentMy fragementmy;
    private FragmentMore fragementmore;
    private Fragment fragmentCompany;
    private Fragment fragementOperation;
    private Fragment fragmentBank;
    public static RelativeLayout[] mTabs;
    private long mPressedTime = 0;
    private  int index;
    public static int currentTabIndex = 0;
    private boolean islogin = false;
    private String logintype;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setColor(this, Color.argb(255,127, 255, 212));
        ButterKnife.bind(this);
        initview();

    }
    public static void setColor(Activity activity, int color) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            // 设置状态栏透明
            activity.getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            // 生成一个状态栏大小的矩形
            View statusView = createStatusView(activity, color);
            // 添加 statusView 到布局中
            ViewGroup decorView = (ViewGroup) activity.getWindow().getDecorView();
            decorView.addView(statusView);
            // 设置根布局的参数
            ViewGroup rootView = (ViewGroup) ((ViewGroup) activity.findViewById(android.R.id.content)).getChildAt(0);
            rootView.setFitsSystemWindows(true);
            rootView.setClipToPadding(true);
        }
    }
    /** * 生成一个和状态栏大小相同的矩形条 * * @param activity 需要设置的activity * @param color 状态栏颜色值 * @return 状态栏矩形条 */
    private static View createStatusView(Activity activity, int color) {
        // 获得状态栏高度
        int resourceId = activity.getResources().getIdentifier("status_bar_height", "dimen", "android");
        int statusBarHeight = activity.getResources().getDimensionPixelSize(resourceId);

        // 绘制一个和状态栏一样高的矩形
        View statusView = new View(activity);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                statusBarHeight);
        statusView.setLayoutParams(params);
        statusView.setBackgroundColor(color);
        return statusView;
    }
    private void initview() {
        SharedPreferences sharedPreferences=getSharedPreferences("LoginType",MODE_PRIVATE);
        logintype = sharedPreferences.getString("longintype", "0");
        Log.i("TAG",logintype+"logintype-----------------------");
        fragementhome = new FragmentHome();
        fragementhomex = new FragmentHomexx();
        fragementhomexx = new FragmentHomexx();
        fragmentCompany = new FragmentCompany();
        fragementOperation=new FragmentOperation();
        fragmentBank=new FragmentBank();
        fragementmy = new FragmentMy();
        fragementmore = new FragmentMore();
        fragments = new Fragment[]{fragementhomex, fragementmy, fragementmore};
        mTabs = new RelativeLayout[3];
        mTabs[0] = (RelativeLayout) findViewById(R.id.bottomhome);
        mTabs[1] = (RelativeLayout) findViewById(R.id.bottommy);
        mTabs[2] = (RelativeLayout) findViewById(R.id.bottommore);
        // 把第一个tab设为选中状态
        mTabs[0].setSelected(true);
            switch (Integer.parseInt(logintype)) {
                case 0:
                    noLogin();
                    break;
                case 1:
                    companyLogin();
                    break;
                case 2:
                    bankLogin();
                    break;
                case 3:
                    operationLogin();
                    break;
                default:
                    break;
            }
        }

    public void bankLogin() {
        fragments = new Fragment[]{fragementhomex, fragmentBank, fragementmore};
        getSupportFragmentManager().beginTransaction().replace(R.id.fragementcontainer, fragementhomex).show(fragementhomex).
                add(R.id.fragementcontainer, fragmentBank).hide(fragmentBank).add(R.id.fragementcontainer, fragementmore).hide(fragementmore)
                .commit();
       // mTabs[1].setSelected(true);
    }

    public void operationLogin() {
        fragments = new Fragment[]{fragementhomex, fragementOperation, fragementmore};
        getSupportFragmentManager().beginTransaction().replace(R.id.fragementcontainer, fragementhomex).show(fragementhomex).
                add(R.id.fragementcontainer, fragementOperation).hide(fragementOperation).add(R.id.fragementcontainer, fragementmore).hide(fragementmore)
                .commit();

    }

    public void companyLogin() {
        fragments = new Fragment[]{fragementhomex, fragmentCompany, fragementmore};
        getSupportFragmentManager().beginTransaction().replace(R.id.fragementcontainer, fragementhomex).show(fragementhomex).
                add(R.id.fragementcontainer, fragmentCompany).hide(fragmentCompany).add(R.id.fragementcontainer, fragementmore).hide(fragementmore)
                .commit();
    }

    private void noLogin() {
        fragments = new Fragment[]{fragementhomex, fragementmy, fragementmore};
        getSupportFragmentManager().beginTransaction().replace(R.id.fragementcontainer, fragementhomex).show(fragementhomex).
                add(R.id.fragementcontainer, fragementmy).hide(fragementmy).add(R.id.fragementcontainer, fragementmore).hide(fragementmore)
                .commit();
    }


    @OnClick({R.id.bottomhome, R.id.bottommy, R.id.bottommore})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.bottomhome:
                index = 0;
                break;
            case R.id.bottommy:
                index = 1;
                break;
            case R.id.bottommore:
                index = 2;
                break;
        }
        if (currentTabIndex != index) {
            FragmentTransaction trx = getSupportFragmentManager().beginTransaction();
            trx.hide(fragments[currentTabIndex]);
            if (!fragments[index].isAdded()) {
                trx.add(R.id.fragementcontainer, fragments[index]);
            }
            trx.show(fragments[index]).commit();
        }
        mTabs[currentTabIndex].setSelected(false);
        // 把当前tab设为选中状态
        mTabs[index].setSelected(true);
        currentTabIndex = index;
    }

    //双击退出程序
    @Override
    public void onBackPressed() {
        long mNowTime = System.currentTimeMillis();//获取第一次按键时间
        if ((mNowTime - mPressedTime) > 2000) {//比较两次按键时间差
            Toast.makeText(this, "再按一次退出程序", Toast.LENGTH_SHORT).show();
            mPressedTime = mNowTime;
        } else {//退出程序
            this.finish();
            android.os.Process.killProcess(android.os.Process.myPid());
        }
    }

}
