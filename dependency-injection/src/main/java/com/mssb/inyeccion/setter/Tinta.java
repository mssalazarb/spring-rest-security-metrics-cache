package com.mssb.inyeccion.setter;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author mssalazarb
 */
@Component
public class Tinta {
    private String marca;
    private Integer modelo;

    public Tinta() {
    }

    public String getMarca() {
        return marca;
    }

    @Value("Canon TYi")
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Integer getModelo() {
        return modelo;
    }

    @Value("123")
    public void setModelo(Integer modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Tinta(marca=" + marca + ", modelo=" + modelo + ")";
    }
}
