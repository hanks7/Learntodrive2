package com.jxjycn.learntodrive.base;

import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import java.util.List;

/**
 * Created by gengjiajia on 16/1/14.
 */
public class BaseViewPageAdapter extends PagerAdapter {
    private List<LinearLayout> collectionSubList;

    public BaseViewPageAdapter(List<LinearLayout> views) {
        this.collectionSubList = views;
    }

    @Override
    public int getCount() {
        return collectionSubList.size();
    }


    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        container.addView(collectionSubList.get(position));
        return collectionSubList.get(position);
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView(collectionSubList.get(position));
    }
}
