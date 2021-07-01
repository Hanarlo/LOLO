package com.example.lolotest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ShareCompat;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Arrays;
import java.util.List;


public class EndOfTest extends AppCompatActivity {


    Button button;

    String Answer;
    int AnswerIsCorrect;
    int AnswerIsNotCorrect;
    String[] address = {"test.receiver.lolo@gmail.com"};
    String finalMessage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end_of_test);
        button = findViewById(R.id.StartTestButton);

        button.setOnClickListener(StartTest);


        Intent intent = getIntent();
        AnswerIsCorrect = intent.getIntExtra("AnswerIsCorrect", 0);
        Answer = intent.getStringExtra("Answer");
        AnswerIsNotCorrect = 47 - AnswerIsCorrect;

        finalMessage = Answer + "Правильных ответов: " + AnswerIsCorrect + "\n" + "\n" + "Неправильных ответов: " + AnswerIsNotCorrect;

        Log.d("aaa", Answer);


        SendAnswers();
    }

    View.OnClickListener StartTest = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

        Intent intent = new Intent(EndOfTest.this, MainActivity.class);
        startActivity(intent);

        }

            //Intent intent1 = new Intent(Intent.ACTION_SENDTO);
            //intent1.setType("*/*");
            //String uriText = "mailto:" + Uri.encode("test.receiver.lolo@gmail.com") +
            //        "?subject=" + Uri.encode("Ответы на тест") +
            //        "&body=" + Uri.encode(finalMessage);
            //Uri uri = Uri.parse(uriText);
            //intent1.setData(uri);
            ////intent1.putExtra(Intent.EXTRA_EMAIL, address);
            ////intent1.putExtra(Intent.EXTRA_SUBJECT, "Ответы на тест");
            ////intent1.putExtra(Intent.EXTRA_TEXT, finalMessage);
            //if (intent1.resolveActivity(getPackageManager()) != null) {
            //    startActivity(intent1);
            //}



    };

    private void SendAnswers(){
        Log.i("SendMailActivity", "Send Button Clicked.");

        String fromEmail = "ridelolo2020@yandex.ru";
        String fromPassword =  "rlqrnifxgwvkbwmd";
        String toEmails =  "test.receiver.lolo@gmail.com";
        List<String> toEmailList = Arrays.asList(toEmails
                .split("\\s*,\\s*"));
        Log.i("SendMailActivity", "To List: " + toEmailList);
        String emailSubject =  "Ответы на тест";
        String emailBody =finalMessage;
        new SendMailTask(EndOfTest.this).execute(fromEmail,
                fromPassword, toEmailList, emailSubject, emailBody);
    }

    @Override
    public void onBackPressed() {
        moveTaskToBack(true);
    }

}


