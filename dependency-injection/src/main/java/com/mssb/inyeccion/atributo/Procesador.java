package com.mssb.inyeccion.atributo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author mssalazarb
 */
@Data
@Component
public class Procesador {
    @Value("Intel Core")
    private String marca;
    @Value("7")
    private Integer modelo;
}
