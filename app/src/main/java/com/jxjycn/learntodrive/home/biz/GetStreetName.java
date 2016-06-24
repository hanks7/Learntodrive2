package com.jxjycn.learntodrive.home.biz;

import android.widget.Button;

import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.search.geocode.GeoCodeResult;
import com.baidu.mapapi.search.geocode.GeoCoder;
import com.baidu.mapapi.search.geocode.OnGetGeoCoderResultListener;
import com.baidu.mapapi.search.geocode.ReverseGeoCodeOption;
import com.baidu.mapapi.search.geocode.ReverseGeoCodeResult;

/**
 * Created by hanks7 on 2016/6/17.
 */
public class GetStreetName {
    private double lat;
    double lng;
    Button button;

    public GetStreetName(double lat, double lng, Button button) {
        this.lat = lat;
        this.lng = lng;
        this.button = button;


    }

    public void setbuttonName() {



            LatLng currentPosition = new LatLng(lat, lng); // 实体类，表示是当前位置
            GeoCoder geoCoder = GeoCoder.newInstance();  //实例化一个地理编码查询对象
            ReverseGeoCodeOption op = new ReverseGeoCodeOption();   //设置反地理编码位置坐标
            op.location(currentPosition);
            geoCoder.reverseGeoCode(op); //发起反地理编码请求(经纬度->地址信息)


            geoCoder.setOnGetGeoCodeResultListener(new OnGetGeoCoderResultListener() {
                @Override
                public void onGetReverseGeoCodeResult(ReverseGeoCodeResult arg0) {
                    try{
                        if (arg0 != null) {
                            String city = arg0.getAddressDetail().city;
                            String province = arg0.getAddressDetail().province;
                            //获取点击的坐标地址
                            String address = arg0.getAddress();
                            address = address.replace(province, "").replace(city, "");
                            button.setText("  " + address + "  ");
                        } else {
                            button.setText("  无显示  ");
                        }
                    }catch (Exception e){

                    }


                }

                @Override
                public void onGetGeoCodeResult(GeoCodeResult arg0) {

                }
            });

    }
}
