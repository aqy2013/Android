package com.example.mrlvn.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import static android.R.attr.tag;

public class MainActivity extends AppCompatActivity implements OnClickListener {

    private Button loginbutton; //初始化登录按钮
    private ImageButton loginbutton2; //实例化图片按钮

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /**
         * 实现登录的事件监听
         * 1.初始化当前登录所需的控件，如何初始化
         *findViewById --返回的是view的一个视图
         * 设置Button的监听，通过监听器，实现按钮的时间
         */
        loginbutton =(Button)findViewById(R.id.button);
        loginbutton2 =(ImageButton) findViewById(R.id.imageButton);
        /**
         * 1.监听事件通过第一种方法实现（匿名内部类）
         */
        loginbutton.setOnClickListener(new OnClickListener(){

            public void onClick (View v){
                //在当前onclick方法中监听button的动作
                System.out.println("我的按钮被点击了");
            }

        });

        /**
         * 2.点击事件外部类写法和作用
         * 但是实际开发比较少用
         *
         */
        loginbutton.setOnClickListener(new MyOnClickListen(){
            @Override
            public void onClick(View v) {
                //调用父类的Onclick
                super.onClick(v);
                Toast.makeText(MainActivity.this ,"按钮要执行的第二种逻辑" ,1).show();
            }
        });


        /**
         * 3.通过实现一个接口的方式实现监听事件
         */
        loginbutton2.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Toast.makeText(MainActivity.this ,"图片按钮要执行的第三种逻辑" ,1).show();
        Log.i("tag","第三种监听的事件方法上线了");

    }
}

/**
 * OnClickListener是一个接口，不能用继承的方式实现
 */
class MyOnClickListen implements OnClickListener{


    public void onClick(View v){
        Log.i("tag","父类的Onclick事件");
        v.setAlpha(0.5f);

    }


}

