package bibi.com.binet.pro.activity;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.hejunlin.superindicatorlibray.CircleIndicator;
import com.hejunlin.superindicatorlibray.LoopViewPager;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import java.util.ArrayList;
import java.util.List;

import bibi.com.binet.R;
import bibi.com.binet.pro.adapter.CompanyDataAdapter;
import bibi.com.binet.pro.adapter.PicAdapter;
import bibi.com.binet.pro.base.view.BaseFragement;
import bibi.com.binet.pro.beannew.CompanyData;
import bibi.com.binet.pro.eventbus.MainEvent;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentCompany extends BaseFragement {


    @BindView(R.id.title)
    TextView title;
    @BindView(R.id.viewpager)
    LoopViewPager viewpager;
    @BindView(R.id.indicator)
    CircleIndicator indicator;
    /*  @BindView(R.id.group_contain)
      LinearLayout groupContain;*/
    @BindView(R.id.companyrecylerview)
    RecyclerView companyrecylerview;
    @BindView(R.id.swiprefesh)
    SwipeRefreshLayout swiprefesh;
    private View view;
    private List<CompanyData> list = new ArrayList<>();

    public FragmentCompany() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragement_company, container, false);
        ButterKnife.bind(this, view);

        initData();
        initView();
        return view;
    }

    private void initData() {
        list.add(new CompanyData("张亚龙", "2016.10", "今天是个好日子！"));
        list.add(new CompanyData("张亚龙", "2016.10", "今天是个好日子！"));
        list.add(new CompanyData("张亚龙", "2016.10", "今天是个好日子！"));
        list.add(new CompanyData("张亚龙", "2016.10", "今天是个好日子！"));
        list.add(new CompanyData("张亚龙", "2016.10", "今天是个好日子！"));
        list.add(new CompanyData("张亚龙", "2016.10", "今天是个好日子！"));
    }

    private void initView() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false) {
            @Override
            public boolean canScrollVertically() {
                return false;
            }
        };
        companyrecylerview.setLayoutManager(linearLayoutManager);
        companyrecylerview.setAdapter(new CompanyDataAdapter(getActivity(), list));
        viewpager.setAdapter(new PicAdapter(getActivity()));
        viewpager.setOnDispatchTouchEventListener(mDispatchOnTouchListener);
        viewpager.setLooperPic(true);

        indicator.setViewPager(viewpager);
    }

    private LoopViewPager.OnDispatchTouchEventListener mDispatchOnTouchListener = new LoopViewPager.OnDispatchTouchEventListener() {
        @Override
        public void onDispatchKeyEvent(MotionEvent event) {
            if (event.getAction() == MotionEvent.ACTION_DOWN) {
                viewpager.setLooperPic(false);
            } else if (event.getAction() == MotionEvent.ACTION_UP
                    || event.getAction() == MotionEvent.ACTION_CANCEL) {
                viewpager.setLooperPic(true);
            }
        }
    };


    @OnClick(R.id.title)
    public void onViewClicked() {
        EventBus.getDefault().post(new MainEvent("我是eventbus"));
        Toast.makeText(getActivity(),"titile点击",Toast.LENGTH_SHORT).show();
    }

}
