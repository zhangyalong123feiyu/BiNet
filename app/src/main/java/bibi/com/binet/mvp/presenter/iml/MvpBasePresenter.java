package bibi.com.binet.mvp.presenter.iml;

import bibi.com.binet.mvp.presenter.MvpPresenter;
import bibi.com.binet.mvp.view.MvpView;

/**
 * Created by bibinet on 2017-2-13.
 */
public abstract class MvpBasePresenter<V extends MvpView> implements MvpPresenter<V>{
    private V view ;

    @Override
    public void attechView(V view) {

        this.view=view;
    }
    @Override
    public void deAttechView() {
        if (view!=null){
            view=null;
        }
    }
}
