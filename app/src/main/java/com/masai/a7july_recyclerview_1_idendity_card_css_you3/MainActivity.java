package com.masai.a7july_recyclerview_1_idendity_card_css_you3;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Menu> menuList;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.rvRecyclerView);
        buildRecyclerviewData();
        setRecyclerViewAdapter();
    }

    private void setRecyclerViewAdapter() {
        MenuAdapter menuAdapter = new MenuAdapter(menuList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this); //this or MainActivity.this
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(menuAdapter);
    }

    private void buildRecyclerviewData() {
        menuList = new ArrayList<>();
        menuList.add(new Menu(R.drawable.bill_gates_1,"Age :  64","Profession : Buisness","Microsoft"));
        menuList.add(new Menu(R.drawable.jeff_bezos_1,"Age :  56","Profession : Buisness","Amazon"));
        menuList.add(new Menu(R.drawable.prateek_sukla_1,"Age :  31","Profession : Buisness","Masai School"));
        menuList.add(new Menu(R.drawable.bill_gates_1,"Age :  64","Profession : Buisness","Microsoft"));
        menuList.add(new Menu(R.drawable.jeff_bezos_1,"Age :  56","Profession : Buisness","Amazon"));
        menuList.add(new Menu(R.drawable.prateek_sukla_1,"Age :  31","Profession : Buisness","Masai School"));
        menuList.add(new Menu(R.drawable.bill_gates_1,"Age :  64","Profession : Buisness","Microsoft"));
        menuList.add(new Menu(R.drawable.jeff_bezos_1,"Age :  56","Profession : Buisness","Amazon"));
        menuList.add(new Menu(R.drawable.prateek_sukla_1,"Age :  31","Profession : Buisness","Masai School"));
        menuList.add(new Menu(R.drawable.bill_gates_1,"Age :  64","Profession : Buisness","Microsoft"));
        menuList.add(new Menu(R.drawable.jeff_bezos_1,"Age :  56","Profession : Buisness","Amazon"));
        menuList.add(new Menu(R.drawable.prateek_sukla_1,"Age :  31","Profession : Buisness","Masai School"));

//
//        for (int i = 0; i < 60; i++) {
//            Menu menu = new Menu(R.drawable.missal_pav1, "Misal Pav", 65);
//            menuList.add(menu);
//        }
    }
}