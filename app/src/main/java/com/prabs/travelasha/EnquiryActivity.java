package com.prabs.travelasha;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.text.DateFormat;
import java.util.Calendar;

public class EnquiryActivity extends AppCompatActivity {

    public TextInputLayout name, mobile, email, destination, adultNo, childrenNo, address, duration, date, message;
    public Button submit;
    public int talley = 0;
    public String enquiryResponse;
    public RadioButton radioButton;
    public RadioGroup radioGroup;
    private DatePickerDialog.OnDateSetListener mDateSetListener;
    public Button dateSelectButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enquiry);

        name = findViewById(R.id.name);
        mobile = findViewById(R.id.mobile);
        email = findViewById(R.id.emailId);
        destination = findViewById(R.id.destination);
        address = findViewById(R.id.adress);
        adultNo = findViewById(R.id.adultNo);
        childrenNo = findViewById(R.id.childrenNo);
        duration = findViewById(R.id.duration);
        date = findViewById(R.id.date);
        message = findViewById(R.id.message);

        dateSelectButton = (Button)findViewById(R.id.dateSelectButton);

        radioGroup = findViewById(R.id.radioGroup);


        submit = (Button) findViewById(R.id.submitButton);

        dateSelectButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Log.d("test", "touche");


                Calendar cal = Calendar.getInstance();
                int year = cal.get(Calendar.YEAR);
                int month = cal.get(Calendar.MONTH);
                int day = cal.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog dialog = new DatePickerDialog(
                        EnquiryActivity.this,
                        android.R.style.Theme_Holo_Light_Dialog_MinWidth,
                        mDateSetListener,
                        year,month,day);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();
            }
        });




        mDateSetListener = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int day) {
                month = month + 1;
                Log.d("TAG", "onDateSet: mm/dd/yyy: " + month + "/" + day + "/" + year);

                String date1 = month + "/" + day + "/" + year;
                date.getEditText().setText(date1);
            }
        };





        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Log.d("mssg", check().toString());
                if (check() == true) {
                    String temp = "";

                    if(radioGroup.getCheckedRadioButtonId() == -1) {

                    }else{

                        int radioId = radioGroup.getCheckedRadioButtonId();
                        radioButton = findViewById(radioId);

                        if (radioButton.getText().toString().isEmpty()) {
                            Log.d("test", "its empty");
                        } else {
                            Log.d("test", "yes");
                            temp = radioButton.getText().toString();
                        }



                    }

                    enquiryResponse = "Name : " + name.getEditText().getText().toString()
                            + " || "+"Email ID : " + email.getEditText().getText().toString()
                            + " || "+ "Mobile No : " + mobile.getEditText().getText().toString()
                            + " || "+ "Address : " + address.getEditText().getText().toString()
                            + " || "+ "Name of Destination : " + destination.getEditText().getText().toString()
                            + " || " + "Date of Journey : " + date.getEditText().getText().toString()
                            + " || "+ " Duration of trip : " + duration.getEditText().getText().toString()
                            + " || "+ "Number of Adults : " + adultNo.getEditText().getText().toString()
                            + " || "+ "Number of Children : " + childrenNo.getEditText().getText().toString()
                            + " || "+ "Message : " + message.getEditText().getText().toString()
                            + " || "+ temp;


                    Calendar calendar = Calendar.getInstance();
                    String date = DateFormat.getDateInstance().format(calendar.getTime());


                    FirebaseDatabase database = FirebaseDatabase.getInstance();
                    DatabaseReference myRef = database.getReference(date);

                    myRef.setValue(enquiryResponse);












                  // JavaMailAPI javaMailAPI = new JavaMailAPI(EnquiryActivity.this, "explore@designs4trips.com", "Response", enquiryResponse);
                  // javaMailAPI.execute();
//
//                    Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("mailto:" + "explore@designs4trips.com"));
//
//                    intent1.putExtra(Intent.EXTRA_SUBJECT,"Response");
//                    intent1.putExtra(Intent.EXTRA_TEXT,enquiryResponse);
//                   // intent1.setType("message/rfc822");
//                    startActivity(Intent.createChooser(intent1,"Choose an Email Client"));



                    Intent intent = new Intent(EnquiryActivity.this,MainActivity.class);
                    startActivity(intent);
                    Toast.makeText(getApplicationContext(), "Thank You", Toast.LENGTH_LONG).show();
                }else{

                }
            }
        });



    }


    public Boolean CheckName(){

        if(name.getEditText().getText().toString().isEmpty()){
            name.setError("Field Cannot Be Empty");
            return false;
        }else{
            name.setError(null);
            return true;
           // talley = talley+ 1 ;
        }

    }


    public Boolean CheckMobile(){

        if(mobile.getEditText().getText().toString().isEmpty()){
            mobile.setError("Field Cannot Be Empty");
            return false;
        }else{
            mobile.setError(null);
           // talley = talley+1 ;
            return true;
        }

    }

    public Boolean CheckEmail(){

        if(email.getEditText().getText().toString().isEmpty()){
            email.setError("Field Cannot Be Empty");
            return false;
        }else{
            email.setError(null);
          //  talley = talley+ 1 ;
            return true;

        }

    }

    public Boolean CheckAdultNo(){

        if(adultNo.getEditText().getText().toString().isEmpty()){
            adultNo.setError("Field Cannot Be Empty");
            return false;
        }else{
            adultNo.setError(null);
          //  talley = talley+ 1 ;
          return true;
            }

    }

    public Boolean CheckChildrenNo(){

        if(childrenNo.getEditText().getText().toString().isEmpty()){
            childrenNo.setError("Field Cannot Be Empty");
            return false;
        }else{

            childrenNo.setError(null);
           // talley = talley+ 1 ;
           return true;
            }

    }



    public Boolean check() {



        CheckAdultNo();
        CheckChildrenNo();
        CheckEmail();
        CheckMobile();
        CheckName();


        if(CheckName() == true && CheckMobile() == true && CheckEmail() == true && CheckChildrenNo() == true && CheckAdultNo() == true){

            return true;
        }else{
            return false;
        }

//        if(talley == 5){
//
//            return true;
//        }else{
//            Log.d("mssg", String.valueOf(talley));
//
//
//            return false;
//        }

    }


}