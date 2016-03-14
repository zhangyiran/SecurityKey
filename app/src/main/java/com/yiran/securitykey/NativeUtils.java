package com.yiran.securitykey;

import android.content.Context;

/**
 * Created by zhangyiran on 16/3/9.
 */
public class NativeUtils {
    static {
        System.loadLibrary("securitykey");
    }

    public static native String getKey(Context context);


}
