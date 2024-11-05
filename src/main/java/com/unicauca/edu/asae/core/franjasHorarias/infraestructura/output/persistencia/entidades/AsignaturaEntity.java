package com.unicauca.edu.asae.core.franjasHorarias.infraestructura.output.persistencia.entidades;

import java.util.List;

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

@Entity
@Table(name="Asignaturas")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AsignaturaEntity {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    @Column(name="nombre",nullable=false, length=50)
    private String nombre;
    @Column(name="codigo",nullable=false,length=50)
    private String codigo;

    @OneToMany(fetch=FetchType.LAZY, mappedBy="objAsignatura")
    private List<CursoEntity> listaCursos;

    public AsignaturaEntity(String nombre,String codigo){
        this.nombre=nombre;
        this.codigo=codigo;
    }
    
}
