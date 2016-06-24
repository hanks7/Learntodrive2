package com.jxjycn.learntodrive.util;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.jxjycn.learntodrive.R;

/**
 * Glide工具类
 * Created by liu on 15/6/29.
 */
public class UtilGlide {

    /**
     * 使用Glide加载图片
     * @param context
     * @param url
     * @param imageView
     */
    public static void loadImg(Context context, String url, ImageView imageView)
    {
        Glide.with(context).load(url).centerCrop().placeholder(R.mipmap.ic_launcher).crossFade().into(imageView);
    }

    public static void loadImg(Context context, String url, int resId, ImageView imageView)
    {
        Glide.with(context).load(url).centerCrop().placeholder(resId).crossFade().into(imageView);
    }

    public static void loadImg(Context context, String url, Drawable drawable, ImageView imageView) {
        Glide.with(context).load(url).placeholder(drawable).error(drawable).into(imageView);
    }
}
