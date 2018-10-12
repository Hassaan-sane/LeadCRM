package com.example.hassaan.leadcrm.Activities;

import android.app.DatePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import com.example.hassaan.leadcrm.Fragments.DatePickerFragment;
import com.example.hassaan.leadcrm.R;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class SignUpActivity extends AppCompatActivity implements DatePickerDialog.OnDateSetListener {
    TextView tv_name, tv_email_new, tv_password_new, tv_confirmPassword, tv_DOB, tv_number, tv_DOB_picked, tv_designation, tv_address;
    EditText et_name, et_email_new, et_password_new, et_confirmPassword, et_DOB, et_number, et_designation, et_address;
    Button btn_SignUp_User, btn_DOB;

    private String DateOfBirth = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        tv_name = findViewById(R.id.tv_name);
        tv_DOB = findViewById(R.id.tv_DOB);
        tv_number = findViewById(R.id.tv_number);
        tv_email_new = findViewById(R.id.tv_email_new);
        tv_password_new = findViewById(R.id.tv_password_new);
        tv_confirmPassword = findViewById(R.id.tv_confirmPassword);
        tv_designation = findViewById(R.id.tv_designation);
        tv_address = findViewById(R.id.tv_address);

        et_name = findViewById(R.id.et_name);
//        et_DOB = findViewById(R.id.et_DOB);
        et_number = findViewById(R.id.et_number);
        et_email_new = findViewById(R.id.et_email_new);
        et_password_new = findViewById(R.id.et_password_new);
        et_confirmPassword = findViewById(R.id.et_confirmPassword);
        et_designation = findViewById(R.id.et_designation);
        et_address = findViewById(R.id.et_address);


        btn_SignUp_User = findViewById(R.id.btn_Signup_User);
        btn_DOB = findViewById(R.id.btn_Dob);

        btn_DOB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                android.support.v4.app.DialogFragment startDatePicker = new DatePickerFragment();

                startDatePicker.show(getSupportFragmentManager(), "DOB Picker");
            }
        });

    }

    @Override
    public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
        SimpleDateFormat Formatout = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat Format = new SimpleDateFormat("dd MMM yyyy");

        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR, i);
        c.set(Calendar.MONTH, i1);
        c.set(Calendar.DAY_OF_MONTH, i2);
        String pickedDate = DateFormat.getDateInstance().format(c.getTime());//this will be displayed

        tv_DOB_picked = findViewById(R.id.tv_DOB_picked);
        tv_DOB_picked.setText(pickedDate);

        try {
            Date startDate = Format.parse(pickedDate);
            DateOfBirth = Formatout.format(startDate);//this will go to database
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Log.i("onDateSet", "onDateSet: " + DateOfBirth);
    }


}
