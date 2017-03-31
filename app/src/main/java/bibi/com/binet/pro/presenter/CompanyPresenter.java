package bibi.com.binet.pro.presenter;

import android.content.Context;

import bibi.com.binet.pro.base.model.BaseModel;
import bibi.com.binet.pro.base.presenter.BasePresenter;
import bibi.com.binet.pro.builder.MyCallBack;
import bibi.com.binet.pro.model.CompanyModel;

/**
 * Created by bibinet on 2017-2-16.
 */
public class CompanyPresenter extends BasePresenter<CompanyModel> {
    public CompanyPresenter(Context context) {
        super(context);
    }

    @Override
    public CompanyModel bindModel() {
        return new CompanyModel(getContext());
    }
    public void loaData(final OnUiThreadListioner onUiThreadListioner){
        getModel().getData(new MyCallBack(){
            @Override
            public void onSuccess(String s) {
                super.onSuccess(s);
                onUiThreadListioner.OnSuccess(s);
            }

            @Override
            public void onError(Throwable throwable, boolean b) {
                super.onError(throwable, b);
                onUiThreadListioner.OnFailed(throwable.getMessage());
            }
        });

    }

}
