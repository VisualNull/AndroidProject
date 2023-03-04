package com.example.myapplication;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity4 extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        Button buttonSetWidth=findViewById(R.id.button2);
        Button buttonGoNextPage=findViewById(R.id.button3);
        TextView textView=findViewById(R.id.textViewWarp);
        buttonSetWidth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ViewGroup.LayoutParams  textViewLayoutParams= textView.getLayoutParams();
                textViewLayoutParams.width=dip2px(MainActivity4.this,500);
                textView.setLayoutParams(textViewLayoutParams);
            }
        });
        buttonGoNextPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity4.this,MainActivity5.class));
            }
        });
    }
    private int dip2px(Context context,float dpValue)
    {
        float scale=context.getResources().getDisplayMetrics().density;
        return (int)(dpValue*scale+0.5f);
    }
}

