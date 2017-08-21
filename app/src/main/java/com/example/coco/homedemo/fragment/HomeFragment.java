package com.example.coco.homedemo.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.example.coco.homedemo.R;
import com.example.coco.homedemo.adapter.AdsAdapter;
import com.example.coco.homedemo.model.GetAds;
import com.example.coco.homedemo.view.BottomContent;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by coco on 2017/7/27.
 */

public class HomeFragment extends Fragment {
    private int currentPosition = 0;
    private Button mBtn;
    private BottomContent content;
    private List<ImageView>list =new ArrayList<>();
    private ViewPager mVp;
    private AdsAdapter adapter;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.home_fragment, null, false);
        initView(v);
        initDate();
        return v;
    }

    private void initDate() {
        GetAds getAds = new GetAds() {
            @Override
            protected void showAds(List<String> guidepic) {

            }
        };
    }

    private void initView(View v) {
       mVp= (ViewPager) v.findViewById(R.id.mVp);
    }
}
