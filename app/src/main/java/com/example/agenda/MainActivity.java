package com.example.agenda;
//David Arranz Montejano
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //declaracion de variables
    EditText etNom,etDir,etTel,etEmail,etEmp;
    Button bAdd,bDel,bCall;
    TextView tvOutPut;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //asignacion de variables
        etNom = (EditText) findViewById(R.id.editTextNomAp);
        etDir = (EditText) findViewById(R.id.editTextDireccion);
        etTel = (EditText) findViewById(R.id.editTextTel);
        etEmail = (EditText) findViewById(R.id.editTextEmail);
        etEmp = (EditText) findViewById(R.id.editTextEmpresa);
        bAdd =(Button) findViewById(R.id.buttonAdd);
        bDel =(Button) findViewById(R.id.buttonDel);
        bCall =(Button) findViewById(R.id.buttonCall);
        tvOutPut=(TextView) findViewById(R.id.textViewOutPut);

        //add coge el texto en los Edit Text y lo asigna al textview
        bAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nomAp,dir,tel,mail,emp;
                nomAp=etNom.getText().toString();
                dir=etDir.getText().toString();
                tel=etTel.getText().toString();
                if(tel.contains("T")||tel.contains("e")||tel.contains("l")){//si no ha borrado Tel
                    tel="";//Se queda vacio
                }
                mail=etEmail.getText().toString();
                emp=etEmp.getText().toString();
                //Se añade todo a tvOutput
                tvOutPut.setText("Nombre y Apellidos: "+ nomAp+
                        "\nTel :"+tel+
                        "\nEmail: "+mail+
                        "\nDireccion: "+dir+
                        "\nEmpresa :"+emp);
            }
        });
        //saca el toast cuando clicas el boton de eliminar
        bDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"¿Esta seguro de que desea eliminar el contacto?",Toast.LENGTH_SHORT).show();
            }
        });
        //saca el toast con el boton de llamar
        bCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Va a llamar a "+etNom.getText().toString(),Toast.LENGTH_SHORT).show();
            }
        });
    }
}