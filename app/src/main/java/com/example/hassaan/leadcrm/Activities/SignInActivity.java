package com.example.hassaan.leadcrm.Activities;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.hassaan.leadcrm.MainActivity;
import com.example.hassaan.leadcrm.R;

public class SignInActivity extends AppCompatActivity {

    TextView tv_email_signIn, tv_password_signIn;
    ImageView imgView_logo;
    EditText et_email_singIn, et_password_signIn;
    Button btn_login, btn_signUp, btn_forgotPass;
    RelativeLayout rellay1, rellay2;

//    Handler handler = new Handler();
//    Runnable runnable = new Runnable() {
//        @Override
//        public void run() {
//            rellay1.setVisibility(View.VISIBLE);
//            rellay2.setVisibility(View.VISIBLE);
//        }
//    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        rellay1 = findViewById(R.id.rellay1);
        rellay2 = findViewById(R.id.rellay2);
        rellay1.setVisibility(View.VISIBLE);
        rellay2.setVisibility(View.VISIBLE);
//        handler.postDelayed(runnable, 2000); //2000 is the timeout for the splash

        tv_email_signIn = findViewById(R.id.tv_email_signIn);
        tv_password_signIn = findViewById(R.id.tv_password_signIn);

        et_email_singIn = findViewById(R.id.et_email_signIn);
        et_password_signIn = findViewById(R.id.et_password_signIn);

        btn_login = findViewById(R.id.btn_login);
        btn_signUp = findViewById(R.id.btn_signUp);
        btn_forgotPass = findViewById(R.id.btn_forgotPass);

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SignInActivity.this, MainActivity.class);
                startActivity(intent);

            }
        });

        btn_signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SignInActivity.this, SignUpActivity.class);
                startActivity(intent);
            }
        });


    }
}
