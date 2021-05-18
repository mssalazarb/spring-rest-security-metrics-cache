package com.mssb.qualifiers;

import com.mssb.model.Animal;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Hogar {

    @Autowired
    @Qualifier("perro")
    private Animal perro;

    @Autowired
    @Qualifier("pajaro")
    private Animal pajaro;

    private static final Logger log = LoggerFactory.getLogger(Hogar.class);

    public void imprimirAnimal() {
        log.info("Mi hogar tiene un perro con nombre: {}", perro.getNombre());
        log.info("Mi hogar tiene un pajaro con nombre: {}", pajaro.getNombre());
    }
}
