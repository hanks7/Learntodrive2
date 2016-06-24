package com.jxjycn.learntodrive.view;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bigkoo.convenientbanner.ConvenientBanner;
import com.bigkoo.convenientbanner.holder.CBViewHolderCreator;
import com.bigkoo.convenientbanner.holder.Holder;
import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;
import com.jxjycn.learntodrive.R;
import com.jxjycn.learntodrive.SchoolRecord.SchoolRecordActivity;
import com.jxjycn.learntodrive.common.AppData;
import com.jxjycn.learntodrive.mine.PersonalInfromationActivity;
import com.jxjycn.learntodrive.myorder.MyOrderActivity;
import com.jxjycn.learntodrive.util.UtilGlide;
import com.jxjycn.learntodrive.util.UtilIntent;
import com.jxjycn.learntodrive.welcome.WelcomeActivity;

import java.util.ArrayList;


public class Menu implements View.OnClickListener{


    ImageView menuIvHead;
    TextView menuTvCount;
    TextView menuTvPhoneNum;
    ImageView imageView;
    RelativeLayout menuRlHead;
    TextView textView;
    TextView menuTvDengji;
    TextView textView3;
    TextView menuTvState;
    ImageView menuIvMywallet;
    TextView menuTvMywallet;
    RelativeLayout menuRlMywallet;
    ImageView menuIvOrder;
    TextView menuTvOrder;
    RelativeLayout menuRlOrder;
    ImageView menuIvRecord;
    TextView menuTvRecord;
    RelativeLayout menuRlRecord;
    ImageView menuIvRecommend;
    TextView menuTvRecommend;
    RelativeLayout menuRlRecommend;
    ImageView menuIvHelp;
    TextView menuTvHelp;
    RelativeLayout menuRlHelp;
    ImageView menuIvSetting;
    TextView menuTvSetting;
    RelativeLayout menuRlSetting;
    ConvenientBanner convenientBanner;
    
    
    
    private Activity context;
    SlidingMenu slidingMenu;
    private RelativeLayout iv_head;
    private Intent intent;

    //有参构造
    public Menu(Activity activity)   {
        this.context = activity;
        this.slidingMenu = new SlidingMenu(activity);
        sliding(activity);

        init();


    }

    private void init() {
         ;

        menuTvDengji  = (TextView) context.findViewById(R.id.menu_tv_dengji);
        menuTvState= (TextView) context.findViewById(R.id.menu_tv_state);

        menuRlHead= (RelativeLayout) context.findViewById(R.id.menu_rl_head);
        menuRlMywallet   = (RelativeLayout) context.findViewById(R.id.menu_rl_mywallet);
        menuRlOrder  = (RelativeLayout) context.findViewById(R.id.menu_rl_order);
        menuRlRecord = (RelativeLayout) context.findViewById(R.id.menu_rl_record);
        menuRlRecommend= (RelativeLayout) context.findViewById(R.id.menu_rl_recommend);
        menuRlHelp = (RelativeLayout) context.findViewById(R.id.menu_rl_help);
        menuRlSetting = (RelativeLayout) context.findViewById(R.id.menu_rl_setting);
        convenientBanner = (ConvenientBanner) context.findViewById(R.id.convenientBanner);

        menuRlHead.setOnClickListener(this);
        menuRlMywallet.setOnClickListener(this);
        menuRlOrder.setOnClickListener(this);
        menuRlRecord.setOnClickListener(this);
        menuRlRecommend.setOnClickListener(this);
        menuRlHelp.setOnClickListener(this);
        menuRlSetting.setOnClickListener(this);


        initConvenientBanner();

    }

    private void initConvenientBanner() {
        convenientBanner.setFocusable(true);
        convenientBanner.setFocusableInTouchMode(true);
        convenientBanner.requestFocus();

        ArrayList<Slider> sliders=new ArrayList<Slider>();
        for (int i = 0; i < AppData.imageUrl.length ; i++) {
            Slider slider=new Slider();
            slider.setCompanyImg(AppData.imageUrl[i]);
            sliders.add(slider);

        }
        convenientBanner.setPages(
                new CBViewHolderCreator<LocalImageHolderView>() {
                    @Override
                    public LocalImageHolderView createHolder() {
                        return new LocalImageHolderView();
                    }
                }, sliders)
                //设置两个点图片作为翻页指示器，不设置则没有指示器，可以根据自己需求自行配合自己的指示器,不需要圆点指示器可用不设
                .setPageIndicator(new int[]{R.mipmap.white_radio, R.mipmap.blue_radio})
                        //设置指示器的方向
                .setPageIndicatorAlign(ConvenientBanner.PageIndicatorAlign.ALIGN_PARENT_RIGHT);

        convenientBanner.startTurning(3000);
    }

    private void sliding(Activity activity) {
        slidingMenu.setMode(SlidingMenu.LEFT);
        // 设置触摸屏幕的模式
        slidingMenu.setTouchModeBehind(SlidingMenu.TOUCHMODE_MARGIN);
        //	        menu.setTouchModeAbove(SlidingMenu.TOUCHMODE_FULLSCREEN);
        slidingMenu.setShadowWidthRes(R.dimen.shadow_width);
        slidingMenu.setShadowDrawable(null);
        // 设置滑动菜单视图的宽度
        slidingMenu.setBehindOffsetRes(R.dimen.slidingmenu_offset);
        // 设置渐入渐出效果的值
        slidingMenu.setFadeDegree(0.35f);
        //侧边栏显示在哪个activity中
        slidingMenu.attachToActivity(activity, SlidingMenu.SLIDING_CONTENT);
        //为侧滑菜单设置布局
        slidingMenu.setMenu(R.layout.menu);

    }

    public void showMenu() {
        if (slidingMenu.isMenuShowing() || slidingMenu.isSecondaryMenuShowing()) {
            slidingMenu.showContent();
        } else {
            slidingMenu.showMenu();

        }
    }
    public void closeMenu() {
        slidingMenu.showContent();
    }


    /**
     * 页面跳转
     *
     * @param classes c
     */
    public void intentLeftToRight(final Class<?> classes) {
        UtilIntent.intentDIYLeftToRight(context, classes);
    }


    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.menu_rl_head:
                intentLeftToRight(PersonalInfromationActivity.class);

                break;
            case R.id.menu_rl_mywallet:
                intentLeftToRight(WelcomeActivity.class);
                break;
            case R.id.menu_rl_order:
                          intentLeftToRight(MyOrderActivity.class);
                break;
            case R.id.menu_rl_record:
                intentLeftToRight(SchoolRecordActivity.class);
                break;
            case R.id.menu_rl_recommend:


                break;
            case R.id.menu_rl_help:
                break;
            case R.id.menu_rl_setting:
                break;
        }

    }
}

class LocalImageHolderView implements Holder<Slider> {
    private ImageView imageView;

    @Override
    public View createView(Context context) {
        imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        return imageView;
    }

    @Override
    public void UpdateUI(Context context, final int position, Slider data) {
        UtilGlide.loadImg(context, data.getCompanyImg(), R.mipmap.default_image, imageView);
    }


}
