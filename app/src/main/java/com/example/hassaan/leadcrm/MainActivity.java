package com.example.hassaan.leadcrm;

import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.hassaan.leadcrm.App.app;
import com.example.hassaan.leadcrm.Data.DBHelper;
import com.example.hassaan.leadcrm.Data.DatabaseManager;

public class MainActivity extends AppCompatActivity {

    // private app ap;
    DBHelper dbHelper;

    EditText edit1;
    EditText edit2;
    EditText edit3;

    Button button, button2 ;

    TextView view1;
    TextView view2;
    TextView view3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //ap=new app();
        dbHelper = new DBHelper(this);
        //DatabaseManager.initializeInstance(dbHelper);

        edit1 = findViewById(R.id.et1);
        edit2 = findViewById(R.id.et2);
        edit3 = findViewById(R.id.et3);

        view1 = findViewById(R.id.tv1);
        view2 = findViewById(R.id.tv2);
        view3 = findViewById(R.id.tv3);

        button = findViewById(R.id.btt1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateData();
            }
        });

        button2 = findViewById(R.id.btt2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Cursor res = dbHelper.getAllData();
                if(res.getCount() == 0)
                {
                    Toast.makeText(MainActivity.this, "No Data Found", Toast.LENGTH_SHORT).show();
                    return;
                }

                StringBuffer stringBuffer = new StringBuffer();
                while(res.moveToNext()){
                    stringBuffer.append("Title :" + res.getString(2) + "\n");
                    stringBuffer.append("Phone :" + res.getString(3) + "\n");
                    stringBuffer.append("Mobile :" + res.getString(4) + "\n");
                }

                view1.setText(stringBuffer.toString());
            }
        });
    }

    private void updateData() {
        String a = edit1.getText().toString();
        String b = edit2.getText().toString();
        String c = edit3.getText().toString();

        boolean isInserted = dbHelper.insertData(a,b,c);
            if (isInserted)
            {
                Toast.makeText(MainActivity.this,"Data Inserted",Toast.LENGTH_SHORT).show();
            }
            else
            {
                Toast.makeText(MainActivity.this,"Data NOT Inserted",Toast.LENGTH_SHORT).show();
            }
    }
}
