package com.example.aplicacionaantah.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.aplicacionaantah.R;
import com.example.aplicacionaantah.software.problema_uno;

public class SoftwareActivity  extends AppCompatActivity {
    private Button btnArranque;
    private Button btnVolver;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_software);
        btnArranque = (Button)findViewById(R.id.btnArranque);
        btnVolver = (Button)findViewById(R.id.btnVolver);

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

    }
}
