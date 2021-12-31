package com.example.happykids;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private DisplayItemAdapter disItemAdapter;
    private ArrayList<DisplayItem> disItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recycler);
        disItem=new ArrayList<>();
        setAdapter();
        setItemInfo();

    }
    private void setAdapter() {
        DisplayItemAdapter disadapter = new DisplayItemAdapter(disItem);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(disadapter);
    }

    private void setItemInfo() {
        disItem.add(new DisplayItem("Black","This chocolate is black",R.drawable.choc));
        disItem.add(new DisplayItem("Yellow","This banana is yellow",R.drawable.banane));
        disItem.add(new DisplayItem("green","This apple is green",R.drawable.green_apple));
        disItem.add(new DisplayItem("orange","This orange is orange",R.drawable.orange));
        disItem.add(new DisplayItem("Red","this tomato is red",R.drawable.tomato));

    }


}