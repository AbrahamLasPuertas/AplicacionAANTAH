package com.example.aplicacionaantah.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.aplicacionaantah.Entidades.Usuario;
import com.example.aplicacionaantah.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class RegistroActivity extends AppCompatActivity {

    private EditText txtNombre, txtCorreo, txtContra, txtContraRepetir;
    private Button btnRegistrar, btnVolver;
    private FirebaseAuth mAuth;

    private FirebaseDatabase database;
    private DatabaseReference referenceUsuarios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        txtNombre = (EditText)findViewById(R.id.RegistroNombre);
        txtCorreo = (EditText)findViewById(R.id.RegistroCorreo);
        txtContra = (EditText)findViewById(R.id.RegistroContra);
        txtContraRepetir = (EditText)findViewById(R.id.RegistroContraRepetir);
        btnRegistrar = (Button)findViewById(R.id.RegistroRegistrar);
        btnVolver = (Button)findViewById(R.id.RegistroVolver);

        mAuth = FirebaseAuth.getInstance();
        database = FirebaseDatabase.getInstance();
        referenceUsuarios = database.getReference("Usuarios");

        btnRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String correo = txtCorreo.getText().toString();
                final String nombre = txtNombre.getText().toString();
                if (validarNombre(nombre)) {
                    if (isValidEmail(correo)) {
                        if (validarContraseña()) {
                            final String contra = txtContra.getText().toString();
                            mAuth.createUserWithEmailAndPassword(correo, contra)
                                    .addOnCompleteListener(RegistroActivity.this, new OnCompleteListener<AuthResult>() {
                                        @Override
                                        public void onComplete(@NonNull Task<AuthResult> task) {
                                            if (task.isSuccessful()) {
                                                Toast.makeText(RegistroActivity.this, "Registro exitoso ", Toast.LENGTH_SHORT).show();
                                                Usuario usuario = new Usuario();
                                                usuario.setCorreo(correo);
                                                usuario.setNombre(nombre);
                                                usuario.setContraseña(contra);
                                                FirebaseUser currentUser = mAuth.getCurrentUser();
                                                DatabaseReference reference = database.getReference("Usuarios/"+currentUser.getUid());
                                                reference.setValue(usuario);
                                                finish();

                                            } else {
                                                Toast.makeText(RegistroActivity.this, "Error al registrarse", Toast.LENGTH_SHORT).show();
                                            }
                                        }
                                    });
                        } else {
                            Toast.makeText(RegistroActivity.this, "ingresa una contraseña valida", Toast.LENGTH_SHORT).show();
                        }
                    } else {
                        Toast.makeText(RegistroActivity.this, "ingresa un correo valido", Toast.LENGTH_SHORT).show();
                    }

                }else{
                    Toast.makeText(RegistroActivity.this, "ingresa un nombre valido", Toast.LENGTH_SHORT).show();
                }
            }
        });
    btnVolver.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            startActivity(new Intent(RegistroActivity.this, LoginActivity.class));
            finish();
        }
    });


    }
    private boolean isValidEmail(CharSequence target) {
        if (TextUtils.isEmpty(target)) {
            return false;
        } else {
            return android.util.Patterns.EMAIL_ADDRESS.matcher(target).matches();
        }
    }

    public boolean validarContraseña(){
        String contra, contraRepetir;

        contra = txtContra.getText().toString();
        contraRepetir = txtContraRepetir.getText().toString();
        if(contra.equals(contraRepetir)){
            if (contra.length()>=6 && contra.length()<=16){
                return true;
            }else{
                Toast.makeText(RegistroActivity.this, "Recuerda que tu contraseña debe ser de minimo 6 digitos y maximo 16", Toast.LENGTH_SHORT).show();
                return false;
            }
        }else{
            Toast.makeText(RegistroActivity.this, "La contraseña debe ser la misma", Toast.LENGTH_SHORT).show();
            return false;
        }
    }

    public boolean validarNombre(String nombre){
        return !nombre.isEmpty();
    }

}
