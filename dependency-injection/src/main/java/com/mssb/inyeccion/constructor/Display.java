package com.mssb.inyeccion.constructor;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author mssalazarb
 */
@Data
@Component
public class Display {
    private String marca;
    private Integer modelo;

    public Display(@Value("Vantage") String marca, @Value("345") Integer modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
}
