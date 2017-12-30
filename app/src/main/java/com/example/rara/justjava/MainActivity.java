package com.example.rara.justjava;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button BtnPertama, BtnKedua;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // casting id
        BtnPertama = (Button)findViewById(R.id.BtnPertama);
        BtnKedua = (Button)findViewById(R.id.BtnKedua);
        BtnPertama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BtnPertama.setText("Button Telah Di Klik");
           }
        });
        BtnKedua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BtnKedua.setText("Si Atlit Rafi Darma Wahab");
                startActivity(new Intent(getApplicationContext(), Kedua.class));
                Toast.makeText(MainActivity.this,"Ini Adalah SI Atlit Botak", Toast.LENGTH_LONG).show();
            }
        });
    }
}
