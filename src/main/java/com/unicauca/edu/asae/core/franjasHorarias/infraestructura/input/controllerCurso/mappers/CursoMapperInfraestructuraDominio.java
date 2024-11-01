package com.unicauca.edu.asae.core.franjasHorarias.infraestructura.input.controllerCurso.mappers;

import org.mapstruct.Mapper;

import com.unicauca.edu.asae.core.franjasHorarias.dominio.modelos.Curso;
import com.unicauca.edu.asae.core.franjasHorarias.infraestructura.input.controllerCurso.DTOPeticion.CursoDTOPeticion;
import com.unicauca.edu.asae.core.franjasHorarias.infraestructura.input.controllerCurso.DTORespuesta.CursoDTORespuesta;

@Mapper(componentModel ="spring")
public interface CursoMapperInfraestructuraDominio {
    Curso mapperDePeticionACurso(CursoDTOPeticion peticion);

    CursoDTORespuesta mapperCursoARespuesta(Curso curso);


}
