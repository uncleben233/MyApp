package com.example.myapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public void onClick(View v) {
        //Log.i("click","onclick");

    }

    public void skip(View view){
        Intent intent = new Intent();
        intent.setClass(MainActivity.this,TotalActivity.class);
        startActivity(intent);
}


    public void skip3(View view){
        Intent intent = new Intent();
        intent.setClass(MainActivity.this,OtherActivity3.class);
        startActivity(intent);
    }
    public void author(View view){
        Intent intent = new Intent();
        intent.setClass(MainActivity.this,authorActivity.class);
        startActivity(intent);
    }

}
