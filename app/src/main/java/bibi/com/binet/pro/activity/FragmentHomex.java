package bibi.com.binet.pro.activity;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.google.gson.Gson;

import org.xutils.image.ImageOptions;
import org.xutils.x;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import bibi.com.binet.R;
import bibi.com.binet.pro.adapter.HomeDataAdapter;
import bibi.com.binet.pro.base.presenter.BasePresenter;
import bibi.com.binet.pro.base.view.BaseFragement;
import bibi.com.binet.pro.bean.ImageInfo;
import bibi.com.binet.pro.bean.KnowledgeBean;
import bibi.com.binet.pro.bean.KnowledgeInfo;
import bibi.com.binet.pro.bean.KnowledgeResult;
import bibi.com.binet.pro.presenter.HomePresenter;
import bibi.com.binet.pro.util.DateUtils;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentHomex extends BaseFragement<HomePresenter> implements ViewPager.OnPageChangeListener {
    @BindView(R.id.homedatarecyclerview)
    RecyclerView homedatarecyclerview;
    @BindView(R.id.professonalmove)
    TextView professonalmove;
    @BindView(R.id.sucess)
    TextView sucess;
    @BindView(R.id.brand)
    TextView brand;
    @BindView(R.id.suspension_bar)
    RelativeLayout suspensionBar;
    private View view;
    private List<KnowledgeBean> lists=new ArrayList<>();
    private LinearLayoutManager linearLayoutManager;
    private int mCurrentPosition=0;
    private int mSuspensionHeight;
    private GridLayoutManager gridLayoutManager;

    @Override
    public HomePresenter bindPresenter() {
        return new HomePresenter(getContext());
    }

    public FragmentHomex() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_homex, container, false);
        ButterKnife.bind(this, view);
        initView();
        initData();
        return view;
    }

    private void initData() {
        presenter.loadData(new BasePresenter.OnUiThreadListioner<KnowledgeResult>() {
            @Override
            public void OnSuccess(KnowledgeResult data) {
                int code = data.getHead().getCode();
                Log.i("TAG",code+"-code------------");
                if (code==200){
                    for (KnowledgeInfo info : data.getData().getKnowledage()) {
                        lists.add(new KnowledgeBean(info.getId(), info.getUrl(), info.getPicUrl(), info.getTitle(),
                                info.getDescription(), DateUtils.datetimeFormatter(new Date(info.getUpdateTime())),
                               "title"));
                    }
                    Log.i("TAG",lists.size()+"-------------");
                }
                homedatarecyclerview.setLayoutManager(gridLayoutManager);
                homedatarecyclerview.setAdapter(new HomeDataAdapter(getActivity(),lists,3));
                homedatarecyclerview.addOnScrollListener(new RecyclerView.OnScrollListener() {
                    @Override public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                        super.onScrollStateChanged(recyclerView, newState);
                        mSuspensionHeight = suspensionBar.getHeight();
                    }
                    @Override public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                        super.onScrolled(recyclerView, dx, dy);
                        View view = linearLayoutManager.findViewByPosition(0);
                        if (view != null) {
                         suspensionBar.setVisibility(View.GONE);
                        }else {
                            suspensionBar.setVisibility(View.VISIBLE);
                        }
                    }
                });
            }
            @Override
            public void OnFailed(String errorinfo) {
                Log.i("TAG",errorinfo+"------error-------");
            }
        });
    }

    private void initView() {
        linearLayoutManager=new LinearLayoutManager(getActivity(),LinearLayoutManager.VERTICAL,false);

         gridLayoutManager=new GridLayoutManager(getActivity(),2,GridLayoutManager.VERTICAL,false);

    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {

    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }


    @OnClick({R.id.professonalmove, R.id.sucess, R.id.brand})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.professonalmove:
                break;
            case R.id.sucess:
                homedatarecyclerview.setLayoutManager(gridLayoutManager);
              //  homedatarecyclerview.setAdapter();
                break;
            case R.id.brand:
                break;
        }
    }
}
