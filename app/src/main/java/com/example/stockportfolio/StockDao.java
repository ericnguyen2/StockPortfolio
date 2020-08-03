package com.example.stockportfolio;

import java.util.List;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

@Dao
public interface StockDao {
    @Query("SELECT * FROM stock")
    List<Stock> getAllStocks();

    @Insert
    void insertAll(Stock... stocks);
}
