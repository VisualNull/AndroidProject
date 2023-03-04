package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

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
        goNextPage();
    }
    private void setText()
    {
        new Handler().postDelayed(mSetText,3000);
    }
    private void goNextPage(){
        new Handler().postDelayed(mGoNextPage,5000);
    }
    private Runnable mSetText=new Runnable() {
        @Override
        public void run() {
            TextView textView3=findViewById(R.id.textView3);
            TextView textView4=findViewById(R.id.textView4);
            TextView textView5=findViewById(R.id.textView5);
            textView3.setText(R.string.Hello);
            textView3.setTextColor(Color.RED);
            textView3.setBackgroundColor(Color.BLUE);
            textView4.setText(R.string.Hello);
            textView4.setTextColor(Color.BLUE);
            textView4.setBackgroundColor(Color.GREEN);
            textView5.setText(R.string.Hello);
            textView5.setTextColor(Color.GREEN);
            textView5.setBackgroundResource(R.color.red);

        }
    };
    private Runnable mGoNextPage=new Runnable() {
        @Override
        public void run() {
            startActivity(new Intent(MainActivity3.this,MainActivity4.class));
        }
    };
}