package com.example.agenda;
//David Arranz Montejano
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    ContactAdapter adapter;
    FloatingActionButton bAdd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<Contact> contacts = new ArrayList() {};
        recyclerView = findViewById(R.id.recyclerView);
        adapter = new ContactAdapter(contacts);
        recyclerView.setAdapter(adapter);
        bAdd = findViewById(R.id.buttonAdd);

        bAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),SecondActivity.class);
                intent.putExtra("accion","add");
                startActivity(intent);
            }
        });
    }
}