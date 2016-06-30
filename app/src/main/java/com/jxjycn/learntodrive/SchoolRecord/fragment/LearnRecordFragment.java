package com.jxjycn.learntodrive.SchoolRecord.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;

import com.jxjycn.learntodrive.R;
import com.jxjycn.learntodrive.util.Tools;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by hanks7 on 2016/6/15.
 */
public class LearnRecordFragment extends Fragment {
    @Bind(R.id.iv_car)
    ImageView ivCar;
    @Bind(R.id.scrollView)
    ScrollView vScrollView;
    @Bind(R.id.ll_scrollview)
    LinearLayout llScrollview;

    int i = 9;
    int everyBox = 45;//每个格子的间距

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_leran_record, null);
        ButterKnife.bind(this, view);
        setScrollViewdistance(i);
        return view;
    }

    private void setScrollViewdistance(final int i) {
        vScrollView.post(new Runnable() {
            public void run() {
                if (i > 17) {
                    vScrollView.post(new Runnable() {
                        @Override
                        public void run() {
                            vScrollView.scrollTo(0, Tools.dip2px(everyBox * i));
                        }
                    });

                } else {
                    vScrollView.post(new Runnable() {
                        @Override
                        public void run() {
                            vScrollView.fullScroll(ScrollView.FOCUS_DOWN);
                        }
                    });
                }
            }
        });
        setCarState(i);
    }


    private void setCarState(int i) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) ivCar.getLayoutParams();
        int px = Tools.dip2px(everyBox * i);
        layoutParams.bottomMargin = px;//将默认的距离底部20dp，改为0，这样底部区域全被listview填满。
        setAnimation(ivCar, px);
        ivCar.setLayoutParams(layoutParams);
    }


    // 综合实现set_demo.xml中的动画
    public void setAnimation(final View v, int px) {
        int duration = 3000;
        if (px < 6) duration = 500;
        final TranslateAnimation animation = new TranslateAnimation(0, 0, px, 0);
        animation.setDuration(duration);//设置动画持续时间
//        animation.setRepeatCount(1);//设置重复次数
//        animation.setRepeatMode(Animation.);//设置反方向执行
        animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                v.clearAnimation();
            }
            @Override
            public void onAnimationRepeat(Animation animation) {

            }


        });
        v.startAnimation(animation);

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }


}
