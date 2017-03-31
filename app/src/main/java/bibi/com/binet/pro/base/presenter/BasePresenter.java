package bibi.com.binet.pro.base.presenter;

import android.content.Context;

import com.google.gson.Gson;

import bibi.com.binet.mvp.presenter.iml.MvpBasePresenter;
import bibi.com.binet.mvp.view.MvpView;
import bibi.com.binet.pro.base.model.BaseModel;

/**
 * Created by bibinet on 2017-2-13.
 */
public abstract class BasePresenter<M extends BaseModel> extends MvpBasePresenter {
    private Context context;
    private Gson gson;
    private M model;
    public BasePresenter(Context context){
        this.context=context;
        this.gson=new Gson();
        this.model=bindModel();
    }

    public abstract M bindModel();
    public Context getContext() {
        return context;
    }

    public Gson getGson() {
        return gson;
    }

    public M getModel() {
        return model;
    }
    public interface OnUiThreadListioner<T>{
        void OnSuccess(T t);
        void OnFailed(String errorinfo);


    }
}
