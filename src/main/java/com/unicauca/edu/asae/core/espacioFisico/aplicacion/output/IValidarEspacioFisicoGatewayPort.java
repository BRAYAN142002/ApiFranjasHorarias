package com.unicauca.edu.asae.core.espacioFisico.aplicacion.output;

import java.sql.Time;
import java.util.List;

import com.unicauca.edu.asae.core.espacioFisico.dominio.modelos.EspacioFisico;

public interface IValidarEspacioFisicoGatewayPort {
    List<EspacioFisico> disponibilidadEspacioFisico(String dia,Time horaInicio, Time horaFin, Integer idEspacioFisico );
}
