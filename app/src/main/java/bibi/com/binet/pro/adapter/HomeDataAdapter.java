package bibi.com.binet.pro.adapter;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.Fragment;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

import bibi.com.binet.R;
import bibi.com.binet.pro.constants.ProConstant;
import bibi.com.binet.pro.bean.ImageInfo;
import bibi.com.binet.pro.bean.KnowledgeBean;
import bibi.com.binet.pro.util.DensityUtil;
import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by bibinet on 2017-2-15.
 */
public class HomeDataAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {


    private Context context;
   private List<KnowledgeBean> datas = new ArrayList<>();
    private int type;
    private int TYPEONE = 1;
    private int TYPETWO = 2;
    private int TYPETHREE = 3;
    private int TYPEFOUR = 4;
    private int lastPosition;

    public HomeDataAdapter(Context context,List<KnowledgeBean> datas , int type) {
        this.context = context;
        this.datas = datas;
        this.type = type;
    }

    @Override
    public int getItemViewType(int position) {

        if (position == 0) {
            return TYPEONE;
        } else {
            if (type == 2) {
                return TYPETWO;
            } else if (type == 3) {
                if (position==0&&position==1){
                    return TYPEONE;
                }
                return TYPETHREE;
            } else {
                return TYPEFOUR;
            }
        }

    }
public  void resetData(List<KnowledgeBean> datas){
    this.datas=datas;
}
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
     /*   View view = null;
        RecyclerView.ViewHolder holder = null;
        if (viewType == 1) {
            view = LayoutInflater.from(context).inflate(R.layout.item_home, parent, false);
            holder = new ViewHolderOne(view);
        } else if (viewType == 2) {
            view = LayoutInflater.from(context).inflate(R.layout.item_homedata, parent, false);
            holder = new ViewHolderTwo(view);
        } else if (viewType == 3) {
            view = LayoutInflater.from(context).inflate(R.layout.item_homedatasucess, parent, false);
            holder = new ViewHolderThree(view);
        } else if (viewType == 4) {
            view = LayoutInflater.from(context).inflate(R.layout.item_homedatabrand, parent, false);
            holder = new ViewHolderFour(view);
        }
        return holder;*/
        View view = null;
        RecyclerView.ViewHolder holder = null;
        if (viewType == 1) {
            view = LayoutInflater.from(context).inflate(R.layout.item_home, parent, false);
            holder = new ViewHolderOne(view);
        } else if (viewType == 2) {
            view = LayoutInflater.from(context).inflate(R.layout.item_fragementcontaner, parent, false);
            holder = new ViewHolderTwo(view);
        }
        return holder;
    }

    Gson gson = new Gson();

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
     /*   if (getItemViewType(position) == 1) {

            ((ViewHolderOne) holder).professonalmove.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                }
            });
        } else if (getItemViewType(position)==2){
            ImageInfo iamgeinfo = gson.fromJson(datas.get(position - 1).getImageurl(), ImageInfo.class);
            Glide.with(context).load(iamgeinfo.getUrl()).into(((ViewHolderTwo) holder).datapic);
            ((ViewHolderTwo) holder).dataname.setText(datas.get(position - 1).getTitle());
            ((ViewHolderTwo) holder).datadetail.setText(datas.get(position - 1).getContent());
            ((ViewHolderTwo) holder).datatime.setText(datas.get(position - 1).getTime());
        }else if (getItemViewType(position)==3){
            ImageInfo iamgeinfo = gson.fromJson(datas.get(position - 1).getImageurl(), ImageInfo.class);
            Glide.with(context).load(iamgeinfo.getUrl()).into(((ViewHolderThree)holder).sucesspic);
            ((ViewHolderThree)holder).sucessdecrp.setText(datas.get(position - 1).getTitle());
        }else if(getItemViewType(position)==4){
            ImageInfo iamgeinfo = gson.fromJson(datas.get(position - 1).getImageurl(), ImageInfo.class);
            Glide.with(context).load(iamgeinfo.getUrl()).into(((ViewHolderTwo) holder).datapic);
            ((ViewHolderTwo) holder).dataname.setText(datas.get(position - 1).getTitle());
            ((ViewHolderTwo) holder).datadetail.setText(datas.get(position - 1).getContent());
            ((ViewHolderTwo) holder).datatime.setText(datas.get(position - 1).getTime());
        }*/
        if (getItemViewType(position) == 1) {

            ((ViewHolderOne) holder).professonalmove.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                }
            });
        } else if (getItemViewType(position)==2){


        }

    }

    @Override
    public int getItemCount() {
        return 1 + datas.size();
    }

    class ViewHolderOne extends RecyclerView.ViewHolder {
        /*     布局一*/
        @BindView(R.id.professonalmove)
        TextView professonalmove;
        @BindView(R.id.sucess)
        TextView sucess;
        @BindView(R.id.brand)
        TextView brand;
        @BindView(R.id.viewpager)
        ViewPager viewpager;
        @BindView(R.id.group_contain)
        LinearLayout groupContain;
        @BindView(R.id.search_edit)
        EditText searchEdit;
        @BindView(R.id.search_image)
        ImageView searchImage;
        @BindView(R.id.requestbooknumber)
        TextView requestbooknumber;
        @BindView(R.id.exaimenumber)
        TextView exaimenumber;
        @BindView(R.id.allmoney)
        TextView allmoney;

        public ViewHolderOne(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
            viewpager.setAdapter(new MyPageAdapter());
            addPoint();
            isRunning = true;
            handler.sendEmptyMessageDelayed(0, 2000);
            viewpager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
                @Override
                public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

                }

                @Override
                public void onPageSelected(int position) {
                    position = position % (3);
                    groupContain.getChildAt(position).setEnabled(true);
                    groupContain.getChildAt(lastPosition).setEnabled(false);
                    lastPosition = position;
                }

                @Override
                public void onPageScrollStateChanged(int state) {

                }
            });
        }

        class MyPageAdapter extends PagerAdapter {
            @Override
            public int getCount() {
                // TODO Auto-generated method stub
                return Integer.MAX_VALUE;
            }

            @Override
            public boolean isViewFromObject(View arg0, Object arg1) {
                // TODO Auto-generated method stub
                return arg0 == arg1;
            }

            @Override
            public Object instantiateItem(ViewGroup container, final int position) {
                // TODO Auto-generated method stub
                ImageView iv = new ImageView(context);
                iv.setScaleType(ImageView.ScaleType.FIT_XY);
                // if (IsNetCanUse){
                Glide.with(context).load(ProConstant.ImageUrls[position % (3)]).error(R.mipmap.ic_launcher).into(iv);
                //}
                // iv.setImageBitmap(BitmapFactory.decodeResource(getResources(), pics[position%(pics.length)]));

                container.addView(iv);
                iv.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        // TODO Auto-generated method stub
                  /*  Intent intent=new Intent(getActivity(),BannerActivity.class);
                    intent.putExtra("position", String.valueOf(position%(pics.length)));
                    startActivity(intent);*/
                    }
                });
                return iv;
            }

            @Override
            public void destroyItem(ViewGroup container, int position, Object object) {
                container.removeView((ImageView) object);
                object = null;//编码规范好
                //super.destroyItem(container, position, object);
            }
        }

        private boolean isRunning;
        Handler handler = new Handler() {
            public void handleMessage(Message msg) {
                viewpager.setCurrentItem(viewpager.getCurrentItem() + 1);
                if (isRunning) {
                    handler.sendEmptyMessageDelayed(0, 2000);
                }
            }
        };

        private void addPoint() {
            groupContain.removeAllViews();
            for (int i = 0; i < 3; i++) {
                ImageView iv = new ImageView(context);
                iv.setBackgroundResource(R.drawable.point_bg);
                if (i == 0) {
                    iv.setEnabled(true);
                } else {
                    iv.setEnabled(false);
                }
                //因为要把view添加到一个线性布局，故需要一个线性布局的LayoutParams
                LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(DensityUtil.dip2px(context, 8), DensityUtil.dip2px(context, 8));
                params.rightMargin = DensityUtil.dip2px(context, 12);
                iv.setLayoutParams(params);
                groupContain.addView(iv);
            }
        }

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

    class ViewHolderThree extends RecyclerView.ViewHolder {
        /*  布局3*/
        @BindView(R.id.sucesspic)
        ImageView sucesspic;
        @BindView(R.id.sucessdecrp)
        TextView sucessdecrp;

        public ViewHolderThree(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }

    class ViewHolderFour extends RecyclerView.ViewHolder {
        /*  布局4*/
        @BindView(R.id.datapic)
        ImageView datapic;
        @BindView(R.id.dataname)
        TextView dataname;
        @BindView(R.id.datadetail)
        TextView datadetail;
        @BindView(R.id.datatime)
        TextView datatime;
        public ViewHolderFour(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }

}
