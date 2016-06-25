package com.jxjycn.learntodrive.myorder;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.jxjycn.learntodrive.R;
import com.jxjycn.learntodrive.base.BaseActivity;
import com.jxjycn.learntodrive.home.HomeActivity;

import butterknife.Bind;
import butterknife.ButterKnife;

public class OrderInformationActivity extends BaseActivity implements View.OnClickListener {

    @Bind(R.id.tv_order_num)
    TextView tvOrderNum;
    @Bind(R.id.tv_name)
    TextView tvName;
    @Bind(R.id.tv_phone)
    TextView tvPhone;
    @Bind(R.id.tv_entrytype)
    TextView tvEntrytype;
    @Bind(R.id.tv_really_name)
    TextView tvReallyName;
    @Bind(R.id.tv_identify)
    TextView tvIdentify;
    @Bind(R.id.tv_transaction_num)
    TextView tvTransactionNum;
    @Bind(R.id.tv_order_time)
    TextView tvOrderTime;
    @Bind(R.id.tv_count)
    TextView tvCount;
    @Bind(R.id.tv_fact_pay)
    TextView tvFactPay;
    @Bind(R.id.btn_cancel_order)
    Button btnCancelOrder;
    @Bind(R.id.btn_2pay)
    Button btn2pay;
    private PopupWindow popWindow;
    private AlertDialog mDialog;
    private PopupWindow popWindow2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_information);
        ButterKnife.bind(this);
        setTitle(translateRstring(R.string.OrderInformationActivity), 0, 0, null);

        btnCancelOrder.setOnClickListener(this);
        btn2pay.setOnClickListener(this);



    }




    /**
     * 弹出的Popwindows
     */
    public void showSubmitPopwindows(View parent) {
        LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.dialogpopupwindows, null, false);
        popWindow = new PopupWindow(
                view,
                RelativeLayout.LayoutParams.MATCH_PARENT,
                RelativeLayout.LayoutParams.MATCH_PARENT,
                true
        );

        //必须设置BackgroundDrawable后setOutsideTouchable(true)才会有效。这里在XML中定义背景，所以这里设置为null;
        popWindow.setBackgroundDrawable(new BitmapDrawable(getResources(),
                (Bitmap) null));
        popWindow.update();
        popWindow.showAtLocation(parent, Gravity.CENTER, 0, 0);
        popWindow.setOutsideTouchable(true); //点击外部关闭。
//        popWindow.setAnimationStyle(android.R.style.Animation_Dialog);    //设置一个动画。
        popWindow.setAnimationStyle(R.style.PopupWindowAnimation);

        TextView tv_no = (TextView) view.findViewById(R.id.popwindows_tv_no);
        TextView tv_yes = (TextView) view.findViewById(R.id.popwindows_tv_yes);

        RelativeLayout rl = (RelativeLayout) view.findViewById(R.id.popwindows_rl);
        RelativeLayout rl_not_click = (RelativeLayout) view.findViewById(R.id.rl_not_click);

        tv_no.setOnClickListener(this);
        tv_yes.setOnClickListener(this);
        rl.setOnClickListener(this);
        rl_not_click.setOnClickListener(this);


    }

    /**
     * 弹出的Popwindows
     */
    public void showPopwindowsYes(View parent) {
        LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.dialogpopupwindowsyes, null, false);

        popWindow2 = new PopupWindow(
                view,
                RelativeLayout.LayoutParams.MATCH_PARENT,
                RelativeLayout.LayoutParams.MATCH_PARENT,
                true
        );

        //必须设置BackgroundDrawable后setOutsideTouchable(true)才会有效。这里在XML中定义背景，所以这里设置为null;
        popWindow2.setBackgroundDrawable(new BitmapDrawable(getResources(),
                (Bitmap) null));
        popWindow2.update();
        popWindow2.showAtLocation(parent, Gravity.CENTER, 0, 0);
        popWindow2.setOutsideTouchable(true); //点击外部关闭。
//        popWindow2.setAnimationStyle(android.R.style.Animation_Dialog);    //设置一个动画。
        popWindow.setAnimationStyle(R.style.PopupWindowAnimation);

        RelativeLayout rl = (RelativeLayout) view.findViewById(R.id.popwindows_rl);
        LinearLayout rl_not_click = (LinearLayout) view.findViewById(R.id.rl_not_click);
        TextView tv_goback_home = (TextView) view.findViewById(R.id.tv_goback_home);
        TextView tv_telephone_num = (TextView) view.findViewById(R.id.tv_telephone_num);
        rl.setOnClickListener(this);
        rl_not_click.setOnClickListener(this);
        tv_goback_home.getPaint().setFlags(Paint.UNDERLINE_TEXT_FLAG); //下划线
        tv_goback_home.getPaint().setAntiAlias(true);//抗锯齿
        tv_goback_home.setOnClickListener(this);
        tv_telephone_num.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.popwindows_tv_no:
                popWindow.dismiss();
                break;
            case R.id.popwindows_tv_yes:
                popWindow.dismiss();
                showPopwindowsYes(v);
                break;
            case R.id.btn_cancel_order:

                showSubmitPopwindows(v);
                break;
            case R.id.btn_2pay:
                break;
            case R.id.popwindows_rl:

                popWindow.dismiss();
                if(popWindow2!=null)
                popWindow2.dismiss();
                break;
            case R.id.tv_goback_home:
              intentLeftToRight(HomeActivity.class);
                break;
            case R.id.tv_telephone_num:
                Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "11111111111"));
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

                break;
        }

    }
}
