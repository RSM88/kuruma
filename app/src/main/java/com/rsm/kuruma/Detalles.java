package com.rsm.kuruma;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Detalles extends AppCompatActivity {

    // Declaracion de variables
    TextView txv_nombre, txv_marca, txv_year, txv_precio, txv_kilometraje, txv_motor, txv_garantia;

    ImageView imv_back,iv_imagen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_detalles);

        // Aqui se asocian variables a elementos visibles en "activity_detalles"
        imv_back = findViewById(R.id.imv_back);
        iv_imagen =  findViewById(R.id.iv_imagen);
        txv_nombre = findViewById(R.id.txv_nombre);
        txv_marca = findViewById(R.id.txv_marca);
        txv_year = findViewById(R.id.txv_year);
        txv_precio = findViewById(R.id.txv_precio);
        txv_kilometraje = findViewById(R.id.txv_kilometraje);
        txv_motor = findViewById(R.id.txv_motor);
        txv_garantia = findViewById(R.id.txv_garantia);


        // Este elemento trae empaquetados datos provenientes del activity anterior
        Bundle bundle = this.getIntent().getExtras();

        // Se carga objeto intent con el activity "MainActivity"
        Intent intent = new Intent(this, MainActivity.class);

        // Se configura/asigna ajecutar  el metodo "startActivity" al
        // presionar la imagen "imv_back".
        // Vuelve a MainActivity
        imv_back.setOnClickListener(v -> startActivity(intent));

        if(bundle != null){
            // Por medio de las variables asociadas (iv_imagen, etc.) a elementos
            // visibles se asigna un valor.
            // Por medio de "bundle" se extrae/recuperan datos del activity anterior
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