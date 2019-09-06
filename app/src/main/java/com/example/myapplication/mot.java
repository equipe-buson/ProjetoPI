package com.example.myapplication;

import java.lang.reflect.Array;

public class mot {

    private String nomeMotorista;
    private String numMotorista;
    private String linha;
    private String coordenadas;

    public mot() {
        this.nomeMotorista = nomeMotorista;
        this.numMotorista = numMotorista;
        this.linha = linha;
        this.coordenadas = coordenadas;
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
