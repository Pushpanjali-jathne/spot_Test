package com.colang.testapp.view;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import com.colang.testapp.R;
import com.colang.testapp.adapter.ImageSliderAdapter;
import com.colang.testapp.adapter.MainActivityPagerAdapter;

public class MainActivity extends AppCompatActivity {

    private ViewPager imageSlidingViewPager;
    private ViewPager contentViewPager;
    private TabLayout tabLayout;
    private CirclePageIndicator indicator;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main);

        initWidgets();
        eventListerns();
        //setting values to viewpager

        ImageSliderAdapter homeViewPagerAdapter = new ImageSliderAdapter(this);
        imageSlidingViewPager.setAdapter(homeViewPagerAdapter);
        indicator.setViewPager(imageSlidingViewPager);

        //calling fragments

        MainActivityPagerAdapter adapter = new MainActivityPagerAdapter(getSupportFragmentManager(), tabLayout.getTabCount());
        contentViewPager.setAdapter(adapter);


    }

    private void eventListerns() {

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                contentViewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
            }
        });

        contentViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

    }

    private void initWidgets() {

        imageSlidingViewPager = (ViewPager) findViewById(R.id.image_sliding_viewpager);
        contentViewPager = (ViewPager) findViewById(R.id.content_viewpager);
        tabLayout = (TabLayout) findViewById(R.id.tablayout);
        indicator = (CirclePageIndicator) findViewById(R.id.indicator);

        tabLayout.addTab(tabLayout.newTab().setText(R.string.video_text).setIcon(R.drawable.video_tab_icon));
        tabLayout.addTab(tabLayout.newTab().setText(R.string.image_text).setIcon(R.drawable.image_tab_icon));
        tabLayout.addTab(tabLayout.newTab().setText(R.string.milestone_text).setIcon(R.drawable.milestone_tab_icon));


    }


}
