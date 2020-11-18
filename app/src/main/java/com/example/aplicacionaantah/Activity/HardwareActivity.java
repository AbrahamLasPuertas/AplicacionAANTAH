package com.example.aplicacionaantah.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.aplicacionaantah.R;
import com.example.aplicacionaantah.hardware.problemah_cinco;
import com.example.aplicacionaantah.hardware.problemah_cuatro;
import com.example.aplicacionaantah.hardware.problemah_diez;
import com.example.aplicacionaantah.hardware.problemah_dos;
import com.example.aplicacionaantah.hardware.problemah_nueve;
import com.example.aplicacionaantah.hardware.problemah_ocho;
import com.example.aplicacionaantah.hardware.problemah_seis;
import com.example.aplicacionaantah.hardware.problemah_siete;
import com.example.aplicacionaantah.hardware.problemah_tres;
import com.example.aplicacionaantah.hardware.problemah_uno;

public class HardwareActivity  extends AppCompatActivity {

    private Button btnVolver;
    private Button btnFuente;
    private Button btnGrafica;
    private Button btnRam;
    private Button btnPlaca;
    private Button btnDisco;
    private Button btnVentilacion;
    private Button btnProcesador;
    private Button btnTeclado;
    private Button btnRaton;
    private  Button btnConexiones;

    @Override
    protected void onCreate(@Nullable final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hardware);
        btnVolver = (Button)findViewById(R.id.btnVolver);
        btnFuente = (Button)findViewById(R.id.btnFuente);
        btnGrafica = (Button)findViewById(R.id.btnGrafica);
        btnRam = (Button)findViewById(R.id.btnRam);
        btnPlaca = (Button)findViewById(R.id.btnPlaca);
        btnDisco = (Button)findViewById(R.id.btnDisco);
        btnProcesador = (Button)findViewById(R.id.btnProcesador);
        btnTeclado = (Button)findViewById(R.id.btnTeclado);
        btnRaton = (Button)findViewById(R.id.btnRaton);
        btnVentilacion = (Button)findViewById(R.id.btnVentilacion);
        btnConexiones = (Button)findViewById(R.id.btnConexion);

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
                finish();
            }
        });
        btnGrafica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HardwareActivity.this, problemah_dos.class));
                finish();
            }
        });
        btnRam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HardwareActivity.this, problemah_tres.class));
                finish();
            }
        });
        btnPlaca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HardwareActivity.this, problemah_cuatro.class));
                finish();
            }
        });
        btnDisco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HardwareActivity.this, problemah_cinco.class));
                finish();
            }
        });
        btnVentilacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HardwareActivity.this, problemah_seis.class));
                finish();
            }
        });
        btnProcesador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HardwareActivity.this, problemah_siete.class));
                finish();
            }
        });
        btnTeclado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HardwareActivity.this, problemah_ocho.class));
                finish();
            }
        });
        btnRaton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HardwareActivity.this, problemah_nueve.class));
                finish();
            }
        });
        btnConexiones.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HardwareActivity.this, problemah_diez.class));
                finish();
            }
        });
    }
}
