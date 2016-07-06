package com.jxjycn.learntodrive.util;

/**
 * Created by hanks7 on 2016/6/22.
 */

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.jxjycn.learntodrive.base.BaseApplication;

/**
 * @author Javen
 *
 */
public class ConnectionChangeReceiver extends BroadcastReceiver {
    private boolean is;
    @Override
    public void onReceive(Context context, Intent intent) {

        judgeNetWorkConnect();
    }

    /**
     * 判断网络状态
     */
    private void judgeNetWorkConnect() {
        int NetWorkConnectionType= UtilNetStatus.getNetWorkConnectionType();
        switch (NetWorkConnectionType){
            case 1:
                if(!BaseApplication.isTYPE_WIFI)
                UtilToast.showToast("wifi网路连接");
                BaseApplication.isTYPE_WIFI=true;
                BaseApplication.isShowNewworkNotice=false;
                break;
            case 0:
                if(!BaseApplication.isTYPE_MOBILE)
                UtilToast.showToast("数据流量连接");
                BaseApplication.isTYPE_MOBILE=true;
                BaseApplication.isShowNewworkNotice=false;
                break;
            case -1:
                if(!BaseApplication.isShowNewworkNotice)
                UtilToast.showToast("网络不可用");
                BaseApplication.isShowNewworkNotice=true;
                BaseApplication.isTYPE_WIFI=false;
                BaseApplication.isTYPE_MOBILE=false;
                break;
        }
//        UtilToast.showToast(BaseApplication.isTYPE_WIFI+"--"+   BaseApplication.isTYPE_MOBILE+"--"+   BaseApplication.isShowNewworkNotice);
    }
}
