package com.example.bai1;

import java.io.Serializable;

public class Video1Model implements Serializable {
    private String url;
    private String title;
    private String desc;

    public Video1Model(){}
    public Video1Model(String url, String title, String desc) {
        this.url = url;
        this.title = title;
        this.desc = desc;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
