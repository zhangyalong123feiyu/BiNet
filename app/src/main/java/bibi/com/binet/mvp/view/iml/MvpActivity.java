package bibi.com.binet.mvp.view.iml;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import bibi.com.binet.mvp.presenter.iml.MvpBasePresenter;
import bibi.com.binet.mvp.view.MvpView;

/**
 * Created by bibinet on 2017-2-13.
 */
public abstract class MvpActivity<P extends MvpBasePresenter> extends AppCompatActivity implements MvpView {
    private P presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        presenter=bindPresenter();
        if (presenter!=null){
           presenter.attechView(this);
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (presenter!=null){
            presenter.deAttechView();
        }
    }

    public abstract P bindPresenter();

}
