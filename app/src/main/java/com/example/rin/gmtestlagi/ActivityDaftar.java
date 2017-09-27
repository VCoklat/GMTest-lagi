package com.example.rin.gmtestlagi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ActivityDaftar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar);

        TextView tvfaq = (TextView) findViewById(R.id.tv_faq);
        tvfaq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent faq = new Intent(ActivityDaftar.this, FAQ.class);
                startActivity(faq);
            }
        });

        Button btndaftar1 = (Button) findViewById(R.id.btn_daftar);
        btndaftar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),
                        "Terimakasih Sudah Mendaftar di Gampang Material", Toast.LENGTH_LONG).show();
                Intent daftar1 = new Intent(ActivityDaftar.this, ActivityHome.class);
                startActivity(daftar1);
            }
        });

        TextView tvsdhdaftar = (TextView) findViewById(R.id.tv_sudah_daftar);
        tvsdhdaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sdhdaftar = new Intent(ActivityDaftar.this, ActivityMasuk.class);
                startActivity(sdhdaftar);
            }
        });
    }

    public class  CustomONItemSelectedListener implements AdapterView.OnItemSelectedListener{
        private AdapterView spinner1;
        String firstItem = String.valueOf(spinner1.getSelectedItem());

        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
            if (firstItem.equals(String.valueOf(spinner1.getSelectedItem()))){

            } else{
                Toast.makeText(parent.getContext(),
                        "Anda Memilih : " + parent.getItemAtPosition(pos).toString(),
                        Toast.LENGTH_LONG).show();
            }
        }

        @Override
        public void onNothingSelected(AdapterView<?> parent) {

        }
    }
}