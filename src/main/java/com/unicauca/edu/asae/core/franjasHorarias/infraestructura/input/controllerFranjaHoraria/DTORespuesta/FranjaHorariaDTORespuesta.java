package com.unicauca.edu.asae.core.franjasHorarias.infraestructura.input.controllerFranjaHoraria.DTORespuesta;

import java.sql.Time;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class FranjaHorariaDTORespuesta {
    private Integer id;
    private  String dia;
    private Time hora_inicio;
    private Time hora_fin;
    private CursoDTORespuesta objCurso;
    private EspacioFisicoDTORespuesta objEspacioFisico;
}
