package com.unicauca.edu.asae.core.docente.dominio.models;

import java.util.ArrayList;
import java.util.List;

import com.unicauca.edu.asae.core.franjasHorarias.dominio.modelos.Curso;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Docente extends Persona {
    private Oficina oficinaAsignada;
    private List<Curso> listaCursos=new ArrayList<>();
    public Docente(Integer id, String nombre, String apellido, String correo, Oficina oficinaAsignada) {
        super(id, nombre, apellido, correo);
        this.oficinaAsignada = oficinaAsignada;
    }
}
