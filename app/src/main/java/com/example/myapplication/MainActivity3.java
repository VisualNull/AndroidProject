package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
    //
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        TextView textView3=findViewById(R.id.textView3);
        textView3.setText("This is activity3");
    }

    @Override
    protected void onResume() {
        super.onResume();
        setText();
    }
    private void setText()
    {
        new Handler().postDelayed(mSetText,3000);
    }
    private Runnable mSetText=new Runnable() {
        @Override
        public void run() {
            TextView textView=findViewById(R.id.textView3);
            textView.setText(R.string.Hello);
        }
    };
}