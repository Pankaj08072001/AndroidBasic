package com.example.adaptorslearning.TestingDesign;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.adaptorslearning.R;
import com.google.android.material.appbar.MaterialToolbar;

public class MainActivity3 extends AppCompatActivity {

    String[] names = {
            "2025", "2024", "2023",
            "2022", "2021", "2020",
            "2019", "2018", "2017",
            "2016", "2015", "2014",
            "2013", "2012", "2011",
            "2010", "2009", "2008"
    };

    RecyclerView recycler_view3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        enableToolbar();

        recycler_view3 = findViewById(R.id.recycler_view3);
        MyAdapter3 myAdapter = new MyAdapter3(names);

        recycler_view3.setLayoutManager(new GridLayoutManager(this, 3));
        recycler_view3.setAdapter(myAdapter);
    }

    private void enableToolbar() {
        MaterialToolbar toolbar = findViewById(R.id.toolbar3);
        setSupportActionBar(toolbar);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setDisplayShowHomeEnabled(true);
        }
        toolbar.getNavigationIcon().setTint(Color.WHITE);
        toolbar.setTitleTextColor(Color.WHITE);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_pyp, menu);
        return true;
    }

}
