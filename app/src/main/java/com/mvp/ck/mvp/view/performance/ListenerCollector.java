package com.mvp.ck.mvp.view.performance;

import android.view.View;

import java.util.WeakHashMap;

/**
 * Created by ck on 2016/11/6.
 */
public class ListenerCollector {
    static private WeakHashMap<View,MyView.MyListener> sListener = new WeakHashMap<View,MyView.MyListener>();
    public void setsListener(View view,MyView.MyListener listener){
        sListener.put(view,listener);
    }
    public static void clearListeners(){
        sListener.clear();
    }
}
