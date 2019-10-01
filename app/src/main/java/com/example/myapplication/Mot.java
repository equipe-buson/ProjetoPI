package com.example.myapplication;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Mot {


    FirebaseDatabase firebaseDatabase;
    DatabaseReference ref;

    private void incializarFireBase() {

        firebaseDatabase = FirebaseDatabase.getInstance();
        ref = firebaseDatabase.getReference();
    }


    private String nomeMotorista;
    private String numMotorista;
    private String linha;
    private String coordenadas;
    private Double latitude;
    private  Double longitude;

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Mot() {
        this.nomeMotorista = nomeMotorista;
        this.numMotorista = numMotorista;
        this.linha = linha;
        this.coordenadas = coordenadas;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    private Array categorias;

    public String getCoordenadas() {
        return coordenadas;
    }

    public void setCoordenadas(String coordenadas) {
        this.coordenadas = coordenadas;
    }

    public String getNomeMotorista() {
        return nomeMotorista;
    }

    public void setNomeMotorista(String nomeMotorista) {
        this.nomeMotorista = nomeMotorista;
    }

    public String getNumMotorista() {
        return numMotorista;
    }

    public void setNumMotorista(String numMotorista) {
        this.numMotorista = numMotorista;
    }

    public String getLinha() {
        return linha;
    }

    public void setLinha(String linha) {
        this.linha = linha;
    }




}
