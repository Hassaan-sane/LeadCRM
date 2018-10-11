package com.example.hassaan.leadcrm.Activities;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TimePicker;

import com.example.hassaan.leadcrm.Fragments.DatePickerFragment;
import com.example.hassaan.leadcrm.Fragments.TimePickerFragment;
import com.example.hassaan.leadcrm.R;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class AddEventActivity extends AppCompatActivity implements View.OnClickListener,DatePickerDialog.OnDateSetListener, TimePickerDialog.OnTimeSetListener {

    Button startDate;
    Button endDate;
    Button starttime;
    Button endtime;

    EditText title;
    EditText location;
    EditText hostname;
    private  int choice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_event);
        startDate=findViewById(R.id.bt_startdate_event);
        endDate=findViewById(R.id.bt_enddate_event);
        starttime=findViewById(R.id.bt_starttime_event);
        endtime=findViewById(R.id.bt_endtime_event);
        title=findViewById(R.id.et_eventname_event);
        location=findViewById(R.id.et_location_event);
        hostname=findViewById(R.id.et_hostname_event);

        startDate.setOnClickListener(this);
        endDate.setOnClickListener(this);
        starttime.setOnClickListener(this);
        endtime.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        android.support.v4.app.DialogFragment startDatePicker;
        android.support.v4.app.DialogFragment startTimePicker;
        switch (v.getId()){
            case R.id.bt_startdate_event:
                choice=1;
                startDatePicker = new DatePickerFragment();
                startDatePicker.show(getSupportFragmentManager(), "Start Date of Event");
                break;

            case R.id.bt_enddate_event:
                choice=2;
                startDatePicker = new DatePickerFragment();
                startDatePicker.show(getSupportFragmentManager(), "End Date of Event");
                break;

            case R.id.bt_starttime_event:
                choice=3;
                startTimePicker = new TimePickerFragment();
                startTimePicker.show(getSupportFragmentManager(), "Start Time of Event");
                break;

            case R.id.bt_endtime_event:
                choice=4;
                startTimePicker = new TimePickerFragment();
                startTimePicker.show(getSupportFragmentManager(), "End Time of Event");
                break;

        }

    }

    @Override
    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
        Calendar c = Calendar.getInstance();
        String pickedDate;

        switch (choice) {

            case 1: //startdate

                c.set(Calendar.YEAR, year);
                c.set(Calendar.MONTH, month);
                c.set(Calendar.DAY_OF_MONTH,dayOfMonth);
                pickedDate = DateFormat.getDateInstance().format(c.getTime());//this will be displayed


                startDate.setText(pickedDate);

                break;

            case 2: //enddate

                c.set(Calendar.YEAR, year);
                c.set(Calendar.MONTH, month);
                c.set(Calendar.DAY_OF_MONTH,dayOfMonth);
                pickedDate = DateFormat.getDateInstance().format(c.getTime());//this will be displayed


                endDate.setText(pickedDate);

                break;
        }
    }

    @Override
    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
        Calendar c = Calendar.getInstance();
        String pickedDate;

        switch (choice) {

            case 3: //starttime

                c.set(Calendar.HOUR, hourOfDay);
                c.set(Calendar.MINUTE, minute);
                c.set(Calendar.SECOND, 0);
                pickedDate = DateFormat.getTimeInstance().format(c.getTime());//this will be displayed


                starttime.setText(pickedDate);

                break;

            case 4: //endtime

                c.set(Calendar.HOUR, hourOfDay);
                c.set(Calendar.MINUTE, minute);
                c.set(Calendar.SECOND, 0);
                pickedDate = DateFormat.getTimeInstance().format(c.getTime());//this will be displayed


                endtime.setText(pickedDate);

                break;
        }

    }
}
