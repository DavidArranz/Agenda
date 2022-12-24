package com.example.agenda;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

    public class SecondActivity extends AppCompatActivity {
        EditText etNombreAp,etTel,etEmail;
        ImageView ivImg;
        TextView tvTitulo;
        Button bSave;
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_second);
            Bundle extras = getIntent().getExtras();
            etNombreAp = findViewById(R.id.editTextNomAp);
            etTel = findViewById(R.id.editTextTel);
            etEmail = findViewById(R.id.editTextEmail);
            tvTitulo = findViewById(R.id.textViewTitle);
            ivImg = findViewById(R.id.imageViewPerfilEdit);
            bSave = findViewById(R.id.buttonSave);

            if(extras.getString("accion").equals("add")){
                tvTitulo.setText("Añadir contacto");
                bSave.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String tel,email;
                        String [] nom = new String[2];
                        tel=etTel.getText().toString();
                        email = etEmail.getText().toString();
                        nom = etNombreAp.getText().toString().split(" ",2);
                        checkFields(nom,email,tel);

                    }
                });
            }else if(extras.getString("accion").equals("act")){
                tvTitulo.setText("Actualizar contacto");
            }
        }

        private void checkFields(String[] nom, String email, String tel) {

        }
    }
