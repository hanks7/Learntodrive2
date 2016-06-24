package com.jxjycn.learntodrive.welcome;

import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

import com.jxjycn.learntodrive.R;
import com.jxjycn.learntodrive.base.BaseActivity;
import com.jxjycn.learntodrive.home.HomeActivity;
import com.jxjycn.learntodrive.util.UtilSPutil;
import com.jxjycn.learntodrive.util.UtilSystem;

import butterknife.Bind;
import butterknife.ButterKnife;

public class WelcomeActivity extends BaseActivity {
    @Bind(R.id.welcome_activity_iv_welcome)
    ImageView ivWelcome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        isHome = true;
        isWelcome=true;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        ButterKnife.bind(this);
//        intentLeftToRight(GuidActivity.class);
//        延迟两秒跳转
        intentActivity();
    }

    private void intentActivity() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                selecterIntent();
            }
        }, 1000);
    }

    private void selecterIntent() {
        if(UtilSPutil.getInstance().getInt("code")== UtilSystem.getVersionCode()){

            intentLeftToRight(HomeActivity.class);finish();
        }else{
            intentLeftToRight(GuidActivity.class);finish();
        }
    }
}
