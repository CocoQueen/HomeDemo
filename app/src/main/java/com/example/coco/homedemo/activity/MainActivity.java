package com.example.coco.homedemo.activity;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTabHost;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TabHost;
import android.widget.TextView;

import com.example.coco.homedemo.R;
import com.example.coco.homedemo.fragment.HomeFragment;
import com.example.coco.homedemo.fragment.MineFragment;

public class MainActivity extends FragmentActivity {

    private FragmentTabHost mTb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

    }

    private void initView() {
        mTb = (FragmentTabHost) findViewById(android.R.id.tabhost);
        mTb.setup(this, getSupportFragmentManager(), android.R.id.tabcontent);

        TabHost.TabSpec homeSpec = mTb.newTabSpec("home").setIndicator(getBottomIndicator("首页",R.mipmap.ic_launcher_round));
        TabHost.TabSpec mineSpec = mTb.newTabSpec("mine").setIndicator(getBottomIndicator("我的",R.mipmap.ic_launcher_round));
        mTb.addTab(homeSpec, HomeFragment.class, null);
        mTb.addTab(mineSpec, MineFragment.class, null);


    }
    /*
    * 添加底部布局的方法
    * */
    private View getBottomIndicator(String title,int drawable){
        View v = LayoutInflater.from(this).inflate(R.layout.bottom,null,false);
        TextView mTv = (TextView) v.findViewById(R.id.mTv_bottom);
        ImageView mImg = (ImageView) v.findViewById(R.id.mImg_bottom);
        mTv.setText(title);
        mImg.setImageResource(drawable);
        return v;
    }
}
