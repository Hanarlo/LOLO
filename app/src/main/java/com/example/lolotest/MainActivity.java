package com.example.lolotest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.StartTestButton);

        button.setOnClickListener(StartTest);
    }

    View.OnClickListener StartTest = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Video.class);
                startActivity(intent);


        }
    };
}