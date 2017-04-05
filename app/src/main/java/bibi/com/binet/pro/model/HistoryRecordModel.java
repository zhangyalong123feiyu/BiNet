package bibi.com.binet.pro.model;

import android.content.Context;

import org.xutils.http.RequestParams;
import org.xutils.x;

import bibi.com.binet.pro.constants.ProConstant;
import bibi.com.binet.pro.base.model.BaseModel;
import bibi.com.binet.pro.builder.MyCallBack;

/**
 * Created by bibinet on 2017-2-16.
 */
public class HistoryRecordModel extends BaseModel {
    public HistoryRecordModel(Context context) {
        super(context);
    }
    public void getData(MyCallBack myCallBack){
        RequestParams requestParams=new RequestParams(ProConstant.homedataurl);
        requestParams.addBodyParameter("v","1");
        requestParams.addBodyParameter("type","1");
        requestParams.addBodyParameter("idList",imei);
        requestParams.addBodyParameter("imei",imei);
        x.http().get(requestParams,myCallBack);
    }
}
