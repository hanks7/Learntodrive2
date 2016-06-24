package com.jxjycn.learntodrive.Coach;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.RelativeLayout;

import com.jxjycn.learntodrive.Coach.adapter.LsvOrderTimeAdapter;
import com.jxjycn.learntodrive.R;
import com.jxjycn.learntodrive.base.BaseActivity;
import com.jxjycn.learntodrive.view.ListViewForScrollView;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ConfirmOrderActivity extends BaseActivity {

    @Bind(R.id.lsv_order_time)
    ListViewForScrollView lsvOrderTime;
    @Bind(R.id.lsv_order_class)
    ListViewForScrollView vlsvOrderClass;
    @Bind(R.id.rl_coupon)
    RelativeLayout vRlcoupon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm_order);
        ButterKnife.bind(this);
        setTitle("学车预约确认", 0, 0, null);


        String[] strs = new String[]{
                "2016-6-21 16:00-17.00", "2016-6-21 16:00-17.00", "2016-6-21 16:00-17.00", "2016-6-21 16:00-17.00", "2016-6-21 16:00-17.00"
        };


        lsvOrderTime.setAdapter(new ArrayAdapter<String>(this, R.layout.item_confirm_order_time_lsv, strs));
        vlsvOrderClass.setAdapter(new LsvOrderTimeAdapter(this, null));



    }


    @OnClick({R.id.rl_coupon, R.id.iv_next})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.rl_coupon:

                Bundle bundle=new Bundle();
                bundle.putString("webUrl","https://wap.baidu.com/");
                bundle.putString("title_name","https://wap.baidu.com/");
                intentLeftToRight(WebActivity.class,bundle);

                break;

        }
    }
}