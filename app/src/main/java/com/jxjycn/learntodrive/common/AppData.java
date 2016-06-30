package com.jxjycn.learntodrive.common;

import android.os.Environment;


/**
 * Created by liu on 15/6/1.
 */
public class AppData {





    public static String BASE_URL = "http://app.chinatou.com/app/";
    public static String URL_IMAGE = "http://app.chinatou.com/";
    public static String uid = null;
    public static String PATH = Environment.getExternalStorageDirectory().getAbsolutePath() + "/learntodrive/";
    public static String FILE_PATH = PATH + "lession/";
    public static String pageSize = "10";
//    public static String FILE_PATH = "/sdcard/learntodrive/";

    public static int photoCompressState=100;//拍照的压缩比例



    public static String textUrl="http://b.hiphotos.baidu.com/image/pic/item/d01373f082025aaf95bdf7e4f8edab64034f1a15.jpg";//测试的图片的url
    public static String textUrl2="http://ww1.sinaimg.cn/bmiddle/5ff14849jw1eyencwdhy9j20m80e3q53.jpg";//测试的图片的url
    public static String textUrl3="http://ww3.sinaimg.cn/bmiddle/6698b73bjw1eyfljev6e3j20sg0izdns.jpg";//测试的图片的url
    public static String textUrl4="http://img.my.csdn.net/uploads/201410/19/1413698883_5877.jpg";//测试的图片的url
    public static String apkURL="http://gdown.baidu.com/data/wisegame/f98d235e39e29031/baiduxinwen.apk";//测试的图片的url
    public static String imageloaderCache="learnToDrive/Cache";//imageloader缓存缓存文件夹


    public static String [] imageUrl={textUrl,textUrl2,textUrl3,textUrl4};//测试图片




//    public static LoginMesResult personMesResult;
    public static Boolean exit = false;//是否退出登录账号
    public static Boolean refushMineMess = false;//是否刷新个人数据
    public static Boolean isLog = false;//是否打印Log

    public static String CACHE = Environment.getExternalStorageDirectory().getAbsolutePath() + "/chintou/";
    public static String PATH_CHINATOU_CACHE = CACHE + "chintou/";    /**
     * 用户信息保存文件
     * *
     */
    public static String touxiang = "touxiang.dat";

