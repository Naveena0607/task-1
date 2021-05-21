package com.example.task1;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    Button proccced;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        proccced = findViewById(R.id.btn_login);
        proccced.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, otp_verification.class));
                finish();
            }
        });
    }
}