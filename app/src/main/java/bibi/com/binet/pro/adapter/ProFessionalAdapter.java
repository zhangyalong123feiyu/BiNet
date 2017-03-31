package bibi.com.binet.pro.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

import bibi.com.binet.R;
import bibi.com.binet.pro.bean.ImageInfo;
import bibi.com.binet.pro.bean.KnowledgeBean;
import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by bibinet on 2017-2-15.
 */
public class ProFessionalAdapter extends RecyclerView.Adapter<ProFessionalAdapter.ViewHolderTwo> {
    private Context context;
    private List<KnowledgeBean> datas = new ArrayList<>();
    Gson gson = new Gson();
    public ProFessionalAdapter(Context context, List<KnowledgeBean> datas) {
        this.context = context;
        this.datas = datas;
    }

    @Override
    public ViewHolderTwo onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_homedata, parent, false);
        ViewHolderTwo holder = new ViewHolderTwo(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolderTwo holder, int position) {
        ImageInfo iamgeinfo = gson.fromJson(datas.get(position).getImageurl(), ImageInfo.class);
        Glide.with(context).load(iamgeinfo.getUrl()).into(((ViewHolderTwo) holder).datapic);
       holder.dataname.setText(datas.get(position).getTitle());
       holder.datadetail.setText(datas.get(position).getContent());
         holder.datatime.setText(datas.get(position).getTime());
    }

    @Override
    public int getItemCount() {
        return datas.size();
    }


    class ViewHolderTwo extends RecyclerView.ViewHolder {
        /*  布局2*/
        @BindView(R.id.datapic)
        ImageView datapic;
        @BindView(R.id.dataname)
        TextView dataname;
        @BindView(R.id.datadetail)
        TextView datadetail;
        @BindView(R.id.datatime)
        TextView datatime;

        public ViewHolderTwo(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
