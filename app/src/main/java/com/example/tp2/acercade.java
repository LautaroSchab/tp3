package com.example.tp2;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class acercade extends AppCompatActivity {
    Button volver_btn, contacto_btn, enviar_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_acercade);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        volver_btn = findViewById(R.id.volver_btn);


        volver_btn.setOnClickListener(v -> {

            Intent intent = new Intent(acercade.this, menu.class);
            startActivity(intent);
        });

        contacto_btn = findViewById(R.id.contacto_btn);


        contacto_btn.setOnClickListener(v -> {

            String NumeroTelefono = "2954610600";
            Intent intent = new Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse("tel:" + NumeroTelefono));
            startActivity(intent);
        });

        enviar_btn = findViewById(R.id.enviar_btn);


        enviar_btn.setOnClickListener(v -> {

            String correo = "schablautaro4@gmail.com";
            Intent intent = new Intent(Intent.ACTION_SENDTO);
            Uri email = Uri.parse("mailto:" + correo);
            intent.setData(email);
            startActivity(intent);
        });
    }
}