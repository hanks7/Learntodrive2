package com.jxjycn.learntodrive.util;

import java.text.DecimalFormat;

/**
 * Created by gengjiajia on 16/3/30.
 */
public class UtilNumber {
    /**
     * 转化为小数点后两位
     */
    public static double gettwoDouble(double number) {
        DecimalFormat df=new DecimalFormat(".##");
        String st=df.format(number);

        return Double.parseDouble(st);
    }
}
