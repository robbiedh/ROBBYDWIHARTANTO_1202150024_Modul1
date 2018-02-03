package com.example.bangijan69.osasapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class EatbusActivity extends AppCompatActivity {

   TextView Menu_eatbus,Porsi_eatbus, Harga_eatbus;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eatbus);

        Menu_eatbus = (TextView) findViewById(R.id.menu_eatbus);
        Porsi_eatbus = (TextView)findViewById(R.id.porsi_eatbus);
        Harga_eatbus = (TextView)findViewById(R.id.harga_eatbus);
    Intent intent =getIntent();
    String menu_eatbus = intent.getStringExtra("menu");
    String porsi_eatbus = intent.getStringExtra("porsi");

    Menu_eatbus.setText(menu_eatbus);
    Porsi_eatbus.setText(porsi_eatbus);
    int temp = Integer.parseInt(porsi_eatbus);
    int harga =temp*50000;
    Harga_eatbus.setText(Integer.toString(harga));
        Toast.makeText(getApplicationContext(),"Jangan disini makan malamnya, uang kamu tidak cukup",Toast.LENGTH_LONG).show();

    }
}
