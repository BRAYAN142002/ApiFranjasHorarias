package com.unicauca.edu.asae.core.docente.dominio.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Oficina {
    private Integer id;
    private String nombre;
    private String ubicacion;
    private Docente objDocente;
}
