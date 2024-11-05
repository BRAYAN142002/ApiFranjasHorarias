package com.unicauca.edu.asae.core.espacioFisico.infraestructura.output.persistencia.entidades;


import com.unicauca.edu.asae.core.franjasHorarias.infraestructura.output.persistencia.entidades.FranjaHorariaEntity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.*;

@Entity
@Table(name="espacio_fisico")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EspacioFisicoEntity {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    @Column(name="nombre",unique=true,length=50, nullable=false)
    private String nombre;
    @Column(name="capacidad",nullable=false)
    private int capacidad;
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "objEspacioFisico")
    private List<FranjaHorariaEntity>listaFranjasHorarias;

    public EspacioFisicoEntity(String nombre,int capacidad){
        this.nombre=nombre;
        this.capacidad=capacidad;
    }
}
