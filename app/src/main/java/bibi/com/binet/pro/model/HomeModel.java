package bibi.com.binet.pro.model;

import android.content.Context;
import android.telephony.TelephonyManager;

import org.xutils.http.RequestParams;
import org.xutils.x;

import bibi.com.binet.pro.constants.ProConstant;
import bibi.com.binet.pro.base.model.BaseModel;
import bibi.com.binet.pro.builder.MyCallBack;

/**
 * Created by bibinet on 2017-2-13.
 */
public class HomeModel extends BaseModel {
    public HomeModel(Context context) {
        super(context);
    }

   /* RequestQueue requestQueue = Volley.newRequestQueue(context);

    StringRequest stringRequest = new StringRequest(Request.Method.POST, "", new Response.Listener<String>() {
        @Override
        public void onResponse(String s) {

        }
    }, new Response.ErrorListener() {
        @Override
        public void onErrorResponse(VolleyError volleyError) {

        }
    }){
        @Override
        protected Map<String, String> getParams() throws AuthFailureError {
            Map<String, String> map = new HashMap<String, String>();
            map.put("params1", "value1");
            map.put("params2", "value2");
            return map;
        }
    };

    public void loadData() {
        requestQueue.add(stringRequest);
        requestQueue.start();

    }*/
   public void getData(MyCallBack myCallBack){

       imei = ((TelephonyManager) context.getSystemService(Context.TELEPHONY_SERVICE)).getDeviceId();
       RequestParams requestParams=new RequestParams(ProConstant.homedataurl);
       requestParams.addBodyParameter("v","1");
       requestParams.addBodyParameter("type","1");
       requestParams.addBodyParameter("idList",imei);
       requestParams.addBodyParameter("imei",imei);
       x.http().get(requestParams,myCallBack);


   }
}
