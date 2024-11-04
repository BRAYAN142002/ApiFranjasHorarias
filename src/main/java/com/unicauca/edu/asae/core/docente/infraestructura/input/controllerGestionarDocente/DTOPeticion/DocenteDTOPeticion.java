package com.unicauca.edu.asae.core.docente.infraestructura.input.controllerGestionarDocente.DTOPeticion;


import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class DocenteDTOPeticion {
    @NotNull(message = "{docente.nombre.emply}")
    @Size(min = 5, max = 45, message = "{docente.nombre.size}")
    private String nombre;
    @NotNull(message = "{docente.apellido.emply}")
    @Size(min = 5, max = 45, message = "{docente.nombre.size}")
    private String apellido;
    @Email
    @NotNull
    private String correo;
    
    @Valid
    private OficinaDTOPeticion oficinaAsignada;
}
