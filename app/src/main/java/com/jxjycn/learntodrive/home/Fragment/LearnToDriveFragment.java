package com.jxjycn.learntodrive.home.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.baidu.location.BDLocation;
import com.baidu.location.BDLocationListener;
import com.baidu.location.LocationClient;
import com.baidu.location.LocationClientOption;
import com.baidu.mapapi.map.BaiduMap;
import com.baidu.mapapi.map.BitmapDescriptor;
import com.baidu.mapapi.map.BitmapDescriptorFactory;
import com.baidu.mapapi.map.InfoWindow;
import com.baidu.mapapi.map.MapStatus;
import com.baidu.mapapi.map.MapStatusUpdateFactory;
import com.baidu.mapapi.map.MapView;
import com.baidu.mapapi.map.Marker;
import com.baidu.mapapi.map.MarkerOptions;
import com.baidu.mapapi.map.MyLocationConfiguration;
import com.baidu.mapapi.map.MyLocationConfiguration.LocationMode;
import com.baidu.mapapi.map.MyLocationData;
import com.baidu.mapapi.model.LatLng;
import com.jxjycn.learntodrive.Coach.OrderCoachActivity;
import com.jxjycn.learntodrive.Coach.OrderTimeTableActivity;
import com.jxjycn.learntodrive.R;
import com.jxjycn.learntodrive.common.AppData;
import com.jxjycn.learntodrive.home.MapSearchActivity;
import com.jxjycn.learntodrive.home.biz.BizMap;
import com.jxjycn.learntodrive.home.biz.GetStreetName;
import com.jxjycn.learntodrive.home.biz.LearnToDriveMyPopWindow;
import com.jxjycn.learntodrive.util.UtilIntent;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by hanks7 on 2016/6/15.
 */
public class LearnToDriveFragment extends Fragment {

    @Bind(R.id.tv_time)
    TextView vTvtime;
    @Bind(R.id.tv_coach)
    TextView vTvcoach;
    @Bind(R.id.ltd_booktime)
    RelativeLayout vBooktime;
    @Bind(R.id.ltd_coach)
    RelativeLayout vCoach;
    @Bind(R.id.ltd_btn_enter)
    RadioButton vBtnEnter;
    @Bind(R.id.ltd_btn_homework)
    RadioButton vBtnHomework;
    @Bind(R.id.ltd_iv_center)
    ImageView vCenter;
    @Bind(R.id.ltd_btn_center)
    Button vBtnCenter;
    MapView vMapv;


    private ArrayList<String> list;
    private LearnToDriveMyPopWindow learnToDriveMyPopWindow;

