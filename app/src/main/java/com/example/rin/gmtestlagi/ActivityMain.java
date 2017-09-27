package com.example.rin.gmtestlagi;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ActivityMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Untuk Button MASUK
        Button btn1 = (Button) findViewById(R.id.btn_masuk);
        btn1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent masuk = new Intent(ActivityMain.this, ActivityMasuk.class);
                startActivity(masuk);
            }
        });

        //Untuk Button DAFTAR
        Button btn2 = (Button) findViewById(R.id.btn_daftar);
        btn2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent daftar = new Intent(ActivityMain.this, ActivityDaftar.class);
                startActivity(daftar);
            }
        });
    }
    private Boolean exit = false;
    @Override
    public void onBackPressed() {
        if (exit) {
            finish(); // finish activity
        } else {
            Toast.makeText(this, "Tekan Back Sekali Lagi Untuk Keluar",
                    Toast.LENGTH_SHORT).show();
            exit = true;
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    onDestroy();
                }
            }, 3 * 1000);

        }

    }
}