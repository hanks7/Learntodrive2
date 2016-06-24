package com.jxjycn.learntodrive.view;


import java.io.Serializable;

/**
 * Created by liu on 15/9/16.
 * 轮播图
 */
public class Slider implements Serializable {


    /**
     * id : 1
     * publishTime : 2016-01-29 12:47:08
     * companyURL : http://baidu.com
     * ordershort : 1
     * serialCount : 1
     * type : 3
     * companyImg : images/banner/banner3.jpg
     * companyName : null
     */

    private int id;
    private String publishTime;
    private String companyURL;
    private int ordershort;
    private int serialCount;
    private int type;
    private String companyImg;
    private Object companyName;

    public void setId(int id) {
        this.id = id;
    }

    public void setPublishTime(String publishTime) {
        this.publishTime = publishTime;
    }

    public void setCompanyURL(String companyURL) {
        this.companyURL = companyURL;
    }

    public void setOrdershort(int ordershort) {
        this.ordershort = ordershort;
    }

    public void setSerialCount(int serialCount) {
        this.serialCount = serialCount;
    }

    public void setType(int type) {
        this.type = type;
    }

    public void setCompanyImg(String companyImg) {
        this.companyImg = companyImg;
    }

    public void setCompanyName(Object companyName) {
        this.companyName = companyName;
    }

    public int getId() {
        return id;
    }

    public String getPublishTime() {
        return publishTime;
    }

    public String getCompanyURL() {
        return companyURL;
    }

    public int getOrdershort() {
        return ordershort;
    }

    public int getSerialCount() {
        return serialCount;
    }

    public int getType() {
        return type;
    }

    public String getCompanyImg() {
        return companyImg;
    }

    public Object getCompanyName() {
        return companyName;
    }
}
