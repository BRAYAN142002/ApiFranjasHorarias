package com.unicauca.edu.asae.core.franjasHorarias.aplicacion.input;

import java.util.List;

import com.unicauca.edu.asae.core.franjasHorarias.dominio.modelos.FranjaHoraria;

public interface IListarFranjaHorariaPorDocenteCUPort {
    List<FranjaHoraria> listarFranjaHorariaPorDOcente(Integer idDocente);
}
