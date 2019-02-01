package com.example.databingtest.Utils;

import android.databinding.BindingConversion;
import com.example.databingtest.SnowMan;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MyUtil2 {


    @BindingConversion
    public static String convertDate(Date date){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        return simpleDateFormat.format(date);
    }

    @BindingConversion
    public static String convertInt(int i){
        return String.valueOf(i);
    }
    @BindingConversion
    public static String convertInteger(Integer i){
        return String.valueOf(i);
    }
    @BindingConversion
    public static String convertBoolean(Boolean i){
        return i?"男":"女";
    }

}
