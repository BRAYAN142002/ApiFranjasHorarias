package com.unicauca.edu.asae.core.docente.dominio.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Docente extends Persona {
    private Oficina objOficina;
    public Docente(String nombre,String apellido,String correo){
        super(nombre,apellido,correo);
    }
   
}
