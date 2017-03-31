package bibi.com.binet.pro.base.model;

import android.content.Context;
import android.telephony.TelephonyManager;

import bibi.com.binet.mvp.model.iml.MvpBaseModel;

/**
 * Created by bibinet on 2017-2-13.
 */
public class BaseModel extends MvpBaseModel {
    protected static String imei = "";
    protected Context context;
    public BaseModel(Context context) {
        this.context = context;
    }
    protected String getImei(){
        if (imei.isEmpty()) {
            imei = ((TelephonyManager)context.getSystemService(Context.TELEPHONY_SERVICE)).getDeviceId();
            System.out.println("imei: " + imei);
        }
        return imei;
    }
}
