package com.unicauca.edu.asae.core.docente.infraestructura.input.controllerGestionarDocente.DTORespuesta;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DocenteDTORespuesta {
    private Integer id;
    private String nombre;
    private String apellido;
    private String correo;
    private OficinaDTORespuesta oficinaAsignada;
}
