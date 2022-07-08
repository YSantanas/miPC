package com.curso.mipc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.regex.Pattern;

public class RegistroActivity extends AppCompatActivity {
    EditText editNombre,editApellidos, editPassword,editEmail;
    Pattern correoP;
    String nombre,contrasenia,apellidos,correo;
    Button btnIniciarSR;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        correoP= Patterns.EMAIL_ADDRESS;
        //Asignamos valores

        editNombre= findViewById(R.id.editNombreR);
        editApellidos=findViewById(R.id.editApellidoR);
        editPassword=findViewById(R.id.editPassR);
        editEmail= findViewById(R.id.editCorreoR);

        btnIniciarSR= findViewById(R.id.btnRegistrar);


        btnIniciarSR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Asignamos valores
                nombre= editNombre.getText().toString();

                contrasenia= editPassword.getText().toString();
                apellidos= editApellidos.getText().toString();
                //
                correo= editEmail.getText().toString();

                if(nombre.length()==0){
                    editNombre.setError("Error NO dejar vacio");
                }else if(contrasenia.length()==0){
                    editPassword.setError("Error NO dejar vacio");
                }


                else if(correo.length()==0){

                    editEmail.setError("Falta Email");
                }        else if(!correoP.matcher(correo).matches()){
                    editEmail.setError("Error Email");

                }

                else if(apellidos.length()==0){
                    editApellidos.setError("Faltan Apellidos");
                }

                //correo=editEmail.getText().toString();
                Herramientas.nextActivity(InicioActivity.class, RegistroActivity.this);
            }


        });

    }
}