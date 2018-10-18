package com.example.hassaan.leadcrm.Activities;

import android.app.DatePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Switch;

import com.example.hassaan.leadcrm.Fragments.DatePickerFragment;
import com.example.hassaan.leadcrm.R;

import java.text.DateFormat;
import java.util.Calendar;

public class EditCallActivity extends AppCompatActivity implements View.OnClickListener, DatePickerDialog.OnDateSetListener {

    Button type_butt, contact_butt, call_purpose_butt, account_butt, callType_butt, reminder_butt, cst_butt;
    EditText subject_et, callDuration_et, description_et, calResult_et;
    Switch billable_Switch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_call);

        type_butt = findViewById(R.id.type_callsEdit);
        contact_butt = findViewById(R.id.contact_callsEdit);
        call_purpose_butt = findViewById(R.id.call_purpose_callsEdit);
        account_butt = findViewById(R.id.account_callsEdit);
        callType_butt = findViewById(R.id.calltype_callsEdit);
        reminder_butt = findViewById(R.id.reminder_callsEdit);
        cst_butt = findViewById(R.id.cst_callsEdit);
        cst_butt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                android.support.v4.app.DialogFragment startDatePicker;
                startDatePicker = new DatePickerFragment();
                startDatePicker.show(getSupportFragmentManager(), "Start Date of Event");
            }
        });

        subject_et = findViewById(R.id.et_subject_callsEdit);
        callDuration_et = findViewById(R.id.callDuration_callsEdit);
        description_et = findViewById(R.id.description_callsEdit);
        calResult_et = findViewById(R.id.callResult_callsEdit);

        billable_Switch = findViewById(R.id.billable_callsEdit);
    }

    @Override
    public void onClick(View v) {

    }

    @Override
    public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
        Calendar c = Calendar.getInstance();
        String pickedDate;

        c.set(Calendar.YEAR, i);
        c.set(Calendar.MONTH, i1);
        c.set(Calendar.DAY_OF_MONTH,i2);
        pickedDate = DateFormat.getDateInstance().format(c.getTime());//this will be displayed
        cst_butt.setText(pickedDate);
    }
}
