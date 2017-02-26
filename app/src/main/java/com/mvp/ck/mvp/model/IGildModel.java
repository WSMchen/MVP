package com.mvp.ck.mvp.model;

import com.mvp.ck.mvp.bean.Girl;

import java.util.List;

/**
 * Created by ck on 2016/10/26.
 */
public interface IGildModel {
    /**
     * 加载数据
     */
    void loadGirls(GirlLoadOnListener listener);
    interface GirlLoadOnListener{
        void onComplete(List<Girl> girls);
    }
}
