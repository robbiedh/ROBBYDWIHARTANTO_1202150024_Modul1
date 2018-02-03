package com.example.bangijan69.osasapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class AbnormalActivity extends AppCompatActivity {

    TextView Menu_abnormal,Porsi_abnormal,Harga_abnormal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abnormal);

        Menu_abnormal = (TextView)findViewById(R.id.menu_abnormal);
        Porsi_abnormal = (TextView)findViewById(R.id.porsi_abnormal);
        Harga_abnormal = (TextView)findViewById(R.id.harga_abnormal);

        Intent intent =getIntent();
        String menu_abnormal = intent.getStringExtra("menu_abnormal");
        String porsi_abnormal = intent.getStringExtra("porsi_abnormal");

        Log.d("abnorma",menu_abnormal);
Log.d("porsi ", porsi_abnormal);
       Menu_abnormal.setText(menu_abnormal.toString());
       Porsi_abnormal.setText(porsi_abnormal.toString());
      int temp = Integer.parseInt(porsi_abnormal);
        int harga =temp*30000;
        Harga_abnormal.setText(Integer.toString(harga));

        Toast.makeText(getApplicationContext(),"Disini aja makan malamnya",Toast.LENGTH_LONG).show();

    }
}
