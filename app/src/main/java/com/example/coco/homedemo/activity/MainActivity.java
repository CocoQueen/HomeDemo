package com.example.coco.homedemo.activity;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTabHost;
import android.view.View;
import android.widget.TabHost;

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
        View v = View.inflate(this,R.layout.bottom,null);
        View v2 = View.inflate(this,R.layout.bottom_mine,null);

        TabHost.TabSpec homeSpec = mTb.newTabSpec("home").setIndicator(v);
        TabHost.TabSpec mineSpec = mTb.newTabSpec("mine").setIndicator(v2);
        mTb.addTab(homeSpec, HomeFragment.class, null);
        mTb.addTab(mineSpec, MineFragment.class, null);


    }
}
