package com.mvp.ck.mvp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.mvp.ck.mvp.R;
import com.mvp.ck.mvp.bean.Girl;

import java.util.List;

/**
 * Created by ck on 2016/10/26.
 */
public class GirAdapter extends BaseAdapter {
    private  List<Girl> girls;
    private  Context context;

    public GirAdapter(Context context, List<Girl> girls){
        this.context = context;
        this.girls = girls;
    }
    @Override
    public int getCount() {
        return girls.size();
    }

    @Override
    public Object getItem(int position) {
        return girls.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View layout = LayoutInflater.from(context).inflate(R.layout.item, null);
        ImageView view1 = (ImageView) layout.findViewById(R.id.view1);
        TextView view2 = (TextView) layout.findViewById(R.id.view2);
        //view1.setImageResource(girls.get(position).getUrl());
        view1.setImageResource(girls.get(position).getUrl());
        view2.setText(girls.get(position).getName());
        return layout;
    }
}
