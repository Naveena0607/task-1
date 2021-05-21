package com.example.task1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class otp_verification extends AppCompatActivity {

    Button proccced;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp_verification);

        proccced = findViewById(R.id.btn_login);
        proccced.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(otp_verification.this, "Registration succesfull", Toast.LENGTH_SHORT).show();
            }
        });
    }
}