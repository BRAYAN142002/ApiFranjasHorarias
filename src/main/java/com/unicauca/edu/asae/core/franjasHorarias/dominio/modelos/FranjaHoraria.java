package com.unicauca.edu.asae.core.franjasHorarias.dominio.modelos;

import java.sql.Time;

import com.unicauca.edu.asae.core.espacioFisico.infraestructura.output.persistencia.entidades.EspacioFisicoEntity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FranjaHoraria {
   
    private int id;
   
    
    private String dia;
   
    private Time hora_inicio;
    
    private Time hora_fin;
    
    
    private EspacioFisicoEntity objEspacioFisico;

    
    private Curso objCurso;
}
