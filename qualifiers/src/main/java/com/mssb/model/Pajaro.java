package com.mssb.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author mssalazarb
 */
@Component
public class Pajaro extends Animal implements Volador {

    private static final Logger log = LoggerFactory.getLogger(Pajaro.class);

    public Pajaro(@Value("Petry") String nombre, @Value("5") Integer edad) {
        super(nombre, edad);
    }

    @Override
    public void volar() {
        log.info("Soy un pajaro y estoy volando");
    }
}
