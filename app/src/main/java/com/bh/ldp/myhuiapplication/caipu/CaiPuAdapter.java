package com.bh.ldp.myhuiapplication.caipu;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;

import com.bh.ldp.lib_base.view.BaseRecyclerViewAdapter;
import com.bh.ldp.lib_base.view.RecyclerViewHolder;
import com.bh.ldp.lib_base.view.onMyClickListener;
import com.bh.ldp.myhuiapplication.MyApplication;
import com.bh.ldp.myhuiapplication.R;
import com.bh.ldp.myhuiapplication.details.CaiDetailsActivity;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.List;

import bean.CaiDetailsBean;

/**
 * created by Da Peng at 2019/10/12
 */
public class CaiPuAdapter extends BaseRecyclerViewAdapter<CaiDetailsBean> {


    public CaiPuAdapter(Context context, List<CaiDetailsBean> list) {
        super(context, list);
    }

    @Override
    protected int getItemLayoutResId() {
        return R.layout.item_cai_pu;
    }

    @Override
    protected void bindItemViewHolder(RecyclerViewHolder holder, int position, final CaiDetailsBean item) {

        holder.setImagineByNetUrl(content, R.id.cai_iv, item.getPic(), R.drawable.ic_launcher_background)
                .setText(R.id.cai_name, item.getName())
                .setText(R.id.cai_tag, item.getTag());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                content.startActivity(new Intent(content, CaiDetailsActivity.class)
                        .putExtra("details", item));
            }
        });

    }


}
