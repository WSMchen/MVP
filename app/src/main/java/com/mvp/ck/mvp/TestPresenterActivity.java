package com.mvp.ck.mvp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.mvp.ck.mvp.adapter.GirAdapter;
import com.mvp.ck.mvp.bean.Girl;
import com.mvp.ck.mvp.presenter.TestGirlPresenter;
import com.mvp.ck.mvp.view.IGirlView;

import java.util.List;

public class TestPresenterActivity extends BaseActivity<IGirlView,TestGirlPresenter> implements IGirlView {

    private ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list = (ListView)findViewById(R.id.list);
        mPresenter.fecth();
    }

    @Override
    protected TestGirlPresenter createPresenter() {
        return new TestGirlPresenter();
    }


    @Override
    public void showData(List<Girl> girls) {
        list.setAdapter(new GirAdapter(this,girls));
    }

    @Override
    public void showLoading() {

    }
}
