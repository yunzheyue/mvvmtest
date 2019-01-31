package com.example.administrator.mvvmtest.recycler;

import android.app.Application;
import android.arch.lifecycle.ViewModel;
import android.support.annotation.NonNull;
import me.goldze.mvvmhabit.base.BaseViewModel;

public class RecyclerViewModel extends BaseViewModel {

    public RecyclerViewModel(@NonNull Application application) {
        super(application);
    }
}
