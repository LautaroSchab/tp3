package com.example.tp2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText Usuario_ingreso, Contraseña_ingreso;
    Button loginBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Usuario_ingreso = findViewById(R.id.Usuario_ingreso);
        Contraseña_ingreso = findViewById(R.id.Contraseña_ingreso);
        loginBtn = findViewById(R.id.Login_btn);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                
                if (Usuario_ingreso.getText().toString().equals("Alumno")&& Contraseña_ingreso.getText().toString().equals("1234")) {

                    Intent intent = new Intent(MainActivity.this, menu.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(MainActivity.this, "Usuario Incorrecto, vuelve a intentarlo.", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}