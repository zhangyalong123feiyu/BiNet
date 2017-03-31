package bibi.com.binet.mvp.presenter;

import bibi.com.binet.mvp.view.MvpView;

/**
 * Created by bibinet on 2017-2-13.
 */
public interface MvpPresenter<V extends MvpView> {
    public  void attechView(V view);
    public void deAttechView();
}
