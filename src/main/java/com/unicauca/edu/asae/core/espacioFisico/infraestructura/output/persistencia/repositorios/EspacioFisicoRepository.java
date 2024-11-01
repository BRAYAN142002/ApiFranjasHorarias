package com.unicauca.edu.asae.core.espacioFisico.infraestructura.output.persistencia.repositorios;

import org.springframework.data.repository.CrudRepository;

import com.unicauca.edu.asae.core.espacioFisico.infraestructura.output.persistencia.entidades.EspacioFisicoEntity;

public interface EspacioFisicoRepository extends CrudRepository<EspacioFisicoEntity,Integer>{
    
}
