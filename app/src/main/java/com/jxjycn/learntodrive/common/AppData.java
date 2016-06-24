package com.jxjycn.learntodrive.common;

import android.os.Environment;


/**
 * Created by liu on 15/6/1.
 */
public class AppData {





    public static String BASE_URL = "http://app.chinatou.com/app/";
    public static String URL_IMAGE = "http://app.chinatou.com/";
    public static String uid = null;
    public static String PATH = Environment.getExternalStorageDirectory().getAbsolutePath() + "/learntodrive/";
    public static String FILE_PATH = PATH + "lession/";
    public static String pageSize = "10";
//    public static String FILE_PATH = "/sdcard/learntodrive/";

    public static int photoCompressState=100;//拍照的压缩比例



    public static String textUrl="http://b.hiphotos.baidu.com/image/pic/item/d01373f082025aaf95bdf7e4f8edab64034f1a15.jpg";//测试的图片的url
    public static String textUrl2="http://ww1.sinaimg.cn/bmiddle/5ff14849jw1eyencwdhy9j20m80e3q53.jpg";//测试的图片的url
    public static String textUrl3="http://ww3.sinaimg.cn/bmiddle/6698b73bjw1eyfljev6e3j20sg0izdns.jpg";//测试的图片的url
    public static String textUrl4="http://img.my.csdn.net/uploads/201410/19/1413698883_5877.jpg";//测试的图片的url
    public static String apkURL="http://gdown.baidu.com/data/wisegame/f98d235e39e29031/baiduxinwen.apk";//测试的图片的url
    public static String imageloaderCache="learnToDrive/Cache";//imageloader缓存缓存文件夹


    public static String [] imageUrl={textUrl,textUrl2,textUrl3,textUrl4};//测试图片




//    public static LoginMesResult personMesResult;
    public static Boolean exit = false;//是否退出登录账号
    public static Boolean refushMineMess = false;//是否刷新个人数据
    public static Boolean isLog = false;//是否打印Log

    public static String CACHE = Environment.getExternalStorageDirectory().getAbsolutePath() + "/chintou/";
    public static String PATH_CHINATOU_CACHE = CACHE + "chintou/";    /**
     * 用户信息保存文件
     * *
     */
    public static String touxiang = "touxiang.dat";

    public static String usagbemoney;
}
