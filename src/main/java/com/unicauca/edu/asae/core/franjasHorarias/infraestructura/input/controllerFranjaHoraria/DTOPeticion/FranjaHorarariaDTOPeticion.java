package com.unicauca.edu.asae.core.franjasHorarias.infraestructura.input.controllerFranjaHoraria.DTOPeticion;

import java.sql.Time;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class FranjaHorarariaDTOPeticion {
    private  String dia;
    private Time horaInicio;
    private Time horaFin;
    private Integer idCurso;
    private Integer idEspacioFisico;
    
}
