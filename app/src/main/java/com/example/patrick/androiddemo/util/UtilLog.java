package com.example.patrick.androiddemo.util;

import android.util.Log;

/**
 * Created by patrick on 2/7/17.
 */

public class UtilLog {

    private static boolean Debug = false;

    public static void setDebug(boolean b){
        Debug = b;
    }

    public static void LogD(String key, String value){
        if(Debug){
            Log.d(key, value);
        }
    }
}
