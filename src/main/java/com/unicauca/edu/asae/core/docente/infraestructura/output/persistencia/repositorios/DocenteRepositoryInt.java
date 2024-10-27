package com.unicauca.edu.asae.core.docente.infraestructura.output.persistencia.repositorios;

import com.unicauca.edu.asae.core.dominio.models.Docente;
import org.springframework.data.repository.CrudRepository;

public interface DocenteRepositoryInt extends CrudRepository<Docente, Integer> {
}
