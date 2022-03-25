package com.example.pato.paloma.patopaloma.entity;

import com.example.pato.paloma.patopaloma.interfaces.Oviparos;

public class Pato implements Oviparos {
    private int idPato;
    private int peso;
    private int patas;

    public Pato() {
    }

    @Override
    public void cazarCielo() {

    }

    @Override
    public void comer() {

    }

    @Override
    public void dormir() {

    }

    @Override
    public String moverse() {
        return "moverse pato";
    }

    public Pato(int idPato, int peso, int patas) {
        this.idPato = idPato;
        this.peso = peso;
        this.patas = patas;
    }

    public int getIdPato() {
        return idPato;
    }

    public void setIdPato(int idPato) {
        this.idPato = idPato;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    @Override
    public String toString() {
        return "Pato{" +
                "idPato=" + idPato +
                ", peso=" + peso +
                ", patas=" + patas +
                '}';
    }
}
