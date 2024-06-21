package com.rsm.kuruma;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    LinearLayout lly_card01, lly_card02, lly_card03, lly_card04, lly_card05, lly_card06, lly_card07;
    TextView txv_sucursales;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lly_card01 = findViewById(R.id.lly_card01);
        lly_card02 = findViewById(R.id.lly_card02);
        lly_card03 = findViewById(R.id.lly_card03);
        lly_card04 = findViewById(R.id.lly_card04);
        lly_card05 = findViewById(R.id.lly_card05);
        lly_card06 = findViewById(R.id.lly_card06);
        lly_card07 = findViewById(R.id.lly_card07);

        txv_sucursales = findViewById(R.id.txv_sucursales);

        Intent intent = new Intent(this, Detalles.class);

        lly_card01.setOnClickListener(v -> {
            intent.putExtra("imagen", R.drawable.img_carro01);
            intent.putExtra("marca", "Cobra");
            intent.putExtra("nombre", "Golden Air 10");
            intent.putExtra("year", "1980");
            intent.putExtra("precio", "200000");
            intent.putExtra("kilometraje", "140");
            intent.putExtra("motor", "motor de agua");
            intent.putExtra("garantia", "Premium");
            startActivity(intent);
        });

        lly_card02.setOnClickListener(v -> {
            intent.putExtra("imagen", R.drawable.img_carro02);
            intent.putExtra("marca", "FireRed");
            intent.putExtra("nombre", "Ultra Car 6000");
            intent.putExtra("year", "1945");
            intent.putExtra("precio", "150000");
            intent.putExtra("kilometraje", "500");
            intent.putExtra("motor", "motor hibrido");
            intent.putExtra("garantia", "Premium");
            startActivity(intent);
        });

        lly_card03.setOnClickListener(v -> {
            intent.putExtra("imagen", R.drawable.img_carro03);
            intent.putExtra("marca", "DibloBlack");
            intent.putExtra("nombre", "Satan30000");
            intent.putExtra("year", "1912");
            intent.putExtra("precio", "1000000");
            intent.putExtra("kilometraje", "4000");
            intent.putExtra("motor", "motor combustion");
            intent.putExtra("garantia", "Golden");
            startActivity(intent);
        });

        lly_card04.setOnClickListener(v -> {
            intent.putExtra("imagen", R.drawable.img_carro04);
            intent.putExtra("marca", "FireRed");
            intent.putExtra("nombre", "Vector 1");
            intent.putExtra("year", "1978");
            intent.putExtra("precio", "300000");
            intent.putExtra("kilometraje", "5800");
            intent.putExtra("motor", "motor combustion");
            intent.putExtra("garantia", "Basic");
            startActivity(intent);
        });

        lly_card05.setOnClickListener(v -> {
            intent.putExtra("imagen", R.drawable.img_carro05);
            intent.putExtra("marca", "Continental");
            intent.putExtra("nombre", "Super Car");
            intent.putExtra("year", "1980");
            intent.putExtra("precio", "450000");
            intent.putExtra("kilometraje", "900");
            intent.putExtra("motor", "motor hibrido");
            intent.putExtra("garantia", "Platinum");
            startActivity(intent);
        });

        lly_card06.setOnClickListener(v -> {
            intent.putExtra("imagen", R.drawable.img_carro06);
            intent.putExtra("marca", "Continental");
            intent.putExtra("nombre", "Mega Car");
            intent.putExtra("year", "1990");
            intent.putExtra("precio", "550000");
            intent.putExtra("kilometraje", "400");
            intent.putExtra("motor", "motor hidrogeno");
            intent.putExtra("garantia", "Premium");
            startActivity(intent);
        });

        lly_card07.setOnClickListener(v -> {
            intent.putExtra("imagen", R.drawable.img_carro07);
            intent.putExtra("marca", "Prusian");
            intent.putExtra("nombre", "Weimar");
            intent.putExtra("year", "1970");
            intent.putExtra("precio", "110000");
            intent.putExtra("kilometraje", "1400");
            intent.putExtra("motor", "motor combustion");
            intent.putExtra("garantia", "Silver");
            startActivity(intent);
        });

        txv_sucursales.setOnClickListener(v -> {

            Intent intent01 = new Intent(this, Sucursales.class);
            startActivity(intent01);
        });

    }



}