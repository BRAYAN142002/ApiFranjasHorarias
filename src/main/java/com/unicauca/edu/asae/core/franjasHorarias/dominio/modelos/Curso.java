package com.unicauca.edu.asae.core.franjasHorarias.dominio.modelos;

import java.util.List;

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
    private List<FranjaHoraria> franjasHorarias;
    private Asignatura objAsignatura;
}
