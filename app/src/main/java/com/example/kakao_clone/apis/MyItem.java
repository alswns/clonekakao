package com.example.kakao_clone.apis;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

public class MyItem {
    private Drawable imageView;
    private String name;
    private String mesage;

    public Drawable getImageView() {
        return imageView;
    }

    public void setImageView(Drawable imageView) {
        this.imageView = imageView;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMesage() {
        return mesage;
    }

    public void setMesage(String mesage) {
        this.mesage = mesage;
    }
}
