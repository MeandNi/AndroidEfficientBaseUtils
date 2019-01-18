package meandni.com.androidefficientbaseutils;

import android.annotation.SuppressLint;
import android.content.Context;

import java.util.ArrayList;

import meandni.com.baseutils.base.BaseApplication;
import meandni.com.baseutils.utils.LogUtils;


public class UtilsApp extends BaseApplication {

    private static UtilsApp sInstance;

    public static UtilsApp getInstance() {
        return sInstance;
    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
    }

    @Override
    public void onCreate() {
        super.onCreate();
        sInstance = this;
    }

}


