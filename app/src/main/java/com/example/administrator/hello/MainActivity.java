package com.example.administrator.hello;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    private int num1=0;
    private int num2=0;
    private int points=0;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        butnum();


    }
    //赋值函数
    public void butnum(){
        Button btnf=(Button)findViewById(R.id.leftbutton);
        Button btnr=(Button)findViewById(R.id.rightbutton);

        Random randy=new Random();

     while (true){
         num1=randy.nextInt(10);
         num2=randy.nextInt(10);
         if (num1!=num2) break;

     }


        System.out.println("num1:"+num1+"num2:"+num2);
        btnf.setText(""+num1);
        btnr.setText(""+num2 );
    }



    //响应按钮事件
    public void leftonclik(View view) {
        Button btn =(Button) findViewById(R.id.leftbutton);
        if (num1>num2){
            Toast.makeText(this,"正确",Toast.LENGTH_SHORT).show();
            points++;
        }else {
            Toast.makeText(this,"错误",Toast.LENGTH_SHORT).show();
            points--;
        }
        butnum();
        TextView tw=(TextView) findViewById(R.id.pointText);
        tw.setText("得分："+points);

    }
    //响应按钮事件
    public void rightonclick(View view) {
        Button btn =(Button) findViewById(R.id.rightbutton);
        if (num2>num1){
            Toast.makeText(this,"正确",Toast.LENGTH_SHORT).show();
            points++;
        }else {
            Toast.makeText(this,"错误",Toast.LENGTH_SHORT).show();
            points++;
        }
        butnum();
        TextView tw=(TextView) findViewById(R.id.pointText);
        tw.setText("得分："+points);

    }
}
