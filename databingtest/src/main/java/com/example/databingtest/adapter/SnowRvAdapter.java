package com.example.databingtest.adapter;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.example.databingtest.R;
import com.example.databingtest.SnowMan;
import com.example.databingtest.databinding.ItemMain6RvBinding;

import java.util.List;

public class SnowRvAdapter extends RecyclerView.Adapter<SnowRvAdapter.SnowManHolder> {

    private List<SnowMan> list;

    public SnowRvAdapter(List<SnowMan> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public SnowManHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
//        这里的ItemMain6RvBinding 也是自动生成的
        ItemMain6RvBinding binding = DataBindingUtil.inflate(LayoutInflater.from(viewGroup.getContext()), R.layout.item_main6_rv, viewGroup, false);
        return new SnowManHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull SnowManHolder snowManHolder, int i) {

        SnowMan snowMan = list.get(i);
        snowManHolder.getBinding().setSnowMan(snowMan);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    //    注意viewholder的写法和原有的不同
    public class SnowManHolder extends RecyclerView.ViewHolder {

        ItemMain6RvBinding binding;

        public SnowManHolder(ViewDataBinding binding) {
            super(binding.getRoot());
            this.binding = (ItemMain6RvBinding) binding;
        }

        public ItemMain6RvBinding getBinding() {
            return binding;
        }

    }
}
