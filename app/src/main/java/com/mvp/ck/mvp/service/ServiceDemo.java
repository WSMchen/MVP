package com.mvp.ck.mvp.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;

/**
 * Created by ck on 2016/11/11.
 */
public class ServiceDemo extends Service {

    @Override
    public void onCreate() {//只有service被创建的时候才会被调用，可以进行一次性的初始化操作
        super.onCreate();

    }

    //当其他组件调用startService方法时调用，在这里主要进行service的操作
    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        return super.onStartCommand(intent, flags, startId);
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        //当其他组件调用onBindService时调用，如果不想让这个service被绑定，可以返回null
        return null;
    }

    @Override
    public void onDestroy() {
        //service调用的最后一个方法
        //在此进行资源的回收
        super.onDestroy();

    }
}
