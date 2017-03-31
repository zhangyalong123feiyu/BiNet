package bibi.com.binet.pro.presenter;

import android.content.Context;

import bibi.com.binet.pro.base.presenter.BasePresenter;
import bibi.com.binet.pro.model.HistoryRecordModel;

/**
 * Created by bibinet on 2017-2-16.
 */
public class HistroyPresenter extends BasePresenter<HistoryRecordModel> {
    public HistroyPresenter(Context context) {
        super(context);
    }

    @Override
    public HistoryRecordModel bindModel() {
        return new HistoryRecordModel(getContext());
    }
}
