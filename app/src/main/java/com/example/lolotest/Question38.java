package com.example.lolotest;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class Question38 extends AppCompatActivity {

    private CheckBox checkBox1;
    private CheckBox checkBox2;
    private CheckBox checkBox3;
    private CheckBox checkBox4;
    String YourAnswer = "";
    String FA;
    String SA;
    String TA;
    String FOA;

    String Answer;
    int AnswerIsCorrect;
    int AnswerIsCorrectt;

    int NumberOfQuestion;

    String QuestionText;
    String AnswerIsRightText = "Неправильно";
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question38);

        Intent intent = getIntent();

        textView = findViewById(R.id.textView);
        NumberOfQuestion = intent.getIntExtra("NumberOfQuestion", 0);
        AnswerIsCorrect = intent.getIntExtra("AnswerIsCorrect", 0);
        Answer = intent.getStringExtra("Answer");

        NumberOfQuestion++;
        setTitle("Вопрос " + NumberOfQuestion);

        Button button = findViewById(R.id.NextAnswerButton);
        button.setOnClickListener(nextAnswerButtonClickListener);

        checkBox1 = findViewById(R.id.checkBox1);
        checkBox2 = findViewById(R.id.checkBox2);
        checkBox3 = findViewById(R.id.checkBox3);
        checkBox4 = findViewById(R.id.checkBox4);


        FA = checkBox1.getText().toString();

        SA = checkBox2.getText().toString();

        TA = checkBox3.getText().toString();

        FOA = checkBox4.getText().toString();
    }


    View.OnClickListener nextAnswerButtonClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

                if (checkBox1.isChecked() || checkBox2.isChecked() || checkBox3.isChecked() || checkBox4.isChecked()){

                    if(checkBox1.isChecked()){
                            YourAnswer = YourAnswer +  FA+ "; ";
                    }

                    if(checkBox2.isChecked()){
                            YourAnswer = YourAnswer + SA+ "; ";

                    }

                    if(checkBox3.isChecked()){
                            AnswerIsCorrectt++;
                            YourAnswer = YourAnswer + TA+ "; ";
                    }

                    if(checkBox4.isChecked()){
                            YourAnswer = YourAnswer + FOA+ "; ";
                        AnswerIsCorrectt++;
                    }


                    Intent intent = getIntent();
                    ArrayList<Class> activityList = new ArrayList<>();
                    Bundle extras = intent.getExtras();
                    activityList = (ArrayList<Class>) extras.get("ACTIVITY_LIST");

                    if (activityList.size() == 0) {
                        // Do something when after all activities have been opened

                        if (AnswerIsCorrectt == 2) {
                            AnswerIsCorrect++;
                            AnswerIsRightText = "Правильно";
                        }
                        QuestionText = textView.getText().toString();
                        Answer = Answer + QuestionText + "\n" + YourAnswer + "\n" + AnswerIsRightText + "\n" + "\n";
                        Intent intent1 = new Intent(getBaseContext(), EndOfTest.class);
                        intent1.putExtra("Answer", Answer);
                        intent1.putExtra("AnswerIsCorrect", AnswerIsCorrect);
                        startActivity(intent1);
                        Log.d("aaa", Answer);
                    } else {
                        // Now, the random number is generated between 1 and however many
                        // activities we have remaining
                        Random generator = new Random();
                        int number = generator.nextInt( activityList.size()) + 1;

                        Class activity = null;

                        // Here, we are checking to see what the output of the random was
                        switch(number) {
                            case 1:
                                // We will open the first remaining activity of the list
                                activity = activityList.get(0);
                                // We will now remove that activity from the list
                                activityList.remove(0);
                                break;
                            case 2:
                                // We will open the second remaining activity of the list
                                activity = activityList.get(1);
                                activityList.remove(1);
                                break;
                            case 3:
                                // We will open the third remaining activity of the list
                                activity = activityList.get(2);
                                activityList.remove(2);
                                break;
                            case 4:
                                // We will open the fourth remaining activity of the list
                                activity = activityList.get(3);
                                activityList.remove(3);
                                break;
                            case 5:
                                // We will open the fourth remaining activity of the list
                                activity = activityList.get(4);
                                activityList.remove(4);
                                break;
                            case 6:
                                // We will open the fourth remaining activity of the list
                                activity = activityList.get(5);
                                activityList.remove(5);
                                break;
                            case 7:
                                // We will open the fourth remaining activity of the list
                                activity = activityList.get(6);
                                activityList.remove(6);
                                break;
                            case 8:
                                // We will open the fourth remaining activity of the list
                                activity = activityList.get(7);
                                activityList.remove(7);
                                break;
                            case 9:
                                // We will open the fourth remaining activity of the list
                                activity = activityList.get(8);
                                activityList.remove(8);
                                break;
                            case 10:
                                // We will open the fourth remaining activity of the list
                                activity = activityList.get(9);
                                activityList.remove(9);
                                break;
                            case 11:
                                // We will open the fourth remaining activity of the list
                                activity = activityList.get(10);
                                activityList.remove(10);
                                break;
                            case 12:
                                // We will open the fourth remaining activity of the list
                                activity = activityList.get(11);
                                activityList.remove(11);
                                break;
                            case 13:
                                // We will open the fourth remaining activity of the list
                                activity = activityList.get(12);
                                activityList.remove(12);
                                break;
                            case 14:
                                // We will open the fourth remaining activity of the list
                                activity = activityList.get(13);
                                activityList.remove(13);
                                break;
                            case 15:
                                // We will open the fourth remaining activity of the list
                                activity = activityList.get(14);
                                activityList.remove(14);
                                break;
                            case 16:
                                // We will open the fourth remaining activity of the list
                                activity = activityList.get(15);
                                activityList.remove(15);
                                break;
                            case 17:
                                // We will open the fourth remaining activity of the list
                                activity = activityList.get(16);
                                activityList.remove(16);
                                break;
                            case 18:
                                // We will open the fourth remaining activity of the list
                                activity = activityList.get(17);
                                activityList.remove(17);
                                break;
                            case 19:
                                // We will open the fourth remaining activity of the list
                                activity = activityList.get(18);
                                activityList.remove(18);
                                break;
                            case 20:
                                // We will open the fourth remaining activity of the list
                                activity = activityList.get(19);
                                activityList.remove(19);
                                break;
                            case 21:
                                // We will open the fourth remaining activity of the list
                                activity = activityList.get(20);
                                activityList.remove(20);
                                break;
                            case 22:
                                // We will open the fourth remaining activity of the list
                                activity = activityList.get(21);
                                activityList.remove(21);
                                break;
                            case 23:
                                // We will open the fourth remaining activity of the list
                                activity = activityList.get(22);
                                activityList.remove(22);
                                break;
                            case 24:
                                // We will open the fourth remaining activity of the list
                                activity = activityList.get(23);
                                activityList.remove(23);
                                break;
                            case 25:
                                // We will open the fourth remaining activity of the list
                                activity = activityList.get(24);
                                activityList.remove(24);
                                break;
                            case 26:
                                // We will open the fourth remaining activity of the list
                                activity = activityList.get(25);
                                activityList.remove(25);
                                break;
                            case 27:
                                // We will open the fourth remaining activity of the list
                                activity = activityList.get(26);
                                activityList.remove(26);
                                break;
                            case 28:
                                // We will open the fourth remaining activity of the list
                                activity = activityList.get(27);
                                activityList.remove(27);
                                break;
                            case 29:
                                // We will open the fourth remaining activity of the list
                                activity = activityList.get(28);
                                activityList.remove(28);
                                break;
                            case 30:
                                // We will open the fourth remaining activity of the list
                                activity = activityList.get(29);
                                activityList.remove(29);
                                break;
                            case 31:
                                // We will open the fourth remaining activity of the list
                                activity = activityList.get(30);
                                activityList.remove(30);
                                break;
                            case 32:
                                // We will open the fourth remaining activity of the list
                                activity = activityList.get(31);
                                activityList.remove(31);
                                break;
                            case 33:
                                // We will open the fourth remaining activity of the list
                                activity = activityList.get(32);
                                activityList.remove(32);
                                break;
                            case 34:
                                // We will open the fourth remaining activity of the list
                                activity = activityList.get(33);
                                activityList.remove(33);
                                break;
                            case 35:
                                // We will open the fourth remaining activity of the list
                                activity = activityList.get(34);
                                activityList.remove(34);
                                break;
                            case 36:
                                // We will open the fourth remaining activity of the list
                                activity = activityList.get(35);
                                activityList.remove(35);
                                break;
                            case 37:
                                // We will open the fourth remaining activity of the list
                                activity = activityList.get(36);
                                activityList.remove(36);
                                break;
                            case 38:
                                // We will open the fourth remaining activity of the list
                                activity = activityList.get(37);
                                activityList.remove(37);
                                break;
                            case 39:
                                // We will open the fourth remaining activity of the list
                                activity = activityList.get(38);
                                activityList.remove(38);
                                break;
                            case 40:
                                // We will open the fourth remaining activity of the list
                                activity = activityList.get(39);
                                activityList.remove(39);
                                break;
                            case 41:
                                // We will open the fourth remaining activity of the list
                                activity = activityList.get(40);
                                activityList.remove(40);
                                break;
                            case 42:
                                // We will open the fourth remaining activity of the list
                                activity = activityList.get(41);
                                activityList.remove(41);
                                break;
                            case 43:
                                // We will open the fourth remaining activity of the list
                                activity = activityList.get(42);
                                activityList.remove(42);
                                break;
                            case 44:
                                // We will open the fourth remaining activity of the list
                                activity = activityList.get(43);
                                activityList.remove(43);
                                break;
                            case 45:
                                // We will open the fourth remaining activity of the list
                                activity = activityList.get(44);
                                activityList.remove(44);
                                break;
                            case 46:
                                // We will open the fourth remaining activity of the list
                                activity = activityList.get(45);
                                activityList.remove(45);
                                break;
                            default:
                                // We will open the fifth remaining activity of the list
                                activity = activityList.get(46);
                                activityList.remove(46);
                                break;
                        }

                        Intent intent1 = new Intent(getBaseContext(), activity);
                        if (AnswerIsCorrectt == 2) {
                            AnswerIsCorrect++;
                            AnswerIsRightText = "Правильно";
                        }
                        QuestionText = textView.getText().toString();
                        Answer = Answer + QuestionText + "\n" + YourAnswer + "\n" + AnswerIsRightText + "\n" + "\n";
                        intent1.putExtra("Answer", Answer);
                        intent1.putExtra("NumberOfQuestion", NumberOfQuestion);
                        intent1.putExtra("ACTIVITY_LIST", activityList);
                        intent1.putExtra("AnswerIsCorrect", AnswerIsCorrect);
                        Log.d("aaa", Answer);
                        startActivity(intent1);

                    }} else {
                    Toast toast = Toast.makeText(getApplicationContext(),
                            "Ответ пуст!", Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        };
    @Override
    public void onBackPressed() {
        moveTaskToBack(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.cancel_button:
                //CustomDialogClass cdd = new CustomDialogClass(PersonalInformation.this);
                //cdd.getWindow();
                //cdd.show();
                AlertDialog.Builder builder = new AlertDialog.Builder(Question38.this);
                builder.setCancelable(true);
                builder.setTitle("Завершить тест").setMessage("Вы уверены, что хотите завершить тест? Ваши данные не будут сохранены.");

                //final View customLayout = getLayoutInflater().inflate(R.layout.activity_dialog_layout, null);
                //builder.setView(customLayout);
                builder.setPositiveButton(Html.fromHtml("<font color='#B00020'>ЗАВЕРШИТЬ</font>"),
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                                startActivity(intent);
                            }
                        });
                builder.setNegativeButton(Html.fromHtml("<font color='#333333'>ОТМЕНА</font>"), new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                });

                AlertDialog dialog = builder.create();
                dialog.show();

//
//
            default:

                return super.onOptionsItemSelected(item);
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_item, menu);
        return true;
    }
}