package com.bh.ldp.lib_base;

import android.app.Application;
import android.content.Context;

/**
 * created by Da Peng at 2019/6/26
 */
public abstract class BaseApplication extends Application {

    protected static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
    }

    public static Context getAppContent(){
        return context;
    }

}
