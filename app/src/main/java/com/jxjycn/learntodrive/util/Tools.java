package com.jxjycn.learntodrive.util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.media.ExifInterface;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Environment;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.jxjycn.learntodrive.base.BaseApplication;
import com.nostra13.universalimageloader.core.ImageLoader;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author sks
 */
public class Tools {
    //	Intent intent=new Intent(this,MainActivity.class);startActivity(intent);finish();

    /**
     * @return yyyy-MM-dd_HH:mm:ss
     */
    public static void intentActivity(Context context, Class<?> c) {
        Intent intent = new Intent(context, c);
        context.startActivity(intent);

    }

    /**
     * @return yyyy-MM-dd_HH:mm:ss
     */
    public static String getDataTime() {
        String name = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss").format(new Date()) + "";

        return name;
    }

    /**
     * @return yyyyMMdd_HHmmss
     */
    public static String getDataTimePhoto() {
        String name = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date()) + "";
        return name;
    }

    /**
     * @param context
     * @return 当前版本号
     * @throws NameNotFoundException
     */
    public static String getCurrentVersion(Context context) throws NameNotFoundException {
        PackageManager manager = context.getPackageManager();
        String packageName = context.getPackageName();
        PackageInfo packageInfo = manager.getPackageInfo(packageName, 0);
        return packageInfo.versionName;
    }


    /**
     * 通过网址就可以拿到bitmap
     *
     * @param url
     * @return
     */
    public static Bitmap returnBitMap(String url) {
        URL myFileUrl = null;
        Bitmap bitmap = null;
        try {
            myFileUrl = new URL(url);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        try {
            HttpURLConnection conn = (HttpURLConnection) myFileUrl
                    .openConnection();
            conn.setDoInput(true);
            conn.connect();
            InputStream is = conn.getInputStream();
            bitmap = BitmapFactory.decodeStream(is);
            is.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return bitmap;
    }

    @SuppressWarnings("deprecation")
    public static void imageLoader(Context context, String url, ImageView imageView) {


        ImageLoader.getInstance().displayImage(url, imageView, BaseApplication.instance.defaultOptions);


    }


    /**
     * 手机号正则表达式
     *
     * @param text
     * @return
     */
    public static boolean checkBody(String text) {
        Pattern pat = Pattern
                .compile("^((13[0-9])|(15[^4,\\D])|(18[0,5-9]))\\d{8}$");
        Matcher mat = pat.matcher(text);
        boolean rs = mat.find();
        return rs;
    }

    /**
     * 密码正则表达式
     *
     * @param text
     * @return
     */
    public static boolean checkPassword(String text) {
        Pattern pat = Pattern
                .compile("^[0-9a-zA-Z]{6,16}");
        Matcher mat = pat.matcher(text);
        boolean rs = mat.find();
        return rs;
    }

    /**
     * 手机验证码正则表达式
     *
     * @param text
     * @return
     */
    public static boolean checkYanzhengma(String text) {
        Pattern pat = Pattern
                .compile("^\\d{6}$");
        Matcher mat = pat.matcher(text);
        boolean rs = mat.find();
        return rs;
    }

    private static final String TAG = Tools.class.getSimpleName();

    /**
     * sdcard 路径
     */
    public static final String SDCARD_PATH = Environment.getExternalStorageDirectory().getPath() + "/hanliuquan";

    /**
     * 屏幕尺寸
     */
    public static int SCREEN_WIDHT = 480;// 宽度
    public static int SCREEN_HEIGHT = 800; // 高度


    public static Bitmap getBitmapFromSD(String path) {
        try {
            File mFile = new File(path);
            if (mFile.exists()) {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = false;
                options.inSampleSize = 4;
                Bitmap bitmap = BitmapFactory.decodeFile(path, options);
                return bitmap;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


    public static String md5(String string) {
        byte[] hash;
        try {
            hash = MessageDigest.getInstance("MD5").digest(string.getBytes("UTF-8"));
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Huh, MD5 should be supported?", e);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("Huh, UTF-8 should be supported?", e);
        }
        StringBuilder hex = new StringBuilder(hash.length * 2);
        for (byte b : hash) {
            if ((b & 0xFF) < 0x10)
                hex.append("0");
            hex.append(Integer.toHexString(b & 0xFF));
        }
        return hex.toString();
    }


    /**
     * 定义一个函数将dp转换为像素
     *
     * @param context
     * @param dp
     * @return
     */
    public static int Dp2Px(Context context, float dp) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dp * scale + 0.5f);
    }


    // 获取当前版本号
    public static String getVersionCode(Activity context) {
        PackageInfo pkg;
        String versionCode = null;
        try {
            pkg = context.getPackageManager().getPackageInfo(context.getApplication().getPackageName(), 0);
            versionCode = pkg.versionCode + "";
        } catch (NameNotFoundException e) {
            e.printStackTrace();
        }
        return versionCode;
    }

    // 获取当前版本号
    public static String getVerID(Activity context) {
        PackageInfo pkg;
        String versionCode = null;
        try {
            pkg = context.getPackageManager().getPackageInfo(context.getApplication().getPackageName(), 0);
            versionCode = pkg.versionName + "";
        } catch (NameNotFoundException e) {
            e.printStackTrace();
        }
        return versionCode;
    }


    /**
     * @param specifiedDay
     * @return
     * @throws Exception
     */
    public static String getSpecifiedDayBefore(String specifiedDay) {
        Calendar c = Calendar.getInstance();
        Date date = null;
        try {
            date = new SimpleDateFormat("yyyy-MM-dd").parse(specifiedDay);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        c.setTime(date);
        int day = c.get(Calendar.DATE);
        c.set(Calendar.DATE, day - 1);

        String dayBefore = new SimpleDateFormat("yyyy-MM-dd").format(c.getTime());
        return dayBefore;
    }

    /**
     * @param specifiedDay
     * @return
     */
    public static String getSpecifiedDayAfter(String specifiedDay) {
        Calendar c = Calendar.getInstance();
        Date date = null;
        try {
            date = new SimpleDateFormat("yyyy-MM-dd").parse(specifiedDay);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        c.setTime(date);
        int day = c.get(Calendar.DATE);
        c.set(Calendar.DATE, day + 1);

        String dayAfter = new SimpleDateFormat("yyyy-MM-dd").format(c.getTime());
        return dayAfter;
    }

    // Bitmap 转 Drawable
    public static Drawable bitmapToDrawable(Bitmap bitmap) {
        Drawable drawable = new BitmapDrawable(bitmap);
        return drawable;
    }


    /**
     * 读取图片属性：旋转的角度
     *
     * @param path 图片绝对路径
     * @return degree旋转的角度
     */
    public static int readPictureDegree(String path) {
        int degree = 0;
        try {
            ExifInterface exifInterface = new ExifInterface(path);
            int orientation = exifInterface.getAttributeInt(ExifInterface.TAG_ORIENTATION, ExifInterface.ORIENTATION_NORMAL);
            switch (orientation) {
                case ExifInterface.ORIENTATION_ROTATE_90:
                    degree = 90;
                    break;
                case ExifInterface.ORIENTATION_ROTATE_180:
                    degree = 180;
                    break;
                case ExifInterface.ORIENTATION_ROTATE_270:
                    degree = 270;
                    break;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return degree;
    }

    /*
     * 旋转图片
     *
     * @param angle
     *
     * @param bitmap
     *
     * @return Bitmap
     */
    public static Bitmap rotaingImageView(int angle, Bitmap bitmap) {
        // 旋转图片 动作
        Matrix matrix = new Matrix();
        ;
        matrix.postRotate(angle);
        System.out.println("angle2=" + angle);
        // 创建新的图片
        Bitmap resizedBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        return resizedBitmap;
    }

    public static Bitmap getimage(String srcPath) {
        BitmapFactory.Options newOpts = new BitmapFactory.Options();
        // 开始读入图片，此时把options.inJustDecodeBounds 设回true了
        newOpts.inJustDecodeBounds = true;
        Bitmap bitmap = BitmapFactory.decodeFile(srcPath, newOpts);// 此时返回bm为空

        newOpts.inJustDecodeBounds = false;
        int w = newOpts.outWidth;
        int h = newOpts.outHeight;
        // 现在主流手机比较多是800*480分辨率，所以高和宽我们设置为
        float hh = 800f;// 这里设置高度为800f
        float ww = 480f;// 这里设置宽度为480f
        // 缩放比。由于是固定比例缩放，只用高或者宽其中一个数据进行计算即可
        int be = 1;// be=1表示不缩放
        if (w > h && w > ww) {// 如果宽度大的话根据宽度固定大小缩放
            be = (int) (newOpts.outWidth / ww);
        } else if (w < h && h > hh) {// 如果高度高的话根据宽度固定大小缩放
            be = (int) (newOpts.outHeight / hh);
        }
        if (be <= 0)
            be = 1;
        newOpts.inSampleSize = be;// 设置缩放比例
        // 重新读入图片，注意此时已经把options.inJustDecodeBounds 设回false了
        bitmap = BitmapFactory.decodeFile(srcPath, newOpts);
        return compressImage(bitmap);// 压缩好比例大小后再进行质量压缩
    }

    public static void compressBmpToFile(Bitmap bmp, File file) {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        int options = 80;// 个人喜欢从80开始,
        bmp.compress(Bitmap.CompressFormat.JPEG, options, baos);
        while (baos.toByteArray().length / 1024 > 100) {
            baos.reset();
            options -= 10;
            bmp.compress(Bitmap.CompressFormat.JPEG, options, baos);
        }
        try {
            FileOutputStream fos = new FileOutputStream(file);
            fos.write(baos.toByteArray());
            fos.flush();
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 质量压缩法
     *
     * @param image
     * @return
     */
    public static Bitmap compressImage(Bitmap image) {

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        image.compress(Bitmap.CompressFormat.JPEG, 100, baos);// 质量压缩方法，这里100表示不压缩，把压缩后的数据存放到baos中
        int options = 90;
        while (baos.toByteArray().length / 1024 > 800) { // 循环判断如果压缩后图片是否大于200kb,大于继续压缩
            baos.reset();// 重置baos即清空baos
            image.compress(Bitmap.CompressFormat.JPEG, options, baos);// 这里压缩options%，把压缩后的数据存放到baos中
            options -= 10;// 每次都减少10
        }
        ByteArrayInputStream isBm = new ByteArrayInputStream(baos.toByteArray());// 把压缩后的数据baos存放到ByteArrayInputStream中
        Bitmap bitmap = BitmapFactory.decodeStream(isBm, null, null);// 把ByteArrayInputStream数据生成图片
        return bitmap;

    }

    public static boolean isEmpty(String s) {
        if (null == s)
            return true;
        if ("null".equals(s)) {
            return true;
        }
        if (s.length() == 0)
            return true;
        if (s.trim().length() == 0)
            return true;
        return false;
    }

    public static void showToast(Context context, String str) {
        Toast toast = Toast.makeText(context.getApplicationContext(), "" + str, Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
    }

    public static boolean isConnected(Context context) {
        ConnectivityManager conn = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo info = conn.getActiveNetworkInfo();
        return (info != null && info.isConnected());
    }

    /**
     * @return yyyy-MM-dd
     */
    public static String getStringDate() {
        Date currentTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String dateString = formatter.format(currentTime);
        return dateString;
    }

    /**
     * 取得日期
     *
     * @return yyyy-MM-dd
     */
    public static String getStringForDate(String date) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            Date time = formatter.parse(date);
            String dateString = formatter.format(time);
            return dateString;
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return date;
    }

    /**
     * 判断当前日期是星期几
     *
     * @param pTime 设置的需要判断的时间 //格式如2012-09-08
     * @return dayForWeek 判断结果
     * @Exception 发生异常
     */
    // String pTime = "2012-03-12";
    public static String getWeek(String pTime) {
        String Week = "";
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Calendar c = Calendar.getInstance();
        try {
            c.setTime(format.parse(pTime));

        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        if (c.get(Calendar.DAY_OF_WEEK) == 1) {
            Week += " 星期天";
        }
        if (c.get(Calendar.DAY_OF_WEEK) == 2) {
            Week += " 星期一";
        }
        if (c.get(Calendar.DAY_OF_WEEK) == 3) {
            Week += " 星期二";
        }
        if (c.get(Calendar.DAY_OF_WEEK) == 4) {
            Week += " 星期三";
        }
        if (c.get(Calendar.DAY_OF_WEEK) == 5) {
            Week += " 星期四";
        }
        if (c.get(Calendar.DAY_OF_WEEK) == 6) {
            Week += " 星期五";
        }
        if (c.get(Calendar.DAY_OF_WEEK) == 7) {
            Week += " 星期六";
        }

        return Week;
    }

    /**
     * 判断 多个字段的值否为空
     *
     * @return true为null或空; false不null或空
     * @author Michael.Zhang 2013-08-02 13:34:43
     */
    public static boolean isNull(String... ss) {
        for (int i = 0; i < ss.length; i++) {
            if (null == ss[i] || ss[i].equals("") || ss[i].equalsIgnoreCase("null")) {
                return true;
            }
        }

        return false;
    }

    /**
     * 判断 一个字段的值否为空
     *
     * @param s
     * @return
     * @author Michael.Zhang 2013-9-7 下午4:39:00
     */
    public static boolean isNull(String s) {
        if (null == s || s.equals("") || s.equalsIgnoreCase("null")) {
            return true;
        }

        return false;
    }

    /**
     * 算出JSON字符的数组对象长度
     */
    public static boolean getLength(String stringVideosData, String dataName) {

        try {

            JSONObject jsobj = new JSONObject(stringVideosData);
            JSONArray jsonArray = jsobj.getJSONArray(dataName);

            if (jsonArray.length() > 0) {
                Log.i(TAG, "数组获取成功");
                return true;
            } else {
                Log.i(TAG, "数组长度不够");
                return false;
            }

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }


    /**
     * 时间得到时间戳
     *
     * @param time
     * @return
     * @author bkw 2014年7月18日 下午2:34:53
     */
    public static long getLongTime(String time) {
        SimpleDateFormat sDate = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date date = sDate.parse(time);
            return date.getTime();// date转成毫秒
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return 0;
    }

    /**
     * 当前时间转为时间戳
     */
    public static long dataForLongTime() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time = String.valueOf(sdf.format(new Date()));
        try {
            Date date = sdf.parse(time);
            return date.getTime();
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return 0;

    }

    /**
     * 判断 列表是否为空
     *
     * @return true为null或空; false不null或空
     */
    public static boolean isEmptyList(List<?> list) {
        return null == list || list.size() == 0;
    }

    /**
     * 传入的时间距离现在多久
     *
     * @param date
     * @return String 返回类型
     * @Title: before
     * @Description: 传入的时间距离现在多久
     * @author bkw
     */
    public static String before(String date) {
        String text;
        long time = 0;
        try {
            time = Long.parseLong(date);
        } catch (Exception e) {
            return "";
        }
        time = date.length() == 10 ? time * 1000 : time;
        long now = System.currentTimeMillis();
        int timeChar = (int) (now / 1000 - time / 1000);// 秒
        if (timeChar < 60) {
            text = timeChar + "秒前";
        } else if (timeChar >= 60 && timeChar < 3600) {
            timeChar = timeChar / (60);
            text = timeChar + "分钟前";
        } else if (timeChar >= 3600 && timeChar < 86400) {
            timeChar = timeChar / (60 * 60);
            text = timeChar + "小时前";
        } else if (timeChar >= 86400 && timeChar < 2592000) {
            timeChar = timeChar / (60 * 60 * 24);
            text = timeChar + "天前";
        } else if (timeChar >= 2592000 && timeChar < 946080000) {
            timeChar = timeChar / (60 * 60 * 24 * 30);
            text = timeChar + "月前";
        } else {
            timeChar = timeChar / (60 * 60 * 24 * 30 * 365);
            text = timeChar + "年前";
        }
        return text;
    }

    /**
     * 将时间戳转为字符串 到日
     *
     * @param cc_time
     * @return
     * @author bkw
     */
    public static String getStrDate(String cc_time) {
        return getStrTime(cc_time, "yyyy-MM-dd");
    }

    private static String getStrTime(String cc_time, String format) {
        String re_StrTime = null;
        if (cc_time == null) {
            cc_time = System.currentTimeMillis() + "";
        }

        if (cc_time.length() == 10) { // 单位 秒
            cc_time += "000";// 单位 毫秒
        }

        SimpleDateFormat sdf = new SimpleDateFormat(format);
        long lcc_time = Long.valueOf(cc_time);
        re_StrTime = sdf.format(new Date(lcc_time));

        return re_StrTime;
    }

    /**
     * 判断应用是否拥有联系人权限
     *
     * @author bkw
     */
    public static boolean isPermiss(Activity activity) {
        PackageManager pm = activity.getPackageManager();
        boolean permission = (PackageManager.PERMISSION_GRANTED == pm.checkPermission("android.permission.READ_CONTACTS", "packageName"));
        if (permission) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 验证手机号码
     *
     * @param phone
     * @return
     * @author bkw
     */
    public static boolean isPhone(String phone) {
        if (isNull(phone)) {
            return false;
        }

        String pattern = "^((13[0-9])|(147)|(15[0-9])|(18[0-9]))\\d{8}$";

        return phone.matches(pattern);
    }

    /**
     * MD5加密
     *
     * @param plainText
     * @return
     * @author bkw
     */
    public static String MD5(String plainText) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(plainText.getBytes());
            byte b[] = md.digest();
            int i;
            StringBuffer buf = new StringBuffer("");
            for (int offset = 0; offset < b.length; offset++) {
                i = b[offset];
                if (i < 0) {
                    i += 256;
                }

                if (i < 16) {
                    buf.append("0");
                }

                buf.append(Integer.toHexString(i));
            }

            return buf.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

        return null;
    }


    /**
     * ScrollView中嵌套ListView时显示不全解决办法
     * <p/>
     * 警告
     * listview 的 item 必须是 线性布局 否则listItem.measure(0, 0);  报 空指针异常
     *
     * @param listView
     */
    public static void setListViewHeightBasedOnChildren(ListView listView) {
        ListAdapter listAdapter = listView.getAdapter();
        if (listAdapter == null) {
            // pre-condition
            return;
        }

        int totalHeight = 0;
        for (int i = 0; i < listAdapter.getCount(); i++) {
            View listItem = listAdapter.getView(i, null, listView);
            listItem.measure(0, 0);
            totalHeight += listItem.getMeasuredHeight();
        }

        ViewGroup.LayoutParams params = listView.getLayoutParams();
        params.height = totalHeight + (listView.getDividerHeight() * (listAdapter.getCount() - 1));
        listView.setLayoutParams(params);
    }

    /**
     * ScrollView中嵌套GridView时显示不全解决办法
     * 警告
     * GridView 的 item 必须是 线性布局 否则listItem.measure(0, 0);  报 空指针异常
     *
     * @param gv
     */
    public static void setGridViewHeightBasedOnChildren(GridView gv) {
        ListAdapter listAdapter = gv.getAdapter();
        if (listAdapter == null) {
            // pre-condition
            return;
        }
        gv.setNumColumns(listAdapter.getCount());

        int totalHeight = 0;
        int totalWidth = 0;
        for (int i = 0; i < listAdapter.getCount(); i++) {
            View listItem = listAdapter.getView(i, null, gv);
            listItem.measure(0, 0);
            totalWidth += listItem.getMeasuredWidth();
            totalHeight = listItem.getMeasuredHeight();
        }

        ViewGroup.LayoutParams params = gv.getLayoutParams();
        params.height = totalHeight;
        params.width = totalWidth;
        gv.setLayoutParams(params);
    }

    /**
     * 根据手机的分辨率从 dp 的单位 转成为 px(像素)
     */
    public static int dip2px(Context context, float dpValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dpValue * scale + 0.5f);
    }



    /**
     * 根据手机的分辨率从 px(像素) 的单位 转成为 dp
     */
    public static int px2dip(Context context, float pxValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (pxValue / scale + 0.5f);
    }
}
