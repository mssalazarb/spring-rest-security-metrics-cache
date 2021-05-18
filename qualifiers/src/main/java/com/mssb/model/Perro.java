package com.mssb.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author mssalazarb
 */
@Component
public class Perro extends Animal {

    public Perro(@Value("Hachi") String nombre, @Value("9") Integer edad) {
        super(nombre, edad);
    }
}
