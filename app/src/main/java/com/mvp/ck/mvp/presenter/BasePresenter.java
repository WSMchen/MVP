package com.mvp.ck.mvp.presenter;

import java.lang.ref.WeakReference;

/**
 * Created by ck on 2016/10/28.
 */
public abstract class BasePresenter<T> {
    /**
     * View的弱引用
     */
    protected WeakReference<T> mViewRef;

    /**
     * 关联
     */
    public void attachView(T view) {
        mViewRef = new WeakReference<T>(view);
    }

    /**
     * 解除关联
     */
    public void detachView(){
        if(mViewRef != null){
            mViewRef.clear();
        }
    }
    public abstract void fecth();
    protected  T getView(){
        return mViewRef.get();
    }
}
