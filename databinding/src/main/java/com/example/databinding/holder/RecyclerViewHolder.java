package com.example.databinding.holder;


import android.databinding.ViewDataBinding;
import android.view.View;
import android.support.v7.widget.RecyclerView;

import com.example.databinding.databinding.LayoutSexBinding;

/**
 * Created by bilaizi on 16-9-7.
 */

public class RecyclerViewHolder extends RecyclerView.ViewHolder {
    private LayoutSexBinding mBinding;

    public RecyclerViewHolder(View itemView) {
        super(itemView);
        mBinding = LayoutSexBinding.bind(itemView);
    }

    public ViewDataBinding getBinding() {
        return mBinding;
    }
}
