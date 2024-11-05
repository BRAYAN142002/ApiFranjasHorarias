package com.unicauca.edu.asae.core.docente.infraestructura.output.persistencia.entidades;

import java.util.List;

import com.unicauca.edu.asae.core.franjasHorarias.infraestructura.output.persistencia.entidades.CursoEntity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="docentes")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DocenteEntity extends PersonaEntity{
    
    public DocenteEntity(String nombre,String apellido,String correo){
        super(nombre,apellido,correo);
    }

    @OneToOne(cascade = CascadeType.PERSIST, mappedBy = "objDocente")
    @JoinColumn(name = "idOficina")    
    private OficinaEntity oficinaAsignada;

    @ManyToMany(cascade={CascadeType.PERSIST},mappedBy="listaDocentesEntity")
    private List<CursoEntity> listaCursosEntity;

  


}
