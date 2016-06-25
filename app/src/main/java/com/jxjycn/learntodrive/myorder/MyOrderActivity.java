package com.jxjycn.learntodrive.myorder;

import android.os.Bundle;
import android.os.Handler;
import android.support.v4.widget.SwipeRefreshLayout;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.jxjycn.learntodrive.R;
import com.jxjycn.learntodrive.base.BaseActivity;
import com.jxjycn.learntodrive.myorder.adapter.LsvMyOrderAdapter;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MyOrderActivity extends BaseActivity {

    @Bind(R.id.lsv)
    ListView lsv;
    @Bind(R.id.swipe_container)
    SwipeRefreshLayout swipeContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_order);
        ButterKnife.bind(this);
        setTitle("我的订单", 0, 0, null);

        lsv.setAdapter(new LsvMyOrderAdapter(this, null));


        initSwipeLayout();

        lsv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                intentLeftToRight(OrderInformationActivity.class);
            }
        });




    }

    private void initSwipeLayout() {
        swipeContainer.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                onRefreshing();
            }
        });

        swipeContainer.setColorSchemeResources(
                android.R.color.holo_blue_light,
                android.R.color.holo_red_light,
                android.R.color.holo_orange_light,
                android.R.color.holo_green_light
        );
    }

    /**
     * 刷新业务
     */
    private void onRefreshing(){
        showToast("刷新开始");

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                showToast("finish()");
                swipeContainer.setRefreshing(false);
            }
        }, 3000);
    }



}
