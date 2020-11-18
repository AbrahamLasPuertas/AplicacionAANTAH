package com.example.aplicacionaantah.hardware;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.TaskStackBuilder;

import com.example.aplicacionaantah.Activity.HardwareActivity;
import com.example.aplicacionaantah.R;

public class problemah_tres extends AppCompatActivity {
    private Button btnVolver;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hproblematres);
        btnVolver = (Button)findViewById(R.id.btnVolver);

        btnVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(problemah_tres.this, HardwareActivity.class));
                finish();
            }
        });
    }
}
