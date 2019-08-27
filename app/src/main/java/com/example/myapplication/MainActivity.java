package com.example.myapplication;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {

    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("Login");

        mAuth = FirebaseAuth.getInstance();


        Button login = (Button) findViewById(R.id.btn_login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //ssss

                EditText et_email = (EditText) findViewById(R.id.main_email);
                EditText et_senha = (EditText) findViewById(R.id.main_senha);
                String email = et_email.getText().toString();
                String senha = et_senha.getText().toString();

                Toast.makeText(MainActivity.this,"Acessando conta",Toast.LENGTH_LONG).show();

                mAuth.signInWithEmailAndPassword(email,senha).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {

                        if (task.isSuccessful()){

                            Intent vai_pro_test = new Intent(MainActivity.this, test.class);
                            startActivity(vai_pro_test);

                        }



                    }
                });


            }
        });



    }
}
