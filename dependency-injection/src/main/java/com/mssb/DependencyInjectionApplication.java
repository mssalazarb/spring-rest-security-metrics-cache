package com.mssb;

import com.mssb.inyeccion.atributo.Carro;
import com.mssb.inyeccion.atributo.Computador;
import com.mssb.inyeccion.atributo.Motor;
import com.mssb.inyeccion.constructor.Celular;
import com.mssb.inyeccion.setter.Impresora;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DependencyInjectionApplication {

    private static final Logger log = LoggerFactory.getLogger(DependencyInjectionApplication.class);

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DependencyInjectionApplication.class, args);

        // Crear objeto sin Inyeccion de dependencias
        Motor motor = new Motor("XL1", 1991);
        Carro carro = new Carro("Renault", 1985, motor);
        log.info("Objecto sin Inyeccion de dependencias: {}", carro);

        // Crear objeto con Inyeccion de dependencias por atributo
        Computador compu = context.getBean(Computador.class);
        log.info("Objecto con Inyeccion de dependencias por atributo: {}", compu);

        // Crear objeto con Inyeccion de dependencias por constructor
        Celular movil = context.getBean(Celular.class);
        log.info("Objecto con Inyeccion de dependencias por constructor: {}", movil);

        // Crear objeto con Inyeccion de dependencias por setter
        Impresora imp = context.getBean(Impresora.class);
        log.info("Objecto con Inyeccion de dependencias por setters: {}", imp);
    }

}
