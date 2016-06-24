package com.jxjycn.learntodrive.Coach.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.jxjycn.learntodrive.R;
import com.jxjycn.learntodrive.base.BaseActivity;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by hanks7 on 2016/6/21.
 */
public class LsvOrderTimeAdapter extends BaseAdapter {


    private BaseActivity context;
    private LayoutInflater inflater;
    private List<String> result;

    public LsvOrderTimeAdapter(BaseActivity context, List<String> result) {
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
            convertView = inflater.inflate(R.layout.item_confirm_order_class_lsv, null);
            viewHolder = new ViewHolder(convertView);
            convertView.setTag(viewHolder);

        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        return convertView;
    }

    static class ViewHolder {
        @Bind(R.id.textView5)
        TextView textView5;
        @Bind(R.id.textView6)
        TextView textView6;
        @Bind(R.id.textView7)
        TextView textView7;

        ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}
