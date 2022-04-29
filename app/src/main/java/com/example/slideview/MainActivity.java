package com.example.slideview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
ViewPager viewpage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewpage=findViewById(R.id.view);
        ImageAdapter adapter=new ImageAdapter(this);
        viewpage.setAdapter(adapter);
    }
}