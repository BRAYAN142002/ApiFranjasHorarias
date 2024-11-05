package com.unicauca.edu.asae.core.espacioFisico.aplicacion.output;

import java.util.List;
import java.util.Optional;

import com.unicauca.edu.asae.core.espacioFisico.dominio.modelos.EspacioFisico;

public interface IGestionarEspacioFisicoGatewayPort {
    EspacioFisico crear(EspacioFisico espacioFisico);
    Optional<EspacioFisico> obtenerPorId(Integer id);
    List<EspacioFisico> listarEspaciosFisicos(String nombre, Integer capacidad);
}
