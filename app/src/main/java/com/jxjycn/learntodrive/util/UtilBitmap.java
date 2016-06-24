package com.jxjycn.learntodrive.util;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.net.Uri;
import android.provider.ContactsContract.Data;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.math.BigDecimal;

public class UtilBitmap {
	
	public static Bitmap comp(Bitmap image) {  
	       
	    ByteArrayOutputStream baos = new ByteArrayOutputStream();         
	    image.compress(Bitmap.CompressFormat.JPEG, 100, baos);  
	    if( baos.toByteArray().length / 1024>1024) {//判断如果图片大于1M,进行压缩避免在生成图片（BitmapFactory.decodeStream）时溢出    
	        baos.reset();//重置baos即清空baos  
	        image.compress(Bitmap.CompressFormat.JPEG, 50, baos);//这里压缩50%，把压缩后的数据存放到baos中  
	    }  
	    ByteArrayInputStream isBm = new ByteArrayInputStream(baos.toByteArray());  
	    BitmapFactory.Options newOpts = new BitmapFactory.Options();  
	    //开始读入图片，此时把options.inJustDecodeBounds 设回true了  
	    newOpts.inJustDecodeBounds = true;  
	    Bitmap bitmap = BitmapFactory.decodeStream(isBm, null, newOpts);  
	    newOpts.inJustDecodeBounds = false;  
	    int w = newOpts.outWidth;  
	    int h = newOpts.outHeight;  
	    //现在主流手机比较多是800*480分辨率，所以高和宽我们设置为  
	    float hh = 800f;//这里设置高度为800f  
	    float ww = 480f;//这里设置宽度为480f  
	    //缩放比。由于是固定比例缩放，只用高或者宽其中一个数据进行计算即可  
	    int be = 1;//be=1表示不缩放  
	    if (w > h && w > ww) {//如果宽度大的话根据宽度固定大小缩放  
	        be = (int) (newOpts.outWidth / ww);  
	    } else if (w < h && h > hh) {//如果高度高的话根据宽度固定大小缩放  
	        be = (int) (newOpts.outHeight / hh);  
	    }  
	    if (be <= 0)  
	        be = 1;  
	    newOpts.inSampleSize = be;//设置缩放比例  
	    //重新读入图片，注意此时已经把options.inJustDecodeBounds 设回false了  
	    isBm = new ByteArrayInputStream(baos.toByteArray());  
	    bitmap = BitmapFactory.decodeStream(isBm, null, newOpts);  
	    return compressImage(bitmap);//压缩好比例大小后再进行质量压缩  
	}
	
	public static Bitmap compressImage(Bitmap image) {  
		   
        ByteArrayOutputStream baos = new ByteArrayOutputStream();  
        image.compress(Bitmap.CompressFormat.JPEG, 100, baos);//质量压缩方法，这里100表示不压缩，把压缩后的数据存放到baos中  
        int options = 100;  
        while ( baos.toByteArray().length / 1024>100) {  //循环判断如果压缩后图片是否大于100kb,大于继续压缩         
            baos.reset();//重置baos即清空baos  
            image.compress(Bitmap.CompressFormat.JPEG, options, baos);//这里压缩options%，把压缩后的数据存放到baos中  
            options -= 10;//每次都减少10  
        }  
        ByteArrayInputStream isBm = new ByteArrayInputStream(baos.toByteArray());//把压缩后的数据baos存放到ByteArrayInputStream中  
        Bitmap bitmap = BitmapFactory.decodeStream(isBm, null, null);//把ByteArrayInputStream数据生成图片  
        return bitmap;  
    }

