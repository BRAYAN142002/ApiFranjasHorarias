package com.unicauca.edu.asae.core.franjasHorarias.infraestructura.output.persistencia.repositorios;

import com.unicauca.edu.asae.core.franjasHorarias.infraestructura.output.persistencia.entidades.AsignaturaEntity;
import org.springframework.data.repository.CrudRepository;

public interface AsignaturaRepositoryInt extends CrudRepository<AsignaturaEntity, Integer> {
    boolean existsByCodigo(String codigo);
}
