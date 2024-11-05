package com.unicauca.edu.asae.core.docente.aplicacion.output;

import java.sql.Time;
import java.util.List;

import com.unicauca.edu.asae.core.docente.dominio.models.Docente;

public interface IValidarDocenteGatewayPort {
    List<Docente> disponiblidadDocente(String dia,Time horaInicio,Time horaFin,Integer idDocente);  
}
