package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        super.onResume();
        goNextPage();
    }
    private void goNextPage()
    {
        TextView textView1=findViewById(R.id.textView1);
        textView1.setText("3秒后进入下一个界面");
        new Handler().postDelayed(mGoNext,3000);
    }
    private Runnable mGoNext=new Runnable() {
        @Override
        public void run() {
            startActivity(new Intent(MainActivity.this,MainActivity2.class));
        }
    };
}