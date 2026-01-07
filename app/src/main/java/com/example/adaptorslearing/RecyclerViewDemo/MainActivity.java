package com.example.adaptorslearing.RecyclerViewDemo;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ButtonBarLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import com.example.adaptorslearing.R;

public class MainActivity extends AppCompatActivity {

    String[] names = {"Lions", "Bears", "Dogs", "Cats", "Elephants", "Lions", "Bears", "Dogs", "Cats", "Elephants", "Bears", "Dogs", "Cats", "Elephants"};
    int[] images = {R.drawable.one, R.drawable.two, R.drawable.three, R.drawable.four, R.drawable.five, R.drawable.six, R.drawable.seven,
            R.drawable.lions, R.drawable.nine, R.drawable.ten, R.drawable.eleven, R.drawable.twelve,
            R.drawable.one, R.drawable.two,};

    RecyclerView recycler_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        enableToolbar();

        recycler_view = findViewById(R.id.recycler_view);

        MyAdapter myAdapter = new MyAdapter(images, names);

        // FOR VERTICAL VIEW

        recycler_view.setLayoutManager(new LinearLayoutManager(this));
        recycler_view.setAdapter(myAdapter);

        // For Horizontal View

//        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
//        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
//        recycler_view.setLayoutManager(layoutManager);
//        recycler_view.setAdapter(myAdapter);

//        LinearLayoutManager layoutManager = new LinearLayoutManager(this , LinearLayoutManager.HORIZONTAL, false);
//        recycler_view.setLayoutManager(layoutManager);
//        recycler_view.setAdapter(myAdapter);

//
//        GridLayoutManager gridLayoutManager = new GridLayoutManager(this , 2);
//        recycler_view.setLayoutManager(gridLayoutManager);
//        recycler_view.setAdapter(myAdapter);

//        GridLayoutManager gridLayoutManager = new GridLayoutManager(this ,2);
//        gridLayoutManager.setOrientation(GridLayoutManager.HORIZONTAL);
//        recycler_view.setLayoutManager(gridLayoutManager);
//        recycler_view.setAdapter(myAdapter);


        //For adjust differ dimensions in proper formate
//        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(2 , StaggeredGridLayoutManager.VERTICAL);
//        recycler_view.setLayoutManager(staggeredGridLayoutManager);
//        recycler_view.setAdapter(myAdapter);

    }

    private void enableToolbar() {
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setTitle("Animals Gallery");
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setDisplayShowHomeEnabled(true);
        }

        if (toolbar.getNavigationIcon() != null) {
            toolbar.setTitleTextColor(Color.WHITE);
            // Use a custom drawable
//            getSupportActionBar().setHomeAsUpIndicator(R.drawable.home);
            toolbar.getNavigationIcon().setTint(Color.WHITE);
        }
    }
}