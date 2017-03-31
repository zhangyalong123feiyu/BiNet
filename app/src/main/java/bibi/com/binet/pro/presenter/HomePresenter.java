package bibi.com.binet.pro.presenter;

import android.content.Context;
import android.util.Log;

import com.google.gson.Gson;

import bibi.com.binet.pro.base.presenter.BasePresenter;
import bibi.com.binet.pro.bean.KnowledgeData;
import bibi.com.binet.pro.bean.KnowledgeResult;
import bibi.com.binet.pro.builder.MyCallBack;
import bibi.com.binet.pro.model.HomeModel;

/**
 * Created by bibinet on 2017-2-13.
 */
public class HomePresenter extends BasePresenter<HomeModel>  {
    public HomePresenter(Context context) {
        super(context);
    }
    @Override
    public HomeModel bindModel() {
        return new HomeModel(getContext());
    }
    public void loadData(final OnUiThreadListioner onUiThreadListioner) {
        getModel().getData(new MyCallBack(){
            @Override
            public void onSuccess(String s) {
                super.onSuccess(s);
                KnowledgeResult homejson = getGson().fromJson(s, KnowledgeResult.class);
                onUiThreadListioner.OnSuccess(homejson);

            }

            @Override
            public void onError(Throwable throwable, boolean b) {
                super.onError(throwable, b);
                onUiThreadListioner.OnFailed(throwable.getMessage());
            }
        });

    }
}
