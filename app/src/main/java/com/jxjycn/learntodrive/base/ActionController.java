package com.jxjycn.learntodrive.base;



import java.io.File;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by liu on 15/5/29.
 * 总控制器，用来连接Activity和Model层，是MVC中的C
 */
public class ActionController{


    /**
     * 缓存网络请求对象
     */
    private static Map<String, BaseManager> managerMap = new HashMap<String, BaseManager>();

    public static int postDate(BaseActivity baseActivity, Class<? extends BaseManager> mClass, Map<String, String> param, IResultListener resultListener) {
        String name = mClass.getName();
        BaseManager manager = null;
        if (manager == null) {
            try {
                manager = mClass.newInstance();
            } catch (IllegalAccessException e) {
            } catch (InstantiationException e) {
            }
            managerMap.put(name, manager);
        }
        if (resultListener != null) {
            resultListener.onStart();
        }
        manager.executePrivate(baseActivity, param, resultListener);
        return 1;
    }

    public static int postDate(BaseActivity baseActivity,Class<? extends BaseManager> mClass, Map<String, String> param, File file,
                               IResultListener resultListener)
    {
        String name = mClass.getName();
        BaseManager manager = managerMap.get(name);
        if (manager == null) {
            try {
                manager = mClass.newInstance();
            } catch (IllegalAccessException e) {
            } catch (InstantiationException e) {
            }
            managerMap.put(name, manager);
        }
        if (resultListener != null) {
            resultListener.onStart();
        }
        manager.executePrivate(baseActivity, param, file, resultListener);
        return 1;
    }
}
