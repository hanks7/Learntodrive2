package com.jxjycn.learntodrive.util;


import android.util.Log;

import com.jxjycn.learntodrive.common.AppData;


/**
 * 日志要统一处理。
 * @author hanks7
 *
 */
public class UtilLog {

	public static void i(Object tag,Object response)
	{
		if (AppData.isLog){

			return;
		}
		Log.i("--**"+tag+"**--","--**查看**--"+response);
	}


	public static void e(Object response)
	{
		if (AppData.isLog){

			return;
		}
		Log.e("--**查看**--", response + "  >>>");
	}

}
