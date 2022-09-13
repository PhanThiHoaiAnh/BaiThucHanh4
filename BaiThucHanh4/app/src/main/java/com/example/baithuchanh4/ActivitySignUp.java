package com.example.baithuchanh4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class ActivitySignUp extends AppCompatActivity {
    Button btnSignIn;
    Object ActivitySignIn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        btnSignIn = findViewById(R.id.btnDN);
        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {openActivitySignIn();
            }
        });
    }
    public void openActivitySignIn() {
        Intent intent = new Intent(ActivitySignUp.this, ActivitySignIn.class);
        startActivity(intent);
    }
}