package com.mydearmechanic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.widget.TextView;

public class login extends AppCompatActivity {
    TextView loginhere;
    TextView registerhere;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_login);
        loginhere=findViewById(R.id.tv3);
        registerhere=findViewById(R.id.tv4);
        loginhere.setOnClickListener(view -> {
            Intent intent=new Intent(login.this,Cuslogin.class);
            startActivity(intent);
        });
        registerhere.setOnClickListener(view -> {
            Intent intent=new Intent(login.this,Cusregis.class);
            startActivity(intent);
        });
    }
}