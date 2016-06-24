package com.jxjycn.learntodrive.SchoolRecord.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
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
    private View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_leran_record, null);
        ButterKnife.bind(this, view);

        int i = 11;

        if(i<13){
            vScrollView.post(new Runnable() {
                public void run() {
                    vScrollView.scrollTo(0, 1000);
                }
            });
        }
        setCarState(i);
        return view;
    }


    private void setCarState(int i) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) ivCar.getLayoutParams();
        int state = i * 41;
        int dpi = Tools.dip2px(getActivity(), state);
        layoutParams.bottomMargin = dpi;//将默认的距离底部20dp，改为0，这样底部区域全被listview填满。
        setAnimation(ivCar, dpi);
        ivCar.setLayoutParams(layoutParams);
    }


    // 综合实现set_demo.xml中的动画
    public void setAnimation(final View v, int dpi) {

        final TranslateAnimation animation = new TranslateAnimation(0, 0, dpi, 0);
        animation.setDuration(3000);//设置动画持续时间
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
