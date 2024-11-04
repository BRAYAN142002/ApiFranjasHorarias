package com.unicauca.edu.asae.core.franjasHorarias.infraestructura.input.controllerAsignatura.mappers;

import com.unicauca.edu.asae.core.franjasHorarias.dominio.modelos.Asignatura;
import com.unicauca.edu.asae.core.franjasHorarias.infraestructura.input.controllerAsignatura.DTOPeticion.AsignaturaDTOPeticion;
import com.unicauca.edu.asae.core.franjasHorarias.infraestructura.input.controllerAsignatura.DTORespuesta.AsignaturaDTORespuesta;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AsignaturaMapperInfraestructuraDominio {
    Asignatura mappearDePeticionAAsignatura(AsignaturaDTOPeticion asignaturaPeticion);
    AsignaturaDTORespuesta mappearDeAsignaturaARespuesta(Asignatura objAsignatura);
}
