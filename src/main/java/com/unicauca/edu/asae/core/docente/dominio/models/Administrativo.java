package com.unicauca.edu.asae.core.docente.dominio.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Administrativo extends Persona {
    private String rol;
    public Administrativo(String nombre, String apellido,String correo, String rol){
        super(nombre,apellido,correo);
        this.rol=rol;
    }

}
