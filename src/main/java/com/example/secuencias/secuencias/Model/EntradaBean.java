package com.example.secuencias.secuencias.Model;


import com.fasterxml.jackson.annotation.JsonProperty;

public class EntradaBean {


    @JsonProperty("numero")
    private Integer numero;

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }


}
