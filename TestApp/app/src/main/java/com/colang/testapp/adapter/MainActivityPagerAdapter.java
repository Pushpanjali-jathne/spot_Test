package com.colang.testapp.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.colang.testapp.fragment.ImageFragment;
import com.colang.testapp.fragment.MilestoneFragment;
import com.colang.testapp.fragment.VideoFragment;


public class MainActivityPagerAdapter extends FragmentPagerAdapter {

    private int numOfTabs;

    public MainActivityPagerAdapter(FragmentManager fm, int count) {
        super(fm);
        this.numOfTabs = count;
    }

    @Override
    public Fragment getItem(int position) {

        Fragment fragment = null;

        switch (position) {
            case 0:
                fragment = new VideoFragment();
                break;
            case 1:
                fragment = new ImageFragment();
                break;
            case 2 :
                fragment = new MilestoneFragment();
                break;
        }

        return fragment;
    }

    @Override
    public int getCount() {
        return numOfTabs;
    }
}
