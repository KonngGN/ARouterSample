package com.example.aroutersample;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;

/**
 * @author : jiangnankong
 * @date : 3/6/19 2:40 PM
 * Description :
 */

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        if (BuildConfig.DEBUG) {
            ARouter.openDebug();
            ARouter.openLog();
        }
        ARouter.init(this);
    }
}