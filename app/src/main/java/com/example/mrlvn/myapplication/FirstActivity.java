package com.example.mrlvn.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


/**
 * Created by MRLVN on 2017/3/6.
 */

public class FirstActivity extends Activity{

    private Button bt1;
    private Button bt2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.firstactivity);

        bt1=(Button)findViewById(R.id.bt_first);
        bt2=(Button)findViewById(R.id.bt_second);

        /**
         * 通过bt1第一种方式跳转页面
         * 1.注册点击事件
         *
         */
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent view = new Intent(FirstActivity.this ,SecondActivity.class);
                view.setAction(Intent.ACTION_VIEW);
                startActivity(view);
            }
        });
    }
}
