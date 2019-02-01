package com.example.databingtest;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import java.util.Date;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        通过在xml中指定Databinding的名称，来实现下面的数据绑定。这时候，需要不能自动绑定，需要构建一下项目。因此并不方便。
        final SecondActivityBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main2);
        binding.setName("eee");

        SnowMan snowMan = new SnowMan("美美", "s");
        binding.setSnowMan(snowMan);
        binding.setIsVisible(true);

        binding.setTime(new Date());


//        binding.setAge(new Integer(1));
        binding.setSex(false);
        binding.btChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.setIsVisible(!binding.getIsVisible());
            }
        });

    }
}
