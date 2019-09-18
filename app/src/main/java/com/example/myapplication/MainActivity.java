package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import androidx.annotation.NonNull;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.material.textfield.TextInputEditText;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends Activity {

    private FirebaseAuth mAuth;
    private InterstitialAd mInterstitialAd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAuth = FirebaseAuth.getInstance();


        Button login = (Button) findViewById(R.id.btn_login);

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {}
        });

        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-3940256099942544/1033173712");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());



        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final EditText et_email = (EditText) findViewById(R.id.main_email);
                final TextInputEditText et_senha = (TextInputEditText) findViewById(R.id.main_senha);
                final String email = et_email.getText().toString().trim();
                final String senha = et_senha.getText().toString().trim();

                Toast.makeText(MainActivity.this,"Acessando conta",Toast.LENGTH_LONG).show();

                mAuth.signInWithEmailAndPassword(email,senha).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {

                        if (task.isSuccessful()){

                            Intent vai_pro_test = new Intent(MainActivity.this, Dados.class);
                            startActivity(vai_pro_test);

                            et_email.setText("");
                            et_senha.setText("");

                        }else{

                            Toast.makeText(MainActivity.this,"Email ou senha Incorretos",Toast.LENGTH_SHORT).show();

                        }
                    }
                });

            }
        });

    }
}
