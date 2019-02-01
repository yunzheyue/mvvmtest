package com.example.databingtest;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import com.example.databingtest.adapter.SnowRvAdapter;
import com.example.databingtest.databinding.ActivityMain6Binding;

import java.util.ArrayList;
import java.util.List;

public class Main6Activity extends AppCompatActivity {
    ActivityMain6Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main6);

        initRv();

    }

    private void initRv() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        binding.rvTest.setLayoutManager(linearLayoutManager);

        List<SnowMan> list = new ArrayList<>();

        for(int i = 0; i < 20; i++) {
            SnowMan snowMan = new SnowMan("小妞"+i, "S");
            list.add(snowMan);
        }

        SnowRvAdapter snowRvAdapter = new SnowRvAdapter(list);
        binding.rvTest.setAdapter(snowRvAdapter);

    }
}
