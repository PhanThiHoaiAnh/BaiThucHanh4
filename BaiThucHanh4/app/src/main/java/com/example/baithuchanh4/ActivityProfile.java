package com.example.baithuchanh4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityProfile extends AppCompatActivity {
    ImageButton btnComeback;
    Object ActivitySignIn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        btnComeback = findViewById(R.id.img_btnBack);
        btnComeback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {openActivitySignIn();
            }
        });
    }
    public void openActivitySignIn() {
        Intent intent = new Intent(ActivityProfile.this, ActivitySignIn.class);
        startActivity(intent);
    }
}