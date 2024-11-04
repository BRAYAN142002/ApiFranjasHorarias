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
    @NotNull(message = "{oficina.nombre.emply}")
    @Size(min = 5, max = 45, message = "{oficina.nombre.size}")
    private String nombre;
    @NotNull(message = "{oficina.ubicacion.emply}")
    @Size(min = 5, max = 55, message = "{oficina.nombre.size}")
    private String ubicacion;
}
