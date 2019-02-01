package com.example.databingtest.obs;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import com.example.databingtest.BR;

public class ObRainMan extends BaseObservable {

    private String name;
    private int age;

    public ObRainMan(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 通过@Bindable标记后能在BR中存在响应的字段，当变化的时候能够通知
     * 更新UI
     */
    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
//        当设置属性的时候，能够通知属性改变
        notifyPropertyChanged(BR.name);
    }

    @Bindable
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        notifyPropertyChanged(BR.age);
    }
}
