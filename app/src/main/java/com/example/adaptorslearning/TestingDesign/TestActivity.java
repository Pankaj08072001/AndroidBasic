package com.example.adaptorslearning.TestingDesign;

import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.example.adaptorslearning.R;
import com.google.android.material.navigation.NavigationView;

public class TestActivity extends AppCompatActivity {

    private DrawerLayout drawerLayout;
    private NavigationView navigationView;
    private Toolbar toolbar;
    private ActionBarDrawerToggle toggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nav_testing);

        initViews();
        setupToolbar();
        setupDrawer();
        setupNavigation();
    }

    /* ---------------- INIT ---------------- */

    private void initViews() {
        toolbar = findViewById(R.id.toolbarT);
        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.navigation_view);
    }

    /* ---------------- TOOLBAR ---------------- */

    private void setupToolbar() {
        setSupportActionBar(toolbar);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        toolbar.setTitleTextColor(Color.WHITE);
    }

    /* ---------------- DRAWER ---------------- */

    private void setupDrawer() {
        toggle = new ActionBarDrawerToggle(
                this,
                drawerLayout,
                toolbar,
                R.string.navigation_view,
                R.string.navigation_view
        );

        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        // Tint hamburger icon AFTER sync
        if (toolbar.getNavigationIcon() != null) {
            toolbar.getNavigationIcon().setTint(Color.WHITE);
        }

        // Optional (better way)
        toggle.getDrawerArrowDrawable().setColor(Color.WHITE);
    }

    /* ---------------- NAVIGATION ---------------- */

    private void setupNavigation() {
        navigationView.setNavigationItemSelectedListener(item -> {
            drawerLayout.closeDrawer(GravityCompat.START);
            return true;
        });
    }

    /* ---------------- BACK / HOME ---------------- */

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (toggle.onOptionsItemSelected(item)) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
