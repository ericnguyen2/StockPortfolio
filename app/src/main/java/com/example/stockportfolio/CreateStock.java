package com.example.stockportfolio;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

public class CreateStock extends AppCompatActivity {

    private static final String TAG = "CreateStock";
    
    EditText ticker;
    EditText quantity;
    EditText price;
    Button button;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_stock);

        ticker = findViewById(R.id.ticker);
        quantity = findViewById(R.id.quantity);
        price = findViewById(R.id.price);
        button = findViewById(R.id.button);

        final AppDatabase db = Room.databaseBuilder(getApplicationContext(), AppDatabase.class, "production").allowMainThreadQueries().build();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Save to database
                Log.d(TAG, "onClick: ticker: " + ticker.getText().toString());
                db.stockDao().insertAll(new Stock(ticker.getText().toString(), quantity.getText().toString(), price.getText().toString()));
                startActivity(new Intent(CreateStock.this, MainActivity.class));
            }
        });
    }
}
