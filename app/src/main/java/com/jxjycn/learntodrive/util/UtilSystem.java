package com.jxjycn.learntodrive.util;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

import com.jxjycn.learntodrive.base.BaseApplication;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;
import java.util.List;

/**
 * Created by liu on 15/6/29.
 */
public class UtilSystem {

    //版本名
    public static String getVersionName() {
        return getPackageInfo(BaseApplication.context).versionName;
    }

    //版本号
    public static int getVersionCode() {
        return getPackageInfo(BaseApplication.context).versionCode;
    }

    private static PackageInfo getPackageInfo(Context context) {
        PackageInfo pi = null;

        try {
            PackageManager pm = context.getPackageManager();
            pi = pm.getPackageInfo(context.getPackageName(),
                    PackageManager.GET_CONFIGURATIONS);

            return pi;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return pi;
    }


    /**
     * 显示软键盘
     * @param context
     * @param view
     */
    public static void showKeyword(View view)
    {
        InputMethodManager imm = (InputMethodManager) view.getContext().getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.showSoftInput(view, 0);
    }

    /**
     * 隐藏软键盘
     * @param context
     * @param view
     */
    public static void hidKeyword( View view)
    {
        InputMethodManager imm = (InputMethodManager) view.getContext().getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }


    public static String getIP() {
        String IP = null;
        StringBuilder IPStringBuilder = new StringBuilder();
        try {
            Enumeration<NetworkInterface> networkInterfaceEnumeration = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaceEnumeration.hasMoreElements()) {
                NetworkInterface networkInterface = networkInterfaceEnumeration.nextElement();
                Enumeration<InetAddress> inetAddressEnumeration = networkInterface.getInetAddresses();
                while (inetAddressEnumeration.hasMoreElements()) {
                    InetAddress inetAddress = inetAddressEnumeration.nextElement();
                    if (!inetAddress.isLoopbackAddress()&&
                            !inetAddress.isLinkLocalAddress()&&
                            inetAddress.isSiteLocalAddress()) {
                        IPStringBuilder.append(inetAddress.getHostAddress().toString());
                    }
                }
            }
        } catch (SocketException ex) {

        }

        IP = IPStringBuilder.toString();
        return IP;
    }

    public static  boolean isAppBroughtToBackground(Context context)
    {
        ActivityManager am = (ActivityManager) context.getSystemService(Context.ACTIVITY_SERVICE);
        List<ActivityManager.RunningAppProcessInfo> appProcesses = am
                .getRunningAppProcesses();
        for (ActivityManager.RunningAppProcessInfo appProcess : appProcesses) {
            if (appProcess.processName.equals(context.getPackageName())) {
                /*
                BACKGROUND=400 EMPTY=500 FOREGROUND=100
                GONE=1000 PERCEPTIBLE=130 SERVICE=300 ISIBLE=200
                 */
                Log.i(context.getPackageName(), "此appimportace ="
                        + appProcess.importance
                        + ",context.getClass().getName()="
                        + context.getClass().getName());
                if (appProcess.importance != ActivityManager.RunningAppProcessInfo.IMPORTANCE_FOREGROUND) {
                    Log.i(context.getPackageName(), "处于后台"
                            + appProcess.processName);
                    return true;
                } else {
                    Log.i(context.getPackageName(), "处于前台"
                            + appProcess.processName);
                    return false;
                }
            }
        }
        return false;
    }
}
