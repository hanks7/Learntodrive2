package com.jxjycn.learntodrive.Coach.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.jxjycn.learntodrive.Coach.StudentCommentActivity;
import com.jxjycn.learntodrive.R;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by hanks7 on 2016/6/21.
 */
public class StudentCommentListViewadapter extends BaseAdapter implements View.OnClickListener {


    private StudentCommentActivity context;
    private LayoutInflater inflater;
    private List<String> result;

    public StudentCommentListViewadapter(StudentCommentActivity context, List<String> result) {
        this.context = context;
        this.inflater = inflater.from(context);
        this.result = result;
    }

    @Override
    public int getCount() {
        return 5;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.item_lsv_student_comment, null);
            viewHolder = new ViewHolder(convertView);
            convertView.setTag(viewHolder);

        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        return convertView;
    }

    @Override
    public void onClick(View v) {

    }

    static class ViewHolder {
        @Bind(R.id.item_lsv_student_comment_iv_head)
        ImageView itemLsvStudentCommentIvHead;
        @Bind(R.id.item_lsv_student_comment_tv_name)
        TextView itemLsvStudentCommentTvName;
        @Bind(R.id.item_lsv_student_comment_tv_ratingBar)
        TextView itemLsvStudentCommentTvRatingBar;
        @Bind(R.id.item_lsv_student_comment_iv_ratingBar)
        RatingBar itemLsvStudentCommentIvRatingBar;
        @Bind(R.id.item_lsv_student_comment_tv_push_time)
        TextView itemLsvStudentCommentTvPushTime;
        @Bind(R.id.item_lsv_student_comment_studentNum)
        TextView itemLsvStudentCommentStudentNum;
        @Bind(R.id.item_lsv_student_comment_rl_item)
        RelativeLayout itemLsvStudentCommentRlItem;

        ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}
