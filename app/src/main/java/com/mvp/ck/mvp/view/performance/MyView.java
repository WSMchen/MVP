package com.mvp.ck.mvp.view.performance;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by ck on 2016/11/6.
 */
public class MyView extends View {
    private MyListener myListener = new MyListener() {
        @Override
        public void myListenerCallback() {
            System.out.print("有被调用");
        }
    };
    public MyView(Context context) {
        super(context);
        init();
    }

    private void init() {
        ListenerCollector collector = new ListenerCollector();
        collector.setsListener(this,myListener);
    }

    public MyView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }
    public interface MyListener{
        public void myListenerCallback();
    }

}
