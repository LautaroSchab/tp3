package com.example.tp2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class menu extends AppCompatActivity {
    Button acercade_btn, salir_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_menu);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        acercade_btn = findViewById(R.id.acercade_btn);


        acercade_btn.setOnClickListener(v -> {

            Intent intent = new Intent(menu.this, acercade.class);
            startActivity(intent);
        });

        salir_btn = findViewById(R.id.salir_btn);


        salir_btn.setOnClickListener(v -> {
            Intent intent = new Intent(menu.this, MainActivity.class);
            startActivity(intent);
        });




    }
}