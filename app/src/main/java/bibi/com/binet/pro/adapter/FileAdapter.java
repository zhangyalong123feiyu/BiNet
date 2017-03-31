package bibi.com.binet.pro.adapter;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import bibi.com.binet.R;
import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by bibinet on 2017-2-20.
 */
public class FileAdapter extends RecyclerView.Adapter<FileAdapter.FileViewHoleDer> {

    private Context context;
    private List<String> filePath = new ArrayList<>();
    private List<String> fileName = new ArrayList<>();

    public FileAdapter(Context context, List<String> filePath, List<String> fileName) {
        this.context = context;
        this.filePath = filePath;
        this.fileName = fileName;
    }

    @Override
    public FileViewHoleDer onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_layoutfilename, parent, false);
        FileViewHoleDer fileViewHoleDer = new FileViewHoleDer(view);
        return fileViewHoleDer;
    }

    @Override
    public void onBindViewHolder(FileViewHoleDer holder, final int position) {
        holder.filename.setText(fileName.get(position));
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.addCategory("android.intent.category.DEFAULT");
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                Uri uri = Uri.fromFile(new File(filePath.get(position) ));
                intent.setDataAndType(uri, "application/msword");
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return filePath.size();
    }

    class FileViewHoleDer extends RecyclerView.ViewHolder {
        @BindView(R.id.filename)
        TextView filename;
        public FileViewHoleDer(View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }
    }
}
