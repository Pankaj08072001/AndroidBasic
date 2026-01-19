package com.example.adaptorslearning.Self;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.adaptorslearning.R;

public class SelfActivity extends AppCompatActivity {

    int[] images = {R.drawable.one, R.drawable.two, R.drawable.three, R.drawable.four, R.drawable.five, R.drawable.six, R.drawable.seven,
            R.drawable.lions, R.drawable.nine, R.drawable.ten, R.drawable.eleven, R.drawable.twelve,
            R.drawable.one, R.drawable.two,};

    RecyclerView recycler_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_self);

        recycler_view = findViewById(R.id.rv_view);

        SelfAdapter selfAdapter = new SelfAdapter(images);
        recycler_view.setLayoutManager(new LinearLayoutManager(this));
        recycler_view.setAdapter(selfAdapter);

    }
}