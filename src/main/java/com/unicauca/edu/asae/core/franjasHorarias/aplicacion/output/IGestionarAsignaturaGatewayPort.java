package com.unicauca.edu.asae.core.franjasHorarias.aplicacion.output;

import com.unicauca.edu.asae.core.franjasHorarias.dominio.modelos.Asignatura;

public interface IGestionarAsignaturaGatewayPort {
    public boolean existeAsignaturaPorCodigo(String codigo);
    public Asignatura guardar(Asignatura objAsignatura);
}
