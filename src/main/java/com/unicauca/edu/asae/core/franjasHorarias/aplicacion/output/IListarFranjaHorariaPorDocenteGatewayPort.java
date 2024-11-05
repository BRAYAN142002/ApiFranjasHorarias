package com.unicauca.edu.asae.core.franjasHorarias.aplicacion.output;

import java.util.List;

import com.unicauca.edu.asae.core.franjasHorarias.dominio.modelos.FranjaHoraria;

public interface IListarFranjaHorariaPorDocenteGatewayPort {
     List<FranjaHoraria> listarFranjaHorariaPorDOcente(Integer idDocente);
}
