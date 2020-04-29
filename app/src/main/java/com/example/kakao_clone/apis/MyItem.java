package com.example.kakao_clone.apis;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MyItem {
    private Drawable imageView;
    private String name;
    private String mesage;
    private View myView;



    public View getMyView() {
        return myView;
    }

    public void setMyView(View myView) {
        this.myView = myView;
    }

    private int size;



    public void setSize(int x_size,int y_size) {
        LinearLayout.LayoutParams params= new LinearLayout.LayoutParams(x_size,y_size);
        System.out.println(myView);
        myView.setLayoutParams(params);

    }

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
