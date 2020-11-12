package com.example.aplicacionaantah.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.aplicacionaantah.R;
import com.google.firebase.auth.FirebaseAuth;

public class MenuActivity extends AppCompatActivity {
    private Button btnSalir, btnSoftware, btnForo, btnNosotros, btnHardware;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        btnHardware = (Button)findViewById(R.id.btnHardware);
        btnSoftware = (Button)findViewById(R.id.btnSoftware);
        btnForo = (Button)findViewById(R.id.btnForo);
        btnSalir = (Button)findViewById(R.id.btnSalir);
        btnNosotros = (Button)findViewById(R.id.btnNosotros);

        btnForo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuActivity.this, MainActivity.class));
                finish();
            }
        });

        btnSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseAuth.getInstance().signOut();
                Toast.makeText(MenuActivity.this, "Hasta Luego", Toast.LENGTH_SHORT).show();
                returnLogin();
            }
        });
    }

    private void returnLogin(){
        startActivity(new Intent(MenuActivity.this, LoginActivity.class));
        finish();
    }
}
