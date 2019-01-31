package com.example.administrator.mvvmtest.login;

import android.app.Application;
import android.databinding.ObservableField;
import android.support.annotation.NonNull;
import android.view.View;
import com.example.administrator.mvvmtest.MainActivity;
import com.example.administrator.mvvmtest.recycler.RecyclerViewActivity;
import me.goldze.mvvmhabit.base.BaseViewModel;
import me.goldze.mvvmhabit.binding.command.BindingAction;
import me.goldze.mvvmhabit.binding.command.BindingCommand;
import me.goldze.mvvmhabit.utils.ToastUtils;

/**
 * BaseViewModel与BaseActivity通过LiveData来处理常用UI逻辑，
 * 即可在ViewModel中使用父类的showDialog()、startActivity()等方法。
 * 在这个LoginViewModel中就可以尽情的写你的逻辑了！
 */
public class LoginViewModel extends BaseViewModel {

    public LoginViewModel(@NonNull Application application) {
        super(application);
    }

    //用户名的绑定
    public ObservableField<String> userName = new ObservableField<>("");

    public ObservableField<String> imgUrl = new ObservableField<>("http://img1.imgtn.bdimg.com/it/u=3206875372,1926186547&fm=26&gp=0.jpg");

    //登录按钮的点击事件
    public View.OnClickListener loginOnClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            ToastUtils.showShort(
                    userName.get()
            );
        }
    };

    public View.OnClickListener jumpActivity = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
//            跳转到普通的activity
            startActivity(MainActivity.class);
        }
    };

    public View.OnClickListener jumpRecyclerView=new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            startActivity(RecyclerViewActivity.class);
        }
    };

    public BindingCommand customConmand = new BindingCommand(new BindingAction() {
        @Override
        public void call() {
            ToastUtils.showShort(
                    "哦"
            );
        }
    });


}
