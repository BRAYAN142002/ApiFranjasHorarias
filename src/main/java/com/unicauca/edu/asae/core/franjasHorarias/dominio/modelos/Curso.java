package com.unicauca.edu.asae.core.franjasHorarias.dominio.modelos;

import java.util.ArrayList;
import java.util.List;



import com.unicauca.edu.asae.core.docente.dominio.models.Docente;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Curso {
    private Integer id;
    private String nombre;
    private List<FranjaHoraria> listaFranjasHorarias =new ArrayList<>();
    private Asignatura objAsignatura;
    private List<Docente> listaDocentes= new ArrayList<>();
    public Curso(String nombre){
        this.nombre=nombre;
    }
}
