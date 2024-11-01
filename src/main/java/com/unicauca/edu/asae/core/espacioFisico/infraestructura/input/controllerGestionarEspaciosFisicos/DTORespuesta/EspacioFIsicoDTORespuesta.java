package com.unicauca.edu.asae.core.espacioFisico.infraestructura.input.controllerGestionarEspaciosFisicos.DTORespuesta;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class EspacioFIsicoDTORespuesta {
    private Integer id;
    private String nombre;
    private int capacidad;
}
