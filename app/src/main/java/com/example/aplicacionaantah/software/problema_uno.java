package com.example.aplicacionaantah.software;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.aplicacionaantah.Activity.SoftwareActivity;
import com.example.aplicacionaantah.R;

public class problema_uno extends AppCompatActivity {
    private Button btnVolver;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sproblemauno);
        btnVolver = (Button)findViewById(R.id.btnVolver);

        btnVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(problema_uno.this, SoftwareActivity.class));
                finish();
            }
        });

    }
}
