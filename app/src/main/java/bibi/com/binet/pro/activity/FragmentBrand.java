package bibi.com.binet.pro.activity;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import bibi.com.binet.R;
import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentBrand extends Fragment {


    @BindView(R.id.prorecyclerview)
    RecyclerView prorecyclerview;
    private View view;

    public FragmentBrand() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_pro, container, false);
        ButterKnife.bind(this, view);
        initData();
        return view;
    }

    private void initData() {

    }

}
