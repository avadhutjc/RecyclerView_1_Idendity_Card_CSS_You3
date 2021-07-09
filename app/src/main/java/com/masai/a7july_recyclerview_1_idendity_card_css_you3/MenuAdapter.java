package com.masai.a7july_recyclerview_1_idendity_card_css_you3;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MenuAdapter extends RecyclerView.Adapter<MenuViewHolder> {

    private ArrayList<Menu> menuList; //Global object declared

    public MenuAdapter(ArrayList<Menu> menuArrayList) { //passing menu from MainActivity
        menuList = menuArrayList; //assigning the data to 13 line menuArrayList
    }

    @NonNull
    @Override
    public MenuViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Log.d("Lloyd", "onCreate View holder");
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);
        return new MenuViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MenuViewHolder holder, int position) {
        Log.d("Lloyd", "onBind View holder");

        Menu menu = menuList.get(position);
        holder.setData(menu);
    }

    @Override
    public int getItemCount() {
        return menuList.size();
    }
}
