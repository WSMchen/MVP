package com.mvp.ck.mvp.model;

import com.mvp.ck.mvp.R;
import com.mvp.ck.mvp.bean.Girl;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ck on 2016/10/26.
 */
public class GirlPresenterImpl implements IGildModel {
    @Override
    public void loadGirls(GirlLoadOnListener listener) {
         List data=new ArrayList<Girl>();
        data.add(new Girl("aaa",1));
        data.add(new Girl("aaa",R.drawable.a));
        data.add(new Girl("bbb",R.drawable.a));
        data.add(new Girl("ccc",R.drawable.a));
        data.add(new Girl("ddd",R.drawable.a));
        data.add(new Girl("eee",R.drawable.a));
       /* data.add(new Girl("bbb",R.mipmap.1));
        data.add(new Girl("ccc","sdfsdfsdf"));
        data.add(new Girl("ddd","sdfsdfsdf"));
        data.add(new Girl("eee","sdfsdfsdf"));
        data.add(new Girl("fff","sdfsdfsdf"));*/

        listener.onComplete(data);
    }
}
