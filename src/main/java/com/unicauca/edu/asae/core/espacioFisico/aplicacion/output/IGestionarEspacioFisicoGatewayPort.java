package com.unicauca.edu.asae.core.espacioFisico.aplicacion.output;

import java.util.Optional;

import com.unicauca.edu.asae.core.espacioFisico.dominio.modelos.EspacioFisico;

public interface IGestionarEspacioFisicoGatewayPort {
    EspacioFisico crear(EspacioFisico espacioFisico);
    Optional<EspacioFisico> obtenerPorId(Integer id);
}
