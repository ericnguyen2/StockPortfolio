package com.example.stockportfolio;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

public class Stock {

    public Stock(String ticker, String quantity, String price) {
        this.ticker = ticker;
        this.quantity = quantity;
        this.price =price;
    }

    private int id;
    private String ticker;
    private String quantity;
    private String price;

    public int getId() {
        return id;
    }

    public String getTicker() {
        return ticker;
    }

    public String getQuantity() {
        return quantity;
    }

    public String getPrice() {
        return price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}