package com.mvp.ck.mvp.view.performance;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.format.Formatter;
import android.widget.ListView;
import android.widget.Toast;

import com.mvp.ck.mvp.BaseActivity;
import com.mvp.ck.mvp.R;
import com.mvp.ck.mvp.adapter.GirAdapter;
import com.mvp.ck.mvp.bean.Girl;
import com.mvp.ck.mvp.presenter.GirlPresenter;
import com.mvp.ck.mvp.presenter.GirlPresenter2;
import com.mvp.ck.mvp.service.MyIntentService;
import com.mvp.ck.mvp.view.IGirlView;

import java.util.List;

public class PreActivity extends BaseActivity<IGirlView,GirlPresenter2> implements IGirlView{

    private ListView list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      /*  MyView view = new MyView(this);
        setContentView(view);*/
       list = (ListView)findViewById(R.id.list);
        mPresenter.fecth();
       // new GirlPresenter2(this).fecth();
        //getMemory();
    //    getAllocationMemory();
     //   srartMyService();
    }

    @Override
    protected void onDestroy() {        super.onDestroy();
     //   ListenerCollector.clearListeners();
    }

    private void srartMyService() {
        Intent intent = new Intent(this,MyIntentService.class);
        startActivity(intent);
    }

    void getAllocationMemory() {
        // 获取系统分配的内存大小
        ActivityManager am = (ActivityManager) getSystemService(Context.ACTIVITY_SERVICE);
        //开启了android:largeHeap="true",米4系统能分配的内存为512M，不开启为128M
        //return  am.getLargeMemoryClass()+"";
        //return  am.getMemoryClass()+"";
        Toast.makeText(this,""+am.getMemoryClass(),Toast.LENGTH_LONG).show();
    }

    private void getMemory() {
        // 获取android当前可用内存大小
        ActivityManager am = (ActivityManager) getSystemService(Context.ACTIVITY_SERVICE);
        ActivityManager.MemoryInfo mi = new ActivityManager.MemoryInfo();
        am.getMemoryInfo(mi);
        long c = mi.availMem;// 当前系统的可用内存
        String a = Formatter.formatFileSize(getBaseContext(), mi.availMem);// 将获取的内存大小规格化
        Toast.makeText(this,c+"sss"+a,Toast.LENGTH_LONG).show();
    }

    @Override
    protected GirlPresenter2 createPresenter() {
        return new GirlPresenter2();
    }

    @Override
    public void showData(List<Girl> girls) {
      list.setAdapter(new GirAdapter(this,girls));
    }

    @Override
    public void showLoading() {

    }
}
