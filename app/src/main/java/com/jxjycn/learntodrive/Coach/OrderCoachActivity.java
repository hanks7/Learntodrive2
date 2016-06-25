package com.jxjycn.learntodrive.Coach;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;

import com.jxjycn.learntodrive.Coach.adapter.OrderCoachAdapter;
import com.jxjycn.learntodrive.R;
import com.jxjycn.learntodrive.base.BaseActivity;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import in.srain.cube.views.loadmore.LoadMoreContainer;
import in.srain.cube.views.loadmore.LoadMoreHandler;
import in.srain.cube.views.loadmore.LoadMoreListViewContainer;
import in.srain.cube.views.ptr.PtrClassicFrameLayout;
import in.srain.cube.views.ptr.PtrDefaultHandler;
import in.srain.cube.views.ptr.PtrFrameLayout;
import in.srain.cube.views.ptr.PtrHandler;

public class OrderCoachActivity extends BaseActivity {

    @Bind(R.id.order_coach_edt_input)
    EditText orderCoachEdtInput;
    @Bind(R.id.order_coach_iv_clear)
    ImageView orderCoachIvClear;
    @Bind(R.id.order_coach_lsv)
    ListView lsv;
    @Bind(R.id.order_coach_load_list_layout)
    LoadMoreListViewContainer loadListLayout;
    @Bind(R.id.order_coach_ptr_layout)
    PtrClassicFrameLayout ptrLayout;

    private int curPage = 1;//页码 1
    private int type;//1是刷新 2是加载

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_coach);
        ButterKnife.bind(this);
        setTitle(translateRstring(R.string.orderCoach), R.string.refresh, 0, null);

        initView();
        OrderCoachAdapter adapter = new OrderCoachAdapter(this, null);
        lsv.setAdapter(adapter);





    }



    @OnClick(R.id.order_coach_iv_clear)
    public void onClick() {
    }

    private void initView() {


        ptrLayout.setPtrHandler(new PtrHandler() {
            @Override
            public boolean checkCanDoRefresh(PtrFrameLayout frame, View content, View header) {
                return PtrDefaultHandler.checkContentCanBePulledDown(frame, lsv, header);
            }

            @Override
            public void onRefreshBegin(PtrFrameLayout frame) {
                curPage = 1;
                type = 1;

            }
        });
        loadListLayout.useDefaultHeader();
        loadListLayout.setLoadMoreHandler(new LoadMoreHandler() {
            @Override
            public void onLoadMore(LoadMoreContainer loadMoreContainer) {
                curPage++;
                type = 2;

            }
        });


    }


    public void erro() {
        ptrLayout.refreshComplete();
        loadListLayout.loadMoreFinish(false, true);
    }
}
