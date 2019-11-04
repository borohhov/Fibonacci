package com.mainor.fibonacciinclass;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class FibonacciAdapter extends RecyclerView.Adapter<FibonacciAdapter.FibonacciViewHolder> {

    

    @NonNull
    @Override
    public FibonacciViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull FibonacciViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public static class FibonacciViewHolder extends RecyclerView.ViewHolder {

        public FibonacciViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
