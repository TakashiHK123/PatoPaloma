package com.example.pato.paloma.patopaloma.entity;

import com.example.pato.paloma.patopaloma.interfaces.Oviparos;

public class Paloma implements Oviparos {

    private int idPaloma;
    private String paloma;


    @Override
    public String moverse() {
        return "moverse paloma";
    }

    @Override
    public void dormir() {

    }

    @Override
    public void comer() {

    }

    @Override
    public void cazarCielo() {

    }

    public Paloma() {
    }

    public Paloma(int idPaloma, String paloma) {
        this.idPaloma = idPaloma;
        this.paloma = paloma;
    }

    public int getIdPaloma() {
        return idPaloma;
    }

    public void setIdPaloma(int idPaloma) {
        this.idPaloma = idPaloma;
    }

    public String getPaloma() {
        return paloma;
    }

    public void setPaloma(String paloma) {
        this.paloma = paloma;
    }

    @Override
    public String toString() {
        return "Paloma{" +
                "idPaloma=" + idPaloma +
                ", paloma='" + paloma + '\'' +
                '}';
    }
}
