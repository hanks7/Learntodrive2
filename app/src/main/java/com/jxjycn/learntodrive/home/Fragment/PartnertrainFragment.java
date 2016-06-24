package com.jxjycn.learntodrive.home.Fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RelativeLayout;

import com.jxjycn.learntodrive.Coach.OrderCoachActivity;
import com.jxjycn.learntodrive.Coach.OrderTimeTableActivity;
import com.jxjycn.learntodrive.R;
import com.jxjycn.learntodrive.util.UtilIntent;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by hanks7 on 2016/6/15.
 */
public class PartnertrainFragment extends Fragment {
    @Bind(R.id.partner_booktime)
    RelativeLayout partnerBooktime;
    @Bind(R.id.partner_coach)
    RelativeLayout partnerCoach;
    @Bind(R.id.partner_btn_enter)
    RadioButton partnerBtnEnter;
    @Bind(R.id.partner_btn_homework)
    RadioButton partnerBtnHomework;
    private View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_partnertrain, null);
        ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }

    @OnClick({R.id.partner_booktime, R.id.partner_coach, R.id.partner_btn_enter, R.id.partner_btn_homework})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.partner_booktime:
                UtilIntent.intentDIYLeftToRight(getActivity(), OrderTimeTableActivity.class);
                break;
            case R.id.partner_coach:
                UtilIntent.intentDIYLeftToRight(getActivity(), OrderCoachActivity.class);
                break;
            case R.id.partner_btn_enter:

                break;
            case R.id.partner_btn_homework:
                break;
        }
    }
}
