package com.colang.testapp.adapter;

import android.content.Context;
import android.os.Parcelable;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.colang.testapp.R;


public class ImageSliderAdapter extends PagerAdapter {

    private Context context;
    private LayoutInflater _Inflater;

    public ImageSliderAdapter(Context context) {
        this.context = context;
        this._Inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return 5;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {

        View pager = null;
        pager = _Inflater.inflate(R.layout.displayvideo, null);
        ImageView ivMusicImage = (ImageView) pager.findViewById(R.id.ivMusicImage);
        container.addView(pager, 0);
        return pager;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public void restoreState(Parcelable arg0, ClassLoader arg1) {
    }

    @Override
    public Parcelable saveState() {
        return null;
    }
}
