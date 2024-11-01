package com.unicauca.edu.asae.core.docente.infraestructura.input.controllerGestionarDocente.DTOPeticion;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class OficinaDTOPeticion {
    @NotNull
    @Size(min = 5, max = 45)
    private String nombre;
    @NotNull
    @Size(min = 5, max = 55)
    private String ubicacion;
}
