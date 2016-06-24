package com.jxjycn.learntodrive.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.GridView;

/**
 * Created by Eric.Chen on 2015/11/23. 类描述:自定义一个GridView控件 功能详细描述:
 * ScrollView嵌套GridView的解决办法
 */
public class BaseGridView extends GridView {

	public BaseGridView(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	public BaseGridView(Context context) {
		super(context);
	}

	public BaseGridView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
	}

	@Override
	public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
		int expandSpec = MeasureSpec.makeMeasureSpec(Integer.MAX_VALUE >> 2,
				MeasureSpec.AT_MOST);
		super.onMeasure(widthMeasureSpec, expandSpec);
	}
}
