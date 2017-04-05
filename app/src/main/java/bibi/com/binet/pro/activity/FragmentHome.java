package bibi.com.binet.pro.activity;


import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.google.gson.Gson;

import org.xutils.image.ImageOptions;
import org.xutils.x;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import bibi.com.binet.R;
import bibi.com.binet.pro.constants.ProConstant;
import bibi.com.binet.pro.base.presenter.BasePresenter;
import bibi.com.binet.pro.base.view.BaseFragement;
import bibi.com.binet.pro.bean.ImageInfo;
import bibi.com.binet.pro.bean.KnowledgeBean;
import bibi.com.binet.pro.bean.KnowledgeInfo;
import bibi.com.binet.pro.bean.KnowledgeResult;
import bibi.com.binet.pro.presenter.HomePresenter;
import bibi.com.binet.pro.util.DateUtils;
import bibi.com.binet.pro.util.DensityUtil;
import bibi.com.binet.pro.util.NetworkUtils;
import bibi.com.binet.pro.view.ViewAllShowLinearLayout;
import bibi.com.binet.pro.view.ViewAllShowLinearLayout.ViewSwitchListener;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentHome extends BaseFragement<HomePresenter> implements ViewPager.OnPageChangeListener {
    @BindView(R.id.title)
    TextView titile;
    @BindView(R.id.viewpager)
    ViewPager viewpager;
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
    LinearLayout mainContainer;
    @BindView(R.id.scrollview)
    ScrollView scrollview;
    @BindView(R.id.professonalmove_top)
    TextView professonalmoveTop;
    @BindView(R.id.sucess_top)
    TextView sucessTop;
    @BindView(R.id.brand_top)
    TextView brandTop;
    @BindView(R.id.ll2)
    LinearLayout ll2;

    private View view;
    private int lastPosition;
    private int[] pics=new int[]{R.mipmap.ic_launcher,R.mipmap.ic_launcher,R.mipmap.ic_launcher};
    private boolean isRunning=false;
    private boolean IsNetCanUse;
    private List<KnowledgeBean> lists=new ArrayList<>();
    private boolean isfristloade=true;

    @Override
    public HomePresenter bindPresenter() {
        return new HomePresenter(getContext());
    }

    public FragmentHome() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_home, container, false);
        ButterKnife.bind(this,view);

        initview();
        initdata();
        return view;
    }
    private void initdata() {
        Log.i("TAG","加载数据");
            presenter.loadData(new BasePresenter.OnUiThreadListioner<KnowledgeResult>() {
                @Override
                public void OnSuccess(KnowledgeResult data) {
                    int code = data.getHead().getCode();
                    Log.i("TAG",code+"-code------------");
                    if (code==200){
                        for (KnowledgeInfo info : data.getData().getKnowledage()) {
                            lists.add(new KnowledgeBean(info.getId(), info.getUrl(), info.getPicUrl(), info.getTitle(),
                                    info.getDescription(), DateUtils.datetimeFormatter(new Date(info.getUpdateTime())),
                                    titile.getText().toString()));
                          /*      adapter=new ClassFicationAdapter(ClassfiCationActivity.this,lists);
                                classficationlistview.setAdapter(adapter);*/

                        }
                        Log.i("TAG",lists.size()+"-------------");
                        ImageOptions options=new ImageOptions.Builder().setCircular(true).setFailureDrawableId(R.mipmap.ic_launcher).build();
                        for (int i = 0; i < lists.size(); i++) {
                            View convertView = LayoutInflater.from(getActivity()).inflate(R.layout.item_homedata, null);
                            KnowledgeBean person = lists.get(i);
                            ImageView photo = (ImageView) convertView.findViewById(R.id.datapic);
                            TextView text_name = (TextView) convertView.findViewById(R.id.dataname);
                            TextView text_location = (TextView) convertView.findViewById(R.id.datadetail);
                            TextView text_favorate = (TextView) convertView.findViewById(R.id.datatime);
                            Gson gson=new Gson();
                            ImageInfo iamgeinfo = gson.fromJson(person.getImageurl(), ImageInfo.class);
                           // Glide.with(getActivity()).load(iamgeinfo.getUrl()).placeholder(R.mipmap.ic_launcher).crossFade().into(photo);

                            x.image().bind(photo,iamgeinfo.getUrl(),options);
                            text_name.setText(person.getTitle());
                            text_location.setText(person.getContent());
                            text_favorate.setText(person.getTime());
                            mainContainer.addView(convertView);
                        }
                    }
                }

                @Override
                public void OnFailed(String errorinfo) {
                    Log.i("TAG",errorinfo+"------error-------");
                }
            });
    }

    private void initview() {

        viewpager.setAdapter(new MyPageAdapter());
        addPoint();
        isRunning=true;
        handler.sendEmptyMessageDelayed(0,2000);
        viewpager.setOnPageChangeListener(this);

        ViewAllShowLinearLayout allShowView = (ViewAllShowLinearLayout)view.findViewById(R.id.view_all_show);
        final LinearLayout ll2 = (LinearLayout)view.findViewById(R.id.ll2);
        allShowView.initData(view.findViewById(R.id.ll1), (ScrollView)view.findViewById(R.id.scrollview),
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
            IsNetCanUse=NetworkUtils.isNetworkAvailable(getActivity());
           // if (IsNetCanUse){
                Glide.with(getActivity()).load(ProConstant.ImageUrls[position%(pics.length)]).error(R.mipmap.ic_launcher).into(iv);
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
        for(int i=0;i<pics.length;i++){
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
        position = position%(pics.length);
        groupContain.getChildAt(position).setEnabled(true);
        groupContain.getChildAt(lastPosition).setEnabled(false);
        lastPosition=position;
    }
    @OnClick({R.id.search_image, R.id.professonalmove, R.id.sucess, R.id.brand, R.id.ll1, R.id.professonalmove_top, R.id.sucess_top, R.id.brand_top, R.id.ll2})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.search_image:
                break;
            case R.id.professonalmove:
                break;
            case R.id.sucess:
                break;
            case R.id.brand:
                break;
            case R.id.ll1:
                break;
            case R.id.professonalmove_top:
                break;
            case R.id.sucess_top:
                break;
            case R.id.brand_top:
                break;
            case R.id.ll2:
                break;
        }
    }
}
