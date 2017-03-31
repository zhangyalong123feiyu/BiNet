package bibi.com.binet.pro.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;

import bibi.com.binet.R;
import bibi.com.binet.mvp.view.MvpView;
import butterknife.ButterKnife;

/**
 * Created by bibinet on 2017-2-13.
 */
public class BaseActivity extends AppCompatActivity implements MvpView{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);

    }

    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.tr_void,R.anim.tr_void);
    }

    @Override
    public void startActivity(Intent intent) {
        super.startActivity(intent);
        overridePendingTransition(R.anim.tr_entry,R.anim.tr_void);
    }

    @Override
    public void finishActivity(int requestCode) {
        super.finishActivity(requestCode);
        overridePendingTransition(R.anim.tr_void,R.anim.tr_exit);
    }

 /*   @Override
    public boolean dispatchKeyEvent(KeyEvent event) {
        if (event.getKeyCode() == KeyEvent.KEYCODE_BACK) {
            if (event.getAction() == KeyEvent.ACTION_DOWN && event.getRepeatCount() == 0) {
                super.finish();
                overridePendingTransition(R.anim.tr_void, R.anim.tr_exit);
                return true;
            }
            return false;
        } else {
            return super.dispatchKeyEvent(event);
        }
    }*/
}
