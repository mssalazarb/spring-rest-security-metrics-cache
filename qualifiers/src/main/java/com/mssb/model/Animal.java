package com.mssb.model;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author mssalazarb
 */
@Data
@AllArgsConstructor
public abstract class Animal {
    private String nombre;
    private Integer edad;
}
