package com.unicauca.edu.asae.core.franjasHorarias.dominio.modelos;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Asignatura {
    private Integer id;
    private String nombre;
    private String codigo;
    private List<Curso>listaCursos=new ArrayList<>();

    public Asignatura(String nombre,String codigo){
        this.nombre=nombre;
        this.codigo=codigo;
    }
}
