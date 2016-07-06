package com.jxjycn.learntodrive.home;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.KeyEvent;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.jxjycn.learntodrive.R;
import com.jxjycn.learntodrive.base.BaseActivity;
import com.jxjycn.learntodrive.base.BaseApplication;
import com.jxjycn.learntodrive.home.Fragment.EnterFrament;
import com.jxjycn.learntodrive.home.Fragment.HomeWorkFragment;
import com.jxjycn.learntodrive.home.Fragment.LearnToDriveFragment;
import com.jxjycn.learntodrive.home.Fragment.PartnertrainFragment;
import com.jxjycn.learntodrive.setting.update.UpdateManager;
import com.jxjycn.learntodrive.view.Menu;
import com.jxjycn.learntodrive.view.NoScrollViewPager;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class HomeActivity extends BaseActivity {
    Menu menu;
    @Bind(R.id.home_rl_head)
    RelativeLayout vRlHead;
    @Bind(R.id.home_rl_message_note)
    RelativeLayout vRlMessageNote;
    @Bind(R.id.home_viewpager)
    NoScrollViewPager vpMain;
    @Bind(R.id.home_btn_enter)
    RadioButton vBtnEnter;
    @Bind(R.id.home_btn_homework)
    RadioButton vBtnHomework;
    @Bind(R.id.home_btn_learntodrive)
    RadioButton vBtnLearntodrive;
    @Bind(R.id.home_btn_partnertraining)
    RadioButton vBtnPartnertraining;
    long exitTime = 0;//点击两次返回得到的时间

    private List<Fragment> fragmentList = new ArrayList<Fragment>();
    public static HomeActivity homeActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        isHome = true;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        init();
        addFragment();
        checkUpdate();//检查软件更新
    }

    private void init() {
        BaseApplication.application.saveLogin();
        ButterKnife.bind(this);
        menu = new Menu(this);
        homeActivity=this;
    }

    /**
     *  检查软件更新
     */
    private void checkUpdate() {

        UpdateManager manager = new UpdateManager(this);
        manager.checkUpdate();// 检查软件更新
    }

    private void addFragment() {
        fragmentList.add(new EnterFrament());
        fragmentList.add(new HomeWorkFragment());
        fragmentList.add(new LearnToDriveFragment());
        fragmentList.add(new PartnertrainFragment());

        FragmentManager fm = getSupportFragmentManager();
        MyPagerAdapter adapter = new MyPagerAdapter(fm);

        vpMain.setOffscreenPageLimit(4);// 防止ViewPager中的Fragment被销毁
        vpMain.setAdapter(adapter);
        vpMain.setCurrentItem(2);
        vpMain.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                currentCheckState(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }


    public void currentCheckState(int itemID) {

        switch (itemID) {
            case 0:
                vBtnEnter.setChecked(true);
                vBtnHomework.setChecked(false);
                vBtnLearntodrive.setChecked(false);
                vBtnPartnertraining.setChecked(false);
                break;
            case 1:
                vBtnEnter.setChecked(false);
                vBtnHomework.setChecked(true);
                vBtnLearntodrive.setChecked(false);
                vBtnPartnertraining.setChecked(false);
                break;
            case 2:
                vBtnEnter.setChecked(false);
                vBtnHomework.setChecked(false);
                vBtnLearntodrive.setChecked(true);
                vBtnPartnertraining.setChecked(false);
                break;
            case 3:
                vBtnEnter.setChecked(false);
                vBtnHomework.setChecked(false);
                vBtnLearntodrive.setChecked(false);
                vBtnPartnertraining.setChecked(true);
                break;

        }


    }


    @OnClick({
            R.id.home_btn_enter,
            R.id.home_btn_homework,
            R.id.home_btn_learntodrive,
            R.id.home_btn_partnertraining,
            R.id.home_rl_head,
            R.id.home_rl_message_note
    })
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.home_btn_enter:
                vpMain.setCurrentItem(0);
                break;
            case R.id.home_btn_homework:
                vpMain.setCurrentItem(1);
                break;
            case R.id.home_btn_learntodrive:
                vpMain.setCurrentItem(2);
                break;
            case R.id.home_btn_partnertraining:
                vpMain.setCurrentItem(3);
                break;

            case R.id.home_rl_head:
                menu.showMenu();

                break;
            case R.id.home_rl_message_note:
                intentLeftToRight(NoticeActivity.class);
                break;
        }

    }

    class MyPagerAdapter extends FragmentPagerAdapter {
        public MyPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return fragmentList.get(position);
        }

        @Override
        public int getCount() {
            return fragmentList.size();
        }

    }

    /**
     * 点击两次返回
     */
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            exit();
            return false;
        }
        return super.onKeyDown(keyCode, event);
    }

    public void exit() {
        if ((System.currentTimeMillis() - exitTime) > 2000) {
            Toast.makeText(getApplicationContext(), "再按一次退出"+getResources().getString(R.string.app_name),
                    Toast.LENGTH_SHORT).show();
            exitTime = System.currentTimeMillis();
        } else {
            finish();
            System.exit(0);

        }
    }


}
