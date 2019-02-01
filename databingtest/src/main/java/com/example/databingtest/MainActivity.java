package com.example.databingtest;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import com.example.databingtest.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /**ActivityMainBinding:就是通过布局文件自动生成的，命名规则为是根据的布局的名称移出下划线并加上Binding组成。
         * binding对象就相当于布局的实例。通过binding来实现数据的交互和显示。
         */
        final ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        SnowMan snowMan = new SnowMan("啦啦", "3级");
        binding.setSnowMan(snowMan);

        RainMan rainMan = new RainMan("铛铛", 12);
        binding.setRainMan(rainMan);

        com.example.databingtest.entity.RainMan otherRainMan = new com.example.databingtest.entity.RainMan("叮叮", 34);
        binding.setOtherRainMan(otherRainMan);

        binding.setName("妞");
        binding.setAge(18);
        binding.setSex(true);

        final ArrayList<String> list = new ArrayList<>();
        list.add("渣渣");
        binding.setList(list);

        HashMap<String, String> map = new HashMap<>();
        map.put("name", "美女");
        binding.setMap(map);


        String[] strings = {"美妞"};
        binding.setArrays(strings);

//
        binding.btnT1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(intent);
            }
        });

        binding.btnT2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Main3Activity.class);
                startActivity(intent);
            }
        });
        binding.btnT3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                list.set(0, "大渣渣");
                binding.setList(list);
            }
        });

        binding.btnT4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Main6Activity.class);
                startActivity(intent);
            }
        });
    }
}
