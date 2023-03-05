package com.example.myapplication;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity8 extends AppCompatActivity implements View.OnClickListener{

    private TextView tv_result; // 声明一个文本视图实例
    private Button btn_test; // 声明一个按钮控件实例

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);
        btn_test=findViewById(R.id.btn_test);
        tv_result=findViewById(R.id.tv_result);
        findViewById(R.id.btn_enable).setOnClickListener(this);
        findViewById(R.id.btn_disable).setOnClickListener(this);
        findViewById(R.id.btn_test).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        // 由于多个控件都把点击监听器设置到了当前页面，因此公共的onClick方法内部需要区分来自哪个按钮
        if (view.getId() == R.id.btn_enable) { // 点击了按钮“启用测试按钮”
            btn_test.setTextColor(Color.BLACK); // 设置按钮的文字颜色
            btn_test.setEnabled(true); // 启用当前控件
        } else if (view.getId() == R.id.btn_disable) { // 点击了按钮“禁用测试按钮”
            btn_test.setTextColor(Color.GRAY); // 设置按钮的文字颜色
            btn_test.setEnabled(false); // 禁用当前控件
        } else if (view.getId() == R.id.btn_test) { // 点击了按钮“测试按钮”
            String desc ="Hello";
            tv_result.setText(desc); // 设置文本视图的文本内容
        }
    }
}
