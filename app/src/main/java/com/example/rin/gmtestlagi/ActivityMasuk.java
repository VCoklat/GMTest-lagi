package com.example.rin.gmtestlagi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ActivityMasuk extends AppCompatActivity {

    Button btn_login;
    TextView tv_lupapass;
    TextView tv_daftar;
    EditText input_nope;
    EditText input_pass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_masuk);

        //Untuk Button Masuk
        btn_login = (Button) findViewById(R.id.btn_masuk);
        btn_login.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent masuk1 = new Intent(ActivityMasuk.this, ActivityHome.class);
                Toast.makeText(getApplicationContext(),
                        "Selamat Datang", Toast.LENGTH_LONG).show();
                startActivity(masuk1);
            }
        });

        //Untuk TextView lupapass
        tv_lupapass = (TextView) findViewById(R.id.tv_lupa_pass);
        tv_lupapass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent lupapass = new Intent(ActivityMasuk.this, LupaPass.class);
                startActivity(lupapass);
            }
        });

        //Untuk TextView Daftar
        tv_daftar = (TextView) findViewById(R.id.tv_daftar);
        tv_daftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent daftar1 = new Intent(ActivityMasuk.this, ActivityHome.class);
                startActivity(daftar1);
            }
        });

    }
}
