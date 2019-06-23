package com.example.myapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class TotalActivity extends AppCompatActivity {

    EditText button_content;
    EditText textview_content;
    EditText editview_content;
    EditText W_button;
    EditText H_button;
    EditText W_textview;
    EditText H_textview;
    EditText W_editview;
    EditText H_editview;
    TextView TV;
    String str1;
    String str2;
    String str3;
    String str4;
    String str5;
    String str6;
    String str7;
    String str8;
    String str9;
    int a;
    int b;

    int c;
    int d;

    int e;
    int f;
    int k;
    int tc;

    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.color,menu);


        return true;

    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
       if(item.getItemId()==R.id.black){
           k=1;
       }
        else if(item.getItemId()==R.id.green){
            k=2;
        }
        else if(item.getItemId()==R.id.gray){
            k=3;
        }
        else if(item.getItemId()==R.id.yellow){
            k=4;
        }else{
            k=0;
        }
        Log.i("color","K="+k);
       return true;
//        return super.onOptionsItemSelected(item);
    }


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_total);
        TV=findViewById(R.id.total_text);
    }
    public void run(View v){
        Intent intentk = new Intent();
        intentk.setClass(TotalActivity.this,TextColorActivity.class);
        startActivityForResult(intentk,1);


    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==1 && resultCode==2){
            Bundle bundle=data.getExtras();
            tc=bundle.getInt("textcolor",0);
            Log.i("pp","tc......................................................"+tc);
        }
    }

    public void save(View view){

        //获取按钮参数
        button_content=(EditText)findViewById(R.id.input_button_content);
        W_button=findViewById(R.id.input_button_width);
        H_button=findViewById(R.id.input_button_height);

        str1=button_content.getText().toString();
        str2=W_button.getText().toString();
        str3=H_button.getText().toString();
        //获取文本框参数
        textview_content=(EditText)findViewById(R.id.input_textview_content);
        W_textview=findViewById(R.id.input_textview_width);
        H_textview=findViewById(R.id.input_textview_height);
        str4=textview_content.getText().toString();
        str5=W_textview.getText().toString();
        str6=H_textview.getText().toString();
        //获取输入框参数
        editview_content=(EditText)findViewById(R.id.input_editview_content);
        W_editview=findViewById(R.id.input_editview_width);
        H_editview=findViewById(R.id.input_editview_height);
        str7=editview_content.getText().toString();
        str8=W_editview.getText().toString();
        str9=H_editview.getText().toString();
        //按钮高宽转换

        try {
            a = Integer.parseInt(str2);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        try {
            b= Integer.parseInt(str3);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        //文本框高宽转换
        try {
            c= Integer.parseInt(str5);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        try {
            d= Integer.parseInt(str6);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        //输入框高宽转换
        try {
            e = Integer.parseInt(str8);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        try {
             f= Integer.parseInt(str9);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        Intent intent = new Intent();
        intent.setClass(this,OtherActivity3.class);
        //传递按钮参数
        intent.putExtra("button_content",str1);
        intent.putExtra("button_width",a);
        intent.putExtra("button_height",b);
        //传递文本框参数
        intent.putExtra("textview_content",str4);
        intent.putExtra("textview_width",c);
        intent.putExtra("textview_height",d);
        //传递输入框参数
        intent.putExtra("editview_content",str7);
        intent.putExtra("editview_width",e);
        intent.putExtra("editview_height",f);
        //传递背景颜色参数
        intent.putExtra("color",k);
        //传递字体颜色参数
        intent.putExtra("textcolor",tc);


        startActivity(intent);
    }
}
