package com.unicauca.edu.asae.core.espacioFisico.infraestructura.input.controllerGestionarEspaciosFisicos.DTOPeticion;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class EspacioFisicoDTOPeticion {
    private String nombre;
    private int capacidad;
}
