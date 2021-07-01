package com.example.lolotest;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.text.Html;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import static java.lang.System.console;
import static java.lang.System.in;

public class PersonalInformation extends AppCompatActivity {

    EditText PhoneEditText;
    EditText NameEditText;
    EditText DriverLicenseEditText;

    String PhoneText;
    String NameText;
    String DLText;

    String Answer = "";
    int AnswerIsCorrect = 0;

    String personalInformation;

    Button button;

    int NumberOfQuestion = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_information);

        setTitle("Личные данные");





        PhoneEditText = findViewById(R.id.PhoneInput);
        NameEditText = findViewById(R.id.NamesInput);
        DriverLicenseEditText = findViewById(R.id.DriverLicenseInput);

        button = findViewById(R.id.ButtonNext);

     //   PhoneText = PhoneEditText.getText().toString();
     //   NameText = NameEditText.getText().toString();
     //   DLText = DriverLicenseEditText.getText().toString();

        button.setOnClickListener(nextAnswerButtonClickListener);




    }

    private boolean validatePhoneNumber(){

       PhoneText = PhoneEditText.getText().toString().trim();

       if (PhoneText.equals("+375")|| PhoneText.isEmpty()){
           PhoneEditText.setError("Заполните поле");
           return false;
       } else {
           return true;
       }

    }

    private boolean validateName(){

        NameText = NameEditText.getText().toString().trim();

        if (NameText.isEmpty()){
            NameEditText.setError("Заполните поле");
            return false;
        } else {
            return true;
        }

    }

    private boolean validateDL(){

        DLText = DriverLicenseEditText.getText().toString().trim();

        if (DLText.isEmpty()){
            DriverLicenseEditText.setError("Заполните поле");
            return false;
        } else {
            return true;
        }

    }

    View.OnClickListener nextAnswerButtonClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if(!validatePhoneNumber() || !validateName() || !validateDL() ){
                return;
            }

            ArrayList<Class> activityList = new ArrayList<>();
            activityList.add(Question1.class);
            activityList.add(Question2.class);
            activityList.add(Question3.class);
            activityList.add(Question4.class);
            activityList.add(Question5.class);
            activityList.add(Question6.class);
            activityList.add(Question7.class);
            activityList.add(Question8.class);
            activityList.add(Question9.class);
            activityList.add(Question10.class);
            activityList.add(Question11.class);
            activityList.add(Question12.class);
            activityList.add(Question13.class);
            activityList.add(Question14.class);
            activityList.add(Question15.class);
            activityList.add(Question16.class);
            activityList.add(Question17.class);
            activityList.add(Question18.class);
            activityList.add(Question19.class);
            activityList.add(Question20.class);
            activityList.add(Question21.class);
            activityList.add(Question22.class);
            activityList.add(Question23.class);
            activityList.add(Question24.class);
            activityList.add(Question25.class);
            activityList.add(Question26.class);
            activityList.add(Question27.class);
            activityList.add(Question28.class);
            activityList.add(Question29.class);
            activityList.add(Question30.class);
            activityList.add(Question31.class);
            activityList.add(Question32.class);
            activityList.add(Question33.class);
            activityList.add(Question34.class);
            activityList.add(Question35.class);
            activityList.add(Question36.class);
            activityList.add(Question37.class);
            activityList.add(Question38.class);
            activityList.add(Question39.class);
            activityList.add(Question40.class);
            activityList.add(Question41.class);
            activityList.add(Question42.class);
            activityList.add(Question43.class);
            activityList.add(Question44.class);
            activityList.add(Question45.class);
            activityList.add(Question46.class);
            activityList.add(Question47.class);



            Random generator = new Random();
            int number = generator.nextInt(47) + 1;

            Class activity = null;

            // Here, we are checking to see what the output of the random was
            switch(number) {
                case 1:
                    activity = Question1.class;
                    // We are adding the number of the activity to the list
                    activityList.remove(Question1.class);
                    break;
                case 2:
                    activity = Question2.class;
                    activityList.remove(Question2.class);
                    break;
                case 3:
                    activity = Question3.class;
                    activityList.remove(Question3.class);
                    break;
                case 4:
                    activity = Question4.class;
                    activityList.remove(Question4.class);
                    break;

                case 5:
                    activity = Question5.class;
                    activityList.remove(Question5.class);
                    break;
                case 6:
                    activity = Question6.class;
                    activityList.remove(Question6.class);
                    break;
                case 7:
                    activity = Question7.class;
                    activityList.remove(Question7.class);
                    break;
                case 8:
                    activity = Question8.class;
                    activityList.remove(Question8.class);
                    break;
                case 9:
                    activity = Question9.class;
                    activityList.remove(Question9.class);
                    break;
                case 10:
                    activity = Question10.class;
                    activityList.remove(Question10.class);
                    break;
                case 11:
                    activity = Question11.class;
                    activityList.remove(Question11.class);
                    break;
                case 12:
                    activity = Question12.class;
                    activityList.remove(Question12.class);
                    break;
                case 13:
                    activity = Question13.class;
                    activityList.remove(Question13.class);
                    break;
                case 14:
                    activity = Question14.class;
                    activityList.remove(Question14.class);
                    break;
                case 15:
                    activity = Question15.class;
                    activityList.remove(Question15.class);
                    break;
                case 16:
                    activity = Question16.class;
                    activityList.remove(Question16.class);
                    break;
                case 17:
                    activity = Question17.class;
                    activityList.remove(Question17.class);
                    break;
                case 18:
                    activity = Question18.class;
                    activityList.remove(Question18.class);
                    break;
                case 19:
                    activity = Question19.class;
                    activityList.remove(Question19.class);
                    break;
                case 20:
                    activity = Question20.class;
                    activityList.remove(Question20.class);
                    break;
                case 21:
                    activity = Question21.class;
                    activityList.remove(Question21.class);
                    break;
                case 22:
                    activity = Question22.class;
                    activityList.remove(Question22.class);
                    break;
                case 23:
                    activity = Question23.class;
                    activityList.remove(Question23.class);
                    break;
                case 24:
                    activity = Question24.class;
                    activityList.remove(Question24.class);
                    break;
                case 25:
                    activity = Question25.class;
                    activityList.remove(Question25.class);
                    break;
                case 26:
                    activity = Question26.class;
                    activityList.remove(Question26.class);
                    break;
                case 27:
                    activity = Question27.class;
                    activityList.remove(Question27.class);
                    break;
                case 28:
                    activity = Question28.class;
                    activityList.remove(Question28.class);
                    break;
                case 29:
                    activity = Question29.class;
                    activityList.remove(Question29.class);
                    break;
                case 30:
                    activity = Question30.class;
                    activityList.remove(Question30.class);
                    break;
                case 31:
                    activity = Question31.class;
                    activityList.remove(Question31.class);
                    break;
                case 32:
                    activity = Question32.class;
                    activityList.remove(Question32.class);
                    break;
                case 33:
                    activity = Question33.class;
                    activityList.remove(Question33.class);
                    break;
                case 34:
                    activity = Question34.class;
                    activityList.remove(Question34.class);
                    break;
                case 35:
                    activity = Question35.class;
                    activityList.remove(Question35.class);
                    break;
                case 36:
                    activity = Question36.class;
                    activityList.remove(Question36.class);
                    break;
                case 37:
                    activity = Question37.class;
                    activityList.remove(Question37.class);
                    break;
                case 38:
                    activity = Question38.class;
                    activityList.remove(Question38.class);
                    break;
                case 39:
                    activity = Question39.class;
                    activityList.remove(Question39.class);
                    break;
                case 40:
                    activity = Question40.class;
                    activityList.remove(Question40.class);
                    break;
                case 41:
                    activity = Question41.class;
                    activityList.remove(Question41.class);
                    break;
                case 42:
                    activity = Question42.class;
                    activityList.remove(Question42.class);
                    break;
                case 43:
                    activity = Question43.class;
                    activityList.remove(Question43.class);
                    break;
                case 44:
                    activity = Question44.class;
                    activityList.remove(Question44.class);
                    break;
                case 45:
                    activity = Question45.class;
                    activityList.remove(Question45.class);
                    break;
                case 46:
                    activity = Question46.class;
                    activityList.remove(Question46.class);
                    break;
                default:
                    activity = Question47.class;
                    activityList.remove(Question47.class);
                    break;
            }

            personalInformation = "Имя: " + NameText + "\n" + "\n" + "Номер телефона: " + PhoneText + "\n" + "\n" + "Номер водительских прав:" + DLText + "\n" + "\n";
            Intent intent = new Intent(getBaseContext(), EndOfTest.class);
            intent.putExtra("ACTIVITY_LIST", activityList);
            intent.putExtra("NumberOfQuestion", NumberOfQuestion);
            intent.putExtra("AnswerIsCorrect", AnswerIsCorrect);
            Answer = Answer + personalInformation;
            intent.putExtra("Answer", Answer);
            startActivity(intent);
        }};


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
        case R.id.cancel_button:
            //CustomDialogClass cdd = new CustomDialogClass(PersonalInformation.this);
            //cdd.getWindow();
            //cdd.show();
            AlertDialog.Builder builder = new AlertDialog.Builder(PersonalInformation.this);
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
    }}









     //       if (YourAnswer != null){
     //               Log.d("answer", YourAnswer);
     //               Intent intent = new Intent(vopros2.this, Vopros3.class);
     //   intent.putExtra("AnswerIsCorrect", AnswerIsCorrect);
     //   intent.putExtra("name", name);
     //   intent.putExtra("phoneNumber", PhoneNumner);
     //   intent.putExtra("NumberOfDriverLicense", NumberOfDriverLicense);
     //   startActivity(intent);
     //   }