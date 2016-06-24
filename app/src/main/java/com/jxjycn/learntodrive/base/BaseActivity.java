package com.jxjycn.learntodrive.base;

import android.app.Activity;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.jxjycn.learntodrive.R;
import com.jxjycn.learntodrive.util.ConnectionChangeReceiver;
import com.jxjycn.learntodrive.util.UtilIntent;
import com.jxjycn.learntodrive.util.UtilNetStatus;
import com.jxjycn.learntodrive.util.UtilPixelTransfrom;
import com.jxjycn.learntodrive.util.UtilToast;
import com.r0adkll.slidr.Slidr;
import com.r0adkll.slidr.model.SlidrConfig;
import com.umeng.analytics.MobclickAgent;

/**
 * Created by houjianjun on 16/5/29.
 */
public class BaseActivity extends FragmentActivity {

    private LoadDialog loadDialog;
    //是否是上传文件请求
    public boolean isUpload = false;
    protected boolean isHome = false;
    protected boolean isWelcome = false;
    protected  ConnectionChangeReceiver myReceiver;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (!isHome) {
            SlidrConfig config = new SlidrConfig.Builder()
                    .velocityThreshold(2400)
                    .distanceThreshold(.25f)
                    .edge(true)
                    .touchSize(UtilPixelTransfrom.dip2px(this, 32))
                    .velocityThreshold(2000)
                    .build();
            // Attach the Slidr Mechanism to this activity
            Slidr.attach(this, config);

        }
        if (!isWelcome) {
//            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
//
//                setTranslucentStatus(this, true);
//                SystemBarTintManager tintManager = new SystemBarTintManager(this);
//                // enable status bar tint
//                tintManager.setStatusBarTintEnabled(true);
//                // enable navigation bar tint
//                tintManager.setNavigationBarTintEnabled(true);
//                tintManager.setStatusBarTintResource(R.color.c14acf0);
//
//            }


        }


        registerReceiver();




    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unregisterReceiver();
    }




    private static void setTranslucentStatus(Activity activity, boolean on) {

        Window win = activity.getWindow();

        WindowManager.LayoutParams winParams = win.getAttributes();

        final int bits = WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS;

        if (on) {

            winParams.flags |= bits;

        } else {

            winParams.flags &= ~bits;

        }

        win.setAttributes(winParams);

    }


    @Override
    protected void onResume() {

        MobclickAgent.onResume(this);


        super.onResume();
    }

    @Override
    protected void onPause() {

        MobclickAgent.onPause(this);
        super.onPause();
    }

    /**
     * 显示标题
     *
     * @param title
     */
//    protected void showTitle(String title) {
//        TextView tv_title = (TextView) findViewById(R.id.tv_title);
//        tv_title.setText(title);
//        ImageView iv_left = (ImageView) findViewById(R.id.iv_left);
//        TextView tv_left = (TextView) findViewById(R.id.tv_left);
//        tv_left.setVisibility(View.GONE);
//        RelativeLayout rl_right = (RelativeLayout) findViewById(R.id.rl_layout_right);
//        rl_right.setVisibility(View.GONE);
//    }

