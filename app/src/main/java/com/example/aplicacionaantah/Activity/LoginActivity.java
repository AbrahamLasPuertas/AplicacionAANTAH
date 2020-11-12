package com.example.aplicacionaantah.Activity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import com.example.aplicacionaantah.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class LoginActivity extends AppCompatActivity {

    private EditText txtCorreo, txtContra;
    private Button btnLogin, btnRegistro;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        txtCorreo = (EditText) findViewById(R.id.idCorreoLogin);
        txtContra = (EditText) findViewById(R.id.idContraLogin);
        btnLogin = (Button) findViewById(R.id.idLoginLogin);
        btnRegistro = (Button)findViewById(R.id.idRegistroLogin);

        mAuth = FirebaseAuth.getInstance();

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String correo = txtCorreo.getText().toString();
                if (isValidEmail(correo)){
                    if (validarContraseña()) {
                        String contraseña = txtContra.getText().toString();
                        mAuth.signInWithEmailAndPassword(correo, contraseña)
                                .addOnCompleteListener(LoginActivity.this, new OnCompleteListener<AuthResult>() {
                                    @Override
                                    public void onComplete(@NonNull Task<AuthResult> task) {
                                        if (task.isSuccessful()) {
                                            // Sign in success, update UI with the signed-in user's information
                                            Toast.makeText(LoginActivity.this, "Logeado Correctamente", Toast.LENGTH_SHORT).show();
                                            nextActivity();

                                        } else {
                                            // If sign in fails, display a message to the user.
                                            Toast.makeText(LoginActivity.this, "Error Intentalo Nuevamente", Toast.LENGTH_SHORT).show();

                                        }
                                    }
                                });

                    }else {
                        Toast.makeText(LoginActivity.this, "Ingresa una Contraseña Valida", Toast.LENGTH_SHORT).show();
                    }
                }else {
                    Toast.makeText(LoginActivity.this, "Ingresa un Correo Valido", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnRegistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this, RegistroActivity.class));
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
        String contra;
        contra = txtContra.getText().toString();
            if (contra.length()>=6 && contra.length()<=16){
                return true;
            }else{
                Toast.makeText(LoginActivity.this, "Recuerda que tu contraseña debe ser de minimo 6 digitos y maximo 16", Toast.LENGTH_SHORT).show();
                return false;
            }
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        FirebaseUser currentUser = mAuth.getCurrentUser();
        if(currentUser!=null){
            Toast.makeText(LoginActivity.this, "Bienvenido", Toast.LENGTH_SHORT).show();
            nextActivity();
        }
    }
    private void nextActivity(){
        startActivity(new Intent(LoginActivity.this, MenuActivity.class));
        finish();
    }
}
