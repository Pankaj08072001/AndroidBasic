package com.example.adaptorslearing.RecyclerViewDemo;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.adaptorslearing.R;

public class MainActivity2 extends AppCompatActivity {

    String[] names = {"Quantitative Aptitude", "Logical Reasoning and Data interpretation", "Verbal and Reasoning Comprehension"};
    int[] images = {R.drawable.one, R.drawable.two, R.drawable.three};

    RecyclerView recycler_view2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        enableToolbar();

        recycler_view2 = findViewById(R.id.recycler_view2);
        MyAdapter myAdapter = new MyAdapter(images, names);
        recycler_view2.setLayoutManager(new LinearLayoutManager(this));
        recycler_view2.setAdapter(myAdapter);
    }

    private void enableToolbar() {
        Toolbar toolbar = findViewById(R.id.toolbar2);
        setSupportActionBar(toolbar);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true); // back arrow
            actionBar.setDisplayShowHomeEnabled(true);
        }

        // Tint back arrow white
        if (toolbar.getNavigationIcon() != null) {
            toolbar.setBackgroundColor(getResources().getColor(R.color.white));
            toolbar.getNavigationIcon().setTint(Color.BLACK);
            toolbar.setTitleTextColor(Color.BLACK

            );
        }
    }

    // Inflate menu for toolbar icons
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_toolbar, menu);

        // Tint each icon white
        for (int i = 0; i < menu.size(); i++) {
            menu.getItem(i).getIcon().setTint(Color.WHITE);
        }

        return true;
    }

}