    // 定位相关
    LocationClient mLocClient;
    public MyLocationListenner myListener = new MyLocationListenner();
    private LocationMode mCurrentMode;
    private static final int accuracyCircleFillColor = 0xAAFFFF88;
    private static final int accuracyCircleStrokeColor = 0xAA00FF00;
    BaiduMap mBaiduMap;
    private InfoWindow mInfoWindow;
    boolean isFirstLoc = true; // 是否首次定位
    private LatLng mCenterLatLng;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_learntodrive, container, false);
        ButterKnife.bind(this, view);
        // 地图初始化
        initBaiduMap(view);
        return view;
    }

    private void initBaiduMap(View view) {
        vMapv = (MapView) view.findViewById(R.id.ltd_mapv);
        mBaiduMap = vMapv.getMap();
        vMapv.removeViewAt(1);//去除百度图标
        vMapv.showZoomControls(false);//去除缩放控件
    }

    @Override
    public void onStart() {
        super.onStart();
        mCurrentMode = LocationMode.NORMAL;
        mBaiduMap.setMyLocationEnabled(true);   // 开启定位图层
        mBaiduMap.setMyLocationConfigeration(new MyLocationConfiguration(mCurrentMode, true, null));
        initLocation(myListener);
        initListener();
        initOverlay(AppData.getLatLngList());
        mBaiduMap.setOnMarkerClickListener(new BaiduMap.OnMarkerClickListener() {

            @Override
            public boolean onMarkerClick(final Marker marker) {
                View view = View.inflate(getActivity(), R.layout.item_ordercoach_overlay, null);
                InfoWindow.OnInfoWindowClickListener listener =
                        listener = new InfoWindow.OnInfoWindowClickListener() {
                            public void onInfoWindowClick() {
                                UtilIntent.intentDIYLeftToRight(getActivity(), OrderTimeTableActivity.class);
                                mBaiduMap.hideInfoWindow();
                            }
                        };

                LatLng ll = marker.getPosition();
                mInfoWindow = new InfoWindow(BitmapDescriptorFactory.fromView(view), ll, -47, listener);
                mBaiduMap.showInfoWindow(mInfoWindow);
                return true;
            }
        });

    }

    public void initOverlay(ArrayList<LatLng> latLngs) {

        BitmapDescriptor bitmapDescriptor = BitmapDescriptorFactory.fromResource(R.mipmap.near_coach_icon);  // 初始化全局 bitmap 信息，不用时及时 recycle
        Marker mMarker;
        for (LatLng latLng : latLngs) {
            MarkerOptions ooA = new MarkerOptions().position(latLng).icon(bitmapDescriptor).zIndex(9).draggable(true);
            mMarker = (Marker) (mBaiduMap.addOverlay(ooA));
        }
    }

    private void initLocation(BDLocationListener Listener) {
        // 定位初始化
        mLocClient = new LocationClient(getActivity());
        mLocClient.registerLocationListener(Listener);
        LocationClientOption option = new LocationClientOption();
        option.setOpenGps(true); // 打开gps
        option.setCoorType("bd09ll"); // 设置坐标类型
        option.setScanSpan(1000);
        mLocClient.setLocOption(option);
        mLocClient.start();
    }

    @OnClick({R.id.ltd_booktime, R.id.ltd_coach, R.id.ltd_btn_center, R.id.ltd_btn_homework})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.ltd_booktime:
                learnToDriveMyPopWindow = new LearnToDriveMyPopWindow(getActivity(), this);
                learnToDriveMyPopWindow.showMyPopWindow(view);
                break;
            case R.id.ltd_coach:
                UtilIntent.intentDIYLeftToRight(getActivity(), OrderCoachActivity.class);
                break;
            case R.id.ltd_btn_center:
                Intent intent = new Intent(getActivity(), MapSearchActivity.class);
                Bundle bundle = new Bundle();
                bundle.putDouble("latitude", mCenterLatLng.latitude);
                bundle.putDouble("longitude", mCenterLatLng.longitude);
                intent.putExtra("bundle", bundle);
                this.startActivityForResult(intent, 103);
                break;
            case R.id.ltd_btn_homework:
                break;
        }
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }


    /**
     * 定位SDK监听函数
     */
    public class MyLocationListenner implements BDLocationListener {

        @Override
        public void onReceiveLocation(BDLocation location) {

            //纬度
            double latitude = location.getLatitude();
            //经度
            double longitude = location.getLongitude();
            //在模拟器上运行得到的是4.9E-324
            if (latitude == 4.9E-324) {
                //说明在模拟器上运行,指定一个坐标
                latitude = 31.818384974842248;
                longitude = 117.24032099999994;
                location.setLatitude(latitude);
                location.setLongitude(longitude);
            }


            //实体类，表示是当前位置

            //移动地图中心点
            MyLocationData locData = new MyLocationData.Builder()
                    .accuracy(location.getRadius())
                            // 此处设置开发者获取到的方向信息，顺时针0-360
                    .direction(100).latitude(location.getLatitude())
                    .longitude(location.getLongitude()).build();
            mBaiduMap.setMyLocationData(locData);
            if (isFirstLoc) {
                mCenterLatLng = new LatLng(latitude, longitude);
                isFirstLoc = false;
                LatLng ll = new LatLng(location.getLatitude(),
                        location.getLongitude());
                MapStatus.Builder builder = new MapStatus.Builder();
                builder.target(ll).zoom(16.0f);
                mBaiduMap.animateMapStatus(MapStatusUpdateFactory.newMapStatus(builder.build()));
            }
        }

        public void onReceivePoi(BDLocation poiLocation) {
        }
    }

    /**
     * 地图状态改变
     */
    private void initListener() {
        mBaiduMap.setOnMapStatusChangeListener(new BaiduMap.OnMapStatusChangeListener() {
            @Override
            public void onMapStatusChangeStart(MapStatus status) {
                vBtnCenter.setVisibility(View.INVISIBLE);
            }

            @Override
            public void onMapStatusChangeFinish(MapStatus status) {
                updateMapState(status);
            }

            @Override
            public void onMapStatusChange(MapStatus status) {
            }
        });
    }


    private void updateMapState(MapStatus status) {
        mCenterLatLng = status.target; // 获取经纬度
        double lat = mCenterLatLng.latitude;
        double lng = mCenterLatLng.longitude;
        vBtnCenter.setVisibility(View.VISIBLE);
        GetStreetName getStreetName = new GetStreetName(lat, lng, vBtnCenter);
        getStreetName.setbuttonName();
    }


    @Override
    public void onPause() {
        super.onPause();
        // activity 暂停时同时暂停地图控件
        vMapv.onPause();
    }

    @Override
    public void onResume() {
        super.onResume();
        // activity 恢复时同时恢复地图控件
        vMapv.onResume();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        // activity 销毁时同时销毁地图控件
        vMapv.onDestroy();
        MapView.setMapCustomEnable(false);
    }

    /**
     * 回调执行在adapter中执行
     *
     * @param i
     */
    public void changeCommiteButton(int i) {
        learnToDriveMyPopWindow.changeCommiteButton(i);
    }

    public void setVtvtimeText(String str) {
        vTvtime.setText(str);
        if (str.equals(""))
            vTvtime.setText(getActivity().getResources().getString(R.string.ChooseOrderYoutTime));
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 103) {
            if(data!=null){

                Bundle bundle = data.getBundleExtra("bundle");
                double latitude = bundle.getDouble("latitude");
                double longitude = bundle.getDouble("longitude");
                LatLng mCenterLatLng = new LatLng(latitude, longitude);
                BizMap.initLocClient(mBaiduMap, mCenterLatLng);
            }

        }
    }


}
