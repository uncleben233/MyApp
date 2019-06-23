package com.example.myapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class TextColorActivity extends AppCompatActivity {
    int b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_color);
        Button bt=findViewById(R.id.textred);
        Button bt1=findViewById(R.id.textblack);
        Button bt2=findViewById(R.id.textgreen);
        Button bt3=findViewById(R.id.textwhite);
        Button bt4=findViewById(R.id.back);
        bt.getBackground().setAlpha(100);
        bt1.getBackground().setAlpha(100);
        bt2.getBackground().setAlpha(100);
        bt3.getBackground().setAlpha(100);
        bt4.getBackground().setAlpha(100);
    }
    public void red(View v){
        b=1;
    }
    public void black(View v){
        b=2;
    }
    public void green(View v){
        b=3;
    }
    public void white(View v){
        b=4;
    }
    public void back(View v){
        Intent intent=new Intent();
        Bundle bd=new Bundle();
        bd.putInt("textcolor",b);
        intent.putExtras(bd);
        setResult(2,intent);
        finish();
    }




}
