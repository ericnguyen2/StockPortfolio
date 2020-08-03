package com.example.stockportfolio;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.View;

import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    FloatingActionButton fab;
    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    ArrayList<String> stocks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        stocks = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            stocks.add("AAPL # " + i);
        }

        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new StockAdapter(stocks);
        recyclerView.setAdapter(adapter);

        fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: pressed!");
                startActivity(new Intent(MainActivity.this, CreateStock.class));
            }
        });
    }
}