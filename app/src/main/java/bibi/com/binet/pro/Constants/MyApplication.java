package bibi.com.binet.pro.constants;

import android.app.Application;

import org.xutils.x;

/**
 * Created by bibinet on 2017-2-14.
 */
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        x.Ext.init(this);
    }
}
