package com.example.lolotest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class how_make_orders extends AppCompatActivity {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_how_make_orders);
        button = findViewById(R.id.NextAnswerButton);
        setTitle("Знакомство с Lolo");

        button.setOnClickListener(next);
    }

    View.OnClickListener next = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(how_make_orders.this, pictures_with_instructions.class);
            startActivity(intent);

        }
    };
}