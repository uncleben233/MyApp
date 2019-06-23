package com.example.myapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class authorActivity extends AppCompatActivity {



        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_author);


        }

        public void tel(View v){
            Intent intent=new Intent(Intent.ACTION_DIAL, Uri.parse("tel:17381573110"));
            startActivity(intent);

        }
    public void map(View v){
        Intent intent1=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.amap.com/search?query=%E8%A5%BF%E5%8D%97%E8%B4%A2%E7%BB%8F%E5%A4%A7%E5%AD%A6%E6%9F%B3%E6%9E%97%E6%A0%A1%E5%8C%BA&city=510100&geoobj=103.983337%7C30.598605%7C104.257996%7C30.726184&zoom=12\n"));

        startActivity(intent1);

    }

}
