package com.unicauca.edu.asae.core.docente.infraestructura.output.persistencia.repositorios;

import org.springframework.data.repository.CrudRepository;

import com.unicauca.edu.asae.core.docente.infraestructura.output.persistencia.entidades.PersonaEntity;

public interface PersonaRepositoryInt extends CrudRepository<PersonaEntity, Integer>{

}
