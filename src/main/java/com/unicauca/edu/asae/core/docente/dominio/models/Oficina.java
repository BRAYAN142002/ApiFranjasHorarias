package com.unicauca.edu.asae.core.docente.dominio.models;

import lombok.AllArgsConstructor;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Oficina {
    private Integer id;
    private String nombre;
    private String ubicacion;
    private Docente objDocente;

    public Oficina(String nombre,String ubicacion){
        this.nombre=nombre;
        this.ubicacion=ubicacion;
    }
}
