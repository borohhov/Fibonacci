package com.mainor.fibonacciinclass;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FibonacciAdapter extends RecyclerView.Adapter<FibonacciAdapter.FibonacciViewHolder> {

    private ArrayList<Long> numbers;
    private Context context;
    public FibonacciAdapter(ArrayList<Long> numbers){
        this.numbers = numbers;
        //this.context = context;
    }

    @NonNull
    @Override
    public FibonacciViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.fib_data_layout, parent, false);
        return new FibonacciAdapter.FibonacciViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FibonacciViewHolder holder, int position) {
        holder.itemView.setText(position+1 + ". " + numbers.get(position));
    }

    @Override
    public int getItemCount() {
        return numbers.size();
    }

    public static class FibonacciViewHolder extends RecyclerView.ViewHolder {
        TextView itemView;
        public FibonacciViewHolder(@NonNull View itemView) {
            super(itemView);
            this.itemView = itemView.findViewById(R.id.fib_data_tv);
        }
    }
}
