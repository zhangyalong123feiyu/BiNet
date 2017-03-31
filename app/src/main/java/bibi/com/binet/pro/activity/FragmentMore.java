package bibi.com.binet.pro.activity;


import android.os.Bundle;
import android.os.Environment;
import android.os.SystemClock;
import android.support.design.widget.BottomSheetDialog;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import bibi.com.binet.R;
import bibi.com.binet.pro.adapter.FileAdapter;
import bibi.com.binet.pro.util.ListFile;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentMore extends Fragment {


    @BindView(R.id.checkfilebutton)
    Button checkfilebutton;
    @BindView(R.id.filerecyclerview)
    RecyclerView filerecyclerview;
    private View view;
    private String FilePath= Environment.getExternalStorageDirectory().getAbsolutePath()+"/BiNet/";
    private List<String> filePath=new ArrayList<>();
    private List<String> fileName=new ArrayList<>();

    /*private String FileName=FilePath+"File"+*/
    public FragmentMore() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_more, container, false);

        ButterKnife.bind(this, view);

        return view;
    }

    @OnClick(R.id.checkfilebutton)
    public void onClick() {
        func(FilePath);
    }
    private  void func(String path) {
        File f=new File(path);
        try {
            FileWriter fileWriter=new FileWriter(FilePath+"zyl.txt");
            fileWriter.write("zhangyalong");
            fileWriter.close();
        } catch (IOException e) {

        }
        if (Environment.getExternalStorageState().equals(Environment.MEDIA_MOUNTED)){
            if(!f.exists()){
                f.mkdirs();
            }
            listFiles(f);
            Log.i("TAG","有了");
        }else {
            Log.i("TAG","没有");
        }

    }

    private  void listFiles(File f) {
        File[] allfile = f.listFiles();
        	for (int i = 0; i < allfile.length; i++) {
        				if (allfile[i].isDirectory()){
                            listFiles(allfile[i]);
                        }else {
                            filePath.add(allfile[i].getAbsolutePath());
                            fileName.add(allfile[i].getName());
                        }
        			}
        filerecyclerview.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.VERTICAL,false));
        filerecyclerview.setAdapter(new FileAdapter(getActivity(),filePath,fileName));
    }
}
