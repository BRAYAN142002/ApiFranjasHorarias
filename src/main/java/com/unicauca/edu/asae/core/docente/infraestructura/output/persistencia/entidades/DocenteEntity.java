package com.unicauca.edu.asae.core.docente.infraestructura.output.persistencia.entidades;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="docentes")
@Getter
@Setter
public class DocenteEntity extends PersonaEntity{

    @OneToOne(cascade = CascadeType.PERSIST, mappedBy = "objDocente")
    @JoinColumn(name = "idOficina")    
    private OficinaEntity oficinaAsignada;

    //@ManyToMany(cascade={CascadeType.PERSIST},mappedBy="listaDocentesEntity")
    //private List<CursoEntity> listaCursosEntity;

    public DocenteEntity(){
        super();
    }
    public DocenteEntity(String nombre,String apellido,String correo){
        super(nombre,apellido,correo);
    }


}
