package com.jxjycn.learntodrive.Coach.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.jxjycn.learntodrive.R;
import com.jxjycn.learntodrive.base.BaseActivity;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by hanks7 on 2016/6/16.
 */
public class OrderCoachAdapter extends BaseAdapter implements View.OnClickListener{

    @Bind(R.id.item_ordercoach_rl_item)
    RelativeLayout iRlItem;
    private BaseActivity context;
    private LayoutInflater inflater;
    private List<String> result;

    public OrderCoachAdapter(BaseActivity context, List<String> result) {
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
            convertView = inflater.inflate(R.layout.item_lsv_order_coach, null);
            viewHolder = new ViewHolder(convertView);
            convertView.setTag(viewHolder);

        }else{
            viewHolder=(ViewHolder)convertView.getTag();
        }
        viewHolder.iRlItem.setOnClickListener(this);
        viewHolder.iIvChoose.setOnClickListener(this);
        viewHolder.iRatingbar.setRating(4);
        return convertView;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.item_ordercoach_iv_choose:
                context.showToast("kfjaklsdjflas");
                    break;
            case R.id.item_ordercoach_rl_item:
                context.showToast("kfjaklsdjflas");
                    break;

        }
        
    }


    static class ViewHolder {
        @Bind(R.id.item_ordercoach_iv_head)
        ImageView iIvHead;
        @Bind(R.id.item_ordercoach_tv_phone)
        TextView iTvPhone;
        @Bind(R.id.item_ordercoach_ratingbar)
        RatingBar iRatingbar;
        @Bind(R.id.item_ordercoach_studentNum)
        TextView iStudentNum;
        @Bind(R.id.item_ordercoach_iv_choose)
        ImageButton iIvChoose;
        @Bind(R.id.item_ordercoach_tv_distance)
        TextView iTvDistance;
        @Bind(R.id.item_ordercoach_rl_item)
        RelativeLayout iRlItem;

        ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }


}
