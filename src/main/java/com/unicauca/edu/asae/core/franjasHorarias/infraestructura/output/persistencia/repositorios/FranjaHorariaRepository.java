package com.unicauca.edu.asae.core.franjasHorarias.infraestructura.output.persistencia.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.unicauca.edu.asae.core.franjasHorarias.infraestructura.output.persistencia.entidades.FranjaHorariaEntity;

public interface  FranjaHorariaRepository extends CrudRepository<FranjaHorariaEntity, Integer>{
   @Query("SELECT f FROM FranjaHorariaEntity f " +
       "JOIN f.objCurso c " +
       "JOIN c.listaDocentes d " + 
       "WHERE d.id = :idDocente")
List<FranjaHorariaEntity> listarPorDocente(@Param("idDocente") Integer idDocente);

}
