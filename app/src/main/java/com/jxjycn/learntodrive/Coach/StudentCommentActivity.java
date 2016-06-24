package com.jxjycn.learntodrive.Coach;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.jxjycn.learntodrive.Coach.adapter.StudentCommentListViewadapter;
import com.jxjycn.learntodrive.R;
import com.jxjycn.learntodrive.base.BaseActivity;

import butterknife.Bind;
import butterknife.ButterKnife;

public class StudentCommentActivity extends BaseActivity {

    @Bind(R.id.student_comment_ll_hide)
    LinearLayout vLlHide;
    @Bind(R.id.student_comment_lsv)
    ListView vLsv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_comment);
        ButterKnife.bind(this);
        setTitle("学员评价", 0, 0, null);

//        hideVllHide();//显示暂无数据

        vLsv.setAdapter(new StudentCommentListViewadapter(this,null));


    }

    /**
     * 显示暂无数据
     */
    private void hideVllHide() {
        vLlHide.setVisibility(View.VISIBLE);
    }
}