    public static String usagbemoney;
    public static String ALL_CITY="{\n" +
            "  \"provincesList\": [\n" +
            "    {\n" +
            "      \"Citys\": [\n" +
            "        {\n" +
            "          \"Id\": \"d0f17d91-f06e-445c-959a-0817379325ca\",\n" +
            "          \"Name\": \"钦州市\",\n" +
            "          \"ProvinceId\": \"167ee47c-bc85-4b2e-87a0-00af5c2cd664\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"109e4928-33c8-4949-bce1-12f00cb17984\",\n" +
            "          \"Name\": \"崇左市\",\n" +
            "          \"ProvinceId\": \"167ee47c-bc85-4b2e-87a0-00af5c2cd664\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"38f71a71-fa64-4489-9ff7-27476712e21f\",\n" +
            "          \"Name\": \"河池市\",\n" +
            "          \"ProvinceId\": \"167ee47c-bc85-4b2e-87a0-00af5c2cd664\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"fad6d6cf-383d-4ef4-90dd-2b020e23351b\",\n" +
            "          \"Name\": \"北海市\",\n" +
            "          \"ProvinceId\": \"167ee47c-bc85-4b2e-87a0-00af5c2cd664\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"06641d5b-e8a5-4847-a06d-7310188548f9\",\n" +
            "          \"Name\": \"梧州市\",\n" +
            "          \"ProvinceId\": \"167ee47c-bc85-4b2e-87a0-00af5c2cd664\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"798b8282-87ee-446d-8076-91517906d2cd\",\n" +
            "          \"Name\": \"南宁市\",\n" +
            "          \"ProvinceId\": \"167ee47c-bc85-4b2e-87a0-00af5c2cd664\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"dae4b8d1-1a18-422e-83aa-ae8a40e63f6d\",\n" +
            "          \"Name\": \"百色市\",\n" +
            "          \"ProvinceId\": \"167ee47c-bc85-4b2e-87a0-00af5c2cd664\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"62508bb3-ffe0-4207-a954-c45a47092b88\",\n" +
            "          \"Name\": \"桂林市\",\n" +
            "          \"ProvinceId\": \"167ee47c-bc85-4b2e-87a0-00af5c2cd664\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"dfd657ab-3994-4cda-8b3c-dec470c53be2\",\n" +
            "          \"Name\": \"来宾市\",\n" +
            "          \"ProvinceId\": \"167ee47c-bc85-4b2e-87a0-00af5c2cd664\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"bac46955-d379-4146-a0b3-defdaadb1a16\",\n" +
            "          \"Name\": \"贺州市\",\n" +
            "          \"ProvinceId\": \"167ee47c-bc85-4b2e-87a0-00af5c2cd664\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"17e7c191-4e51-4aa4-bdf7-e6f79acf827c\",\n" +
            "          \"Name\": \"玉林市\",\n" +
            "          \"ProvinceId\": \"167ee47c-bc85-4b2e-87a0-00af5c2cd664\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"689da1d2-951f-4b64-9208-e762be59bdc1\",\n" +
            "          \"Name\": \"柳州市\",\n" +
            "          \"ProvinceId\": \"167ee47c-bc85-4b2e-87a0-00af5c2cd664\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"394d6cb1-aea1-4e4d-b547-ec192a7178ab\",\n" +
            "          \"Name\": \"防城港市\",\n" +
            "          \"ProvinceId\": \"167ee47c-bc85-4b2e-87a0-00af5c2cd664\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"b79de958-3052-4925-8d27-fbe60723362e\",\n" +
            "          \"Name\": \"贵港市\",\n" +
            "          \"ProvinceId\": \"167ee47c-bc85-4b2e-87a0-00af5c2cd664\"\n" +
            "        }\n" +
            "      ],\n" +
            "      \"Id\": \"167ee47c-bc85-4b2e-87a0-00af5c2cd664\",\n" +
            "      \"Name\": \"广西壮族自治区\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"Citys\": [\n" +
            "        {\n" +
            "          \"Id\": \"ae5ef87a-dd23-4139-bee2-6472ea8acf22\",\n" +
            "          \"Name\": \"澳门特别行政区\",\n" +
            "          \"ProvinceId\": \"cb3d960c-0e17-473e-b735-0b076d47c79c\"\n" +
            "        }\n" +
            "      ],\n" +
            "      \"Id\": \"cb3d960c-0e17-473e-b735-0b076d47c79c\",\n" +
            "      \"Name\": \"澳门特别行政区\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"Citys\": [\n" +
            "        {\n" +
            "          \"Id\": \"245fc3c6-a77a-4bd6-8a46-35c2858c28be\",\n" +
            "          \"Name\": \"省直辖县级行政单位\",\n" +
            "          \"ProvinceId\": \"e4ea5edf-5390-4137-bac4-15f2db76a299\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"49088680-af1f-4a11-8e66-3516bf6559e4\",\n" +
            "          \"Name\": \"海口市\",\n" +
            "          \"ProvinceId\": \"e4ea5edf-5390-4137-bac4-15f2db76a299\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"a7d45c49-3d3e-42a1-ad17-c3392280fe0e\",\n" +
            "          \"Name\": \"三亚市\",\n" +
            "          \"ProvinceId\": \"e4ea5edf-5390-4137-bac4-15f2db76a299\"\n" +
            "        }\n" +
            "      ],\n" +
            "      \"Id\": \"e4ea5edf-5390-4137-bac4-15f2db76a299\",\n" +
            "      \"Name\": \"海南省\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"Citys\": [\n" +
            "        {\n" +
            "          \"Id\": \"57f9ae23-dc40-4771-b787-9d2a59e4e4d9\",\n" +
            "          \"Name\": \"银川市\",\n" +
            "          \"ProvinceId\": \"0aea2c2e-da7c-4a98-b179-16bf4a26ee43\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"9c6beebd-0aac-43ac-80c1-1b8d3d0bb483\",\n" +
            "          \"Name\": \"吴忠市\",\n" +
            "          \"ProvinceId\": \"0aea2c2e-da7c-4a98-b179-16bf4a26ee43\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"035eee51-48c3-4391-bf5c-0cbc1b93cf61\",\n" +
            "          \"Name\": \"固原市\",\n" +
            "          \"ProvinceId\": \"0aea2c2e-da7c-4a98-b179-16bf4a26ee43\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"3a5e236b-27ee-47a8-bf05-0dc6944c18f8\",\n" +
            "          \"Name\": \"石嘴山市\",\n" +
            "          \"ProvinceId\": \"0aea2c2e-da7c-4a98-b179-16bf4a26ee43\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"3cb6b6fa-f9e5-4ee1-8be7-45271a882d31\",\n" +
            "          \"Name\": \"中卫市\",\n" +
            "          \"ProvinceId\": \"0aea2c2e-da7c-4a98-b179-16bf4a26ee43\"\n" +
            "        }\n" +
            "      ],\n" +
            "      \"Id\": \"0aea2c2e-da7c-4a98-b179-16bf4a26ee43\",\n" +
            "      \"Name\": \"宁夏回族自治区\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"Citys\": [\n" +
            "        {\n" +
            "          \"Id\": \"2489823e-ccfa-4a0c-a375-96d48748149d\",\n" +
            "          \"Name\": \"海北藏族自治州\",\n" +
            "          \"ProvinceId\": \"6a02c31f-47e5-4e64-8213-1cf17d02f06f\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"ac39c604-8e38-4564-90fe-895cfa17c595\",\n" +
            "          \"Name\": \"黄南藏族自治州\",\n" +
            "          \"ProvinceId\": \"6a02c31f-47e5-4e64-8213-1cf17d02f06f\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"d7647762-9fa9-4089-8c35-73d409059903\",\n" +
            "          \"Name\": \"果洛藏族自治州\",\n" +
            "          \"ProvinceId\": \"6a02c31f-47e5-4e64-8213-1cf17d02f06f\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"49aa2eb9-03c8-42f0-8331-766a03ba24aa\",\n" +
            "          \"Name\": \"西宁市\",\n" +
            "          \"ProvinceId\": \"6a02c31f-47e5-4e64-8213-1cf17d02f06f\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"7e94ccef-0781-46ec-81c5-7fe7c83bbcf2\",\n" +
            "          \"Name\": \"玉树藏族自治州\",\n" +
            "          \"ProvinceId\": \"6a02c31f-47e5-4e64-8213-1cf17d02f06f\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"07f3e9f8-2dd4-453d-93f6-6e6d2715c8e4\",\n" +
            "          \"Name\": \"海西蒙古族藏族自治州\",\n" +
            "          \"ProvinceId\": \"6a02c31f-47e5-4e64-8213-1cf17d02f06f\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"b9b1fbaa-2e7d-4502-be74-c1783b624023\",\n" +
            "          \"Name\": \"海南藏族自治州\",\n" +
            "          \"ProvinceId\": \"6a02c31f-47e5-4e64-8213-1cf17d02f06f\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"f1fb3c7b-61c8-4787-ac17-fbc6cc333e2c\",\n" +
            "          \"Name\": \"海东地区\",\n" +
            "          \"ProvinceId\": \"6a02c31f-47e5-4e64-8213-1cf17d02f06f\"\n" +
            "        }\n" +
            "      ],\n" +
            "      \"Id\": \"6a02c31f-47e5-4e64-8213-1cf17d02f06f\",\n" +
            "      \"Name\": \"青海省\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"Citys\": [\n" +
            "        {\n" +
            "          \"Id\": \"035c8acb-b607-46f9-a01f-ede1aa1184c8\",\n" +
            "          \"Name\": \"舟山市\",\n" +
            "          \"ProvinceId\": \"74d26654-0be5-43df-9a4f-20115b8d7584\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"10b76e0c-9c22-4a1c-8405-ef251b727d19\",\n" +
            "          \"Name\": \"湖州市\",\n" +
            "          \"ProvinceId\": \"74d26654-0be5-43df-9a4f-20115b8d7584\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"1020ae0e-bdcf-4f96-9dc9-e182c120b20b\",\n" +
            "          \"Name\": \"嘉兴市\",\n" +
            "          \"ProvinceId\": \"74d26654-0be5-43df-9a4f-20115b8d7584\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"5a6785ed-9945-482a-ae4f-bc823e84a7ca\",\n" +
            "          \"Name\": \"衢州市\",\n" +
            "          \"ProvinceId\": \"74d26654-0be5-43df-9a4f-20115b8d7584\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"9d12babb-ffaf-488d-aa4e-95d4242e07c9\",\n" +
            "          \"Name\": \"金华市\",\n" +
            "          \"ProvinceId\": \"74d26654-0be5-43df-9a4f-20115b8d7584\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"38ae5f8e-c5ec-48ab-b01e-c6a0baca0f55\",\n" +
            "          \"Name\": \"台州市\",\n" +
            "          \"ProvinceId\": \"74d26654-0be5-43df-9a4f-20115b8d7584\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"6d46f05c-5059-4ec7-8aa7-cd9229244cbd\",\n" +
            "          \"Name\": \"宁波市\",\n" +
            "          \"ProvinceId\": \"74d26654-0be5-43df-9a4f-20115b8d7584\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"a8fefdfa-1ff5-4b99-8493-6aea6d522597\",\n" +
            "          \"Name\": \"杭州市\",\n" +
            "          \"ProvinceId\": \"74d26654-0be5-43df-9a4f-20115b8d7584\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"8193d0d2-5efb-4c8b-9d19-45be3b4c5116\",\n" +
            "          \"Name\": \"丽水市\",\n" +
            "          \"ProvinceId\": \"74d26654-0be5-43df-9a4f-20115b8d7584\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"6f3549a9-cd21-4643-89a9-44e09180dfee\",\n" +
            "          \"Name\": \"温州市\",\n" +
            "          \"ProvinceId\": \"74d26654-0be5-43df-9a4f-20115b8d7584\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"01864ca2-65cc-4562-8b7f-04328948339c\",\n" +
            "          \"Name\": \"绍兴市\",\n" +
            "          \"ProvinceId\": \"74d26654-0be5-43df-9a4f-20115b8d7584\"\n" +
            "        }\n" +
            "      ],\n" +
            "      \"Id\": \"74d26654-0be5-43df-9a4f-20115b8d7584\",\n" +
            "      \"Name\": \"浙江省\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"Citys\": [\n" +
            "        {\n" +
            "          \"Id\": \"ae5ef87a-dd23-4139-bee2-6472ea8acf23\",\n" +
            "          \"Name\": \"香港特别行政区\",\n" +
            "          \"ProvinceId\": \"abf30916-9972-41cb-814e-24eac24e8ce6\"\n" +
            "        }\n" +
            "      ],\n" +
            "      \"Id\": \"abf30916-9972-41cb-814e-24eac24e8ce6\",\n" +
            "      \"Name\": \"香港特别行政区\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"Citys\": [\n" +
            "        {\n" +
            "          \"Id\": \"077f1c32-c977-44dc-889f-5bc37e06cb55\",\n" +
            "          \"Name\": \"黔南布依族苗族自治州\",\n" +
            "          \"ProvinceId\": \"23b3c109-452c-4b07-8d77-27349f5420ba\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"c1e92ffd-f662-462c-93d9-4e88bad214d2\",\n" +
            "          \"Name\": \"铜仁地区\",\n" +
            "          \"ProvinceId\": \"23b3c109-452c-4b07-8d77-27349f5420ba\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"6f193bc3-7bab-4ed6-ae8a-3e3e777a3c2f\",\n" +
            "          \"Name\": \"黔西南布依族苗族自治州\",\n" +
            "          \"ProvinceId\": \"23b3c109-452c-4b07-8d77-27349f5420ba\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"2f662d7b-fc51-495f-8f22-065d7019517c\",\n" +
            "          \"Name\": \"黔东南苗族侗族自治州\",\n" +
            "          \"ProvinceId\": \"23b3c109-452c-4b07-8d77-27349f5420ba\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"413a067a-b658-4cd4-b529-0f9d8d14e556\",\n" +
            "          \"Name\": \"安顺市\",\n" +
            "          \"ProvinceId\": \"23b3c109-452c-4b07-8d77-27349f5420ba\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"74ca1cf6-3a90-450e-816d-105a5de3e094\",\n" +
            "          \"Name\": \"贵阳市\",\n" +
            "          \"ProvinceId\": \"23b3c109-452c-4b07-8d77-27349f5420ba\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"3a24078c-1184-4afb-a471-711cab81f909\",\n" +
            "          \"Name\": \"毕节地区\",\n" +
            "          \"ProvinceId\": \"23b3c109-452c-4b07-8d77-27349f5420ba\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"be0c0d6f-3ce0-4067-9f20-97b0352e4982\",\n" +
            "          \"Name\": \"遵义市\",\n" +
            "          \"ProvinceId\": \"23b3c109-452c-4b07-8d77-27349f5420ba\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"be7919ae-8c59-4184-bf6a-d472396d1183\",\n" +
            "          \"Name\": \"六盘水市\",\n" +
            "          \"ProvinceId\": \"23b3c109-452c-4b07-8d77-27349f5420ba\"\n" +
            "        }\n" +
            "      ],\n" +
            "      \"Id\": \"23b3c109-452c-4b07-8d77-27349f5420ba\",\n" +
            "      \"Name\": \"贵州省\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"Citys\": [\n" +
            "        {\n" +
            "          \"Id\": \"d7f5202d-404c-411f-8ec1-ce4a6169ff68\",\n" +
            "          \"Name\": \"延安市\",\n" +
            "          \"ProvinceId\": \"52870c17-e12b-44a9-83e7-2a550d1171b8\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"5c3365b4-7414-4d24-a21b-d72810be95f0\",\n" +
            "          \"Name\": \"渭南市\",\n" +
            "          \"ProvinceId\": \"52870c17-e12b-44a9-83e7-2a550d1171b8\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"ee4f7af5-4007-4009-b81c-8bf8c232b23f\",\n" +
            "          \"Name\": \"宝鸡市\",\n" +
            "          \"ProvinceId\": \"52870c17-e12b-44a9-83e7-2a550d1171b8\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"abe23f4d-e5b2-4cdf-bc7a-6afac7bebccf\",\n" +
            "          \"Name\": \"安康市\",\n" +
            "          \"ProvinceId\": \"52870c17-e12b-44a9-83e7-2a550d1171b8\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"96b0ee6a-8c15-4e17-948f-6dac92cb7cae\",\n" +
            "          \"Name\": \"铜川市\",\n" +
            "          \"ProvinceId\": \"52870c17-e12b-44a9-83e7-2a550d1171b8\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"001f31d3-4cf0-4fba-8a65-27344053f422\",\n" +
            "          \"Name\": \"西安市\",\n" +
            "          \"ProvinceId\": \"52870c17-e12b-44a9-83e7-2a550d1171b8\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"17f58e4c-7bf4-41e0-b4c3-219c575c8a12\",\n" +
            "          \"Name\": \"榆林市\",\n" +
            "          \"ProvinceId\": \"52870c17-e12b-44a9-83e7-2a550d1171b8\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"83416a5d-5642-4659-8b97-568cb3f79b59\",\n" +
            "          \"Name\": \"汉中市\",\n" +
            "          \"ProvinceId\": \"52870c17-e12b-44a9-83e7-2a550d1171b8\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"d53c7c01-05d0-4035-852e-f40a341882ef\",\n" +
            "          \"Name\": \"咸阳市\",\n" +
            "          \"ProvinceId\": \"52870c17-e12b-44a9-83e7-2a550d1171b8\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"d57f680b-7fc0-439c-864d-fd918f6011c6\",\n" +
            "          \"Name\": \"商洛市\",\n" +
            "          \"ProvinceId\": \"52870c17-e12b-44a9-83e7-2a550d1171b8\"\n" +
            "        }\n" +
            "      ],\n" +
            "      \"Id\": \"52870c17-e12b-44a9-83e7-2a550d1171b8\",\n" +
            "      \"Name\": \"陕西省\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"Citys\": [\n" +
            "        {\n" +
            "          \"Id\": \"a633975d-3494-40fb-afa1-5612324ce687\",\n" +
            "          \"Name\": \"昭通市\",\n" +
            "          \"ProvinceId\": \"6e807b58-07e7-40cf-8971-3756750ba62a\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"33416fef-8cad-4921-b1e6-585f9938d47a\",\n" +
            "          \"Name\": \"怒江傈僳族自治州\",\n" +
            "          \"ProvinceId\": \"6e807b58-07e7-40cf-8971-3756750ba62a\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"a72a5105-a3ea-49a2-92d9-3da8fefea0d5\",\n" +
            "          \"Name\": \"临沧市\",\n" +
            "          \"ProvinceId\": \"6e807b58-07e7-40cf-8971-3756750ba62a\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"302d0a3e-2c11-4618-a7ea-4a2beffae5af\",\n" +
            "          \"Name\": \"文山壮族苗族自治州\",\n" +
            "          \"ProvinceId\": \"6e807b58-07e7-40cf-8971-3756750ba62a\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"da105cd2-f200-4fe0-8bc9-472ee8a7a3b8\",\n" +
            "          \"Name\": \"西双版纳傣族自治州\",\n" +
            "          \"ProvinceId\": \"6e807b58-07e7-40cf-8971-3756750ba62a\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"e6df04bc-8ef6-4b58-b734-358a91a9c278\",\n" +
            "          \"Name\": \"楚雄彝族自治州\",\n" +
            "          \"ProvinceId\": \"6e807b58-07e7-40cf-8971-3756750ba62a\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"88aa9345-0fdd-4d55-b5db-2dc45fa1e158\",\n" +
            "          \"Name\": \"丽江市\",\n" +
            "          \"ProvinceId\": \"6e807b58-07e7-40cf-8971-3756750ba62a\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"b21abebb-942e-4f22-b85f-151fd1431c7b\",\n" +
            "          \"Name\": \"德宏傣族景颇族自治州\",\n" +
            "          \"ProvinceId\": \"6e807b58-07e7-40cf-8971-3756750ba62a\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"a33036dc-e507-445e-a924-00f8287654d6\",\n" +
            "          \"Name\": \"保山市\",\n" +
            "          \"ProvinceId\": \"6e807b58-07e7-40cf-8971-3756750ba62a\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"f3208ae7-4c1f-4a8e-a239-774c0efff470\",\n" +
            "          \"Name\": \"大理白族自治州\",\n" +
            "          \"ProvinceId\": \"6e807b58-07e7-40cf-8971-3756750ba62a\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"40b4b40e-b0c0-4abf-bb6a-88d4c90ae3b8\",\n" +
            "          \"Name\": \"迪庆藏族自治州\",\n" +
            "          \"ProvinceId\": \"6e807b58-07e7-40cf-8971-3756750ba62a\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"e5eed04e-baf0-4e77-acd6-9e3fe68fbfbf\",\n" +
            "          \"Name\": \"玉溪市\",\n" +
            "          \"ProvinceId\": \"6e807b58-07e7-40cf-8971-3756750ba62a\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"381635c3-eb99-4270-b37a-991a1bbfc724\",\n" +
            "          \"Name\": \"红河哈尼族彝族自治州\",\n" +
            "          \"ProvinceId\": \"6e807b58-07e7-40cf-8971-3756750ba62a\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"5ad150e3-e732-4ef5-93e1-d66d330a2d3f\",\n" +
            "          \"Name\": \"曲靖市\",\n" +
            "          \"ProvinceId\": \"6e807b58-07e7-40cf-8971-3756750ba62a\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"da21e4c6-342e-4d6a-b8e5-c9252b2b5c29\",\n" +
            "          \"Name\": \"思茅市\",\n" +
            "          \"ProvinceId\": \"6e807b58-07e7-40cf-8971-3756750ba62a\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"09891418-1858-4821-a77f-ad971f048801\",\n" +
            "          \"Name\": \"昆明市\",\n" +
            "          \"ProvinceId\": \"6e807b58-07e7-40cf-8971-3756750ba62a\"\n" +
            "        }\n" +
            "      ],\n" +
            "      \"Id\": \"6e807b58-07e7-40cf-8971-3756750ba62a\",\n" +
            "      \"Name\": \"云南省\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"Citys\": [\n" +
            "        {\n" +
            "          \"Id\": \"7d04e3a1-ee87-431c-9aa7-ac245014c51a\",\n" +
            "          \"Name\": \"上海市\",\n" +
            "          \"ProvinceId\": \"3abcf245-505f-4342-b4d0-3dabd8cadb7f\"\n" +
            "        }\n" +
            "      ],\n" +
            "      \"Id\": \"3abcf245-505f-4342-b4d0-3dabd8cadb7f\",\n" +
            "      \"Name\": \"上海\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"Citys\": [\n" +
            "        {\n" +
            "          \"Id\": \"30fab2f1-8f0d-48ae-9456-b52f7a2c7c9a\",\n" +
            "          \"Name\": \"大庆市\",\n" +
            "          \"ProvinceId\": \"220c349a-b73a-426a-b250-4b27e59c45e8\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"9d368aa0-2152-47cc-9eea-bbfaf74919c1\",\n" +
            "          \"Name\": \"大兴安岭地区\",\n" +
            "          \"ProvinceId\": \"220c349a-b73a-426a-b250-4b27e59c45e8\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"338f89e5-156b-4205-9e34-8fd2879d806f\",\n" +
            "          \"Name\": \"双鸭山市\",\n" +
            "          \"ProvinceId\": \"220c349a-b73a-426a-b250-4b27e59c45e8\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"01344f0a-3242-48fd-aad6-7140042edc0b\",\n" +
            "          \"Name\": \"鹤岗市\",\n" +
            "          \"ProvinceId\": \"220c349a-b73a-426a-b250-4b27e59c45e8\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"773a3f4f-0c62-4024-be0f-1180e4da8551\",\n" +
            "          \"Name\": \"鸡西市\",\n" +
            "          \"ProvinceId\": \"220c349a-b73a-426a-b250-4b27e59c45e8\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"1514839b-d838-411b-b33a-282e2e72afc6\",\n" +
            "          \"Name\": \"佳木斯市\",\n" +
            "          \"ProvinceId\": \"220c349a-b73a-426a-b250-4b27e59c45e8\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"17a95d4a-958c-4e4d-b7b8-289a92eb5370\",\n" +
            "          \"Name\": \"七台河市\",\n" +
            "          \"ProvinceId\": \"220c349a-b73a-426a-b250-4b27e59c45e8\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"aa7f5ada-0fa6-45d4-9d98-479c43ce3964\",\n" +
            "          \"Name\": \"伊春市\",\n" +
            "          \"ProvinceId\": \"220c349a-b73a-426a-b250-4b27e59c45e8\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"28fe794f-6fdf-42f0-88fb-482b6bb57ec3\",\n" +
            "          \"Name\": \"哈尔滨市\",\n" +
            "          \"ProvinceId\": \"220c349a-b73a-426a-b250-4b27e59c45e8\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"1841df8b-2721-4179-9a5d-4abd1c8937f7\",\n" +
            "          \"Name\": \"牡丹江市\",\n" +
            "          \"ProvinceId\": \"220c349a-b73a-426a-b250-4b27e59c45e8\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"695bb41d-52d4-4be1-b375-438a86e7e348\",\n" +
            "          \"Name\": \"黑河市\",\n" +
            "          \"ProvinceId\": \"220c349a-b73a-426a-b250-4b27e59c45e8\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"f09a3b3a-f68f-4941-a504-551a2f9d3275\",\n" +
            "          \"Name\": \"齐齐哈尔市\",\n" +
            "          \"ProvinceId\": \"220c349a-b73a-426a-b250-4b27e59c45e8\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"4a70ff61-9fd8-4af4-8d42-5359d5bf1a58\",\n" +
            "          \"Name\": \"绥化市\",\n" +
            "          \"ProvinceId\": \"220c349a-b73a-426a-b250-4b27e59c45e8\"\n" +
            "        }\n" +
            "      ],\n" +
            "      \"Id\": \"220c349a-b73a-426a-b250-4b27e59c45e8\",\n" +
            "      \"Name\": \"黑龙江省\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"Citys\": [\n" +
            "        {\n" +
            "          \"Id\": \"ef89b763-e04e-4b16-94b0-56be622bf862\",\n" +
            "          \"Name\": \"喀什地区\",\n" +
            "          \"ProvinceId\": \"07996592-1ab7-4669-996d-4efc79d5340b\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"c7ca0469-746d-414a-977f-481104fff97d\",\n" +
            "          \"Name\": \"巴音郭楞蒙古自治州\",\n" +
            "          \"ProvinceId\": \"07996592-1ab7-4669-996d-4efc79d5340b\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"e471d605-826b-444d-a0c0-46fe5cbac943\",\n" +
            "          \"Name\": \"吐鲁番地区\",\n" +
            "          \"ProvinceId\": \"07996592-1ab7-4669-996d-4efc79d5340b\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"6cd445c1-ce8b-4b25-9af1-2a57a7dbc1b6\",\n" +
            "          \"Name\": \"克孜勒苏柯尔克孜自治州\",\n" +
            "          \"ProvinceId\": \"07996592-1ab7-4669-996d-4efc79d5340b\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"f542c2be-abae-44a4-a281-13dae0c7d66d\",\n" +
            "          \"Name\": \"昌吉回族自治州\",\n" +
            "          \"ProvinceId\": \"07996592-1ab7-4669-996d-4efc79d5340b\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"462a6b1f-b5a5-4350-895c-018ad47721ac\",\n" +
            "          \"Name\": \"伊犁哈萨克自治州\",\n" +
            "          \"ProvinceId\": \"07996592-1ab7-4669-996d-4efc79d5340b\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"8c4cebe8-c616-4498-995a-7f7e1fa65f07\",\n" +
            "          \"Name\": \"阿勒泰地区\",\n" +
            "          \"ProvinceId\": \"07996592-1ab7-4669-996d-4efc79d5340b\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"0f2f4670-6283-45e5-af21-94491c16b1c4\",\n" +
            "          \"Name\": \"塔城地区\",\n" +
            "          \"ProvinceId\": \"07996592-1ab7-4669-996d-4efc79d5340b\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"5ab6df27-de2a-466a-936e-c30a0df85a7f\",\n" +
            "          \"Name\": \"阿克苏地区\",\n" +
            "          \"ProvinceId\": \"07996592-1ab7-4669-996d-4efc79d5340b\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"4e147b7e-f721-40cc-b231-c9cf1bf67559\",\n" +
            "          \"Name\": \"哈密地区\",\n" +
            "          \"ProvinceId\": \"07996592-1ab7-4669-996d-4efc79d5340b\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"95e02f24-b82a-44bc-926d-c66bf54678a1\",\n" +
            "          \"Name\": \"乌鲁木齐市\",\n" +
            "          \"ProvinceId\": \"07996592-1ab7-4669-996d-4efc79d5340b\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"12610052-dd77-4979-aa95-ddb7934c0c99\",\n" +
            "          \"Name\": \"省直辖行政单位\",\n" +
            "          \"ProvinceId\": \"07996592-1ab7-4669-996d-4efc79d5340b\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"29f008a3-f9c8-440c-810f-fdd318b2b1ec\",\n" +
            "          \"Name\": \"博尔塔拉蒙古自治州\",\n" +
            "          \"ProvinceId\": \"07996592-1ab7-4669-996d-4efc79d5340b\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"6c71deb8-fb1a-44dc-88da-f8f7d54242c1\",\n" +
            "          \"Name\": \"克拉玛依市\",\n" +
            "          \"ProvinceId\": \"07996592-1ab7-4669-996d-4efc79d5340b\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"08ae5f6e-006e-4130-8417-dfe8e24a916a\",\n" +
            "          \"Name\": \"和田地区\",\n" +
            "          \"ProvinceId\": \"07996592-1ab7-4669-996d-4efc79d5340b\"\n" +
            "        }\n" +
            "      ],\n" +
            "      \"Id\": \"07996592-1ab7-4669-996d-4efc79d5340b\",\n" +
            "      \"Name\": \"新疆维吾尔自治区\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"Citys\": [\n" +
            "        {\n" +
            "          \"Id\": \"9420aade-7fcb-47b3-bac1-ea204d253a40\",\n" +
            "          \"Name\": \"北京市\",\n" +
            "          \"ProvinceId\": \"359418ff-6598-4a5a-900c-5d6ef2fb42e5\"\n" +
            "        }\n" +
            "      ],\n" +
            "      \"Id\": \"359418ff-6598-4a5a-900c-5d6ef2fb42e5\",\n" +
            "      \"Name\": \"北京\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"Citys\": [\n" +
            "        {\n" +
            "          \"Id\": \"f1afba3d-170d-40b7-939c-e6687fc40ab3\",\n" +
            "          \"Name\": \"汕尾市\",\n" +
            "          \"ProvinceId\": \"0aa32b24-b795-49d8-b37b-619c8335343a\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"6f737af5-7142-4e7f-a734-f0272c881c4e\",\n" +
            "          \"Name\": \"中山市\",\n" +
            "          \"ProvinceId\": \"0aa32b24-b795-49d8-b37b-619c8335343a\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"e47a0e01-778e-4184-9f1c-ecd0604e1e99\",\n" +
            "          \"Name\": \"韶关市\",\n" +
            "          \"ProvinceId\": \"0aa32b24-b795-49d8-b37b-619c8335343a\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"5cb06346-4b4b-49ff-8d49-df753ed10a22\",\n" +
            "          \"Name\": \"东莞市\",\n" +
            "          \"ProvinceId\": \"0aa32b24-b795-49d8-b37b-619c8335343a\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"9ea06802-3ef6-411b-8af4-fdb1281335bf\",\n" +
            "          \"Name\": \"江门市\",\n" +
            "          \"ProvinceId\": \"0aa32b24-b795-49d8-b37b-619c8335343a\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"a9df690b-4c9c-44bb-b60e-c531117dd43d\",\n" +
            "          \"Name\": \"茂名市\",\n" +
            "          \"ProvinceId\": \"0aa32b24-b795-49d8-b37b-619c8335343a\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"c85c178d-1874-486a-89bb-c5aa4d3cd3d9\",\n" +
            "          \"Name\": \"佛山市\",\n" +
            "          \"ProvinceId\": \"0aa32b24-b795-49d8-b37b-619c8335343a\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"99217488-d2d0-4d10-a9c5-cb2108a6daa5\",\n" +
            "          \"Name\": \"广州市\",\n" +
            "          \"ProvinceId\": \"0aa32b24-b795-49d8-b37b-619c8335343a\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"bb917ed7-331e-4837-94bb-c8edeb61321a\",\n" +
            "          \"Name\": \"珠海市\",\n" +
            "          \"ProvinceId\": \"0aa32b24-b795-49d8-b37b-619c8335343a\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"feed34bd-0081-4161-a6de-9ff498c1a310\",\n" +
            "          \"Name\": \"湛江市\",\n" +
            "          \"ProvinceId\": \"0aa32b24-b795-49d8-b37b-619c8335343a\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"c42324d7-0ccc-4929-8a3f-900b699be790\",\n" +
            "          \"Name\": \"深圳市\",\n" +
            "          \"ProvinceId\": \"0aa32b24-b795-49d8-b37b-619c8335343a\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"106a7194-3489-4a8f-92f8-0ff5ebbcffb8\",\n" +
            "          \"Name\": \"云浮市\",\n" +
            "          \"ProvinceId\": \"0aa32b24-b795-49d8-b37b-619c8335343a\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"f82a2227-20b4-4ca2-a78d-2c74ce1a76b4\",\n" +
            "          \"Name\": \"河源市\",\n" +
            "          \"ProvinceId\": \"0aa32b24-b795-49d8-b37b-619c8335343a\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"b7fc9f77-89a8-426b-a7a3-2d7116a5a452\",\n" +
            "          \"Name\": \"惠州市\",\n" +
            "          \"ProvinceId\": \"0aa32b24-b795-49d8-b37b-619c8335343a\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"82636d8e-2820-4fb3-b57b-4b2d11780801\",\n" +
            "          \"Name\": \"阳江市\",\n" +
            "          \"ProvinceId\": \"0aa32b24-b795-49d8-b37b-619c8335343a\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"9c2c6967-8f28-4f78-bc84-41523e931833\",\n" +
            "          \"Name\": \"汕头市\",\n" +
            "          \"ProvinceId\": \"0aa32b24-b795-49d8-b37b-619c8335343a\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"a88a13bd-0d47-4623-bc6a-3d0416790838\",\n" +
            "          \"Name\": \"揭阳市\",\n" +
            "          \"ProvinceId\": \"0aa32b24-b795-49d8-b37b-619c8335343a\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"c7b2883b-ec94-4360-b1bc-37b6f83254ef\",\n" +
            "          \"Name\": \"清远市\",\n" +
            "          \"ProvinceId\": \"0aa32b24-b795-49d8-b37b-619c8335343a\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"a0b51a42-4f66-4ec3-a65e-51d61a89b4b8\",\n" +
            "          \"Name\": \"潮州市\",\n" +
            "          \"ProvinceId\": \"0aa32b24-b795-49d8-b37b-619c8335343a\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"bdba0f6f-35cf-456e-808c-567b53be0ba6\",\n" +
            "          \"Name\": \"肇庆市\",\n" +
            "          \"ProvinceId\": \"0aa32b24-b795-49d8-b37b-619c8335343a\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"21c8e3c8-3a2b-4194-b4a4-68be293aa6ad\",\n" +
            "          \"Name\": \"梅州市\",\n" +
            "          \"ProvinceId\": \"0aa32b24-b795-49d8-b37b-619c8335343a\"\n" +
            "        }\n" +
            "      ],\n" +
            "      \"Id\": \"0aa32b24-b795-49d8-b37b-619c8335343a\",\n" +
            "      \"Name\": \"广东省\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"Citys\": [\n" +
            "        {\n" +
            "          \"Id\": \"68771343-b675-4224-b6b3-599045ae279b\",\n" +
            "          \"Name\": \"昌都地区\",\n" +
            "          \"ProvinceId\": \"76b136e0-c072-4d6b-9049-6a0070f7f27f\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"4745936a-32b9-4db4-9909-5b71b6c2998b\",\n" +
            "          \"Name\": \"那曲地区\",\n" +
            "          \"ProvinceId\": \"76b136e0-c072-4d6b-9049-6a0070f7f27f\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"6ebb88b4-711b-4641-ae75-0448a55cb91d\",\n" +
            "          \"Name\": \"林芝地区\",\n" +
            "          \"ProvinceId\": \"76b136e0-c072-4d6b-9049-6a0070f7f27f\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"a2b82a3c-0f51-49d3-ba50-cd2e5745168f\",\n" +
            "          \"Name\": \"阿里地区\",\n" +
            "          \"ProvinceId\": \"76b136e0-c072-4d6b-9049-6a0070f7f27f\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"1118df59-f071-4ac9-b072-db053b509ee1\",\n" +
            "          \"Name\": \"日喀则地区\",\n" +
            "          \"ProvinceId\": \"76b136e0-c072-4d6b-9049-6a0070f7f27f\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"de67eb5f-592f-4887-a796-b8260b714b69\",\n" +
            "          \"Name\": \"拉萨市\",\n" +
            "          \"ProvinceId\": \"76b136e0-c072-4d6b-9049-6a0070f7f27f\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"b3afcc88-7eb6-4631-b0f9-ab62da1d81b6\",\n" +
            "          \"Name\": \"山南地区\",\n" +
            "          \"ProvinceId\": \"76b136e0-c072-4d6b-9049-6a0070f7f27f\"\n" +
            "        }\n" +
            "      ],\n" +
            "      \"Id\": \"76b136e0-c072-4d6b-9049-6a0070f7f27f\",\n" +
            "      \"Name\": \"西藏自治区\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"Citys\": [\n" +
            "        {\n" +
            "          \"Id\": \"631afada-1f81-4af4-b6fd-b45af91145d3\",\n" +
            "          \"Name\": \"诸城市\",\n" +
            "          \"ProvinceId\": \"422c27f5-518f-4621-a787-7425c5296d60\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"e9f524ef-040e-4c38-aace-af5817737913\",\n" +
            "          \"Name\": \"聊城市\",\n" +
            "          \"ProvinceId\": \"422c27f5-518f-4621-a787-7425c5296d60\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"50f0a005-db7e-40a5-a92d-d50076cd14ad\",\n" +
            "          \"Name\": \"济宁市\",\n" +
            "          \"ProvinceId\": \"422c27f5-518f-4621-a787-7425c5296d60\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"1dc771c9-c07c-450f-b932-843ef0dd0c16\",\n" +
            "          \"Name\": \"临沂市\",\n" +
            "          \"ProvinceId\": \"422c27f5-518f-4621-a787-7425c5296d60\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"dc2c5dec-fca0-4e10-ad9d-88b2e70f9e0b\",\n" +
            "          \"Name\": \"威海市\",\n" +
            "          \"ProvinceId\": \"422c27f5-518f-4621-a787-7425c5296d60\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"9ba4d576-ffb8-482b-8036-9a091606076d\",\n" +
            "          \"Name\": \"德州市\",\n" +
            "          \"ProvinceId\": \"422c27f5-518f-4621-a787-7425c5296d60\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"52a71753-7068-401c-a332-97d3284e1a70\",\n" +
            "          \"Name\": \"东营市\",\n" +
            "          \"ProvinceId\": \"422c27f5-518f-4621-a787-7425c5296d60\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"8071d483-4845-474f-ba0f-703885dc0886\",\n" +
            "          \"Name\": \"济南市\",\n" +
            "          \"ProvinceId\": \"422c27f5-518f-4621-a787-7425c5296d60\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"f50dab6d-c95b-4b3c-87b4-0571f02b80e2\",\n" +
            "          \"Name\": \"潍坊市\",\n" +
            "          \"ProvinceId\": \"422c27f5-518f-4621-a787-7425c5296d60\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"eba6bee6-5fe5-4a0d-bde8-0f373cea9ccd\",\n" +
            "          \"Name\": \"烟台市\",\n" +
            "          \"ProvinceId\": \"422c27f5-518f-4621-a787-7425c5296d60\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"c5155eed-38cb-4acb-a503-1371ad8a1739\",\n" +
            "          \"Name\": \"荷泽市\",\n" +
            "          \"ProvinceId\": \"422c27f5-518f-4621-a787-7425c5296d60\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"09013e76-4561-4de5-b431-5e1cf75228a0\",\n" +
            "          \"Name\": \"枣庄市\",\n" +
            "          \"ProvinceId\": \"422c27f5-518f-4621-a787-7425c5296d60\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"78956740-b4f1-4120-aabb-39f6abb0f0f7\",\n" +
            "          \"Name\": \"淄博市\",\n" +
            "          \"ProvinceId\": \"422c27f5-518f-4621-a787-7425c5296d60\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"8e211b85-20ec-47dd-9776-36919a586c20\",\n" +
            "          \"Name\": \"滨州市\",\n" +
            "          \"ProvinceId\": \"422c27f5-518f-4621-a787-7425c5296d60\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"0deae1d7-d490-4cf7-a5c4-fe39e5823584\",\n" +
            "          \"Name\": \"日照市\",\n" +
            "          \"ProvinceId\": \"422c27f5-518f-4621-a787-7425c5296d60\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"bcaa135c-d1ad-415d-8d43-e6fed4ec545e\",\n" +
            "          \"Name\": \"青岛市\",\n" +
            "          \"ProvinceId\": \"422c27f5-518f-4621-a787-7425c5296d60\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"261cf8a2-9cbf-4cf5-875c-e101e60d99ed\",\n" +
            "          \"Name\": \"泰安市\",\n" +
            "          \"ProvinceId\": \"422c27f5-518f-4621-a787-7425c5296d60\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"89c30809-c6d3-49a0-9edb-ee9525fdc9ff\",\n" +
            "          \"Name\": \"莱芜市\",\n" +
            "          \"ProvinceId\": \"422c27f5-518f-4621-a787-7425c5296d60\"\n" +
            "        }\n" +
            "      ],\n" +
            "      \"Id\": \"422c27f5-518f-4621-a787-7425c5296d60\",\n" +
            "      \"Name\": \"山东省\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"Citys\": [\n" +
            "        {\n" +
            "          \"Id\": \"9f7a8666-cbc7-491d-9155-e99af7f812ca\",\n" +
            "          \"Name\": \"九江市\",\n" +
            "          \"ProvinceId\": \"33361fe8-7bf7-4697-a5a7-79d5a61fe269\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"94fc4746-af21-4099-b414-feec114b7dfb\",\n" +
            "          \"Name\": \"鹰潭市\",\n" +
            "          \"ProvinceId\": \"33361fe8-7bf7-4697-a5a7-79d5a61fe269\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"738b9cd6-19af-4f85-a566-4b4ecf6a78b9\",\n" +
            "          \"Name\": \"上饶市\",\n" +
            "          \"ProvinceId\": \"33361fe8-7bf7-4697-a5a7-79d5a61fe269\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"5c90ed55-a88b-4ce9-8709-50750346ba69\",\n" +
            "          \"Name\": \"南昌市\",\n" +
            "          \"ProvinceId\": \"33361fe8-7bf7-4697-a5a7-79d5a61fe269\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"a4430752-1b2a-4410-9c3d-025b04deea4b\",\n" +
            "          \"Name\": \"抚州市\",\n" +
            "          \"ProvinceId\": \"33361fe8-7bf7-4697-a5a7-79d5a61fe269\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"d911bb0e-f9ae-4494-910e-1c2c45e906f2\",\n" +
            "          \"Name\": \"宜春市\",\n" +
            "          \"ProvinceId\": \"33361fe8-7bf7-4697-a5a7-79d5a61fe269\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"06d61439-88dc-4823-8778-6e78607f2692\",\n" +
            "          \"Name\": \"吉安市\",\n" +
            "          \"ProvinceId\": \"33361fe8-7bf7-4697-a5a7-79d5a61fe269\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"9e8e439d-8b91-4cda-904b-68f2232e8d35\",\n" +
            "          \"Name\": \"景德镇市\",\n" +
            "          \"ProvinceId\": \"33361fe8-7bf7-4697-a5a7-79d5a61fe269\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"6059a82d-7f9d-4863-b013-cfc723ef8411\",\n" +
            "          \"Name\": \"赣州市\",\n" +
            "          \"ProvinceId\": \"33361fe8-7bf7-4697-a5a7-79d5a61fe269\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"ecbd783c-4a22-4270-a94d-d95fec7ebc8d\",\n" +
            "          \"Name\": \"萍乡市\",\n" +
            "          \"ProvinceId\": \"33361fe8-7bf7-4697-a5a7-79d5a61fe269\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"64516a4d-864d-4075-b331-b036afe2084c\",\n" +
            "          \"Name\": \"新余市\",\n" +
            "          \"ProvinceId\": \"33361fe8-7bf7-4697-a5a7-79d5a61fe269\"\n" +
            "        }\n" +
            "      ],\n" +
            "      \"Id\": \"33361fe8-7bf7-4697-a5a7-79d5a61fe269\",\n" +
            "      \"Name\": \"江西省\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"Citys\": [\n" +
            "        {\n" +
            "          \"Id\": \"6bef71a6-b05e-42a4-aec3-bd3712ae117c\",\n" +
            "          \"Name\": \"漯河市\",\n" +
            "          \"ProvinceId\": \"d6044f33-a608-4838-b330-8872a2aca9e5\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"04c60821-4682-4d78-a290-da8a2c0acd9a\",\n" +
            "          \"Name\": \"新乡市\",\n" +
            "          \"ProvinceId\": \"d6044f33-a608-4838-b330-8872a2aca9e5\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"8075dd62-b2b8-4dc7-b2ac-ced0ee7d7618\",\n" +
            "          \"Name\": \"许昌市\",\n" +
            "          \"ProvinceId\": \"d6044f33-a608-4838-b330-8872a2aca9e5\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"5d1b9efb-c41a-4178-b693-7ab5889057ca\",\n" +
            "          \"Name\": \"信阳市\",\n" +
            "          \"ProvinceId\": \"d6044f33-a608-4838-b330-8872a2aca9e5\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"3c377d19-2eca-4be9-a1f1-77a8177090d0\",\n" +
            "          \"Name\": \"安阳市\",\n" +
            "          \"ProvinceId\": \"d6044f33-a608-4838-b330-8872a2aca9e5\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"4ab3f1d8-1aa5-491b-b5f2-93097858cbfb\",\n" +
            "          \"Name\": \"洛阳市\",\n" +
            "          \"ProvinceId\": \"d6044f33-a608-4838-b330-8872a2aca9e5\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"26fa03cc-20a7-4eec-b9b2-9b0509f7a0b7\",\n" +
            "          \"Name\": \"三门峡市\",\n" +
            "          \"ProvinceId\": \"d6044f33-a608-4838-b330-8872a2aca9e5\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"d9e45a5a-40eb-4f4b-a2b2-230612fbd559\",\n" +
            "          \"Name\": \"平顶山市\",\n" +
            "          \"ProvinceId\": \"d6044f33-a608-4838-b330-8872a2aca9e5\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"9fa69e67-59ed-420b-8532-243b6eab9dce\",\n" +
            "          \"Name\": \"焦作市\",\n" +
            "          \"ProvinceId\": \"d6044f33-a608-4838-b330-8872a2aca9e5\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"ee4776d0-2ac0-46f4-89ca-29e2aa73a16b\",\n" +
            "          \"Name\": \"周口市\",\n" +
            "          \"ProvinceId\": \"d6044f33-a608-4838-b330-8872a2aca9e5\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"ec8d15e5-43fb-412d-9074-1c06bf4110cc\",\n" +
            "          \"Name\": \"濮阳市\",\n" +
            "          \"ProvinceId\": \"d6044f33-a608-4838-b330-8872a2aca9e5\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"8d7a76b8-f490-48a1-a8ac-5258864ebe47\",\n" +
            "          \"Name\": \"南阳市\",\n" +
            "          \"ProvinceId\": \"d6044f33-a608-4838-b330-8872a2aca9e5\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"8be92b40-e74f-48ea-8161-5c3c70468ab7\",\n" +
            "          \"Name\": \"驻马店市\",\n" +
            "          \"ProvinceId\": \"d6044f33-a608-4838-b330-8872a2aca9e5\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"325ec6fe-92c2-488c-8194-35dd0d301491\",\n" +
            "          \"Name\": \"郑州市\",\n" +
            "          \"ProvinceId\": \"d6044f33-a608-4838-b330-8872a2aca9e5\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"6e2a045c-0033-4353-836e-363449127a42\",\n" +
            "          \"Name\": \"鹤壁市\",\n" +
            "          \"ProvinceId\": \"d6044f33-a608-4838-b330-8872a2aca9e5\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"6cfca218-3815-4d08-a36e-e61a663e13ed\",\n" +
            "          \"Name\": \"开封市\",\n" +
            "          \"ProvinceId\": \"d6044f33-a608-4838-b330-8872a2aca9e5\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"d6957be9-f7e0-46f4-9c68-e33185803898\",\n" +
            "          \"Name\": \"商丘市\",\n" +
            "          \"ProvinceId\": \"d6044f33-a608-4838-b330-8872a2aca9e5\"\n" +
            "        }\n" +
            "      ],\n" +
            "      \"Id\": \"d6044f33-a608-4838-b330-8872a2aca9e5\",\n" +
            "      \"Name\": \"河南省\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"Citys\": [\n" +
            "        {\n" +
            "          \"Id\": \"d6d2424e-a086-4e79-ba61-68dafaa1ea6d\",\n" +
            "          \"Name\": \"沧州市\",\n" +
            "          \"ProvinceId\": \"cf7ab7e5-9f70-44a2-ad03-8a1d500b4541\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"db3c573e-db36-4513-b5ca-56fc3fbd0d7a\",\n" +
            "          \"Name\": \"石家庄市\",\n" +
            "          \"ProvinceId\": \"cf7ab7e5-9f70-44a2-ad03-8a1d500b4541\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"e3ce1dfe-25ba-40d2-96eb-174916297f35\",\n" +
            "          \"Name\": \"唐山市\",\n" +
            "          \"ProvinceId\": \"cf7ab7e5-9f70-44a2-ad03-8a1d500b4541\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"6fd237e0-3887-478f-952c-07d35fe8f07c\",\n" +
            "          \"Name\": \"邢台市\",\n" +
            "          \"ProvinceId\": \"cf7ab7e5-9f70-44a2-ad03-8a1d500b4541\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"1e5586d9-dfe4-4848-bd05-201c2b2dbd91\",\n" +
            "          \"Name\": \"邯郸市\",\n" +
            "          \"ProvinceId\": \"cf7ab7e5-9f70-44a2-ad03-8a1d500b4541\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"5bd6eccb-4dc9-4602-937a-a00d3d779df3\",\n" +
            "          \"Name\": \"衡水市\",\n" +
            "          \"ProvinceId\": \"cf7ab7e5-9f70-44a2-ad03-8a1d500b4541\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"163540e0-190f-4b12-8f9a-9e4ea4dcfb81\",\n" +
            "          \"Name\": \"承德市\",\n" +
            "          \"ProvinceId\": \"cf7ab7e5-9f70-44a2-ad03-8a1d500b4541\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"25b9e80d-fc8a-4cfb-b306-93b73768bb37\",\n" +
            "          \"Name\": \"保定市\",\n" +
            "          \"ProvinceId\": \"cf7ab7e5-9f70-44a2-ad03-8a1d500b4541\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"aa4ea828-9694-4a0e-ada4-94278586204e\",\n" +
            "          \"Name\": \"张家口市\",\n" +
            "          \"ProvinceId\": \"cf7ab7e5-9f70-44a2-ad03-8a1d500b4541\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"f0cba361-5604-418f-a388-c0aa5b04651f\",\n" +
            "          \"Name\": \"秦皇岛市\",\n" +
            "          \"ProvinceId\": \"cf7ab7e5-9f70-44a2-ad03-8a1d500b4541\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"574a224c-5de1-4ccf-9064-ab339b00ddc0\",\n" +
            "          \"Name\": \"廊坊市\",\n" +
            "          \"ProvinceId\": \"cf7ab7e5-9f70-44a2-ad03-8a1d500b4541\"\n" +
            "        }\n" +
            "      ],\n" +
            "      \"Id\": \"cf7ab7e5-9f70-44a2-ad03-8a1d500b4541\",\n" +
            "      \"Name\": \"河北省\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"Citys\": [],\n" +
            "      \"Id\": \"4a725e57-33e8-46ce-8a4a-8b7ad10f3a72\",\n" +
            "      \"Name\": \"台湾省\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"Citys\": [\n" +
            "        {\n" +
            "          \"Id\": \"2629ca47-5db0-4549-9654-aa704d6a04b8\",\n" +
            "          \"Name\": \"襄樊市\",\n" +
            "          \"ProvinceId\": \"c42a984d-fb78-4b5f-a31d-8f3a7ea6c829\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"d2b033ac-b8a4-4c44-aec7-ac4c7988cc65\",\n" +
            "          \"Name\": \"省直辖行政单位\",\n" +
            "          \"ProvinceId\": \"c42a984d-fb78-4b5f-a31d-8f3a7ea6c829\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"0b8e8d8f-08d8-4fef-b226-c20823c16696\",\n" +
            "          \"Name\": \"黄冈市\",\n" +
            "          \"ProvinceId\": \"c42a984d-fb78-4b5f-a31d-8f3a7ea6c829\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"f2da9bf7-27dc-4f84-a776-b99d2dad71f5\",\n" +
            "          \"Name\": \"武汉市\",\n" +
            "          \"ProvinceId\": \"c42a984d-fb78-4b5f-a31d-8f3a7ea6c829\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"c1457a45-41e3-4ecc-a157-b7bd8bf4f4f4\",\n" +
            "          \"Name\": \"随州市\",\n" +
            "          \"ProvinceId\": \"c42a984d-fb78-4b5f-a31d-8f3a7ea6c829\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"e9ca6cc6-31d9-44b6-bfb1-d000453992b3\",\n" +
            "          \"Name\": \"孝感市\",\n" +
            "          \"ProvinceId\": \"c42a984d-fb78-4b5f-a31d-8f3a7ea6c829\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"82398c13-a372-437d-92ff-c4398bc4d27c\",\n" +
            "          \"Name\": \"恩施土家族苗族自治州\",\n" +
            "          \"ProvinceId\": \"c42a984d-fb78-4b5f-a31d-8f3a7ea6c829\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"2083bd22-10ff-4b8f-93c5-cb41287130c3\",\n" +
            "          \"Name\": \"鄂州市\",\n" +
            "          \"ProvinceId\": \"c42a984d-fb78-4b5f-a31d-8f3a7ea6c829\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"ea0913ed-50aa-448a-8370-9109c7351715\",\n" +
            "          \"Name\": \"十堰市\",\n" +
            "          \"ProvinceId\": \"c42a984d-fb78-4b5f-a31d-8f3a7ea6c829\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"7beaee16-f71a-4b85-a9ea-7cc4a4e6d77c\",\n" +
            "          \"Name\": \"荆门市\",\n" +
            "          \"ProvinceId\": \"c42a984d-fb78-4b5f-a31d-8f3a7ea6c829\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"803a43a3-cbe7-4f92-978a-115df72c0c15\",\n" +
            "          \"Name\": \"黄石市\",\n" +
            "          \"ProvinceId\": \"c42a984d-fb78-4b5f-a31d-8f3a7ea6c829\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"788a3c5e-d63d-40c2-8d19-3fdb26514a16\",\n" +
            "          \"Name\": \"宜昌市\",\n" +
            "          \"ProvinceId\": \"c42a984d-fb78-4b5f-a31d-8f3a7ea6c829\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"1df75cb6-88c5-4969-86b9-e94fb00b4995\",\n" +
            "          \"Name\": \"荆州市\",\n" +
            "          \"ProvinceId\": \"c42a984d-fb78-4b5f-a31d-8f3a7ea6c829\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"6fdf8a3d-7f1b-442d-a66a-eae7e892e4e3\",\n" +
            "          \"Name\": \"咸宁市\",\n" +
            "          \"ProvinceId\": \"c42a984d-fb78-4b5f-a31d-8f3a7ea6c829\"\n" +
            "        }\n" +
            "      ],\n" +
            "      \"Id\": \"c42a984d-fb78-4b5f-a31d-8f3a7ea6c829\",\n" +
            "      \"Name\": \"湖北省\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"Citys\": [\n" +
            "        {\n" +
            "          \"Id\": \"8b21688b-b79b-4bf7-be0f-6dc2c42d2a7d\",\n" +
            "          \"Name\": \"重庆市\",\n" +
            "          \"ProvinceId\": \"27559624-3add-4f81-a899-8fa7d281a47f\"\n" +
            "        }\n" +
            "      ],\n" +
            "      \"Id\": \"27559624-3add-4f81-a899-8fa7d281a47f\",\n" +
            "      \"Name\": \"重庆\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"Citys\": [\n" +
            "        {\n" +
            "          \"Id\": \"a7fc0fa2-4982-47ca-8fee-6cc4cae22fe6\",\n" +
            "          \"Name\": \"乌海市\",\n" +
            "          \"ProvinceId\": \"e68ffd4c-600a-477d-86f9-99b73e9c52f5\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"0d97a16b-4683-4f83-8beb-746497b51da4\",\n" +
            "          \"Name\": \"乌兰察布市\",\n" +
            "          \"ProvinceId\": \"e68ffd4c-600a-477d-86f9-99b73e9c52f5\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"eb22903c-ca4e-42cb-8854-9c8e0bc1e8e7\",\n" +
            "          \"Name\": \"呼和浩特市\",\n" +
            "          \"ProvinceId\": \"e68ffd4c-600a-477d-86f9-99b73e9c52f5\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"f311239c-790d-49fd-88ec-dac0f3acf762\",\n" +
            "          \"Name\": \"鄂尔多斯市\",\n" +
            "          \"ProvinceId\": \"e68ffd4c-600a-477d-86f9-99b73e9c52f5\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"43028025-6c98-4edd-8385-b0604cb5e145\",\n" +
            "          \"Name\": \"锡林郭勒盟\",\n" +
            "          \"ProvinceId\": \"e68ffd4c-600a-477d-86f9-99b73e9c52f5\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"596c467b-fdb7-40a0-b2c3-0cba73bea688\",\n" +
            "          \"Name\": \"呼伦贝尔市\",\n" +
            "          \"ProvinceId\": \"e68ffd4c-600a-477d-86f9-99b73e9c52f5\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"d9f61d3d-f5d5-4679-9d13-093f2dd6fd47\",\n" +
            "          \"Name\": \"巴彦淖尔市\",\n" +
            "          \"ProvinceId\": \"e68ffd4c-600a-477d-86f9-99b73e9c52f5\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"12cdebac-fb01-49dc-8ef8-03527bcd4fde\",\n" +
            "          \"Name\": \"阿拉善盟\",\n" +
            "          \"ProvinceId\": \"e68ffd4c-600a-477d-86f9-99b73e9c52f5\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"41721a69-40bf-4f82-bb96-2dd3c03b9707\",\n" +
            "          \"Name\": \"包头市\",\n" +
            "          \"ProvinceId\": \"e68ffd4c-600a-477d-86f9-99b73e9c52f5\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"e57e376c-8aa3-42cf-915e-3334497d4975\",\n" +
            "          \"Name\": \"赤峰市\",\n" +
            "          \"ProvinceId\": \"e68ffd4c-600a-477d-86f9-99b73e9c52f5\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"eca70a5c-547d-41fd-8a22-e7cd2886b04b\",\n" +
            "          \"Name\": \"通辽市\",\n" +
            "          \"ProvinceId\": \"e68ffd4c-600a-477d-86f9-99b73e9c52f5\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"05f3a1fb-263a-47b5-bc41-e7ea70919573\",\n" +
            "          \"Name\": \"兴安盟\",\n" +
            "          \"ProvinceId\": \"e68ffd4c-600a-477d-86f9-99b73e9c52f5\"\n" +
            "        }\n" +
            "      ],\n" +
            "      \"Id\": \"e68ffd4c-600a-477d-86f9-99b73e9c52f5\",\n" +
            "      \"Name\": \"内蒙古自治区\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"Citys\": [\n" +
            "        {\n" +
            "          \"Id\": \"7203523b-01b4-4052-82bb-775d5d04952f\",\n" +
            "          \"Name\": \"天津市\",\n" +
            "          \"ProvinceId\": \"21af3a35-cb78-47b3-ac79-9b9bb3bacfff\"\n" +
            "        }\n" +
            "      ],\n" +
            "      \"Id\": \"21af3a35-cb78-47b3-ac79-9b9bb3bacfff\",\n" +
            "      \"Name\": \"天津\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"Citys\": [\n" +
            "        {\n" +
            "          \"Id\": \"3e972ebb-7340-42ff-b25a-7b3e1b38b280\",\n" +
            "          \"Name\": \"酒泉市\",\n" +
            "          \"ProvinceId\": \"7d7c42ad-7de5-4c18-813c-9c1d97c7c909\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"be57a30e-88e9-45d5-9f43-7fabf7b6615f\",\n" +
            "          \"Name\": \"临夏回族自治州\",\n" +
            "          \"ProvinceId\": \"7d7c42ad-7de5-4c18-813c-9c1d97c7c909\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"68e27db2-8928-46f1-b50b-6bbafcd5a41d\",\n" +
            "          \"Name\": \"天水市\",\n" +
            "          \"ProvinceId\": \"7d7c42ad-7de5-4c18-813c-9c1d97c7c909\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"0ac0c66b-3c57-4b35-b964-6e73c240c4b9\",\n" +
            "          \"Name\": \"白银市\",\n" +
            "          \"ProvinceId\": \"7d7c42ad-7de5-4c18-813c-9c1d97c7c909\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"792104f9-a26a-45b6-9405-93595f267d7e\",\n" +
            "          \"Name\": \"定西市\",\n" +
            "          \"ProvinceId\": \"7d7c42ad-7de5-4c18-813c-9c1d97c7c909\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"ab9a38b2-8537-437f-ba29-87a0baeeb64d\",\n" +
            "          \"Name\": \"兰州市\",\n" +
            "          \"ProvinceId\": \"7d7c42ad-7de5-4c18-813c-9c1d97c7c909\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"a615e89f-bab5-458e-a697-be2cec8f20c1\",\n" +
            "          \"Name\": \"甘南藏族自治州\",\n" +
            "          \"ProvinceId\": \"7d7c42ad-7de5-4c18-813c-9c1d97c7c909\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"5803e1a6-079b-424d-b930-c8f0e1f63738\",\n" +
            "          \"Name\": \"张掖市\",\n" +
            "          \"ProvinceId\": \"7d7c42ad-7de5-4c18-813c-9c1d97c7c909\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"4478ea57-28ea-47f7-a783-4ee899ee4283\",\n" +
            "          \"Name\": \"陇南市\",\n" +
            "          \"ProvinceId\": \"7d7c42ad-7de5-4c18-813c-9c1d97c7c909\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"eeeff971-9b59-4610-baab-557035c74623\",\n" +
            "          \"Name\": \"嘉峪关市\",\n" +
            "          \"ProvinceId\": \"7d7c42ad-7de5-4c18-813c-9c1d97c7c909\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"cf4bcf15-163b-4786-93b3-eb71b6591549\",\n" +
            "          \"Name\": \"庆阳市\",\n" +
            "          \"ProvinceId\": \"7d7c42ad-7de5-4c18-813c-9c1d97c7c909\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"7fcda938-803c-4528-9c6d-dfc1bd233689\",\n" +
            "          \"Name\": \"武威市\",\n" +
            "          \"ProvinceId\": \"7d7c42ad-7de5-4c18-813c-9c1d97c7c909\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"234b16ea-20f4-41ac-a1f9-e0ccee283ca7\",\n" +
            "          \"Name\": \"金昌市\",\n" +
            "          \"ProvinceId\": \"7d7c42ad-7de5-4c18-813c-9c1d97c7c909\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"68cc49c9-f2f1-43c2-812b-fb4702326c0b\",\n" +
            "          \"Name\": \"平凉市\",\n" +
            "          \"ProvinceId\": \"7d7c42ad-7de5-4c18-813c-9c1d97c7c909\"\n" +
            "        }\n" +
            "      ],\n" +
            "      \"Id\": \"7d7c42ad-7de5-4c18-813c-9c1d97c7c909\",\n" +
            "      \"Name\": \"甘肃省\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"Citys\": [\n" +
            "        {\n" +
            "          \"Id\": \"23d6f24a-a0df-44e6-bde9-f923aa5bc907\",\n" +
            "          \"Name\": \"铜陵市\",\n" +
            "          \"ProvinceId\": \"1a7ef8d4-b20d-41c2-b6f0-9f91bc9feaf4\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"7e1bdb1f-bd6d-44d1-8ab7-f437242decfb\",\n" +
            "          \"Name\": \"亳州市\",\n" +
            "          \"ProvinceId\": \"1a7ef8d4-b20d-41c2-b6f0-9f91bc9feaf4\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"306da6ba-a233-4bb5-854d-e3350170275d\",\n" +
            "          \"Name\": \"巢湖市\",\n" +
            "          \"ProvinceId\": \"1a7ef8d4-b20d-41c2-b6f0-9f91bc9feaf4\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"9ddae24c-c6d8-4f13-ba69-31c32b50df43\",\n" +
            "          \"Name\": \"黄山市\",\n" +
            "          \"ProvinceId\": \"1a7ef8d4-b20d-41c2-b6f0-9f91bc9feaf4\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"c51d9ee4-2a92-410f-97ed-1027fb4cf7b5\",\n" +
            "          \"Name\": \"安庆市\",\n" +
            "          \"ProvinceId\": \"1a7ef8d4-b20d-41c2-b6f0-9f91bc9feaf4\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"4a864e7e-5fa4-48a1-b840-19707301197e\",\n" +
            "          \"Name\": \"宿州市\",\n" +
            "          \"ProvinceId\": \"1a7ef8d4-b20d-41c2-b6f0-9f91bc9feaf4\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"f63bf98c-1597-4fda-aaf4-171296d17866\",\n" +
            "          \"Name\": \"六安市\",\n" +
            "          \"ProvinceId\": \"1a7ef8d4-b20d-41c2-b6f0-9f91bc9feaf4\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"c9a3d30a-eaec-4184-977f-c6709a07ab8a\",\n" +
            "          \"Name\": \"蚌埠市\",\n" +
            "          \"ProvinceId\": \"1a7ef8d4-b20d-41c2-b6f0-9f91bc9feaf4\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"d4107a05-c17e-47c1-af35-c3eb19956306\",\n" +
            "          \"Name\": \"合肥市\",\n" +
            "          \"ProvinceId\": \"1a7ef8d4-b20d-41c2-b6f0-9f91bc9feaf4\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"fe74b0e9-ad83-4855-8583-c49193d04daa\",\n" +
            "          \"Name\": \"池州市\",\n" +
            "          \"ProvinceId\": \"1a7ef8d4-b20d-41c2-b6f0-9f91bc9feaf4\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"6e451140-b303-4aa1-a20b-d507c855cbd2\",\n" +
            "          \"Name\": \"芜湖市\",\n" +
            "          \"ProvinceId\": \"1a7ef8d4-b20d-41c2-b6f0-9f91bc9feaf4\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"86275ac2-cb68-4607-8f41-c09956c3bab6\",\n" +
            "          \"Name\": \"宣城市\",\n" +
            "          \"ProvinceId\": \"1a7ef8d4-b20d-41c2-b6f0-9f91bc9feaf4\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"bfe6feef-7b8c-4301-9810-b2ad8adb88d4\",\n" +
            "          \"Name\": \"淮南市\",\n" +
            "          \"ProvinceId\": \"1a7ef8d4-b20d-41c2-b6f0-9f91bc9feaf4\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"df8eacb2-78e6-4867-af8f-90671182a896\",\n" +
            "          \"Name\": \"阜阳市\",\n" +
            "          \"ProvinceId\": \"1a7ef8d4-b20d-41c2-b6f0-9f91bc9feaf4\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"f6a9689a-b970-4ae0-b1c7-a047a3ff33a1\",\n" +
            "          \"Name\": \"滁州市\",\n" +
            "          \"ProvinceId\": \"1a7ef8d4-b20d-41c2-b6f0-9f91bc9feaf4\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"9907d78b-7042-451e-9a1d-6e5639af1aa7\",\n" +
            "          \"Name\": \"马鞍山市\",\n" +
            "          \"ProvinceId\": \"1a7ef8d4-b20d-41c2-b6f0-9f91bc9feaf4\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"5e04f04a-a6df-4dcf-8e3b-5fd10442cb61\",\n" +
            "          \"Name\": \"淮北市\",\n" +
            "          \"ProvinceId\": \"1a7ef8d4-b20d-41c2-b6f0-9f91bc9feaf4\"\n" +
            "        }\n" +
            "      ],\n" +
            "      \"Id\": \"1a7ef8d4-b20d-41c2-b6f0-9f91bc9feaf4\",\n" +
            "      \"Name\": \"安徽省\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"Citys\": [\n" +
            "        {\n" +
            "          \"Id\": \"a3521055-25db-4106-8cb3-6ef1e3bde788\",\n" +
            "          \"Name\": \"厦门市\",\n" +
            "          \"ProvinceId\": \"3a7270c6-bcda-4374-a931-c1850f977053\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"2feab6a4-25b6-43ee-b46f-77bca6152336\",\n" +
            "          \"Name\": \"南平市\",\n" +
            "          \"ProvinceId\": \"3a7270c6-bcda-4374-a931-c1850f977053\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"b1e7c5e9-a8bc-4145-b426-ad2e3703d73f\",\n" +
            "          \"Name\": \"三明市\",\n" +
            "          \"ProvinceId\": \"3a7270c6-bcda-4374-a931-c1850f977053\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"75e8a1c2-8835-4642-bfb8-d7e58351409a\",\n" +
            "          \"Name\": \"宁德市\",\n" +
            "          \"ProvinceId\": \"3a7270c6-bcda-4374-a931-c1850f977053\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"18b1ccf4-f2b0-4b91-aab9-4f6d2b081a08\",\n" +
            "          \"Name\": \"莆田市\",\n" +
            "          \"ProvinceId\": \"3a7270c6-bcda-4374-a931-c1850f977053\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"869d2a60-ca89-43d7-84b6-5514b0f02f66\",\n" +
            "          \"Name\": \"福州市\",\n" +
            "          \"ProvinceId\": \"3a7270c6-bcda-4374-a931-c1850f977053\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"e480f44e-9692-4a11-b9b8-5f4cbc21682b\",\n" +
            "          \"Name\": \"漳州市\",\n" +
            "          \"ProvinceId\": \"3a7270c6-bcda-4374-a931-c1850f977053\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"d6ebb4b5-1cb4-4271-b666-f52c1e3383f0\",\n" +
            "          \"Name\": \"龙岩市\",\n" +
            "          \"ProvinceId\": \"3a7270c6-bcda-4374-a931-c1850f977053\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"995084b3-5206-4c09-a9ee-f7cfcb43f9c2\",\n" +
            "          \"Name\": \"泉州市\",\n" +
            "          \"ProvinceId\": \"3a7270c6-bcda-4374-a931-c1850f977053\"\n" +
            "        }\n" +
            "      ],\n" +
            "      \"Id\": \"3a7270c6-bcda-4374-a931-c1850f977053\",\n" +
            "      \"Name\": \"福建省\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"Citys\": [\n" +
            "        {\n" +
            "          \"Id\": \"7cca8dc8-be02-4f7e-84a2-fdf9e7988e32\",\n" +
            "          \"Name\": \"广安市\",\n" +
            "          \"ProvinceId\": \"d2237310-ad42-49f9-bd20-c4705ee8c260\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"26b77110-4feb-4172-b9fe-f39c66410547\",\n" +
            "          \"Name\": \"阿坝藏族羌族自治州\",\n" +
            "          \"ProvinceId\": \"d2237310-ad42-49f9-bd20-c4705ee8c260\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"6f0ce905-93a1-4fbd-8e7c-503896d3b882\",\n" +
            "          \"Name\": \"广元市\",\n" +
            "          \"ProvinceId\": \"d2237310-ad42-49f9-bd20-c4705ee8c260\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"37048ec1-dc9f-4323-9a7d-505e2ed35b4f\",\n" +
            "          \"Name\": \"遂宁市\",\n" +
            "          \"ProvinceId\": \"d2237310-ad42-49f9-bd20-c4705ee8c260\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"c174bb33-a116-4c36-945c-55922b1b8a8f\",\n" +
            "          \"Name\": \"乐山市\",\n" +
            "          \"ProvinceId\": \"d2237310-ad42-49f9-bd20-c4705ee8c260\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"ac9c9bf5-b8bd-429f-a3c2-4934413e2ae3\",\n" +
            "          \"Name\": \"凉山彝族自治州\",\n" +
            "          \"ProvinceId\": \"d2237310-ad42-49f9-bd20-c4705ee8c260\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"bda897ba-01e2-474e-b5cb-49f678a8cb86\",\n" +
            "          \"Name\": \"泸州市\",\n" +
            "          \"ProvinceId\": \"d2237310-ad42-49f9-bd20-c4705ee8c260\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"43a371ca-0ec6-405d-b590-472dee86b150\",\n" +
            "          \"Name\": \"南充市\",\n" +
            "          \"ProvinceId\": \"d2237310-ad42-49f9-bd20-c4705ee8c260\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"a0cfdf55-4393-467c-bb7c-0ba97f5bd7af\",\n" +
            "          \"Name\": \"内江市\",\n" +
            "          \"ProvinceId\": \"d2237310-ad42-49f9-bd20-c4705ee8c260\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"7eb8fa5e-ccae-45a6-b341-027c6b9fa469\",\n" +
            "          \"Name\": \"宜宾市\",\n" +
            "          \"ProvinceId\": \"d2237310-ad42-49f9-bd20-c4705ee8c260\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"67cef868-7299-407f-9e38-1df737c5ad61\",\n" +
            "          \"Name\": \"资阳市\",\n" +
            "          \"ProvinceId\": \"d2237310-ad42-49f9-bd20-c4705ee8c260\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"66710c65-0bdf-4840-b055-267a3592233d\",\n" +
            "          \"Name\": \"巴中市\",\n" +
            "          \"ProvinceId\": \"d2237310-ad42-49f9-bd20-c4705ee8c260\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"b082e7eb-6d93-4de5-ba66-2904f14fe8fd\",\n" +
            "          \"Name\": \"攀枝花市\",\n" +
            "          \"ProvinceId\": \"d2237310-ad42-49f9-bd20-c4705ee8c260\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"ecd6ec22-b762-4464-a04c-de4171ad595d\",\n" +
            "          \"Name\": \"自贡市\",\n" +
            "          \"ProvinceId\": \"d2237310-ad42-49f9-bd20-c4705ee8c260\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"0562106a-4304-45e7-84af-ba6fd8fa8fc6\",\n" +
            "          \"Name\": \"雅安市\",\n" +
            "          \"ProvinceId\": \"d2237310-ad42-49f9-bd20-c4705ee8c260\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"e09d55e2-02d9-4603-b9a8-c1c1627aa871\",\n" +
            "          \"Name\": \"眉山市\",\n" +
            "          \"ProvinceId\": \"d2237310-ad42-49f9-bd20-c4705ee8c260\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"fbca6643-a831-4a86-aa6d-b48f34734383\",\n" +
            "          \"Name\": \"绵阳市\",\n" +
            "          \"ProvinceId\": \"d2237310-ad42-49f9-bd20-c4705ee8c260\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"bb79feeb-04f0-4843-ae2f-73e23db2a4d2\",\n" +
            "          \"Name\": \"德阳市\",\n" +
            "          \"ProvinceId\": \"d2237310-ad42-49f9-bd20-c4705ee8c260\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"2cf23cca-a7b9-4826-a8ef-6dd900ffae3b\",\n" +
            "          \"Name\": \"成都市\",\n" +
            "          \"ProvinceId\": \"d2237310-ad42-49f9-bd20-c4705ee8c260\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"d49eba1b-eab0-4322-a8aa-8b16f7466c63\",\n" +
            "          \"Name\": \"甘孜藏族自治州\",\n" +
            "          \"ProvinceId\": \"d2237310-ad42-49f9-bd20-c4705ee8c260\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"e4894567-4364-40ad-afed-85e04f156f8d\",\n" +
            "          \"Name\": \"达州市\",\n" +
            "          \"ProvinceId\": \"d2237310-ad42-49f9-bd20-c4705ee8c260\"\n" +
            "        }\n" +
            "      ],\n" +
            "      \"Id\": \"d2237310-ad42-49f9-bd20-c4705ee8c260\",\n" +
            "      \"Name\": \"四川省\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"Citys\": [\n" +
            "        {\n" +
            "          \"Id\": \"950c8ea4-103e-48c3-834b-88e3c2abc402\",\n" +
            "          \"Name\": \"无锡市\",\n" +
            "          \"ProvinceId\": \"c11221f4-59a9-4b51-97a7-ca30bcfa9b16\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"c63f0ef9-0c98-45a0-8cb1-b5c36bc96b83\",\n" +
            "          \"Name\": \"常州市\",\n" +
            "          \"ProvinceId\": \"c11221f4-59a9-4b51-97a7-ca30bcfa9b16\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"551c7d77-ebfc-47cd-bcfa-bc888187a82d\",\n" +
            "          \"Name\": \"盐城市\",\n" +
            "          \"ProvinceId\": \"c11221f4-59a9-4b51-97a7-ca30bcfa9b16\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"32ed1176-5960-4749-a034-d07dbe314ca6\",\n" +
            "          \"Name\": \"苏州市\",\n" +
            "          \"ProvinceId\": \"c11221f4-59a9-4b51-97a7-ca30bcfa9b16\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"224d3443-baea-4965-bbec-d0b4bc0b0a8d\",\n" +
            "          \"Name\": \"宿迁市\",\n" +
            "          \"ProvinceId\": \"c11221f4-59a9-4b51-97a7-ca30bcfa9b16\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"74c98897-6588-4e2b-9edf-1de7aa18bef9\",\n" +
            "          \"Name\": \"徐州市\",\n" +
            "          \"ProvinceId\": \"c11221f4-59a9-4b51-97a7-ca30bcfa9b16\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"cc861651-6672-49d4-945e-347931a744f1\",\n" +
            "          \"Name\": \"淮安市\",\n" +
            "          \"ProvinceId\": \"c11221f4-59a9-4b51-97a7-ca30bcfa9b16\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"2f50ff12-6a10-4b8c-9d6a-167240c8e4d3\",\n" +
            "          \"Name\": \"连云港市\",\n" +
            "          \"ProvinceId\": \"c11221f4-59a9-4b51-97a7-ca30bcfa9b16\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"6f14e5e3-bcf1-4e56-b844-51f83f90b7b7\",\n" +
            "          \"Name\": \"南京市\",\n" +
            "          \"ProvinceId\": \"c11221f4-59a9-4b51-97a7-ca30bcfa9b16\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"74cfa48a-8fc2-47c0-a443-5222c832000c\",\n" +
            "          \"Name\": \"镇江市\",\n" +
            "          \"ProvinceId\": \"c11221f4-59a9-4b51-97a7-ca30bcfa9b16\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"8406cf80-f252-4bf8-9e71-64af14ee2bae\",\n" +
            "          \"Name\": \"南通市\",\n" +
            "          \"ProvinceId\": \"c11221f4-59a9-4b51-97a7-ca30bcfa9b16\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"6f15ab2f-4132-4a31-9e95-ee7920d39290\",\n" +
            "          \"Name\": \"扬州市\",\n" +
            "          \"ProvinceId\": \"c11221f4-59a9-4b51-97a7-ca30bcfa9b16\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"18f38636-c894-44cb-97c8-e45142993b0a\",\n" +
            "          \"Name\": \"泰州市\",\n" +
            "          \"ProvinceId\": \"c11221f4-59a9-4b51-97a7-ca30bcfa9b16\"\n" +
            "        }\n" +
            "      ],\n" +
            "      \"Id\": \"c11221f4-59a9-4b51-97a7-ca30bcfa9b16\",\n" +
            "      \"Name\": \"江苏省\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"Citys\": [\n" +
            "        {\n" +
            "          \"Id\": \"dc1f42ce-1740-417d-92d8-e4d7e82919d2\",\n" +
            "          \"Name\": \"吉林市\",\n" +
            "          \"ProvinceId\": \"7ffa40e4-fdbf-43ac-84f1-cb07ae38f43b\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"74e886bb-ec2d-47cd-8596-5e2b9a41607a\",\n" +
            "          \"Name\": \"松原市\",\n" +
            "          \"ProvinceId\": \"7ffa40e4-fdbf-43ac-84f1-cb07ae38f43b\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"0b8e19df-3f55-4b22-9c93-5c471239f7d0\",\n" +
            "          \"Name\": \"四平市\",\n" +
            "          \"ProvinceId\": \"7ffa40e4-fdbf-43ac-84f1-cb07ae38f43b\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"00d4a630-f0ed-4f6b-a03e-492af4e16ef5\",\n" +
            "          \"Name\": \"延边朝鲜族自治州\",\n" +
            "          \"ProvinceId\": \"7ffa40e4-fdbf-43ac-84f1-cb07ae38f43b\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"844dc883-0d02-4acc-b44c-4ef8c441ff17\",\n" +
            "          \"Name\": \"长春市\",\n" +
            "          \"ProvinceId\": \"7ffa40e4-fdbf-43ac-84f1-cb07ae38f43b\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"f00ad8a7-be37-483d-b665-373c8c030d33\",\n" +
            "          \"Name\": \"白城市\",\n" +
            "          \"ProvinceId\": \"7ffa40e4-fdbf-43ac-84f1-cb07ae38f43b\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"381cc1d0-0bdf-4992-af36-0ad7dab609bc\",\n" +
            "          \"Name\": \"白山市\",\n" +
            "          \"ProvinceId\": \"7ffa40e4-fdbf-43ac-84f1-cb07ae38f43b\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"e8699bfb-8ad9-42a0-b3e7-2b0f97e2598c\",\n" +
            "          \"Name\": \"辽源市\",\n" +
            "          \"ProvinceId\": \"7ffa40e4-fdbf-43ac-84f1-cb07ae38f43b\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"cd711677-4415-4c98-b925-95393c2bf436\",\n" +
            "          \"Name\": \"通化市\",\n" +
            "          \"ProvinceId\": \"7ffa40e4-fdbf-43ac-84f1-cb07ae38f43b\"\n" +
            "        }\n" +
            "      ],\n" +
            "      \"Id\": \"7ffa40e4-fdbf-43ac-84f1-cb07ae38f43b\",\n" +
            "      \"Name\": \"吉林省\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"Citys\": [\n" +
            "        {\n" +
            "          \"Id\": \"b7a67c05-0447-459e-ba0b-83bc1c1dd786\",\n" +
            "          \"Name\": \"本溪市\",\n" +
            "          \"ProvinceId\": \"ecb21b7a-4dae-4af9-b9af-d54259223821\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"3ed6a8d1-9052-4502-9cbb-d8463593fb4e\",\n" +
            "          \"Name\": \"丹东市\",\n" +
            "          \"ProvinceId\": \"ecb21b7a-4dae-4af9-b9af-d54259223821\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"93170404-dcc4-4321-9275-bc973484a7f7\",\n" +
            "          \"Name\": \"大连市\",\n" +
            "          \"ProvinceId\": \"ecb21b7a-4dae-4af9-b9af-d54259223821\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"9deb1a40-5240-43f0-b588-ac62c4a7df00\",\n" +
            "          \"Name\": \"阜新市\",\n" +
            "          \"ProvinceId\": \"ecb21b7a-4dae-4af9-b9af-d54259223821\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"f2aa8698-9333-4c82-b9da-2f9d5e63d92e\",\n" +
            "          \"Name\": \"抚顺市\",\n" +
            "          \"ProvinceId\": \"ecb21b7a-4dae-4af9-b9af-d54259223821\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"b4fe6a75-0689-4c21-aa42-3134b2010e99\",\n" +
            "          \"Name\": \"铁岭市\",\n" +
            "          \"ProvinceId\": \"ecb21b7a-4dae-4af9-b9af-d54259223821\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"ba82f6f7-294f-4b31-8e48-018c663e851f\",\n" +
            "          \"Name\": \"锦州市\",\n" +
            "          \"ProvinceId\": \"ecb21b7a-4dae-4af9-b9af-d54259223821\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"04061f5a-3190-4b61-bdc6-12c77d276b89\",\n" +
            "          \"Name\": \"沈阳市\",\n" +
            "          \"ProvinceId\": \"ecb21b7a-4dae-4af9-b9af-d54259223821\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"9f8a938a-aee1-4c0f-ba37-37b378fce03a\",\n" +
            "          \"Name\": \"葫芦岛市\",\n" +
            "          \"ProvinceId\": \"ecb21b7a-4dae-4af9-b9af-d54259223821\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"72fb1f97-c187-49fa-9c5d-3f24cc61c299\",\n" +
            "          \"Name\": \"鞍山市\",\n" +
            "          \"ProvinceId\": \"ecb21b7a-4dae-4af9-b9af-d54259223821\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"03b873a1-a8c8-4c87-add7-5667952c7a0a\",\n" +
            "          \"Name\": \"朝阳市\",\n" +
            "          \"ProvinceId\": \"ecb21b7a-4dae-4af9-b9af-d54259223821\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"02b5dfeb-8e1d-4786-9969-e3a5564816f0\",\n" +
            "          \"Name\": \"盘锦市\",\n" +
            "          \"ProvinceId\": \"ecb21b7a-4dae-4af9-b9af-d54259223821\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"697cceab-09d6-4ee9-bbbf-ea8f14365b54\",\n" +
            "          \"Name\": \"辽阳市\",\n" +
            "          \"ProvinceId\": \"ecb21b7a-4dae-4af9-b9af-d54259223821\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"b5d085d6-cf5f-4067-a4af-fbffe4ad3074\",\n" +
            "          \"Name\": \"营口市\",\n" +
            "          \"ProvinceId\": \"ecb21b7a-4dae-4af9-b9af-d54259223821\"\n" +
            "        }\n" +
            "      ],\n" +
            "      \"Id\": \"ecb21b7a-4dae-4af9-b9af-d54259223821\",\n" +
            "      \"Name\": \"辽宁省\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"Citys\": [\n" +
            "        {\n" +
            "          \"Id\": \"afada3a8-67b3-416d-9d64-57f00b9d3512\",\n" +
            "          \"Name\": \"阳泉市\",\n" +
            "          \"ProvinceId\": \"f8941f33-06e1-4edc-bf2d-d96daf10efc1\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"c9dd0c1f-8dc2-4fe0-b9c6-5f8717ef8066\",\n" +
            "          \"Name\": \"晋城市\",\n" +
            "          \"ProvinceId\": \"f8941f33-06e1-4edc-bf2d-d96daf10efc1\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"6788ef60-1076-423c-9090-3f874f856fb8\",\n" +
            "          \"Name\": \"晋中市\",\n" +
            "          \"ProvinceId\": \"f8941f33-06e1-4edc-bf2d-d96daf10efc1\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"143f8bf0-82e1-4768-89fd-3ffa103cfb74\",\n" +
            "          \"Name\": \"太原市\",\n" +
            "          \"ProvinceId\": \"f8941f33-06e1-4edc-bf2d-d96daf10efc1\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"7c1ce91d-566f-4942-bbf8-123622542150\",\n" +
            "          \"Name\": \"大同市\",\n" +
            "          \"ProvinceId\": \"f8941f33-06e1-4edc-bf2d-d96daf10efc1\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"ed6af995-d759-44f4-b5db-1e678b01f5bb\",\n" +
            "          \"Name\": \"忻州市\",\n" +
            "          \"ProvinceId\": \"f8941f33-06e1-4edc-bf2d-d96daf10efc1\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"437237fb-73ad-4d92-b385-20c19c25ba33\",\n" +
            "          \"Name\": \"吕梁市\",\n" +
            "          \"ProvinceId\": \"f8941f33-06e1-4edc-bf2d-d96daf10efc1\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"bcc48e96-12b1-4d19-850b-c155d3407b4d\",\n" +
            "          \"Name\": \"长治市\",\n" +
            "          \"ProvinceId\": \"f8941f33-06e1-4edc-bf2d-d96daf10efc1\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"0ccc7d65-da6e-41da-bbd9-69ce8cedebdc\",\n" +
            "          \"Name\": \"临汾市\",\n" +
            "          \"ProvinceId\": \"f8941f33-06e1-4edc-bf2d-d96daf10efc1\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"403c0130-b016-4ea5-acc7-9a5a68a31653\",\n" +
            "          \"Name\": \"运城市\",\n" +
            "          \"ProvinceId\": \"f8941f33-06e1-4edc-bf2d-d96daf10efc1\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"666d89b3-9f6d-4fb4-9baf-8a893998e7c9\",\n" +
            "          \"Name\": \"朔州市\",\n" +
            "          \"ProvinceId\": \"f8941f33-06e1-4edc-bf2d-d96daf10efc1\"\n" +
            "        }\n" +
            "      ],\n" +
            "      \"Id\": \"f8941f33-06e1-4edc-bf2d-d96daf10efc1\",\n" +
            "      \"Name\": \"山西省\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"Citys\": [\n" +
            "        {\n" +
            "          \"Id\": \"0ef9d878-f247-495d-b157-8b58b80e56af\",\n" +
            "          \"Name\": \"株洲市\",\n" +
            "          \"ProvinceId\": \"360c371c-c675-4957-827e-e0a74344459f\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"1a8de372-716b-4d83-b065-9138b22f1798\",\n" +
            "          \"Name\": \"张家界市\",\n" +
            "          \"ProvinceId\": \"360c371c-c675-4957-827e-e0a74344459f\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"3908d33d-49d5-4b0d-9662-6db67069625b\",\n" +
            "          \"Name\": \"湘西土家族苗族自治州\",\n" +
            "          \"ProvinceId\": \"360c371c-c675-4957-827e-e0a74344459f\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"4bee87dd-4a0c-4253-86e0-c0b42e5fb7fe\",\n" +
            "          \"Name\": \"益阳市\",\n" +
            "          \"ProvinceId\": \"360c371c-c675-4957-827e-e0a74344459f\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"f86fc5c4-839c-4b55-8d21-ae72e932fbbe\",\n" +
            "          \"Name\": \"怀化市\",\n" +
            "          \"ProvinceId\": \"360c371c-c675-4957-827e-e0a74344459f\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"0c7ab447-6b19-4b83-9af2-22959dcaa0f2\",\n" +
            "          \"Name\": \"郴州市\",\n" +
            "          \"ProvinceId\": \"360c371c-c675-4957-827e-e0a74344459f\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"e67edccb-baef-49d3-8aaf-29065726afcd\",\n" +
            "          \"Name\": \"娄底市\",\n" +
            "          \"ProvinceId\": \"360c371c-c675-4957-827e-e0a74344459f\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"a88d1e25-1403-453a-b33d-247c7775b067\",\n" +
            "          \"Name\": \"邵阳市\",\n" +
            "          \"ProvinceId\": \"360c371c-c675-4957-827e-e0a74344459f\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"f5d9dd69-bad2-47ee-bd7c-31c6dcddc9e8\",\n" +
            "          \"Name\": \"衡阳市\",\n" +
            "          \"ProvinceId\": \"360c371c-c675-4957-827e-e0a74344459f\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"cafda78f-f7b9-4049-a1c0-2f1a23037998\",\n" +
            "          \"Name\": \"常德市\",\n" +
            "          \"ProvinceId\": \"360c371c-c675-4957-827e-e0a74344459f\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"e0bedbbe-47ee-486a-8b66-1287b93d0a2b\",\n" +
            "          \"Name\": \"湘潭市\",\n" +
            "          \"ProvinceId\": \"360c371c-c675-4957-827e-e0a74344459f\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"2f1747e4-f079-4aed-87f2-3fcfe47f901a\",\n" +
            "          \"Name\": \"永州市\",\n" +
            "          \"ProvinceId\": \"360c371c-c675-4957-827e-e0a74344459f\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"2057b61e-6726-4544-99de-454be56ad9e8\",\n" +
            "          \"Name\": \"长沙市\",\n" +
            "          \"ProvinceId\": \"360c371c-c675-4957-827e-e0a74344459f\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"Id\": \"29de749c-e03d-4530-8fd3-5d82fb936e94\",\n" +
            "          \"Name\": \"岳阳市\",\n" +
            "          \"ProvinceId\": \"360c371c-c675-4957-827e-e0a74344459f\"\n" +
            "        }\n" +
            "      ],\n" +
            "      \"Id\": \"360c371c-c675-4957-827e-e0a74344459f\",\n" +
            "      \"Name\": \"湖南省\"\n" +
            "    }\n" +
            "  ]\n" +
            "}";
}
