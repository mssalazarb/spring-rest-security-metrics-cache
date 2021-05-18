package com.mssb.inyeccion.constructor;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author mssalazarb
 */
@Data
@Component
public class Celular {

    private String marca;
    private Integer modelo;
    private Display display;

    @Autowired
    public Celular(@Value("Xiaomi") String marca, @Value("34") Integer modelo, Display display) {
        this.marca = marca;
        this.modelo = modelo;
        this.display = display;
    }
}
