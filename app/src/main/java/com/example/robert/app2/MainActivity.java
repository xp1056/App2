package com.example.robert.app2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.alibaba.fastjson.JSON;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        JSON.parse("{\"username\":\"Robert\"}");
    }
}
