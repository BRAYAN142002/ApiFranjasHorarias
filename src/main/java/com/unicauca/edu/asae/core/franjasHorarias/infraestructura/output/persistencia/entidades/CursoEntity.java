package com.unicauca.edu.asae.core.franjasHorarias.infraestructura.output.persistencia.entidades;

import java.util.List;

import com.unicauca.edu.asae.core.docente.infraestructura.output.persistencia.entidades.DocenteEntity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="cursos")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CursoEntity {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    @Column(name="nombre",nullable=false,length=70)
    private String nombre;
    @OneToMany(cascade=CascadeType.PERSIST,mappedBy="objCursoEntity")
    private List<FranjaHorariaEntity> franjasHorariasEntity;

    @ManyToOne(cascade=CascadeType.PERSIST)
    @JoinColumn(name="asignatura_id")
    private AsignaturaEntity objAsignaturaEntity;

    @ManyToMany(fetch=FetchType.LAZY)
    @JoinTable(name="curso_docente",
                joinColumns = @JoinColumn(name= "idCurso"),
                inverseJoinColumns = @JoinColumn(name= "idDocente"))
    private List<DocenteEntity>listaDocentesEntity;

    public CursoEntity(String nombre){
        this.nombre=nombre;

    }
}
