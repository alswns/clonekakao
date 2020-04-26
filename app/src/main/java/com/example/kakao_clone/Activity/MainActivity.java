package com.example.kakao_clone.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ListView;

import com.example.kakao_clone.R;
import com.example.kakao_clone.apis.MyAdapter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView list=findViewById(R.id.list);
        MyAdapter myAdapter=new MyAdapter();
        list.setAdapter(myAdapter);
        Drawable drawable=Drawable.createFromPath("/drawable/ic_kakao_logo.xml");
        System.out.println(drawable);
        myAdapter.addItem(drawable,"안녕","안녕");
        myAdapter.addItem(drawable,"안녕","안녕");
        myAdapter.addItem(drawable,"안녕","안녕");
        myAdapter.addItem(drawable,"안녕","안녕");
        myAdapter.addItem(drawable,"안녕","안녕");
        myAdapter.addItem(drawable,"안녕","안녕");
        myAdapter.addItem(drawable,"안녕","안녕");
        myAdapter.addItem(drawable,"안녕","안녕");
        myAdapter.addItem(drawable,"안녕","안녕");
        myAdapter.addItem(drawable,"안녕","안녕");
        myAdapter.addItem(drawable,"안녕","안녕");
        myAdapter.addItem(drawable,"안녕","안녕");
        myAdapter.addItem(drawable,"안녕","안녕");
        myAdapter.addItem(drawable,"안녕","안녕");
        myAdapter.addItem(drawable,"안녕","안녕");
        myAdapter.addItem(drawable,"안녕","안녕");
        myAdapter.addItem(drawable,"안녕","안녕");
        myAdapter.addItem(drawable,"안녕","안녕");
        myAdapter.addItem(drawable,"안녕","안녕");
        myAdapter.addItem(drawable,"안녕","안녕");
        myAdapter.addItem(drawable,"안녕","안녕");
        myAdapter.addItem(drawable,"안녕","안녕");
        myAdapter.addItem(drawable,"안녕","안녕");
        myAdapter.addItem(drawable,"안녕","안녕");
        myAdapter.addItem(drawable,"안녕","안녕");
        myAdapter.addItem(drawable,"안녕","안녕");
        myAdapter.addItem(drawable,"안녕","안녕");
        myAdapter.addItem(drawable,"안녕","안녕");
        myAdapter.addItem(drawable,"안녕","안녕");
        myAdapter.addItem(drawable,"안녕","안녕");





    }
}
