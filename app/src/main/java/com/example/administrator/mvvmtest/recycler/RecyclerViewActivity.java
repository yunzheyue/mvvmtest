package com.example.administrator.mvvmtest.recycler;

import android.os.Bundle;
import com.example.administrator.mvvmtest.BR;
import com.example.administrator.mvvmtest.R;
import com.example.administrator.mvvmtest.databinding.ActivityRecyclerViewBinding;
import me.goldze.mvvmhabit.base.BaseActivity;

//R.layout.activity_recycler_view
public class RecyclerViewActivity extends BaseActivity<ActivityRecyclerViewBinding, RecyclerViewModel> {

    @Override
    public int initContentView(Bundle bundle) {
        return R.layout.activity_recycler_view;
    }

    @Override
    public int initVariableId() {
        return BR.viewModel;
    }
}
