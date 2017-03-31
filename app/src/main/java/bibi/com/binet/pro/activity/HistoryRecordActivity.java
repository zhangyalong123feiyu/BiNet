package bibi.com.binet.pro.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import bibi.com.binet.R;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by bibinet on 2017-2-16.
 */
public class HistoryRecordActivity extends BaseActivity {
    @BindView(R.id.title)
    TextView title;
    @BindView(R.id.title_imageleft)
    ImageView titleimageleft;
    @BindView(R.id.historyrecodrecyclerview)
    RecyclerView historyrecodrecyclerview;
    @BindView(R.id.historyrecodrefreshview)
    SwipeRefreshLayout historyrecodrefreshview;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historyrecord);
        ButterKnife.bind(this);
        initView();
    }

    private void initView() {
        title.setText(R.string.histroytitle);
    }
    @OnClick({R.id.title_imageleft})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.title_imageleft:
                finish();
                break;
        }
    }
}
