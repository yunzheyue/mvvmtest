package com.example.databingtest.Utils;

import android.databinding.BindingConversion;
import com.example.databingtest.SnowMan;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MyUtil {

    public static String getName(SnowMan snowMan){
        return snowMan.getName();
    }

    public static String getLevel(SnowMan snowMan){
        return snowMan.getLevel();
    }

}
