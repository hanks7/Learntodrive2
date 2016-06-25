package com.jxjycn.learntodrive.base;


import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.Gravity;
import android.view.WindowManager;

import com.jxjycn.learntodrive.R;


public class LoadDialog extends Dialog{
	public LoadDialog(Context context) {
		super(context, R.style.CustomDialog);
	}
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.dialog_load);
		getWindow().setLayout(WindowManager.LayoutParams.MATCH_PARENT, WindowManager.LayoutParams.WRAP_CONTENT);
		getWindow().setGravity(Gravity.CENTER);
		setCanceledOnTouchOutside(false);
	}

	@Override
	public void cancel() {
		super.cancel();
	}
}
