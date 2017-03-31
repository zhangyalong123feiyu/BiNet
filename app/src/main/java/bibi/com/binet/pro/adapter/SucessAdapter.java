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
public class SucessAdapter extends RecyclerView.Adapter<SucessAdapter.SucessViewHolder> {



    private Context context;
    private List<KnowledgeBean> datas = new ArrayList<>();
    Gson gson = new Gson();

    public SucessAdapter(List<KnowledgeBean> datas, Context context) {
        this.datas = datas;
        this.context = context;
    }

    @Override
    public SucessViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_homedatasucess, parent, false);
        SucessViewHolder holder = new SucessViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(SucessViewHolder holder, int position) {
        ImageInfo iamgeinfo = gson.fromJson(datas.get(position).getImageurl(), ImageInfo.class);
        Glide.with(context).load(iamgeinfo.getUrl()).into(holder.sucesspic);
   holder.sucessdecrp.setText(datas.get(position).getTitle());
    }

    @Override
    public int getItemCount() {
        return datas.size();
    }

    class SucessViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.sucesspic)
        ImageView sucesspic;
        @BindView(R.id.sucessdecrp)
        TextView sucessdecrp;
        public SucessViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);

        }
    }
}
