package com.obtenerdiploma.obterner_diploma.Entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Diploma {
    private String mensaje;
    private double promedio;
    private Alumno alumno;
}
