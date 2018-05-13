package com.example.jh.sharesdkdemo;

import android.app.Application;

import com.mob.MobSDK;

/**
 * Created by jinhui on 2018/5/12.
 * Email:1004260403@qq.com
 */
public class MyApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // 通过代码注册你的AppKey和AppSecret
        MobSDK.init(this, "25bed81dd6138", "6f63ab36214d4aaf3c888882573a67b1");
    }
}
