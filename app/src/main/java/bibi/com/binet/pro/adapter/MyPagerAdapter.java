package bibi.com.binet.pro.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bibinet on 2017-2-21.
 */
public class MyPagerAdapter extends FragmentPagerAdapter{
    private List<Fragment> listfragements=new ArrayList<>();
    private Context context;

    public MyPagerAdapter(FragmentManager fm, List<Fragment> listfragements, Context context) {
        super(fm);
        this.listfragements = listfragements;
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        return listfragements.get(position);
    }

    @Override
    public int getCount() {
        return listfragements.size();
    }
}
