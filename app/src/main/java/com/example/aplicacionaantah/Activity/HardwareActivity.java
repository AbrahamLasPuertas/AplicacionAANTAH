package com.example.aplicacionaantah.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.aplicacionaantah.R;
import com.example.aplicacionaantah.hardware.problemah_uno;
import com.example.aplicacionaantah.software.problema_uno;

public class HardwareActivity  extends AppCompatActivity {

    private Button btnVolver;
    private Button btnFuente;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hardware);
        btnVolver = (Button)findViewById(R.id.btnVolver);
        btnFuente = (Button)findViewById(R.id.btnFuente);

        btnVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HardwareActivity.this, MenuActivity.class));
                finish();
            }
        });
        btnFuente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HardwareActivity.this, problemah_uno.class));
            }
        });
    }
}
