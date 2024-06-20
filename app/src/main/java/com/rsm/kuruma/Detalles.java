package com.rsm.kuruma;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class Detalles extends AppCompatActivity {

    TextView txv_nombre, txv_marca, txv_year, txv_precio, txv_kilometraje, txv_motor, txv_garantia;

    ImageView imv_back,iv_imagen;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_detalles);

        imv_back = findViewById(R.id.imv_back);
        iv_imagen =  findViewById(R.id.iv_imagen);
        txv_nombre = findViewById(R.id.txv_nombre);
        txv_marca = findViewById(R.id.txv_marca);
        txv_year = findViewById(R.id.txv_year);
        txv_precio = findViewById(R.id.txv_precio);
        txv_kilometraje = findViewById(R.id.txv_kilometraje);
        txv_motor = findViewById(R.id.txv_motor);
        txv_garantia = findViewById(R.id.txv_garantia);


        Bundle bundle = this.getIntent().getExtras();

        Intent intent = new Intent(this, MainActivity.class);
        imv_back.setOnClickListener(v -> startActivity(intent));

        if(bundle != null){
            iv_imagen.setImageResource(bundle.getInt("imagen"));
            txv_marca.setText(bundle.getString("marca"));
            txv_nombre.setText(bundle.getString("nombre"));
            txv_year.setText(bundle.getString("year"));
            txv_precio.setText(bundle.getString("precio"));
            txv_kilometraje.setText(bundle.getString("kilometraje"));
            txv_motor.setText(bundle.getString("motor"));
            txv_garantia.setText(bundle.getString("garantia"));

        }





    }


}