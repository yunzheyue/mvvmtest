package com.example.databingtest.obs;

import android.databinding.ObservableField;

public class ObSnowMan {

    //    使用ObservableField进行包裹
    public ObservableField<String> name = new ObservableField<>();
    public ObservableField<Integer> age = new ObservableField<>();

    public ObSnowMan(String name, Integer age) {
//        设置数据
        this.name.set(name);
        this.age.set(age);
    }

    public ObservableField<String> getName() {
        return name;
    }

    public void setName(ObservableField<String> name) {
        this.name = name;
    }

    public ObservableField<Integer> getAge() {
        return age;
    }

    public void setAge(ObservableField<Integer> age) {
        this.age = age;
    }
}
