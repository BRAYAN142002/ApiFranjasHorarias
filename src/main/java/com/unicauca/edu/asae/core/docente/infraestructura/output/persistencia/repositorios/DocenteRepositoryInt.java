package com.unicauca.edu.asae.core.docente.infraestructura.output.persistencia.repositorios;

import com.unicauca.edu.asae.core.docente.infraestructura.output.persistencia.entidades.DocenteEntity;

import java.sql.Time;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;


public interface DocenteRepositoryInt extends CrudRepository<DocenteEntity, Integer> {

    boolean existsByCorreo(String correo);

     @Query(value = "SELECT d.* FROM docentes d " +
               "INNER JOIN curso_docente cd ON d.id = cd.idDocente " +
               "INNER JOIN cursos c ON cd.idCurso = c.id " +
               "INNER JOIN franja_horarias f ON f.curso_id = c.id " +
               "WHERE f.dia = :dia " +
               "AND f.hora_inicio <= :horaFin " +
               "AND f.hora_fin >= :horaInicio " +
               "AND d.id = :idDocente", nativeQuery = true)
    List<DocenteEntity> verificarDisponibilidadDocente(@Param("dia") String dia,
                                                   @Param("horaInicio") Time horaInicio,
                                                   @Param("horaFin") Time horaFin,
                                                   @Param("idDocente") Integer idDocente);

}
