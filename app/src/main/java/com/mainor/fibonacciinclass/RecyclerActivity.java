package com.mainor.fibonacciinclass;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class RecyclerActivity extends AppCompatActivity {
    private RecyclerView.LayoutManager layoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);
        RecyclerView recyclerView = findViewById(R.id.recycler);
        layoutManager = new LinearLayoutManager(this);
        int count = getIntent().getIntExtra("Input", 10);
        recyclerView.setLayoutManager(layoutManager);
        FibonacciAdapter adapter = new FibonacciAdapter(FibonacciGenerator.getFibonacciNums(count));
        recyclerView.setAdapter(adapter);
    }
}
