package com.example.myapplication;

import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        Toast.makeText(MainActivity5.this,"Program has ended!" +
                "" +
                "" +
                "",Toast.LENGTH_LONG).show();
    }
}
