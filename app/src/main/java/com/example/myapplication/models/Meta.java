package com.example.myapplication.models;

public class Meta {
    private String texto;
    private boolean concluida;

    public Meta(String texto) {
        this.texto = texto;
        this.concluida = false;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }
}
