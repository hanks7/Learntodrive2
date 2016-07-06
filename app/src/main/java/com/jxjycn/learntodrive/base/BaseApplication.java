package com.jxjycn.learntodrive.base;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;
import com.baidu.mapapi.SDKInitializer;
import com.jxjycn.learntodrive.R;
import com.jxjycn.learntodrive.common.AppData;
import com.jxjycn.learntodrive.mine.bean.PersonInformationEntity;
import com.jxjycn.learntodrive.util.UtilLog;
import com.nostra13.universalimageloader.cache.disc.impl.UnlimitedDiskCache;
import com.nostra13.universalimageloader.cache.disc.naming.Md5FileNameGenerator;
import com.nostra13.universalimageloader.cache.memory.impl.UsingFreqLimitedMemoryCache;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;
import com.nostra13.universalimageloader.core.assist.QueueProcessingType;
import com.nostra13.universalimageloader.core.download.BaseImageDownloader;
import com.nostra13.universalimageloader.utils.StorageUtils;

import java.io.File;

//import com.umeng.socialize.PlatformConfig;

/**
 * 密钥库类型: JKS
 * 密钥库提供方: SUN
 * <p/>
 * 您的密钥库包含 1 个条目
 * <p/>
 * 别名: android
 * 创建日期: 2016-6-16
 * 条目类型: PrivateKeyEntry
 * 证书链长度: 1
 * 证书[1]:
 * 所有者: CN=jxjycn, OU=jxjycn, O=jxjycn, L=hefei, ST=anhui, C=86
 * 发布者: CN=jxjycn, OU=jxjycn, O=jxjycn, L=hefei, ST=anhui, C=86
 * 序列号: 4e466fcf
 * 有效期开始日期: Thu Jun 16 08:52:50 CST 2016, 截止日期: Mon Jun 10 08:52:50 CST 2041
 * 证书指纹:
 * MD5: DF:D7:ED:17:67:83:2E:8B:E8:47:B2:8C:93:3C:E8:68
 * SHA1: 68:75:D6:FD:D5:EB:52:B9:3D:81:02:9A:44:B2:54:B9:DE:2A:00:D2
 * SHA256: 23:0B:94:EB:80:7A:95:C7:09:E3:23:16:64:19:60:B6:DE:C6:E7:9F:46:AE:63:D9:73:2F:4E:5C:A1:8A:B9:65
 * 签名算法名称: SHA256withRSA
 * 版本: 3
 */
public class BaseApplication extends Application {

    public static BaseApplication application = null;
    public static Context context = null;
    public static RequestQueue queue = null;

    public static boolean isShowNewworkNotice = false;
    public static boolean isTYPE_WIFI = true;
    public static boolean isTYPE_MOBILE = false;
    public static int countNum = 0;
    public static BaseApplication instance;
    public DisplayImageOptions defaultOptions;
    public static int[][] tempSave = new int[7][18];//选择的时间列表保存是否点击状态,0:没有点击,1:点击;3:小于当前时间
    public ImageLoaderConfiguration config;
    public PersonInformationEntity personInformationEntity;


    @Override
    public void onCreate() {
        super.onCreate();

        // 在使用 SDK 各组间之前初始化 context 信息，传入 ApplicationContext
        SDKInitializer.initialize(this);
        application = this;
        context = getApplicationContext();
        initImageLoad();
        queue = Volley.newRequestQueue(this);
        instance = this;
        tempSave = setTempSave();
        saveLogin();//保存登陆
    }

    private int[][] setTempSave() {
        int[][] tempSave = new int[7][18];
        for (int i = 0; i < 7; i++) {
            for (int t = 0; t < 18; t++) {
                BaseApplication.tempSave[i][t] = 0;
            }
        }
        return tempSave;
    }


    public static BaseApplication getInstance() {
        return application;
    }

    public void saveLogin() {
        personInformationEntity=new PersonInformationEntity();
        SharedPreferences preferences = getSharedPreferences("UserInfo", 0);
        personInformationEntity.setIsLongin(preferences.getBoolean("isLongin",false));
        personInformationEntity.setMobile(preferences.getString("Mobile", ""));


    }


    public static RequestQueue getRequestQueueinstance() {
        if (queue == null) {
            queue = Volley.newRequestQueue(BaseApplication.getInstance());
        }
        return queue;
    }

    private void initImageLoad() {




        File cacheDir = StorageUtils.getOwnCacheDirectory(context,
                AppData.PATH_CHINATOU_CACHE);
        // displayImage(...) call if no options will be passed to this method
        defaultOptions = new DisplayImageOptions.Builder()
                .cacheInMemory(true).cacheOnDisc(true)
                .showImageForEmptyUri(R.mipmap.default_image)// 没有图片
                .showImageOnLoading(R.mipmap.default_image)// 加载中
                .showImageOnFail(R.mipmap.default_image).build();// 加载失败



        config = new ImageLoaderConfiguration.Builder(
                context)
                .memoryCacheExtraOptions(480, 800)
                        // max width, max height，即保存的每个缓存文件的最大长宽
                .threadPoolSize(3)
                        // 线程池内加载的数量
                .threadPriority(Thread.NORM_PRIORITY - 2)
                .denyCacheImageMultipleSizesInMemory()
                .memoryCache(new UsingFreqLimitedMemoryCache(2 * 1024 * 1024))
                        // 你可以通过自己的内存缓存实现
                .memoryCacheSize(2 * 1024 * 1024)
                .discCacheSize(50 * 1024 * 1024)
                .discCacheFileNameGenerator(new Md5FileNameGenerator())
                        // 将保存的时候的URI名称用MD5 加密
                .tasksProcessingOrder(QueueProcessingType.LIFO)
                .discCacheFileCount(100)
                        // 缓存的文件数量
                .discCache(new UnlimitedDiskCache(cacheDir))
                        // 自定义缓存路径
                .defaultDisplayImageOptions(defaultOptions)
                .imageDownloader(
                        new BaseImageDownloader(context, 5 * 1000, 30 * 1000)) // connectTimeout
                        // s)超时时间
                .writeDebugLogs() // Remove for release app
                .build();// 开始构建
        // Initialize ImageLoader with configuration.

        ImageLoader.getInstance().init(config);

 UtilLog.i("cacheDir.getPath()", cacheDir.getPath());

    }


}
