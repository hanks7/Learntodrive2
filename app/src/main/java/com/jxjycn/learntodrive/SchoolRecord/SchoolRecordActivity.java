package com.jxjycn.learntodrive.SchoolRecord;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.RadioButton;

import com.jxjycn.learntodrive.R;
import com.jxjycn.learntodrive.SchoolRecord.fragment.LearnRecordFragment;
import com.jxjycn.learntodrive.SchoolRecord.fragment.TrainRecordFragment;
import com.jxjycn.learntodrive.base.BaseActivity;
import com.jxjycn.learntodrive.view.ScrollViewPager;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SchoolRecordActivity extends BaseActivity {
    @Bind(R.id.school_record_btn_learn)
    RadioButton vBtnlearn;
    @Bind(R.id.school_record_btn_train)
    RadioButton vBtntrain;
    @Bind(R.id.school_record_viewpager)
    ScrollViewPager vpMain;
    private List<Fragment> fragmentList = new ArrayList<Fragment>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_school_record);
        setTitle(translateRstring(R.string.SchoolRecordActivity), 0, 0, null);
        ButterKnife.bind(this);
        addFragment();
    }

    @OnClick({R.id.school_record_btn_learn, R.id.school_record_btn_train})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.school_record_btn_learn:
                vpMain.setCurrentItem(0);
                break;
            case R.id.school_record_btn_train:
                vpMain.setCurrentItem(1);
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


    private void addFragment() {
        fragmentList.add(new LearnRecordFragment());
        fragmentList.add(new TrainRecordFragment());
        FragmentManager fm = getSupportFragmentManager();
        MyPagerAdapter adapter = new MyPagerAdapter(fm);
        vpMain.setOffscreenPageLimit(2);// 防止ViewPager中的Fragment被销毁
        vpMain.setAdapter(adapter);
        vpMain.setCurrentItem(0);
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
                vBtnlearn.setChecked(true);
                vBtntrain.setChecked(false);

                break;
            case 1:
                vBtnlearn.setChecked(false);
                vBtntrain.setChecked(true);

                break;


        }
    }
}
