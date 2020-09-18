package com.uos.litepaldemo;

import android.app.Application;

import org.litepal.LitePal;

/**
 * Create By xxc
 * Date: 2020/9/17 18:26
 * Desc:
 */
public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        LitePal.initialize(this);
    }
}
