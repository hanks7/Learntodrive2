package com.jxjycn.learntodrive.util;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by liu on 15/11/24.
 */
public class UtilAnimation {

    public static void scaleView(final View view, final int id)
    {
        final float scale = 1.2f;
        AnimatorSet scaleSet = new AnimatorSet();

        ValueAnimator valueAnimatorSmall = ValueAnimator.ofFloat(1.0f, scale);
        valueAnimatorSmall.setDuration(200);

        ValueAnimator valueAnimatorLarge = ValueAnimator.ofFloat(scale, 1.0f);
        valueAnimatorLarge.setDuration(200);

        valueAnimatorSmall.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {

            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                float scale = (Float) animation.getAnimatedValue();
                view.setScaleX(scale);
                view.setScaleY(scale);
            }
        });
        valueAnimatorLarge.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {

            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                float scale = (Float) animation.getAnimatedValue();
                view.setScaleX(scale);
                view.setScaleY(scale);
            }
        });
        valueAnimatorSmall.addListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animation) {
                ImageView imageView = (ImageView) view;
                imageView.setImageResource(id);
            }

            @Override
            public void onAnimationEnd(Animator animation) {

            }

            @Override
            public void onAnimationCancel(Animator animation) {

            }

            @Override
            public void onAnimationRepeat(Animator animation) {

            }
        });

        scaleSet.play(valueAnimatorLarge).after(valueAnimatorSmall);
        scaleSet.start();
    }
}
