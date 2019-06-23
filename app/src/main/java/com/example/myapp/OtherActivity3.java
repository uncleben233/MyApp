package com.example.myapp;


import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class OtherActivity3 extends AppCompatActivity {
    TextView TV;
    EditText ED;
    ViewGroup.LayoutParams p3;
    ViewGroup.LayoutParams p2;
    Button mbtn;
    ViewGroup.LayoutParams p;
    Item item;
    String s;
    int f;
    int h;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);
        //获取控件参数
        TV = (TextView) findViewById(R.id.new_textview);
        ED=(EditText)findViewById(R.id.new_editview);
        mbtn = (Button) findViewById(R.id.new_btn);
        LinearLayout myLayout = findViewById(R.id.LinearLayout);

        Intent intent = getIntent();

        //接收按钮参数
        int W_button=intent.getIntExtra("button_width",0);
        int H_button=intent.getIntExtra("button_height",0);
        String str1=(String) intent.getStringExtra("button_content");
        //接收文本框参数
        int W_textview=intent.getIntExtra("textview_width",0);
        int H_textview=intent.getIntExtra("textview_height",0);
        String str2=(String) intent.getStringExtra("textview_content");
        //接收输入框参数
        int W_editview=intent.getIntExtra("editview_width",0);
        int H_editview=intent.getIntExtra("editview_height",0);
        String str3=(String) intent.getStringExtra("editview_content");
        //接收颜色参数
         f=intent.getIntExtra("color",0);
         //接收字体颜色参数
        h=intent.getIntExtra("textcolor",0);
         //设置背景颜色
        if(f==1){
            myLayout.setBackgroundColor(Color.BLACK);
        }
        else if(f==2){
            myLayout.setBackgroundColor(Color.GREEN);
        }
         else if(f==3){
            myLayout.setBackgroundColor(Color.GRAY);
        }
        else if(f==4){
            myLayout.setBackgroundColor(Color.YELLOW);
        }else{
            myLayout.setBackgroundColor(Color.WHITE);
        }

        ED.setText(str3);
       p3=ED.getLayoutParams();
       p3.width=W_editview;
       p3.height=H_editview;



        TV.setText(str2);
        p=TV.getLayoutParams();
        p.width=W_textview;
        p.height=H_textview;

        p2=mbtn.getLayoutParams();
        p2.width=W_button;
        p2.height=H_button;
        mbtn.setText(str1);

        if(h==1){

            TV.setTextColor(TV.getResources().getColor(R.color.red));//来源于博客园https://www.cnblogs.com/JLZT1223/p/6825136.html
            ED.setTextColor(TV.getResources().getColor(R.color.red));//来源于博客园https://www.cnblogs.com/JLZT1223/p/6825136.html
            mbtn.setTextColor(android.graphics.Color.RED);

        }
        else if(h==2){
            TV.setTextColor(TV.getResources().getColor(R.color.black));
            ED.setTextColor(TV.getResources().getColor(R.color.black));
            mbtn.setTextColor(Color.BLACK);
        }
        else if(h==3){
            TV.setTextColor(TV.getResources().getColor(R.color.green));
            ED.setTextColor(TV.getResources().getColor(R.color.green));
            mbtn.setTextColor(Color.GREEN);
        }
        else if(h==4){
            TV.setTextColor(TV.getResources().getColor(R.color.white));
            ED.setTextColor(TV.getResources().getColor(R.color.white));
            mbtn.setTextColor(Color.WHITE);
        }else{
            TV.setTextColor(TV.getResources().getColor(R.color.black));
            ED.setTextColor(TV.getResources().getColor(R.color.black));
        }







        mbtn.getBackground().setAlpha(0);
        if (p2.width>0){
            mbtn.getBackground().setAlpha(255);
        }




        mbtn.setLayoutParams(p2);







    }
}


