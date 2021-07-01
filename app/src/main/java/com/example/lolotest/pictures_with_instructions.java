package com.example.lolotest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class pictures_with_instructions extends AppCompatActivity {

    Button button;
    ImageView imageView;
    int number = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pictures_with_instructions);
        setTitle("Знакомство с Lolo");

        button = findViewById(R.id.NextAnswerButton);
        imageView = findViewById(R.id.imageInstructions);

        button.setOnClickListener(next);
    }

    View.OnClickListener next  = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            number++;
            switch (number){
                case 1:
                    imageView.setImageResource(R.drawable.dsad2);
                    break;
                case 2:
                    imageView.setImageResource(R.drawable.sadasfgr3);
                    break;
                case 3:
                    imageView.setImageResource(R.drawable.sdawdsda4);
                    break;
                case 4:
                    imageView.setImageResource(R.drawable.dafgfg5);
                    break;
                case 5:
                    Intent intent = new Intent(pictures_with_instructions.this, PersonalInformation.class);
                    startActivity(intent);
                    break;
                default:
                    imageView.setImageResource(R.drawable.asd1);
                    break;
            }
        }
    };
}