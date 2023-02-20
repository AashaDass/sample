package com.mydearmechanic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.widget.Button;

public class Firstpage extends AppCompatActivity {
    Button Customer;
    Button Mechanic;
    Button CallCentre;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_firstpage);
        Customer=findViewById(R.id.btn1);
        Mechanic=findViewById(R.id.btn2);
        CallCentre=findViewById(R.id.btn3);
        Customer.setOnClickListener(view -> {
            Intent intent=new Intent(Firstpage.this,login.class);
            startActivity(intent);
        });
        Mechanic.setOnClickListener(view -> {
            Intent intent=new Intent(Firstpage.this,login.class);
            startActivity(intent);
        });
        CallCentre.setOnClickListener(view -> {
            Intent intent=new Intent(Firstpage.this,login.class);
            startActivity(intent);
        });
    }
}