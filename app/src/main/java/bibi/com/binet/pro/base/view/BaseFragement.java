package bibi.com.binet.pro.base.view;

import bibi.com.binet.mvp.presenter.iml.MvpBasePresenter;
import bibi.com.binet.mvp.view.MvpView;
import bibi.com.binet.mvp.view.iml.MvpFragement;

/**
 * Created by bibinet on 2017-2-13.
 */
public class BaseFragement<P extends MvpBasePresenter> extends MvpFragement<P> {
    @Override
    public P bindPresenter() {
        return null;
    }
}
