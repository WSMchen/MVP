package com.mvp.ck.mvp;

import android.app.Activity;
import android.os.Bundle;

import com.mvp.ck.mvp.presenter.BasePresenter;

/**
 * Created by ck on 2016/10/28.
 */
public abstract class BaseActivity<V,T extends BasePresenter<V>> extends Activity{

    protected T mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPresenter = createPresenter();
        mPresenter.attachView((V)this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mPresenter.detachView();
    }

    protected abstract T createPresenter();
}
