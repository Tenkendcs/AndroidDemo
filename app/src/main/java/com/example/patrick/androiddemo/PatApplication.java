package com.example.patrick.androiddemo;

import android.app.Application;

import com.example.patrick.androiddemo.util.UtilLog;

/**
 * Created by patrick on 2/7/17.
 */

public class PatApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        UtilLog.setDebug(true);
    }
}
