package bibi.com.binet.mvp.view.iml;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

import bibi.com.binet.mvp.presenter.iml.MvpBasePresenter;
import bibi.com.binet.mvp.view.MvpView;

/**
 * Created by bibinet on 2017-2-13.
 */
public abstract class MvpFragement<P extends MvpBasePresenter> extends Fragment implements MvpView {
    public P presenter ;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        presenter=bindPresenter();
        if (presenter!=null){
            presenter.attechView(this);
        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if (presenter!=null){
            presenter.deAttechView();
        }
    }

    public abstract P bindPresenter();

}
