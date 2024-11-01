package com.unicauca.edu.asae.core.franjasHorarias.infraestructura.output.persistencia.entidades;

import java.sql.Time;

import com.unicauca.edu.asae.core.espacioFisico.infraestructura.output.persistencia.entidades.EspacioFisicoEntity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="franja_horarias")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FranjaHorariaEntity {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    @Column(name="dia",nullable=false, length=50)
    private String dia;
    @Column(name="hora_inicio",nullable=false)
    private Time hora_inicio;
    @Column(name="hora_fin", nullable=false)
    private Time hora_fin;
    
    @ManyToOne(cascade={CascadeType.PERSIST})
    @JoinColumn(name="espacio_fisico_id",nullable=false)
    private EspacioFisicoEntity objEspacioFisicoEntity;

    @ManyToOne(cascade=CascadeType.PERSIST)
    @JoinColumn(name="curso_id")
    private CursoEntity objCursoEntity;

    public FranjaHorariaEntity(String dia,Time horaInicio,Time horaFin){
        this.dia=dia;
        this.hora_inicio=horaInicio;
        this.hora_fin=horaFin;
    }
    
}
