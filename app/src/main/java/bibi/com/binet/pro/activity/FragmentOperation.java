package bibi.com.binet.pro.activity;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import bibi.com.binet.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentOperation extends Fragment {


    public FragmentOperation() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_operation, container, false);
    }

}