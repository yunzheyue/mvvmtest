package com.example.databingtest;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.example.databingtest.databinding.ActivityMain4Binding;
import com.example.databingtest.obs.ObSnowMan;

public class Main4Activity extends AppCompatActivity {

//    使用ObservableField
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMain4Binding binding = DataBindingUtil.setContentView(this, R.layout.activity_main4);
        ObSnowMan obSnowMan = new ObSnowMan("美人", 23);
        binding.setObSnowMan(obSnowMan);
    }
}
