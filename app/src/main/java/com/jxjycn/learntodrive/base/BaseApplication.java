package com.jxjycn.learntodrive.base;

import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;
import com.baidu.mapapi.SDKInitializer;
import com.nostra13.universalimageloader.cache.disc.impl.UnlimitedDiskCache;
import com.nostra13.universalimageloader.cache.disc.naming.HashCodeFileNameGenerator;
import com.nostra13.universalimageloader.cache.memory.impl.LruMemoryCache;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;
import com.nostra13.universalimageloader.core.assist.ImageScaleType;
import com.nostra13.universalimageloader.core.assist.QueueProcessingType;
import com.nostra13.universalimageloader.core.display.SimpleBitmapDisplayer;
import com.nostra13.universalimageloader.core.download.BaseImageDownloader;
import com.nostra13.universalimageloader.utils.StorageUtils;
//import com.umeng.socialize.PlatformConfig;

import java.io.File;

/**
 * 密钥库类型: JKS
 密钥库提供方: SUN

 您的密钥库包含 1 个条目

 别名: android
 创建日期: 2016-6-16
 条目类型: PrivateKeyEntry
 证书链长度: 1
 证书[1]:
 所有者: CN=jxjycn, OU=jxjycn, O=jxjycn, L=hefei, ST=anhui, C=86
 发布者: CN=jxjycn, OU=jxjycn, O=jxjycn, L=hefei, ST=anhui, C=86
 序列号: 4e466fcf
 有效期开始日期: Thu Jun 16 08:52:50 CST 2016, 截止日期: Mon Jun 10 08:52:50 CST 2041
 证书指纹:
 MD5: DF:D7:ED:17:67:83:2E:8B:E8:47:B2:8C:93:3C:E8:68
 SHA1: 68:75:D6:FD:D5:EB:52:B9:3D:81:02:9A:44:B2:54:B9:DE:2A:00:D2
 SHA256: 23:0B:94:EB:80:7A:95:C7:09:E3:23:16:64:19:60:B6:DE:C6:E7:9F:46:AE:63:D9:73:2F:4E:5C:A1:8A:B9:65
 签名算法名称: SHA256withRSA
 版本: 3
 */
public class BaseApplication extends Application {

    private static BaseApplication application = null;
    public static Context context = null;
    public static RequestQueue queue = null;

    public static boolean isShowNewworkNotice=false;
    public static boolean isTYPE_WIFI=true;
    public static boolean isTYPE_MOBILE =false;

    public static BaseApplication instance;
    public DisplayImageOptions defaultOptions;


    @Override
    public void onCreate() {
        super.onCreate();

        // 在使用 SDK 各组间之前初始化 context 信息，传入 ApplicationContext
        SDKInitializer.initialize(this);
        application = this;
        context = getApplicationContext();
        queue = Volley.newRequestQueue(this);
        initImageLoad();
//        initUM();
    }

//    private void initUM() {
//        PlatformConfig.setWeixin("wxb69878cd9241eb83", "2b2f94b8d765326aaa2f1f454db36c2e");
//        //微信 appid appsecret
//
//
//        PlatformConfig.setSinaWeibo("3463738408", "bc78526674f9117d68af948e8c312dc9");
//
//        //新浪微博 appkey appsecret
//
//        PlatformConfig.setQQZone("1105185993", "1B9OPvo62beJX14k");
//        // QQ和Qzone appid appkey
//    }

    public static RequestQueue getRequestQueueinstance() {
        if (queue == null) {
            queue = Volley.newRequestQueue(BaseApplication.getInstance());
        }
        return queue;
    }


    public static BaseApplication getInstance() {
        return application;


    }

    private void initImageLoad() {

        defaultOptions = new DisplayImageOptions.Builder()
//                .showImageOnLoading(R..mipmap.book_default_image_gried) // resource or drawable
//                .showImageForEmptyUri(R.mipmap.book_default_image_gried) // resource or drawable
//                .showImageOnFail(R.mipmap.book_default_image_gried) // resource or drawable
                .resetViewBeforeLoading(false)  // default
                .delayBeforeLoading(1000)
                .cacheInMemory(false) // default
                .cacheOnDisc(false) // default
                .imageScaleType(ImageScaleType.IN_SAMPLE_POWER_OF_2) // default
                .bitmapConfig(Bitmap.Config.ARGB_8888) // default
                .displayer(new SimpleBitmapDisplayer()) // default
                .handler(new Handler()) // default
                .build();


        File cacheDir = StorageUtils.getCacheDirectory(getApplicationContext());
        ImageLoaderConfiguration config = new ImageLoaderConfiguration.Builder(getApplicationContext())
                .memoryCacheExtraOptions(480, 800) // default = device screen dimensions
                .discCacheExtraOptions(480, 800, null)
                .threadPriority(Thread.NORM_PRIORITY - 2) // default
                .tasksProcessingOrder(QueueProcessingType.FIFO) // default
                .denyCacheImageMultipleSizesInMemory()
                .memoryCache(new LruMemoryCache(2 * 1024 * 1024))
                .memoryCacheSize(2 * 1024 * 1024)
                .memoryCacheSizePercentage(13) // default
                .discCache(new UnlimitedDiskCache(cacheDir)) // default
                .discCacheSize(50 * 1024 * 1024)
                .discCacheFileCount(100)
                .discCacheFileNameGenerator(new HashCodeFileNameGenerator()) // default
                .imageDownloader(new BaseImageDownloader(getApplicationContext())) // default
                .defaultDisplayImageOptions(defaultOptions) // defaul
                .build();

        ImageLoader.getInstance().init(config);

    }


}
