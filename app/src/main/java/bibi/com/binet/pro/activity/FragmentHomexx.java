package bibi.com.binet.pro.activity;


import android.Manifest;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import bibi.com.binet.R;
import bibi.com.binet.pro.constants.Constants;
import bibi.com.binet.pro.constants.ProConstant;
import bibi.com.binet.pro.base.view.BaseFragement;
import bibi.com.binet.pro.builder.MyViewPager;
import bibi.com.binet.pro.presenter.HomePresenter;
import bibi.com.binet.pro.util.DensityUtil;
import bibi.com.binet.pro.util.SmsObserver;
import bibi.com.binet.pro.view.ViewAllShowLinearLayout;
import bibi.com.binet.pro.view.ViewAllShowLinearLayout.ViewSwitchListener;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentHomexx extends BaseFragement<HomePresenter> implements ViewPager.OnPageChangeListener {

    @BindView(R.id.title)
    TextView title;
    @BindView(R.id.viewpager)
    MyViewPager viewpager;
    @BindView(R.id.group_contain)
    LinearLayout groupContain;
    @BindView(R.id.search_edit)
    EditText searchEdit;
    @BindView(R.id.search_image)
    ImageView searchImage;
    @BindView(R.id.requestbook)
    TextView requestbook;
    @BindView(R.id.requestbooknumber)
    TextView requestbooknumber;
    @BindView(R.id.exaime)
    TextView exaime;
    @BindView(R.id.exaimenumber)
    TextView exaimenumber;
    @BindView(R.id.all)
    TextView all;
    @BindView(R.id.allmoney)
    TextView allmoney;
    @BindView(R.id.bottommore)
    RelativeLayout bottommore;
    @BindView(R.id.professonalmove)
    TextView professonalmove;
    @BindView(R.id.sucess)
    TextView sucess;
    @BindView(R.id.brand)
    TextView brand;
    @BindView(R.id.ll1)
    LinearLayout ll1;
    @BindView(R.id.vi)
    View vi;
    @BindView(R.id.main_container)
    RelativeLayout mainContainer;
    @BindView(R.id.scrollview)
    ScrollView scrollview;
    @BindView(R.id.view_all_show)
    ViewAllShowLinearLayout viewAllShow;
    @BindView(R.id.professonalmove_top)
    TextView professonalmoveTop;
    @BindView(R.id.sucess_top)
    TextView sucessTop;
    @BindView(R.id.brand_top)
    TextView brandTop;
    @BindView(R.id.ll2)
    LinearLayout ll2;
    @BindView(R.id.folatbutton)
    FloatingActionButton floatingActionButton;
    private View view;
    private Fragment[] fragments=new Fragment[3];
    private Fragmentpro fragementpro;
    private FragmentSucess fragmentSucess;
    private FragmentBrand fragementBrand;
    private TextView[] mTabs;
    private int index;
    private int currentTabIndex;
    private boolean isRunning;
    private int lastPosition;
    private TextView[] mTabsTop;

    @Override
    public HomePresenter bindPresenter() {
        return new HomePresenter(getContext());
    }

    public FragmentHomexx() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        haspermissons();
        view = inflater.inflate(R.layout.fragment_homexx, container, false);
        ButterKnife.bind(this, view);
        setListenter();
      //  StatusBarUtil.setColor(getActivity(),Color.argb(0,127, 255, 212));

        return view;
    }

    private void haspermissons() {
        if (ContextCompat.checkSelfPermission(getActivity(),Manifest.permission.READ_PHONE_STATE) == PackageManager.PERMISSION_GRANTED){

        }else {
            requestPermisson();
        }
    }

    private void requestPermisson() {
        ActivityCompat.requestPermissions(getActivity(),new String[]{Manifest.permission.READ_PHONE_STATE}, Constants.READPHONE_STATE);
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        switch (requestCode) {
        		case Constants.READPHONE_STATE:
        			if (grantResults[0]==PackageManager.PERMISSION_GRANTED){

                    }else {
                        ActivityCompat.shouldShowRequestPermissionRationale(getActivity(),Manifest.permission.READ_PHONE_STATE);
                    }
        			break;

        		default:
        			break;
        		}
    }

    @Override
    public void onResume() {
        super.onResume();
        recevecode();
    }

    private void recevecode() {
        SmsObserver smsObserver = new SmsObserver(getActivity(), new Handler(),
                new SmsObserver.SmsListener() {
                    @Override
                    public void onResult(String smsContent) {
                        //todo
                        Toast.makeText(getActivity(),"成功了",Toast.LENGTH_SHORT).show();
                    searchEdit.setText(smsContent);
                    }
                });
        getActivity().getContentResolver().registerContentObserver(
                Uri.parse("content://sms/"), true, smsObserver);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initview();
    }



    private void setListenter() {
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scrollview.scrollTo(0, 0);
            }
        });
        scrollview.setOnTouchListener(new View.OnTouchListener() {
            float y1;
            float y2;
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch (motionEvent.getAction()) {

                    case MotionEvent.ACTION_DOWN:
                         y1 = motionEvent.getRawY();
                        break;
                    case MotionEvent.ACTION_MOVE:
                        y2=motionEvent.getRawY();
                    case MotionEvent.ACTION_UP:
                        if ((y2-y1)<0){
                            floatingActionButton.setVisibility(View.GONE);
                        }else if ((y2-y1)>0){
                            floatingActionButton.setVisibility(View.VISIBLE);
                        }
                    default:
                        break;
                }
                return false;

            }

        });
    }
    private void initview() {

        viewpager.setAdapter(new MyPageAdapter());
        addPoint();
        isRunning=true;
        handler.sendEmptyMessageDelayed(0,2000);
        viewpager.setOnPageChangeListener(this);
 /*       viewpager.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch (motionEvent.getAction()) {
                		case MotionEvent.ACTION_DOWN:
                			handler.removeMessages(0);
                            Log.i("TAG","手指按下了！");
                			break;
                    case MotionEvent.ACTION_MOVE:
                        handler.removeMessages(0);
                        Log.i("TAG","手指移动了！");
                        break;
                    case MotionEvent.ACTION_UP:
                        Log.i("TAG","手指拿开了！");
                    handler.sendEmptyMessageDelayed(0,2000);
                        break;
                		default:
                			break;
                		}
              return false;
            }
        });*/
        viewpager.setOnViewPagerTouchListioner(new MyViewPager.OnTouchListioner() {
            @Override
            public void onActionDown() {
                handler.removeMessages(0);
                Log.i("TAG","手指按下了！");
            }

            @Override
            public void onActionMove() {
                handler.removeMessages(0);
                Log.i("TAG","手指移动了！");
            }

            @Override
            public void onActionUp() {
                handler.sendEmptyMessageDelayed(0,2000);
                Log.i("TAG","手指拿开了！");
            }
        });

        ViewAllShowLinearLayout allShowView = (ViewAllShowLinearLayout) view.findViewById(R.id.view_all_show);
        final LinearLayout ll2 = (LinearLayout) view.findViewById(R.id.ll2);
        allShowView.initData(view.findViewById(R.id.ll1), (ScrollView) view.findViewById(R.id.scrollview),
                new ViewSwitchListener() {
                    @Override
                    public void onViewShow() {
                        Log.i("TAG", "到达顶部");
                        ll2.setVisibility(View.VISIBLE);
                    }
                    @Override
                    public void onViewGone() {
                        ll2.setVisibility(View.GONE);
                    }
                });
        fragementpro=new Fragmentpro();
        fragmentSucess=new FragmentSucess();
        fragementBrand=new FragmentBrand();
        fragments = new Fragment[]{fragementpro, fragmentSucess, fragementBrand};

        getChildFragmentManager().beginTransaction().replace(R.id.main_container,fragementpro ).show(fragementpro).
                add(R.id.main_container, fragmentSucess).hide(fragmentSucess).add(R.id.main_container, fragementBrand).hide(fragementBrand)
                .commit();
        mTabs = new TextView[3];
        mTabs[0] = professonalmove;
        mTabs[1] = sucess;
        mTabs[2] = brand;
        mTabsTop=new TextView[3];
        mTabsTop[0]=professonalmoveTop;
        mTabsTop[1]=sucessTop;
        mTabsTop[2]=brandTop;
        // 把第一个tab设为选中状态
        mTabs[0].setSelected(true);
        mTabsTop[0].setSelected(true);
    }
    class MyPageAdapter extends PagerAdapter {
        @Override
        public int getCount() {
            // TODO Auto-generated method stub
            return Integer.MAX_VALUE;
        }
        @Override
        public boolean isViewFromObject(View arg0, Object arg1) {
            // TODO Auto-generated method stub
            return arg0==arg1;
        }
        @Override
        public Object instantiateItem(ViewGroup container, final int position) {
            // TODO Auto-generated method stub
            ImageView iv=new ImageView(getActivity());
            iv.setScaleType(ImageView.ScaleType.FIT_XY);
            // if (IsNetCanUse){
            Glide.with(getActivity()).load(ProConstant.ImageUrls[position%(3)]).error(R.mipmap.ic_launcher).into(iv);
            //}
            // iv.setImageBitmap(BitmapFactory.decodeResource(getResources(), pics[position%(pics.length)]));

            container.addView(iv);
            iv.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    // TODO Auto-generated method stub
                  /*  Intent intent=new Intent(getActivity(),BannerActivity.class);
                    intent.putExtra("position", String.valueOf(position%(pics.length)));
                    startActivity(intent);*/
                }
            });
            return iv;
        }
        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            container.removeView((ImageView)object);
            object=null;//编码规范好
            //super.destroyItem(container, position, object);
        }
    }
    @Override
    public void onPageScrollStateChanged(int arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    public void onPageScrolled(int arg0, float arg1, int arg2) {
        // TODO Auto-generated method stub

    }



    Handler handler=new Handler(){
        public void handleMessage(android.os.Message msg) {
            viewpager.setCurrentItem(viewpager.getCurrentItem()+1);
            if (isRunning) {
                handler.sendEmptyMessageDelayed(0,2000);
            }
        };
    };
    private void addPoint() {
        groupContain.removeAllViews();
        for(int i=0;i<3;i++){
            ImageView iv=new ImageView(getActivity());
            iv.setBackgroundResource(R.drawable.point_bg);
            if (i==0) {
                iv.setEnabled(true);
            } else {
                iv.setEnabled(false);
            }
            //因为要把view添加到一个线性布局，故需要一个线性布局的LayoutParams
            LinearLayout.LayoutParams params=new LinearLayout.LayoutParams(DensityUtil.dip2px(getActivity(),8), DensityUtil.dip2px(getActivity(),8));
            params.rightMargin= DensityUtil.dip2px(getActivity(),12);
            iv.setLayoutParams(params);
            groupContain.addView(iv);
        }
    }
    @Override
    public void onPageSelected(int position) {
        // TODO Auto-generated method stub
        position = position%(3);
        groupContain.getChildAt(position).setEnabled(true);
        groupContain.getChildAt(lastPosition).setEnabled(false);
        lastPosition=position;
    }
    @OnClick({R.id.search_edit, R.id.professonalmove, R.id.sucess, R.id.brand, R.id.professonalmove_top, R.id.sucess_top, R.id.brand_top})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.search_edit:
                break;
            case R.id.professonalmove:
                index=0;
                break;
            case R.id.sucess:
                index=1;
                break;
            case R.id.brand:
                index=2;
                break;
            case R.id.professonalmove_top:
                index=0;
                break;
            case R.id.sucess_top:
                index=1;
                break;
            case R.id.brand_top:
                index=2;
                break;
        }
        if (currentTabIndex != index) {
            FragmentTransaction trx = getChildFragmentManager().beginTransaction();
            trx.hide(fragments[currentTabIndex]);
            if (!fragments[index].isAdded()) {
                trx.add(R.id.fragementcontainer, fragments[index]);
            }
            trx.show(fragments[index]).commit();
        }
        mTabs[currentTabIndex].setSelected(false);
        mTabsTop[currentTabIndex].setSelected(false);
        // 把当前tab设为选中状态
        mTabs[index].setSelected(true);
        mTabsTop[index].setSelected(true);
        currentTabIndex = index;
    }

}
