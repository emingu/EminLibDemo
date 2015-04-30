package com.eminlibdemo.emin.com.myapplication.materialdrawer;

import android.graphics.drawable.Drawable;

/**
 * Created by wengyiming on 15/3/7.
 */
public class MenuItem {
    private Drawable menuIcon;
    private String title;
    private Boolean showRedPoint;

    public Drawable getMenuIcon() {
        return menuIcon;
    }

    public MenuItem(Boolean showRedPoint, Drawable menuIcon, String title) {
        this.showRedPoint = showRedPoint;
        this.menuIcon = menuIcon;
        this.title = title;
    }

    public void setMenuIcon(Drawable menuIcon) {
        this.menuIcon = menuIcon;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Boolean getShowRedPoint() {
        return showRedPoint;
    }

    public void setShowRedPoint(Boolean showRedPoint) {
        this.showRedPoint = showRedPoint;
    }
}
