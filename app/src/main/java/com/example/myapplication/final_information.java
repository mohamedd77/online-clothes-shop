package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class final_information extends AppCompatActivity {
    TextView tv1,tv2,tv3;
    SharedPreferences sp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_information);
        tv1=findViewById(R.id.tv_name);
        tv2=findViewById(R.id.tv_address);
        tv3=findViewById(R.id.tv_password);

        sp=getSharedPreferences("MySharedPref", MODE_PRIVATE);
        String username = sp.getString("username", null);
        String address = sp.getString("address", null);
        String password = sp.getString("password", null);
        tv1.setText("Name is : "+username);
        tv2.setText("Address is : "+address);

       tv3.setText("Password is: "+password);
    }
}
