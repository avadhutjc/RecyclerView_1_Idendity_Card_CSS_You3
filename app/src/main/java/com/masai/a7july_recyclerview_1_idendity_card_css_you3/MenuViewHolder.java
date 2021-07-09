package com.masai.a7july_recyclerview_1_idendity_card_css_you3;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MenuViewHolder extends RecyclerView.ViewHolder {

    private ImageView imageView;
    private TextView mTvAge;
    private TextView mTvItemName;
    private TextView mTvCompany;


    public MenuViewHolder(@NonNull View itemView) {
        super(itemView);
        initViews(itemView);
    }

    private void initViews(View itemView) {
        imageView = itemView.findViewById(R.id.ivItem);
        mTvAge = itemView.findViewById(R.id.tvItemAge);
        mTvItemName = itemView.findViewById(R.id.tvProfession);
        mTvCompany = itemView.findViewById(R.id.tvCompany);
    }

    //setting of data here
    public void setData(Menu menu) {
        imageView.setImageResource(menu.getImage());
        mTvAge.setText(menu.getAge());
        mTvItemName.setText(menu.getProfession());
        mTvCompany.setText(menu.getCompany());
    }
}
