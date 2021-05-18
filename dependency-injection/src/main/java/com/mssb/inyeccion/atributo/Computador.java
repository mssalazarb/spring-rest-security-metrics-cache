package com.mssb.inyeccion.atributo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author mssalazarb
 */
@Data
@Component
public class Computador {
    @Value("Lenovo")
    private String marca;
    @Value("545")
    private Integer modelo;

    @Autowired
    private Procesador procesador;
}
