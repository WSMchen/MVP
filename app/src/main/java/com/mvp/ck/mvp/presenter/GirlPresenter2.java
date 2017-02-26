package com.mvp.ck.mvp.presenter;

import com.mvp.ck.mvp.bean.Girl;
import com.mvp.ck.mvp.model.GirlPresenterImpl;
import com.mvp.ck.mvp.model.GirlPresenterImpl2;
import com.mvp.ck.mvp.model.IGildModel;
import com.mvp.ck.mvp.view.IGirlView;

import java.util.List;

/**
 * Created by ck on 2016/10/26.
 */
public class GirlPresenter2 extends BasePresenter<IGirlView> {
    IGildModel mGildModel = new GirlPresenterImpl2();
    // IGirlView mGildView ;
   /* public GirlPresenter2(IGirlView mGildView){
        this.mGildView = mGildView;
    }*/

    /**
     * view和model绑定
     */
    public void fecth() {
        getView().showLoading();
        if (mGildModel != null) {
            mGildModel.loadGirls(new IGildModel.GirlLoadOnListener() {
                @Override
                public void onComplete(List<Girl> girls) {
                    //给View显示
                    getView().showData(girls);
                }
            });
        }
    }
}
