package com.masonliu.ndk;

import android.content.Context;

public class JNIUtil {
    private static String pwd;

    static {
        System.loadLibrary("masonsdkjni");
    }

    public static String getPwd(Context con) {
        if (pwd == null) {
            pwd = getPwdOriginal(con);
        }
        return pwd;
    }

    private static native String getPwdOriginal(Context con);

}
