package com.unicauca.edu.asae.core.docente.infraestructura.output.persistencia.entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Table(name="oficinas")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OficinaEntity {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    @Column(unique=true,name="nombre", nullable=false, length=50)
    private String nombre;

    @Column(name="ubicacion", nullable=false,length=50)
    private String ubicacion;

    //@OneToOne(cascade = CascadeType.PERSIST, mappedBy = "objOficinaEntity")
	//@PrimaryKeyJoinColumn
    @OneToOne
    @JoinColumn(name = "idDocente")
    private DocenteEntity objDocente; 

    public OficinaEntity(String nombre,String ubicacion){
        this.nombre=nombre;
        this.ubicacion=ubicacion;
    }
}