//
//    @Override
//    protected void onDestroy() {
//        super.onDestroy();
//        if (queue != null) {
//            System.out.println(this.getClass().getName());
//            queue.cancelAll(this.getClass().getName());
//        }
//    }

    /**
     * 描述：Toast提示文本.
     *
     * @param text 文本
     */
    public void showToast(String text) {
        UtilToast.showToast(text);
    }

    /**
     * 描述：Toast提示文本.
     *
     * @param resId 文本的资源ID
     */
    public void showToast(int resId) {
        UtilToast.showToast(getString(resId));
    }

    /**
     * 加载框
     */
    public void showLoadDialog() {
        if (loadDialog != null) {
            loadDialog.show();
        } else {
            loadDialog = new LoadDialog(this);
            loadDialog.show();
        }
    }

    /**
     *
     */
    public void removeLoadDialog() {
        if (loadDialog != null) {
            if (loadDialog.isShowing()) {
                loadDialog.dismiss();
            }
        }
    }

    public void onback(View view) {
        finishAnim(this);
    }

    public void finishAnim(Activity activity) {
        UtilIntent.finishDIY(activity);
    }

    /**
     * 页面跳转
     *
     * @param classes c
     */
    public void intentLeftToRight(final Class<?> classes) {
        UtilIntent.intentDIYLeftToRight(this, classes);
    }

    /**
     * 自定义页面跳转动画
     *
     * @param classes   目标
     * @param enterAnim 进入动画文件ID
     * @param exitAnim  退出动画文件ID
     */
    public void intent(final Class<?> classes, final int enterAnim, final int exitAnim) {
        UtilIntent.intentDIYLeftToRight(this, classes, enterAnim, exitAnim);
    }

    /**
     * 页面跳转
     *
     * @param classes 目标
     * @param map     参数
     */
    public void intentLeftToRight(final Class<?> classes, final Bundle bundle) {
        UtilIntent.intentDIYLeftToRight(this, classes, bundle);
    }

    public void intentBottomToTop(final Class<?> classes) {
        UtilIntent.intentDIYBottomToTop(this, classes);
    }

    public void intentBottomToTop(final Class<?> classes, final Bundle bundle) {
        UtilIntent.intentDIYBottomToTop(this, classes, bundle);
    }

    public void intentResultLeftToRight(final Class<?> classes, final int requestCode) {
        UtilIntent.intentResultDIY(this, classes, requestCode);
    }

    public void intentResultLeftToRight(final Class<?> classes, final int requestCode, final Bundle bundle) {
        UtilIntent.intentResultDIY(this, classes, bundle, requestCode);
    }

    public void intent(final Class<?> classes) {
        UtilIntent.intentDIY(this, classes);
    }


    /**
     * 自定义页面跳转
     *
     * @param classes   目标
     * @param map       参数
     * @param enterAnim 进入动画文件ID
     * @param exitAnim  退出动画文件ID
     */
    protected void intent(final Class<?> classes, final Bundle bundle, final int enterAnim, final int exitAnim) {
        UtilIntent.intentDIYLeftToRight(BaseActivity.this, classes, bundle, enterAnim, exitAnim);
    }


    public void finishAnimLeftToRight() {
        UtilIntent.finishDIYLeftToRight(this);
    }


    public void finishAnimBottomToTop() {
        UtilIntent.finishDIYBottomToTop(this);
    }

    @Override
    public void onBackPressed() {
        finishAnimLeftToRight();
    }

    public void onBack(View v) {
        finishAnimLeftToRight();
    }

    /**
     * 左边图片点击事件
     *
     * @param v
     */
    public void leftImaget(View v) {

    }

    /**
     * 左边文字点击事件
     *
     * @param v
     */
    public void leftText(View v) {

    }

    /**
     * 右边图片点击事件
     *
     * @param v
     */
    public void rightImage(View v) {

    }

    /**
     * 右边文字点击事件
     *
     * @param v
     */
    public void rightText(View v) {


    }


    /**
     *   <include
     *   android:id="@+id/in_title"
     *   layout="@layout/app_title" >
     *   </include>
     *
     * @param titleName_id  int  标题名称
     * @param Rmipmap  R.mipmap.bill  默认值 0 表示隐藏图片按钮
     * @param NextName_id    下一步名称,0表示隐藏文字.
     * @param runnable   下一步,需要执行的事件
     *
     *
     * 	eg:setTitleNme(R.id.app_name, 0, 0, null);
     */
    public void setTitle(String titleName_id,int NextName_id,int Rmipmap,final Runnable runnable) {

        try {

            TextView title = (TextView)findViewById(R.id.title_tv);
            RelativeLayout title_rl_return=(RelativeLayout)findViewById(R.id.title_rl_return);
            ImageView title_iv_next = (ImageView)findViewById(R.id.title_iv_next);
            TextView tv_next = (TextView)findViewById(R.id.title_tv_next);
            LinearLayout title_rl_next=(LinearLayout)findViewById(R.id.title_rl_next);

            if(NextName_id!=0 && Rmipmap == 0){//有文字

                String NextName=getResources().getString(NextName_id);

                title_iv_next.setVisibility(View.GONE);
                tv_next.setVisibility(View.VISIBLE);
                tv_next.setText("  "+NextName+"  ");
                title_rl_next.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        runnable.run();
                    }
                });
            }else if(NextName_id==0 && Rmipmap != 0){//有图
                tv_next.setVisibility(View.GONE);
                title_iv_next.setVisibility(View.VISIBLE);
                title_iv_next.setImageDrawable((getResources().getDrawable(Rmipmap)));
                title_iv_next.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        runnable.run();
                    }
                });

            }else{//都没有
                tv_next.setVisibility(View.GONE);
                title_iv_next.setVisibility(View.GONE);
            }

            title_rl_return.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    onBackPressed();
                }
            });
            title.setText(titleName_id);

        } catch (Exception e) {

        }

    }

    public void setTitleonActivityResult(String titleName_id,final Runnable runnable) {

        TextView title = (TextView)findViewById(R.id.title_tv);
        RelativeLayout title_rl_return=(RelativeLayout)findViewById(R.id.title_rl_return);

        title_rl_return.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                runnable.run();
            }
        });
        title.setText(titleName_id);

    }

    public String translateRstring(int rStringID){
        return  getResources().getString(rStringID);
    }

    private  void registerReceiver(){
        IntentFilter filter=new IntentFilter(ConnectivityManager.CONNECTIVITY_ACTION);
        myReceiver=new ConnectionChangeReceiver();
        this.registerReceiver(myReceiver, filter);
    }

    private  void unregisterReceiver(){
        this.unregisterReceiver(myReceiver);
    }


}
