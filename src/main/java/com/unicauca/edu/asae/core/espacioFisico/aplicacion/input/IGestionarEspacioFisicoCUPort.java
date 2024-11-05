package com.unicauca.edu.asae.core.espacioFisico.aplicacion.input;

import java.util.List;

import com.unicauca.edu.asae.core.espacioFisico.dominio.modelos.EspacioFisico;

public interface  IGestionarEspacioFisicoCUPort {
    EspacioFisico crear(EspacioFisico espacioFisico);
    List<EspacioFisico> listarEspaciosFisicos(String nombre, Integer capacidad);
}
