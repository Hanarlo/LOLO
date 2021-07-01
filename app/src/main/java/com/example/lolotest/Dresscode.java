package com.example.lolotest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Dresscode extends AppCompatActivity {
    Button button;
    ImageView imageView;
    TextView textView;
    int Number = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dresscode);
        setTitle("Знакомство с Lolo");

        button = findViewById(R.id.NextAnswerButton);
        imageView = findViewById(R.id.image);
        textView = findViewById(R.id.text2);

        button.setOnClickListener(nextDresscode);
    }

    View.OnClickListener nextDresscode = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Number++;
            switch (Number){
                case 1:
                    textView.setText("Вот так должен выглядеть водитель тарифов Бизнес, VIP, VIP Plus.");
                    imageView.setImageResource(R.drawable.second_dressscode);
                    break;
                case 2:
                    Intent intent = new Intent(Dresscode.this, how_make_orders.class);
                    startActivity(intent);
                    break;
                default:
                    textView.setText("Вот так должен выглядеть водитель тарифов Эконом, Эконом плюс, Комфорт.");
                    imageView.setImageResource(R.drawable.first_dresscode);

            }
        }
    };
}