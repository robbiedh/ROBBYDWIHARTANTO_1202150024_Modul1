package com.example.bangijan69.osasapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText Menu,Porsi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    Menu = (EditText)findViewById(R.id.input_menu);
    Porsi = (EditText)findViewById(R.id.jumlah_makan);
    }


    public void eatbus(View view) {
        Intent intent = new Intent(this, EatbusActivity.class);

         intent.putExtra("menu",Menu.getText().toString());
         intent.putExtra("porsi",Porsi.getText().toString());
         startActivity(intent);

    }

}
