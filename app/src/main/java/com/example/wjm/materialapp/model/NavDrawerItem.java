package com.example.wjm.materialapp.model;

/**
 * Created by okbuy on 17-1-4.
 */

public class NavDrawerItem {

    private boolean showNotify;
    private String title;

    public NavDrawerItem(String title, boolean showNotify) {
        this.title = title;
        this.showNotify = showNotify;
    }

    public boolean isShowNotify() {
        return showNotify;
    }

    public void setShowNotify(boolean showNotify) {
        this.showNotify = showNotify;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public NavDrawerItem() {
    }
}
