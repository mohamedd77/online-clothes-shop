package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

public class login extends AppCompatActivity {
EditText txt1,txt2,txt3;
Button btn,btn2;
SharedPreferences sp;
SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        txt1=findViewById(R.id.et_user);
        txt2=findViewById(R.id.et_address);
        txt3=findViewById(R.id.et_password);
        sp=getSharedPreferences("MySharedPref", MODE_PRIVATE);
        editor=sp.edit();
        btn=findViewById(R.id.btn_login);

            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(txt1.getText().length()>6&&txt2.getText().length()>10&&txt3.getText().length()>6) {
                        Intent intent = new Intent(getApplicationContext(), reaching.class);
                        startActivity(intent);
                        savedata();
                    }
                }
            });


    }




    public void savedata()
    {

        String username  =txt1.getText().toString();
        String address=txt2.getText().toString();
        String password =txt3.getText().toString();
        editor.putString("username",username);
        editor.putString("address",address);
        editor.putString("password",password);

        editor.apply();

    }
}
