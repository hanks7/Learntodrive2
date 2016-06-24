package com.jxjycn.learntodrive.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.jxjycn.learntodrive.bean.BaseResult;

import java.lang.reflect.Type;

/**
 * Created by liu on 15/5/29.
 * 解析Gson数据格式
 */
public class UtilGson {


    public static BaseResult fromJson(String gsonStr, Type type) {

        try {
            if (gsonStr == null) {
                return null;
            }
            GsonBuilder builder = new GsonBuilder();
            Gson gson = builder.create();
            return (BaseResult) gson.fromJson(gsonStr,type);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String toJson(Object obj) {
        try {
            if (obj == null) {
                return null;
            }
            GsonBuilder builder = new GsonBuilder();
            Gson gson = builder.create();
            return gson.toJson(obj);
        } catch (Exception ex) {
            //Log.e("TEST", " exception , " + ex.getMessage());
            return null;
        }
    }
}
