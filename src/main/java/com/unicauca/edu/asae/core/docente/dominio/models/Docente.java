package com.unicauca.edu.asae.core.docente.dominio.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Docente extends Persona {
    private Oficina oficinaAsignada;
    public Docente(Integer id, String nombre, String apellido, String correo, Oficina oficinaAsignada) {
        super(id, nombre, apellido, correo);
        this.oficinaAsignada = oficinaAsignada;
    }
}
