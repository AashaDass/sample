package com.mydearmechanic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;
import android.widget.Button;

public class Cuslogin extends AppCompatActivity {
    Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_cuslogin);
        login=findViewById(R.id.btn4);
        login.setOnClickListener(view -> {
            Intent intent=new Intent(Cuslogin.this,MainActivity.class);
            startActivity(intent);
        });
    }
}