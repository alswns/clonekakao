package com.example.kakao_clone.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import com.example.kakao_clone.R;
import com.example.kakao_clone.apis.BaseActivity;
import com.example.kakao_clone.apis.MyAdapter;
import com.example.kakao_clone.apis.MyItem;

public class MainActivity extends AppCompatActivity    {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView list=findViewById(R.id.list);
        MyAdapter myAdapter=new MyAdapter();
        View view=getCurrentFocus();
//        View view=


//        list.addFooterView(view);

        list.setAdapter(myAdapter);


        Drawable drawable=getDrawable(R.drawable.base_image);
        myAdapter.addItem(drawable,"박민준","굿굿굿");
        myAdapter.addItem(drawable,"안녕","");
        myAdapter.addItem(drawable,"안녕","안녕");
        myAdapter.addItem(drawable,"안녕","안녕");
        myAdapter.addItem(drawable,"안녕","안녕");
        myAdapter.addItem(drawable,"안녕","안녕");
        myAdapter.addItem(drawable,"안녕","안녕");
        myAdapter.addItem(drawable,"안녕","안녕");
        myAdapter.addItem(drawable,"안녕","안녕");
        myAdapter.addItem(drawable,"안녕","안녕");
        myAdapter.addItem(drawable,"안녕","안녕");
        System.out.println(myAdapter.getItem(0));
        MyItem myItem= (MyItem) myAdapter.getItem(0);
        myItem.setSize(30,30);

//        myAdapter.getItem(0)




    }
}
