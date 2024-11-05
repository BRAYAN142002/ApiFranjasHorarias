package com.unicauca.edu.asae.core.franjasHorarias.infraestructura.input.controllerFranjaHoraria.DTORespuesta;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class EspacioFisicoDTORespuesta {
    private Integer idEspacioFisico;
    private String nombre;
    private int capacidad;
    
}
