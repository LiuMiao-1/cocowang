package com.cocowang.service.model;

public class BannerModel {
    //标题
    private String title;
    //图片链接地址
    private String url;
    //顺序
    private int sort;
    //图片资源地址
    private String src;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getSort() {
        return sort;
    }

    public void setSort(int sort) {
        this.sort = sort;
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }
}
