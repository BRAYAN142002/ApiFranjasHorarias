package com.unicauca.edu.asae.core.docente.aplicacion.output;

import com.unicauca.edu.asae.core.docente.dominio.models.Docente;

public interface IGestionarDocenteGatewayPort {

    public boolean existeDocentePorId(Integer id);

    public Docente guardar(Docente objDocente);
}
