package com.rsm.kuruma;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

// Pantalla de inicio: Muestra una pantalla a modo de presentacion o inicio de la app
public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);


        // Se crea una tarea/proceso que no ejecuta nada
        // Solo tiene el proposito de crear un tiempo para que
        // la pantalla permanezca visible antes de cambiar a otra pantalla
        new Handler().postDelayed(new Runnable() { // Se crea un hilo de ejecucion

            @Override
            public void run() {
                // Se indica cambiar de vista/pantalla/activity, en este caso "MainActivity"
                Intent intent = new Intent(SplashScreen.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, 1000); // se indica esperar 1000 milisegundos antes de ejecutar la "tarea dentro de "run()"


    }
}