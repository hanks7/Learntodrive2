package com.jxjycn.learntodrive.mine;

import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.baoyz.actionsheet.ActionSheet;
import com.bigkoo.pickerview.OptionsPickerView;
import com.bigkoo.pickerview.TimePickerView;
import com.jxjycn.learntodrive.R;
import com.jxjycn.learntodrive.base.BaseActivity;
import com.jxjycn.learntodrive.common.AppData;
import com.jxjycn.learntodrive.util.BitmapHelper;
import com.jxjycn.learntodrive.util.Tools;
import com.jxjycn.learntodrive.util.UtilBitmap;
import com.jxjycn.learntodrive.util.UtilDate;
import com.jxjycn.learntodrive.view.CircularImageView;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class PersonalInfromationActivity extends BaseActivity implements ActionSheet.ActionSheetListener {


    @Bind(R.id.pia_iv_head)
    CircularImageView vIvHead;
    @Bind(R.id.pia_rl_head)
    RelativeLayout vRlHead;
    @Bind(R.id.pia_tv_nickname)
    TextView vTvNickname;
    @Bind(R.id.pia_rl_nickname)
    RelativeLayout vRlNickname;
    @Bind(R.id.pia_tv_reallyname)
    TextView vTvReallyname;
    @Bind(R.id.pia_rl_reallyname)
    RelativeLayout vRlReallyname;
    @Bind(R.id.pia_tv_sex)
    TextView vTvSex;
    @Bind(R.id.pia_rl_sex)
    RelativeLayout vRlSex;
    @Bind(R.id.pia_tv_boirthday)
    TextView vTvBoirthday;
    @Bind(R.id.pia_rl_boirthday)
    RelativeLayout vRlBoirthday;
    @Bind(R.id.pia_tv_idINformation)
    TextView vTvIdINformation;
    @Bind(R.id.pia_rl_idINformation)
    RelativeLayout vRlIdINformation;
    @Bind(R.id.pia_tv_introduce)
    TextView vTvIntroduce;
    @Bind(R.id.pia_rl_introduce)
    RelativeLayout vRlIntroduce;


    //-----相机使用的参数-------
    private String uri = "";
    private File file_;
    private File pic_file;//得到照片的文件流!
    private Bitmap photo;


//    private ArrayList<ProvinceBean> options1Items = new ArrayList<ProvinceBean>();
//    private ArrayList<ArrayList<String>> options2Items = new ArrayList<ArrayList<String>>();
//    private ArrayList<ArrayList<ArrayList<String>>> options3Items = new ArrayList<ArrayList<ArrayList<String>>>();

    TimePickerView pvTime;
    OptionsPickerView pvOptions;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_infromation);
        ButterKnife.bind(this);
        setTitle(getResources().getString(R.string.PersonalInfromationActivityTitle), 0, 0, null);
        intTimePickerView();//选择时间
        intSexPickView();//选择性别
        Tools.imageLoader(vIvHead, AppData.textUrl4);

    }


    @OnClick({R.id.pia_iv_head, R.id.pia_rl_head, R.id.pia_rl_nickname, R.id.pia_rl_reallyname, R.id.pia_rl_sex, R.id.pia_rl_boirthday, R.id.pia_rl_idINformation, R.id.pia_rl_introduce})
    public void onClick(View view) {
        switch (view.getId()) {

            case R.id.pia_rl_head:
                showActionSheet();
                break;
            case R.id.pia_rl_nickname:
                intentResultLeftToRight(NickNameActivity.class, 101);
                break;
            case R.id.pia_rl_reallyname:
                intentResultLeftToRight(ReallyNameActivity.class, 102);
                break;
            case R.id.pia_rl_sex:
                pvOptions.show();
                break;
            case R.id.pia_rl_boirthday:
                pvTime.show();
                break;
            case R.id.pia_rl_idINformation:
                vTvIdINformation.setText("请先去报名");
                intentLeftToRight(WriteInfroActivity.class);

                break;
            case R.id.pia_rl_introduce:
                intentResultLeftToRight(IntroduceActivity.class, 103);
                break;
        }
    }


    /**
     * 返回值回调
     */
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        // 选择的是拍照
        if (requestCode == 0 && resultCode == RESULT_OK) {
            ((ImageView) vIvHead).setImageBitmap(UtilBitmap.getimage(uri));
            try {
                photo = UtilBitmap.getimage(uri);
                FileOutputStream b = new FileOutputStream(file_);
                ((Bitmap) photo).compress(Bitmap.CompressFormat.JPEG, AppData.photoCompressState, b);// 把数据写入文件
            } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            pic_file = file_;


            // 选择的是相册
        } else if (requestCode == 2 && resultCode == RESULT_OK && null != data) {
            Uri selectedImage = data.getData();
            String[] filePathColumn = {MediaStore.Images.Media.DATA};
            Cursor cursor = getContentResolver().query(selectedImage,
                    filePathColumn, null, null, null);
            cursor.moveToFirst();

            int columnIndex = cursor.getColumnIndex(filePathColumn[0]);
            String picturePath = cursor.getString(columnIndex);
            uri = picturePath;
            pic_file = new File(picturePath);

            try {
                photo = UtilBitmap.getimage(picturePath);
                FileOutputStream b = new FileOutputStream(pic_file);
                photo.compress(Bitmap.CompressFormat.JPEG, AppData.photoCompressState, b);// 把数据写入文件
            } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            cursor.close();
            String compressBitmap = BitmapHelper.compressBitmap(picturePath, 540, 300, true);
            Bitmap bitmap = BitmapFactory.decodeFile(compressBitmap);
            vIvHead.setImageBitmap(bitmap);
        } else if (requestCode == 101 && null != data) {
            String str = data.getStringExtra(translateRstring(R.string.nickname)).trim();
            if (!str.equals("")) vTvNickname.setText(str);

        } else if (requestCode == 102 && null != data) {
            String str = data.getStringExtra(translateRstring(R.string.reallyname)).trim();
            if (!str.equals("")) vTvReallyname.setText(str);

        } else if (requestCode == 103 && null != data) {
            String str = data.getStringExtra(translateRstring(R.string.introduce)).trim();
            if (!str.equals("")) vTvIntroduce.setText(str);

        }
    }

    @Override
    public void onOtherButtonClick(ActionSheet actionSheet, int index) {

        switch (index) {

            case 0:
                getCamera();
                break;
            case 1:
                goAlbum();
                break;

        }


    }

    @Override
    public void onDismiss(ActionSheet actionSheet, boolean isCancle) {

    }


    public void showActionSheet() {
        setTheme(R.style.ActionSheetStyleiOS7);
        ActionSheet.createBuilder(this, getSupportFragmentManager())
                .setCancelButtonTitle("Cancel")
                .setOtherButtonTitles(getResources().getString(R.string.camera), getResources().getString(R.string.album))
                .setCancelableOnTouchOutside(true).setListener(this).show();
    }

    private void goAlbum() {
        Intent intent = new Intent(
                Intent.ACTION_PICK,
                MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        startActivityForResult(intent, 2);
    }

    protected void getCamera() {

        //判断SD卡是否存在
        if (Environment.getExternalStorageState().equals(Environment.MEDIA_MOUNTED)) {
            //指定照片保存路径(SD卡)，image.jpg为一个临时文件，每次拍照后这个图片都会被替换
            String name = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date()) + ".jpg";

            File file = new File(AppData.FILE_PATH);
            if (!file.exists() && !file.isDirectory()) {
                System.out.println("//不存在");
                file.mkdirs();

            }
            String fileName = AppData.FILE_PATH + name;
            uri = fileName;
            file_ = new File(fileName);
            Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
            intent.putExtra("camerasensortype", 2); // 调用前置摄像头
            intent.putExtra("autofocus", true); // 自动对焦
            intent.putExtra("fullScreen", false); // 全屏
            intent.putExtra("showActionIcons", false);
            intent.putExtra(MediaStore.EXTRA_OUTPUT, Uri.fromFile(file_));
            startActivityForResult(intent, 0);
        } else {
            Toast.makeText(this, "SD卡不存在或不可用", Toast.LENGTH_LONG).show();
        }

    }

    public void intSexPickView() {

        final ArrayList<String> options1Items = new ArrayList<>();
        options1Items.add("男");
        options1Items.add("女");

        pvOptions = new OptionsPickerView(this);
        pvOptions.setPicker(options1Items);
        pvOptions.setCyclic(false, true, true);
        pvOptions.setSelectOptions(0);
        pvOptions.setCancelable(true);
        pvOptions.setOnoptionsSelectListener(new OptionsPickerView.OnOptionsSelectListener() {

            @Override
            public void onOptionsSelect(int options1, int option2, int options3) {
                vTvSex.setText(options1Items.get(options1));
            }
        });

    }

    private void intTimePickerView() {
        //时间选择器
        pvTime = new TimePickerView(this, TimePickerView.Type.YEAR_MONTH_DAY);
        //控制时间范围
        Calendar calendar = Calendar.getInstance();
        pvTime.setRange(calendar.get(Calendar.YEAR) - 67, calendar.get(Calendar.YEAR));
        pvTime.setTime(new Date());
        pvTime.setCyclic(false);
        pvTime.setCancelable(true);
        //时间选择后回调
        pvTime.setOnTimeSelectListener(new TimePickerView.OnTimeSelectListener() {

            @Override
            public void onTimeSelect(Date date) {
                vTvBoirthday.setText(UtilDate.getSimpleDateFormatTime(date));
            }
        });
    }


}
