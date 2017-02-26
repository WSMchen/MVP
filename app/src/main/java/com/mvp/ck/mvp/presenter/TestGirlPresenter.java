package com.mvp.ck.mvp.presenter;

import com.mvp.ck.mvp.bean.Girl;
import com.mvp.ck.mvp.model.IGildModel;
import com.mvp.ck.mvp.model.TestGirlPresenterModel;
import com.mvp.ck.mvp.view.IGirlView;

import java.util.List;

/**
 * Created by ck on 2016/10/28.
 */
public class TestGirlPresenter extends BasePresenter<IGirlView> {
    private IGildModel iModel = new TestGirlPresenterModel();

    @Override
    public void fecth() {
        if(iModel != null){
            iModel.loadGirls(new IGildModel.GirlLoadOnListener() {
                @Override
                public void onComplete(List<Girl> girls) {
                    getView().showData(girls);
                }
            });
        }
    }
}
