package com.unicauca.edu.asae.core.espacioFisico.infraestructura.output.persistencia.repositorios;

import java.sql.Time;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.unicauca.edu.asae.core.espacioFisico.infraestructura.output.persistencia.entidades.EspacioFisicoEntity;

public interface EspacioFisicoRepository extends CrudRepository<EspacioFisicoEntity,Integer>{
    List<EspacioFisicoEntity> findByNombreStartingWithIgnoreCaseAndCapacidadGreaterThanEqualOrderByNombreAsc(String nombre,Integer capacidad);

    @Query("SELECT e FROM EspacioFisicoEntity e JOIN e.listaFranjasHorarias f " +
       "WHERE f.dia = :dia AND f.hora_inicio <= :horaFin AND f.hora_fin >= :horaInicio AND e.id = :id")
    List<EspacioFisicoEntity> buscarEspacioFisicoDisponible(@Param("dia") String dia,
                                                        @Param("horaInicio") Time horaInicio,
                                                        @Param("horaFin") Time horaFin,
                                                        @Param("id") Integer id);




   


    List<EspacioFisicoEntity> findByNombreContainingIgnoreCaseAndCapacidadGreaterThanEqualOrderByNombreAsc(String nombre, Integer capacidad);     
}
