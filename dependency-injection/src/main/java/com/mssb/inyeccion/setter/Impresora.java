package com.mssb.inyeccion.setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author mssalazarb
 */
@Component
public class Impresora {
    private String marca;
    private Integer modelo;
    private Tinta tinta;

    public Impresora() {
    }

    public String getMarca() {
        return marca;
    }

    @Value("Canon")
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Integer getModelo() {
        return modelo;
    }

    @Value("567")
    public void setModelo(Integer modelo) {
        this.modelo = modelo;
    }

    public Tinta getTinta() {
        return tinta;
    }

    @Autowired
    public void setTinta(Tinta tinta) {
        this.tinta = tinta;
    }

    @Override
    public String toString() {
        return "Impresora(marca=" + marca + ", modelo=" + modelo + ", tinta=" + tinta + ")";
    }
}
