package com.rsm.kuruma;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Sucursales extends AppCompatActivity {

    ImageView imv_back01;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sucursales);

        // Se asocia variable "imv_back01" con elemento
        // visible "imv_back01" en "activity_sucursales"
        imv_back01 = findViewById(R.id.imv_back01);

        // Se configura "intent" y "imv_back01" para volver
        // a "MainActivity" al precionar imagen
        Intent intent = new Intent(this, MainActivity.class);
        imv_back01.setOnClickListener(v -> startActivity(intent));

    }
}