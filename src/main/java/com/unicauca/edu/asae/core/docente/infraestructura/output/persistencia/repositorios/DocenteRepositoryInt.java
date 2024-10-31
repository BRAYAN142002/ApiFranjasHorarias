package com.unicauca.edu.asae.core.docente.infraestructura.output.persistencia.repositorios;

import com.unicauca.edu.asae.core.docente.infraestructura.output.persistencia.entidades.DocenteEntity;
import org.springframework.data.repository.CrudRepository;

public interface DocenteRepositoryInt extends CrudRepository<DocenteEntity, Integer> {

}
