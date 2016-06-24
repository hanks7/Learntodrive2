package com.jxjycn.learntodrive.util;

import java.math.BigDecimal;

/**
 * Created by liu on 15/8/3.
 */
public class UtilFloat {

    public static double getValue(int n, double value)
    {
        BigDecimal b = new BigDecimal(value);
        return b.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
    }
}
