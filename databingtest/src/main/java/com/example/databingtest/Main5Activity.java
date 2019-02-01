package com.example.databingtest;

import android.databinding.DataBindingUtil;
import android.databinding.ObservableArrayList;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.example.databingtest.databinding.ActivityMain5Binding;

public class Main5Activity extends AppCompatActivity {


    /**    使用Observable容器类
     *ObservableArrayList
     * ObservableArrayMap
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMain5Binding binding = DataBindingUtil.setContentView(this, R.layout.activity_main5);

        ObservableArrayList<SnowMan> list = new ObservableArrayList<>();
        SnowMan snowMan1 = new SnowMan("小妞1", "S");
        SnowMan snowMan2 = new SnowMan("小妞2", "S");
        SnowMan snowMan3 = new SnowMan("小妞3", "S");
        list.add(snowMan1);
        list.add(snowMan2);
        list.add(snowMan3);
        binding.setList(list);

    }
}
