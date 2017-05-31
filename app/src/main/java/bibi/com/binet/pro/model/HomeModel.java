package bibi.com.binet.pro.model;

import android.content.Context;
import android.os.Environment;
import android.telephony.TelephonyManager;

import org.xutils.http.RequestParams;
import org.xutils.x;

import java.io.File;

import bibi.com.binet.pro.builder.MyCacheCallBack;
import bibi.com.binet.pro.constants.ProConstant;
import bibi.com.binet.pro.base.model.BaseModel;
import bibi.com.binet.pro.builder.MyCallBack;

/**
 * Created by bibinet on 2017-2-13.
 */
public class HomeModel extends BaseModel {
    private String cacheName="cacheDirc";
    private File cacheFile=new File(Environment.getExternalStorageDirectory(),"cachefile");
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
   public void getData(MyCacheCallBack myCallBack){

       imei = ((TelephonyManager) context.getSystemService(Context.TELEPHONY_SERVICE)).getDeviceId();
       RequestParams requestParams=new RequestParams(ProConstant.homedataurl);
       requestParams.addBodyParameter("v","1");
       requestParams.addBodyParameter("type","1");
       requestParams.addBodyParameter("idList",imei);
       requestParams.addBodyParameter("imei",imei);
       requestParams.setCacheDirName(cacheName);
       requestParams.setCacheMaxAge(60*60*24*15);
       requestParams.setCacheSize(1024*1024*30);
       x.http().get(requestParams,myCallBack);


   }
}
