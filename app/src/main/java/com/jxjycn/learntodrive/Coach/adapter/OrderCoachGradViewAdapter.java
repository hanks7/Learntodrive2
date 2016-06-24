package com.jxjycn.learntodrive.Coach.adapter;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.jxjycn.learntodrive.Coach.OrderTimeTableActivity;
import com.jxjycn.learntodrive.R;
import com.jxjycn.learntodrive.util.UtilLog;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by hanks7 on 2016/6/20.
 */
public class OrderCoachGradViewAdapter extends BaseAdapter {

    private OrderTimeTableActivity context;
    private LayoutInflater inflater;
    private List<String> result;
    private int countNum=0;


    public OrderCoachGradViewAdapter(OrderTimeTableActivity context, List<String> result) {
        this.context = context;
        this.inflater = inflater.from(context);
        this.result = result;
    }

    @Override
    public int getCount() {

        return result.size();
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
    public View getView(final int position, View convertView, ViewGroup parent) {


        final ViewHolder viewHolder;
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.item_gradview_order_coach_time, null);
            viewHolder = new ViewHolder(convertView);

            convertView.setTag(viewHolder);

        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        viewHolder.vTvTimeChoosed.setText(result.get(position));
        viewHolder.vCheckChoosing.setText(result.get(position));
        viewHolder.vRlBg.setTag(1);
        Date date = new Date();

        if (!isChoosed(date, position)) {
            changeUI(viewHolder);
        } else {
            viewHolder.vRlBg.setBackgroundColor(Color.parseColor("#cacacc"));
        }


        return convertView;
    }

    private void changeUI(final ViewHolder viewHolder) {
        viewHolder.vRlBg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if ((int) viewHolder.vRlBg.getTag() == 1) {
                    viewHolder.vRlBg.setTag(2);
                    viewHolder.vRlBg.setBackgroundDrawable(context.getResources().getDrawable(R.mipmap.icon_checked));
                    viewHolder.vCheckChoosing.setTextColor(Color.parseColor("#FFffff"));
                    countNum=countNum+1;
                    context.changeCommiteButton(countNum );



                    UtilLog.i("countNum + 1",countNum);
                } else {


                    viewHolder.vRlBg.setTag(1);
                    viewHolder.vRlBg.setBackgroundColor(Color.parseColor("#FFffff"));
                    countNum=countNum-1;
                    context.changeCommiteButton(countNum);
                    UtilLog.i("countNum - 1", countNum);
                }

            }
        });
    }

    /**
     * 是否小于当前时间
     *
     * @param date
     * @param postion
     * @return
     */
    private boolean isChoosed(Date date, int postion) {
        postion = postion + 5;
        String dt = new SimpleDateFormat("HH").format(date);
        int mI = 0;
        if (dt.startsWith("0")) {
            dt = dt.replace("0", "");
        }
        mI = Integer.parseInt(dt);
        return mI >= postion;
    }


    static class ViewHolder {
        @Bind(R.id.item_gradview_order_coach_time_tv_time_choosed)
        TextView vTvTimeChoosed;
        @Bind(R.id.item_gradview_order_coach_time_check_choosing)
        TextView vCheckChoosing;
        @Bind(R.id.item_gradview_order_coach_time_ll_choosing)
        LinearLayout vLlChoosing;
        @Bind(R.id.item_gradview_order_coach_time_rl_bg)
        RelativeLayout vRlBg;
        ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}
