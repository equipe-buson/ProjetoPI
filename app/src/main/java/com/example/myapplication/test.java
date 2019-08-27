package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.List;

public class test extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    final FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference ref = database.getReference("https://loginfire-23a07.firebaseio.com/");
mot moto= new mot();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);




        Button botao = (Button) findViewById(R.id.btn_iniciar);
        EditText etNome = (EditText) findViewById(R.id.nome_motorista);
        EditText etNumeroOnibus = (EditText) findViewById(R.id.numero_onibus);
        Spinner etLinha = (Spinner) findViewById(R.id.linha);




        final String nome = etNome.getText().toString();
        final String numerobus = etNumeroOnibus.getText().toString();

        setTitle("Motorista");

        // Spinner element
        Spinner spinner = (Spinner) findViewById(R.id.linha);

        // Spinner click listener
        spinner.setOnItemSelectedListener(this);

        // Spinner Drop down elements
        List<String> categories = new ArrayList<String>();
        categories.add("Terminal - Bela vista");
        categories.add("Bela Vista - Terminal");
        categories.add("Terminal - Poço Grande");
        categories.add("Poço Grande - Terminal");

        String linha = spinner.toString();


        // Creating adapter for spinner
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories);

        // Drop down layout style - list view with radio button
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        spinner.setAdapter(dataAdapter);

        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                DatabaseReference postRef = ref.child("/motorista/ygENNIxo7K9zfB9i1icJ");
                postRef.child("motota").child("12345");


                Toast.makeText(test.this,"Iniciando",Toast.LENGTH_SHORT).show();


            }
        });

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        // On selecting a spinner item
        String item = parent.getItemAtPosition(position).toString();

    }
    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub
    }
}

