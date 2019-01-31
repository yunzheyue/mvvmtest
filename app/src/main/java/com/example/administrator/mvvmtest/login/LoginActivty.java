package com.example.administrator.mvvmtest.login;

import android.os.Bundle;
import com.example.administrator.mvvmtest.BR;
import com.example.administrator.mvvmtest.R;
import com.example.administrator.mvvmtest.databinding.ActivityLoginBinding;
import me.goldze.mvvmhabit.base.BaseActivity;


public class LoginActivty extends BaseActivity<ActivityLoginBinding, LoginViewModel> {

    //ActivityLoginBinding类是databinding框架自定生成的
    @Override
    public int initContentView(Bundle bundle) {
        return R.layout.activity_login;
    }

    /**
     * initVariableId() 返回变量的id，对应activity_login中name="viewModel"，
     * 就像一个控件的id，可以使用R.id.xxx，这里的BR跟R文件一样，由系统生成，使用BR.xxx找到这个ViewModel的id。
     */
    @Override
    public int initVariableId() {
        return BR.viewModel;
    }
}
