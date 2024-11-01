package com.unicauca.edu.asae.core.docente.aplicacion.output;


import com.unicauca.edu.asae.core.docente.dominio.models.Docente;


public interface IGestionarDocenteGatewayPort {

    public boolean existeDocentePorCorreo(String correo);

    public Docente guardar(Docente objDocente);
}
