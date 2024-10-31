package com.unicauca.edu.asae.core.docente.dominio.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Persona {
    private Integer id;
    private String nombre;
    private String apellido;
    private String correo;
    public Persona(String nombre,String apellido,String correo){
        this.nombre=nombre;
        this.apellido=apellido;
        this.correo=correo;

    }
}
