package com.example.stockportfolio;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

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

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // TODO: Save to database
                Log.d(TAG, "onClick: ticker: " + ticker.getText().toString());
            }
        });
    }
}
