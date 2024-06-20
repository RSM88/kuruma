package com.rsm.kuruma;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Sucursales extends AppCompatActivity {

    ImageView imv_back01;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sucursales);

        imv_back01 = findViewById(R.id.imv_back01);


        Intent intent = new Intent(this, MainActivity.class);
        imv_back01.setOnClickListener(v -> startActivity(intent));

    }
}