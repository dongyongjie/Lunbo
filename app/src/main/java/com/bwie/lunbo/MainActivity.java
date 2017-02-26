package com.bwie.lunbo;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bwie.lunbo.bean.RootBean;
import com.google.gson.Gson;
import com.youth.banner.Banner;
import com.youth.banner.BannerConfig;
import com.youth.banner.loader.ImageLoader;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import java.util.ArrayList;
import java.util.List;

import okhttp3.Call;

public class MainActivity extends AppCompatActivity {
    private List<String> images = new ArrayList<>();
    private List<String> name=new ArrayList<>();
    private List<String> titles=new ArrayList<>();
    private List<RootBean.ItemsBean> items;
    private Banner banner;
    private TextView title;
    private RecyclerView recyclerView;
    private Handler handler=new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            switch (msg.what){
                case 0:
                    for (RootBean.ItemsBean list:items
                            ) {
                        name.add(list.getPath());
//                        Log.i("TAG", "onResponse: "+name.size());
                        titles.add(list.getTitle());
                    }
                    lun();
                    break;
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        images.add("http://m.xxxiao.com/wp-content/uploads/sites/3/2016/09/m.xxxiao.com_09fd0951e3fa9f37ecfcdd54602c41cd-682x1024.jpg");
        images.add("http://m.xxxiao.com/wp-content/uploads/sites/3/2016/09/m.xxxiao.com_09fd0951e3fa9f37ecfcdd54602c41cd-682x1024.jpg");
        images.add("http://m.xxxiao.com/wp-content/uploads/sites/3/2016/09/m.xxxiao.com_09fd0951e3fa9f37ecfcdd54602c41cd-682x1024.jpg");
        initView();


    }
    public void initView(){
        title = (TextView) findViewById(R.id.title);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        banner = (Banner) findViewById(R.id.banner);
        OkHttpUtils.get().url("http://i.dxy.cn/snsapi/event/count/list/all")
                .build()
                .execute(new StringCallback() {



                    @Override
                    public void onError(Call call, Exception e) {

                    }

                    @Override
                    public void onResponse(Call call, String s) {
//                        Log.i("TAG", "onResponse: "+s);
                        Gson gson = new Gson();
                        RootBean bean = gson.fromJson(s, RootBean.class);
                        items = bean.getItems();
                        Message msg=new Message();
                        msg.what=0;
                        msg.obj= items;
                        handler.sendMessage(msg);

                    }

                });
    }
    public void lun(){
        banner.setBannerStyle(BannerConfig.CIRCLE_INDICATOR);
        banner.setImages(name);
        banner.setDelayTime(3000);
        banner.setImageLoader(new ImageLoader() {
            @Override
            public void displayImage(Context context, Object path, ImageView imageView) {
                Glide.with(context.getApplicationContext())
                        .load(path)
                        .crossFade()
                        .into(imageView);
            }
        });
        banner.start();
        banner.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {
                title.setText(titles.get(state));
            }
        });
    }
}
