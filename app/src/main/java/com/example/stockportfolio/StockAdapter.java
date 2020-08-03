package com.example.stockportfolio;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class StockAdapter extends RecyclerView.Adapter<StockAdapter.ViewHolder> {

    ArrayList<String> stocks;

    public StockAdapter(ArrayList<String> stocks) {
        this.stocks = stocks;
    }

    @NonNull
    @Override
    public StockAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.stock_row, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StockAdapter.ViewHolder holder, int position) {
        holder.ticker.setText(stocks.get(position));
    }

    @Override
    public int getItemCount() {
        return stocks.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView ticker;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ticker = itemView.findViewById(R.id.ticker);
        }
    }
}
