package com.example.adaptorslearning.CardViewDemo;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.GridView;

import com.example.adaptorslearning.R;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivityOne extends AppCompatActivity {
    // Create reference variable for grid view
    GridView gridView_one;

    // Create array for images
    int[] animals_arr = {R.drawable.one, R.drawable.two, R.drawable.three, R.drawable.four, R.drawable.five, R.drawable.six, R.drawable.seven,
            R.drawable.nine, R.drawable.ten, R.drawable.eleven, R.drawable.twelve,
    };

    //  default method
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_one);
        initViewsGridVeiw();   // method call
        enableToolbar();       // method call
    }

    // enable toolbar and set title
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
            toolbar.getNavigationIcon().setTint(Color.WHITE);
        }
    }


    // for grid view data
    private void initViewsGridVeiw() {
        gridView_one = (GridView) findViewById(R.id.gridview_one);
        MyAdaptorsOne myAdaptorsOne = new MyAdaptorsOne(this, animals_arr);
        gridView_one.setAdapter(myAdaptorsOne);
    }
}
