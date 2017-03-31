package bibi.com.binet.pro.activity;


import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import bibi.com.binet.R;
import bibi.com.binet.pro.adapter.ProFessionalAdapter;
import bibi.com.binet.pro.base.presenter.BasePresenter;
import bibi.com.binet.pro.base.view.BaseFragement;
import bibi.com.binet.pro.bean.KnowledgeBean;
import bibi.com.binet.pro.bean.KnowledgeInfo;
import bibi.com.binet.pro.bean.KnowledgeResult;
import bibi.com.binet.pro.presenter.HomePresenter;
import bibi.com.binet.pro.util.DateUtils;
import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * A simple {@link Fragment} subclass.
 */
public class Fragmentpro extends BaseFragement<HomePresenter> {
    @BindView(R.id.prorecyclerview)
    RecyclerView prorecyclerview;
    private View view;
    private List<KnowledgeBean> lists=new ArrayList<>();
    private ProFessionalAdapter adapter;

    @Override
    public bibi.com.binet.pro.presenter.HomePresenter bindPresenter() {
        return new bibi.com.binet.pro.presenter.HomePresenter(getContext());
    }
    public Fragmentpro() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_pro, container, false);
        ButterKnife.bind(this, view);
        initData();
        setListener();
        return view;
    }

    private void setListener() {
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
                prorecyclerview.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.VERTICAL,false){
                /*    @Override
                    public boolean canScrollVertically() {
                        return false;//禁止recyclerview在垂直方向滚动
                    }*/
                });
                prorecyclerview.setNestedScrollingEnabled(false);//禁止recyclerview在垂直方向滚动
                adapter=new ProFessionalAdapter(getActivity(),lists);
                prorecyclerview.setAdapter(adapter);
            }
            @Override
            public void OnFailed(String errorinfo) {
                Log.i("TAG",errorinfo+"------error-------");
            }
        });

    }



}
