package com.jxjycn.learntodrive.Coach;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;
import android.widget.RelativeLayout;

import com.jxjycn.learntodrive.Coach.adapter.GvDateSelectAdapter;
import com.jxjycn.learntodrive.Coach.adapter.OrderTimeTableGradViewAdapter;
import com.jxjycn.learntodrive.R;
import com.jxjycn.learntodrive.base.BaseActivity;
import com.jxjycn.learntodrive.home.biz.OrderTimeData;
import com.jxjycn.learntodrive.view.BaseGridView;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class OrderTimeTableActivity extends BaseActivity {


    @Bind(R.id.rl_coach_car)
    RelativeLayout rlCoachCar;
    @Bind(R.id.rl_stu_comment)
    RelativeLayout rlStuComment;
    @Bind(R.id.btn_commite)
    Button vbtncommite;

    @Bind(R.id.gv)
    BaseGridView vGv;
    @Bind(R.id.gv_date)
    GridView vGvdate;


    private ArrayList<String> list;
    private OrderTimeData timeDataTools = new OrderTimeData();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_time_table);
        ButterKnife.bind(this);
        setTitle(translateRstring(R.string.orderCoach), 0, 0, null);
        vbtncommite.setEnabled(false);
        initGridView();

    }




    @OnClick({R.id.rl_coach_car, R.id.rl_stu_comment, R.id.btn_commite})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.rl_coach_car:
                intentLeftToRight(StudentCommentActivity.class);
                break;
            case R.id.rl_stu_comment:
                intentLeftToRight(StudentCommentActivity.class);
                break;
            case R.id.btn_commite:
                ArrayList<String> list = timeDataTools.getTvTimeList();
                Bundle bundle=new Bundle();
                bundle.putStringArrayList("ArrayList",list);
                intentLeftToRight(ConfirmOrderActivity.class, bundle);

                break;
        }
    }

    /**
     * 回调执行在adapter中执行
     *
     * @param i
     */
    public void changeCommiteButton(int i) {
        if (i != 0) {

            vbtncommite.setBackgroundDrawable(getResources().getDrawable(R.drawable.nomal_button_selector));
            vbtncommite.setEnabled(true);

        } else {
            vbtncommite.setEnabled(false);
            vbtncommite.setBackgroundColor(getResources().getColor(R.color.gray));
        }
        vbtncommite.setTextColor(getResources().getColor(R.color.white));

    }

    /**
     *
     * @param position
     */
    public void changeLearnToDriveGradViewAdapter(int position) {
        OrderTimeTableGradViewAdapter adapter = new OrderTimeTableGradViewAdapter(this, list, position);
        vGv.setAdapter(adapter);
    }
    /**
     *
     */
    private void initGridView() {
        vGv.setFocusable(false); //让Grid不能获得focus
        list = timeDataTools.getStrings();
        GvDateSelectAdapter gvDateSelectAdapter = new GvDateSelectAdapter(this, new GvDateSelectAdapter.AdapterCallBack() {
            @Override
            public void contentOnClick(int position) {
                changeLearnToDriveGradViewAdapter(position);
            }
        });
        vGvdate.setAdapter(gvDateSelectAdapter);
        changeLearnToDriveGradViewAdapter(0);
    }

}
