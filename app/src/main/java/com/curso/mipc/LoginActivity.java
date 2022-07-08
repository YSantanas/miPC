package com.curso.mipc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    EditText editNickL,editPassL;
    Button btnIniciarL;

    String nombre,contrasenia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);



        editNickL=findViewById(R.id.editNombre);
        editPassL=findViewById(R.id.editPass);
        btnIniciarL=findViewById(R.id.btnIniciarL);

        btnIniciarL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                validarCampos();
                //Tools.nextActivity(menu.class, login.this);

            }
        });
    }

    //funcion de validacion
    public void validarCampos(){
        nombre= editNickL.getText().toString();
        contrasenia= editPassL.getText().toString();



        if(nombre!=null &&nombre.length()!=0 ){


        }else{
            editNickL.setError("Nombre Vacio");
            return;
        }
        if(contrasenia!=null && contrasenia.length()!=0){

        }else{
            editPassL.setError("Contraseña Vacia");
            return;
        }

        Intent inicio = new Intent(LoginActivity.this, InicioActivity.class);
        startActivity(inicio);
        //Herramientas.nextActivity(CatalogoActivity.class, LoginActivity.this);

    }

}