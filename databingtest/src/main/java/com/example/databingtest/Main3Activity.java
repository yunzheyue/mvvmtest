package com.example.databingtest;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import com.example.databingtest.databinding.ActivityMain3Binding;
import com.example.databingtest.obs.ObRainMan;

public class Main3Activity extends AppCompatActivity {


    /**
     * 使用双向数据绑定，具体有三种动态更新机制，更具model来更新ui
     * 类Observable
     * 字段ObservableField
     * 集合类型 Observable容器类
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMain3Binding binding = DataBindingUtil.setContentView(this, R.layout.activity_main3);

        ObRainMan obRainMan = new ObRainMan("小妞", 23);
        binding.setObRainMan(obRainMan);

        binding.btnT1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Main3Activity.this, Main4Activity.class));
            }
        });
        binding.btnT2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Main3Activity.this, Main5Activity.class));
            }
        });


    }
}
