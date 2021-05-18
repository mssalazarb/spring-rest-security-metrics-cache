package com.mssb.inyeccion.atributo;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author mssalazarb
 */
@Data
@AllArgsConstructor
public class Carro {
    private String marca;
    private Integer modelo;

    private Motor motor;
}
