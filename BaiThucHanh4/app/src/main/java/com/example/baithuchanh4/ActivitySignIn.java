package com.example.baithuchanh4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ActivitySignIn extends AppCompatActivity {
    EditText edtUsN, edtPass;
    Button btnProf, btnSignUp;
    Object ActivityProfile, ActivitySignUp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);
        edtUsN = findViewById(R.id.edit_tUsN);
        edtPass = findViewById(R.id.edit_tPass);
        btnProf = findViewById(R.id.btnDN);

        btnProf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userName = "hoaianhphan";
                String passWord = "hoaianhphan";
                if (edtUsN.getText().toString().equals(userName) && edtPass.getText().toString().equals(passWord)){
                    Toast.makeText(getApplicationContext(),"Đăng nhập thành công", Toast.LENGTH_LONG).show();
                    openActivityProfile();
                }else {
                    Toast.makeText(getApplicationContext(),"Tài khoản hoặc Mật khẩu sai. Vui lòng kiếm tra lại!", Toast.LENGTH_LONG).show();
                }
            }
        });

        btnSignUp = findViewById(R.id.btnDK);
        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { openActivitySignUp();
            }
        });
    }
    public void openActivityProfile() {
        Intent intent = new Intent(ActivitySignIn.this, ActivityProfile.class);
        startActivity(intent);
    }

    public void openActivitySignUp() {
        Intent intent = new Intent(ActivitySignIn.this, ActivitySignUp.class);
        startActivity(intent);
    }
}