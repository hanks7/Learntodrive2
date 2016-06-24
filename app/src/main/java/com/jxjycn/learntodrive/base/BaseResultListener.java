package com.jxjycn.learntodrive.base;


import com.jxjycn.learntodrive.bean.BaseResult;

public class BaseResultListener implements IResultListener {
	private BaseActivity activity;

	public BaseResultListener(BaseActivity act) {
		activity = act;
	}

	@Override
	public void onStart() {
	}

	@Override
	public void onSuccess(Object result) {
		activity.removeLoadDialog();
	}

	@Override
	public void onFailure(Object result) {
		// TODO Auto-generated method stub
		activity.removeLoadDialog();
		if(result != null) {
			BaseResult baseResult = (BaseResult) result;
			activity.showToast(baseResult.getMsg());
		}
		else
		{
			activity.showToast("网络异常");
		}
	}

	@Override
	public void onNetError() {
		onFailure(null);
	}


}
