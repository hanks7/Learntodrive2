package com.jxjycn.learntodrive.base;

/**
 * Activity中的回调接口类，�?要在Activity中实现该接口，便于控制器将数据层数据返回给Activity
 * @author zyj
 *
 */
public interface IResultListener {
	//开始
	public void onStart();
	//成功
	public void onSuccess(Object result);
	//失败
	public void onFailure(Object result);
	//网络连接错误
	public void onNetError();

}
