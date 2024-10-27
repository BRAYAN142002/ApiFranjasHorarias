package com.unicauca.edu.asae.core.docente.dominio.models;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
public class Docente extends Persona {
    private Oficina oficinaAsignada;
}
