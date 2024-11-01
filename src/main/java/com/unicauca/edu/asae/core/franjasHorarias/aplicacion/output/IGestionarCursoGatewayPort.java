package com.unicauca.edu.asae.core.franjasHorarias.aplicacion.output;

import java.util.Optional;

import com.unicauca.edu.asae.core.franjasHorarias.dominio.modelos.Curso;

public interface IGestionarCursoGatewayPort {
    Curso crear(Curso curso);
    Optional<Curso> obtenerCursoPorId(Integer id);
}
