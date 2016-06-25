package com.jxjycn.learntodrive.Coach;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.jxjycn.learntodrive.Coach.adapter.OrderCoachGradViewAdapter;
import com.jxjycn.learntodrive.Coach.biz.GetCurrentTime;
import com.jxjycn.learntodrive.R;
import com.jxjycn.learntodrive.base.BaseActivity;
import com.jxjycn.learntodrive.view.BaseGridView;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class OrderTimeTableActivity extends BaseActivity {

    @Bind(R.id.gv)
    BaseGridView vGv;
    @Bind(R.id.tv_dayOf_week_0)
    TextView tvDayOfWeek0;
    @Bind(R.id.tv_dayOf_week_1)
    TextView tvDayOfWeek1;
    @Bind(R.id.tv_dayOf_week_2)
    TextView tvDayOfWeek2;
    @Bind(R.id.tv_dayOf_week_3)
    TextView tvDayOfWeek3;
    @Bind(R.id.tv_dayOf_week_4)
    TextView tvDayOfWeek4;
    @Bind(R.id.tv_dayOf_week_5)
    TextView tvDayOfWeek5;
    @Bind(R.id.tv_dayOf_week_6)
    TextView tvDayOfWeek6;
    @Bind(R.id.tv_dayOf_week_list_0)
    RadioButton tvDayOfWeekList0;
    @Bind(R.id.tv_dayOf_week_list_1)
    RadioButton tvDayOfWeekList1;
    @Bind(R.id.tv_dayOf_week_list_2)
    RadioButton tvDayOfWeekList2;
    @Bind(R.id.tv_dayOf_week_list_3)
    RadioButton tvDayOfWeekList3;
    @Bind(R.id.tv_dayOf_week_list_4)
    RadioButton tvDayOfWeekList4;
    @Bind(R.id.tv_dayOf_week_list_5)
    RadioButton tvDayOfWeekList5;
    @Bind(R.id.tv_dayOf_week_list_6)
    RadioButton tvDayOfWeekList6;
    @Bind(R.id.rl_coach_car)
    RelativeLayout rlCoachCar;
    @Bind(R.id.rl_stu_comment)
    RelativeLayout rlStuComment;
    @Bind(R.id.btn_commite)
    Button vbtncommite;


    private ArrayList<TextView> tv_dayOf_week_list;
    private ArrayList<RadioButton> tv_dayOf_moth_list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_time_table);
        ButterKnife.bind(this);

        setTitle(translateRstring(R.string.orderCoach), 0, 0, null);

        vbtncommite.setEnabled(false);
        ArrayList<String> list = getStrings();
        OrderCoachGradViewAdapter adapter = new OrderCoachGradViewAdapter(this, list);
        vGv.setAdapter(adapter);
        vGv.setFocusable(false); //让Grid不能获得focus
        getDayWeekList();
        GetCurrentTime getCurrentTime = new GetCurrentTime(tv_dayOf_week_list, tv_dayOf_moth_list);
        getCurrentTime.commit();

    }

    private void getDayWeekList() {
        tv_dayOf_week_list = new ArrayList<>();
        tv_dayOf_week_list.add(tvDayOfWeek0);
        tv_dayOf_week_list.add(tvDayOfWeek1);
        tv_dayOf_week_list.add(tvDayOfWeek2);
        tv_dayOf_week_list.add(tvDayOfWeek3);
        tv_dayOf_week_list.add(tvDayOfWeek4);
        tv_dayOf_week_list.add(tvDayOfWeek5);
        tv_dayOf_week_list.add(tvDayOfWeek6);

        tv_dayOf_moth_list = new ArrayList<>();
        tv_dayOf_moth_list.add(tvDayOfWeekList0);
        tv_dayOf_moth_list.add(tvDayOfWeekList1);
        tv_dayOf_moth_list.add(tvDayOfWeekList2);
        tv_dayOf_moth_list.add(tvDayOfWeekList3);
        tv_dayOf_moth_list.add(tvDayOfWeekList4);
        tv_dayOf_moth_list.add(tvDayOfWeekList5);
        tv_dayOf_moth_list.add(tvDayOfWeekList6);
    }

    @NonNull
    private ArrayList<String> getStrings() {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 5; i < 23; i++) {
            String str = v(i);
            list.add(str);
        }
        return list;
    }


    private String v(int t) {
        String s = t + ":00" + "-" + (t + 1) + ":00";

        return s;

    }

    @OnClick({R.id.rl_coach_car, R.id.rl_stu_comment,R.id.btn_commite})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.rl_coach_car:
                intentLeftToRight(StudentCommentActivity.class);
                break;
            case R.id.rl_stu_comment:
                intentLeftToRight(StudentCommentActivity.class);
                break;
            case R.id.btn_commite:
                intentLeftToRight(ConfirmOrderActivity.class);
                break;
        }
    }

    /**
     * 回调执行在adapter中执行
     * @param i
     */
    public void changeCommiteButton(int i){
        if(i!=0){

            vbtncommite.setBackgroundDrawable(getResources().getDrawable(R.drawable.nomal_button_selector));
            vbtncommite.setEnabled(true);

        }else{
            vbtncommite.setEnabled(false);
            vbtncommite.setBackgroundColor(getResources().getColor(R.color.gray));
        }
        vbtncommite.setTextColor(getResources().getColor(R.color.white));

    }
}
