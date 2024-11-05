package com.unicauca.edu.asae.core.espacioFisico.dominio.modelos;


import java.util.ArrayList;
import java.util.List;

import com.unicauca.edu.asae.core.franjasHorarias.dominio.modelos.FranjaHoraria;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EspacioFisico {
   
    private Integer id;
    private String nombre;
    private int capacidad;
    private List<FranjaHoraria> listaFranjasHorarias=new ArrayList<>();

    public EspacioFisico(String nombre,int capacidad){
        this.nombre=nombre;
        this.capacidad=capacidad;
    }
}
