package com.example.aplicacionaantah.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.aplicacionaantah.R;
import com.example.aplicacionaantah.software.problema_catorce;
import com.example.aplicacionaantah.software.problema_cinco;
import com.example.aplicacionaantah.software.problema_cuatro;
import com.example.aplicacionaantah.software.problema_diez;
import com.example.aplicacionaantah.software.problema_doce;
import com.example.aplicacionaantah.software.problema_dos;
import com.example.aplicacionaantah.software.problema_nueve;
import com.example.aplicacionaantah.software.problema_ocho;
import com.example.aplicacionaantah.software.problema_once;
import com.example.aplicacionaantah.software.problema_seis;
import com.example.aplicacionaantah.software.problema_siete;
import com.example.aplicacionaantah.software.problema_trece;
import com.example.aplicacionaantah.software.problema_tres;
import com.example.aplicacionaantah.software.problema_uno;

public class SoftwareActivity  extends AppCompatActivity {
    private Button btnArranque;
    private Button btnVolver;
    private Button btnRam;
    private Button btnBasura;
    private Button btnAzul;
    private Button btnAzuluno;
    private Button btnAzuldos;
    private Button btnAzultres;
    private Button btnAzulcuatro;
    private Button btnAzulcinco;
    private Button btnAzulseis;
    private Button btnAzulsiete;
    private Button btnConexion;
    private Button btnExterno;
    private Button btnVoltaje;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_software);
        btnArranque = (Button)findViewById(R.id.btnArranque);
        btnVolver = (Button)findViewById(R.id.btnVolver);
        btnRam = (Button)findViewById(R.id.btnRam);
        btnBasura = (Button)findViewById(R.id.btnBasura);
        btnAzul = (Button)findViewById(R.id.btnAzul);
        btnAzuluno = (Button)findViewById(R.id.btnAzuluno);
        btnAzuldos = (Button)findViewById(R.id.btnAzuldos);
        btnAzultres = (Button)findViewById(R.id.btnAzultres);
        btnAzulcuatro = (Button)findViewById(R.id.btnAzulcuatro);
        btnAzulcinco = (Button)findViewById(R.id.btnAzulcinco);
        btnAzulseis = (Button)findViewById(R.id.btnAzulseis);
        btnAzulsiete = (Button)findViewById(R.id.btnAzulsiete);
        btnConexion = (Button)findViewById(R.id.btnConexion);
        btnExterno = (Button)findViewById(R.id.btnExterno);
        btnVoltaje = (Button)findViewById(R.id.btnVoltaje);


        btnVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SoftwareActivity.this, MenuActivity.class));
                finish();
            }
        });

        btnArranque.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SoftwareActivity.this, problema_uno.class));
                finish();
            }
        });
        btnRam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SoftwareActivity.this, problema_dos.class));
                finish();
            }
        });
        btnBasura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SoftwareActivity.this, problema_tres.class));
                finish();
            }
        });
        btnAzul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SoftwareActivity.this, problema_cuatro.class));
                finish();
            }
        });
        btnAzuluno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SoftwareActivity.this, problema_cinco.class));
                finish();
            }
        });
        btnAzuldos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SoftwareActivity.this, problema_seis.class));
                finish();
            }
        });
        btnAzultres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SoftwareActivity.this, problema_siete.class));
                finish();
            }
        });
        btnAzulcuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SoftwareActivity.this, problema_ocho.class));
                finish();
            }
        });
        btnAzulcinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SoftwareActivity.this, problema_nueve.class));
                finish();
            }
        });
        btnAzulseis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SoftwareActivity.this, problema_diez.class));
                finish();
            }
        });
        btnAzulsiete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SoftwareActivity.this, problema_once.class));
                finish();
            }
        });
        btnConexion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SoftwareActivity.this, problema_doce.class));
                finish();
            }
        });
        btnExterno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SoftwareActivity.this, problema_trece.class));
                finish();
            }
        });
        btnVoltaje.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SoftwareActivity.this, problema_catorce.class));
                finish();
            }
        });


    }
}
