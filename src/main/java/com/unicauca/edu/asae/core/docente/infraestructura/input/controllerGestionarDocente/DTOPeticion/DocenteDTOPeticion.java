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
    @NotNull
    @Size(min = 5, max = 45)
    private String nombre;
    @NotNull
    @Size(min = 5, max = 45)
    private String apellido;
    @Email
    @NotNull
    private String correo;
    
    @Valid
    private OficinaDTOPeticion oficinaAsignada;
}