	/**
	 * 图片压缩
	 * @param bitmap
	 * @param path
	 * @param total
	 * @return
	 */
	public static File compressBmpToFile(Bitmap bitmap, String path, int total)
	{
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		File file = null;
		int options = 100;//个人喜欢从80开始,
		bitmap.compress(Bitmap.CompressFormat.JPEG, options, baos);
		while (baos.toByteArray().length / 1024 > total) {
			baos.reset();
			options -= 10;
			bitmap.compress(Bitmap.CompressFormat.JPEG, options, baos);
		}
		try {
			file = new File(path);
			FileOutputStream fos = new FileOutputStream(file);
			fos.write(baos.toByteArray());
			fos.flush();
			fos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return file;
	}

	/**
	 * 加载本地图片
	 * @param url
	 * @return
	 */
	public  static Bitmap getLalBitmap(String url) {
		try {
			FileInputStream fis = new FileInputStream(url);
			return BitmapFactory.decodeStream(fis);  ///把流转化为Bitmap图片

		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return null;
		}
	}

	public static Bitmap loadContactPhoto(Context context, int Idname) {
		ContentResolver r=context.getContentResolver();
		Uri uri=Data.CONTENT_URI;
		String[] column={
				Data.DATA15
		};
		Cursor cursor=r.query(uri, column, Data._ID + "=" + Idname, null, null);
		if(cursor.moveToNext()){
			byte[] bytes=cursor.getBlob(0);
			cursor.close();
			return BitmapFactory.decodeByteArray(bytes, 0, bytes.length);
		}
		return null;
	}
	public static Bitmap getimage(String srcPath) {
		BitmapFactory.Options newOpts = new BitmapFactory.Options();
		//开始读入图片，此时把options.inJustDecodeBounds 设回true了
		newOpts.inJustDecodeBounds = true;
		Bitmap bitmap = BitmapFactory.decodeFile(srcPath,newOpts);//此时返回bm为空

		newOpts.inJustDecodeBounds = false;
		int w = newOpts.outWidth;
		int h = newOpts.outHeight;
		//现在主流手机比较多是800*480分辨率，所以高和宽我们设置为
		float hh = 800f;//这里设置高度为800f
		float ww = 480f;//这里设置宽度为480f
		//缩放比。由于是固定比例缩放，只用高或者宽其中一个数据进行计算即可
		int be = 1;//be=1表示不缩放
		if (w > h && w > ww) {//如果宽度大的话根据宽度固定大小缩放
			be = (int) (newOpts.outWidth / ww);
		} else if (w < h && h > hh) {//如果高度高的话根据宽度固定大小缩放
			be = (int) (newOpts.outHeight / hh);
		}
		if (be <= 0)
			be = 1;
		newOpts.inSampleSize = be;//设置缩放比例
		//重新读入图片，注意此时已经把options.inJustDecodeBounds 设回false了
		bitmap = BitmapFactory.decodeFile(srcPath, newOpts);
		//	        return compressImage(bitmap);//压缩好比例大小后再进行质量压缩
		return  reduce(bitmap,400,800,true);
	}

	public static Bitmap reduce(Bitmap bitmap, int width, int height, boolean isAdjust) {
		if (bitmap.getWidth() < width && bitmap.getHeight() < height) {return bitmap;}
		float sx = new BigDecimal(width).divide(new BigDecimal(bitmap.getWidth()), 4, BigDecimal.ROUND_DOWN).floatValue();
		float sy = new BigDecimal(height).divide(new BigDecimal(bitmap.getHeight()), 4, BigDecimal.ROUND_DOWN).floatValue();
		if (isAdjust) {// 如果想自动调整比例，不至于图片会拉伸
			sx = (sx < sy ? sx : sy);sy = sx;// 哪个比例小一点，就用哪个比例
		}
		Matrix matrix = new Matrix();
		matrix.postScale(sx, sy);// 调用api中的方法进行压缩，就大功告成了
		return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
	}

}


/**
 * Project Name:FileUploadDemo
 * File Name:BitmapHelper.java
 * Package Name:com.loveplusplus.demo.fileupload
 * Date:2015-10-9下午10:05:29
 * Copyright (c) 2015, jinghao-520@163.com All Rights Reserved.
 *
 */



/**
 * ClassName:BitmapHelper <br/>
 * Date:     2015-10-9 下午10:05:29 <br/>
 * @author   jinghao
 * @version
 * @see
 */


