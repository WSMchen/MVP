package com.mvp.ck.mvp.model;

import com.mvp.ck.mvp.R;
import com.mvp.ck.mvp.bean.Girl;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ck on 2016/10/26.
 */
public class GirlPresenterImpl2 implements IGildModel {
    @Override
    public void loadGirls(GirlLoadOnListener listener) {
         List data=new ArrayList<Girl>();
        data.add(new Girl("aaa",R.drawable.a));
        data.add(new Girl("bbb",R.drawable.b));
        data.add(new Girl("ccc",R.drawable.c));
        data.add(new Girl("ddd",R.drawable.a));
        data.add(new Girl("eee",R.drawable.b));
        listener.onComplete(data);
    }
}
