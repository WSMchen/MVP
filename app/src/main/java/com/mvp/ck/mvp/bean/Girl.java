package com.mvp.ck.mvp.bean;

/**
 * Created by ck on 2016/10/26.
 */
public class Girl {
    private String name;
    private int url;

    public Girl(String name, int url) {
        this.name = name;
        this.url = url;
    }

    public int getUrl() {
        return url;
    }

    public void setUrl(int url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
