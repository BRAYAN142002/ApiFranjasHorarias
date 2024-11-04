package com.unicauca.edu.asae.core.franjasHorarias.infraestructura.input.controllerAsignatura.DTOPeticion;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class AsignaturaDTOPeticion {

    @NotNull
    @Size(min = 5, max = 10)
    private String nombre;
    @NotNull
    @Size(min = 5, max = 10)
    private String codigo;

}
