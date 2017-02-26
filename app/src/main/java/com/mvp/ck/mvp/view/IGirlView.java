package com.mvp.ck.mvp.view;

import com.mvp.ck.mvp.bean.Girl;

import java.util.List;

/**
 * Created by ck on 2016/10/26.
 */
public interface IGirlView {
    /**
     * 显示数据
     */
    void showData(List<Girl> girls);
    /**
     * 进度
     */
    void showLoading();
}
