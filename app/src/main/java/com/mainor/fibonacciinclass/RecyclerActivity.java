package com.mainor.fibonacciinclass;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class RecyclerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);
        RecyclerView recyclerView = findViewById(R.id.recycler);
        int count = getIntent().getIntExtra("Input", 10);
        FibonacciAdapter adapter = new FibonacciAdapter(FibonacciGenerator.getFibonacciNums(count));
        recyclerView.setAdapter(adapter);
    }
}
