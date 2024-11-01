package com.unicauca.edu.asae.core.franjasHorarias.infraestructura.output.persistencia.repositorios;

import org.springframework.data.repository.CrudRepository;

import com.unicauca.edu.asae.core.franjasHorarias.infraestructura.output.persistencia.entidades.CursoEntity;

public interface CursoRepository extends CrudRepository<CursoEntity,Integer>{
    
}
