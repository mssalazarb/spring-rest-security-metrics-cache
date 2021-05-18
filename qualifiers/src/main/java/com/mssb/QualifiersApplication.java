package com.mssb;

import com.mssb.model.Animal;
import com.mssb.model.Avion;
import com.mssb.model.Pajaro;
import com.mssb.model.Perro;
import com.mssb.qualifiers.Hogar;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class QualifiersApplication {

    private static final Logger log = LoggerFactory.getLogger(QualifiersApplication.class);

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(QualifiersApplication.class, args);

        Perro perro = context.getBean(Perro.class);
        log.info("Objecto Perro: {}", perro.getNombre());

        Pajaro pajaro = context.getBean(Pajaro.class);
        log.info("Objecto Pajaro: {}", pajaro.getNombre());

        Avion avion = context.getBean(Avion.class);
        avion.volar();

        Animal animal = context.getBean("pajaro", Animal.class);
        log.info("Objecto Animal con qualifier pajaro: {}", animal.getNombre());

        Animal animalQ = context.getBean("perro", Animal.class);
        log.info("Objecto Animal con qualifier perro: {}", animalQ.getNombre());

        Hogar hogar = context.getBean(Hogar.class);
        hogar.imprimirAnimal();
    }

}
