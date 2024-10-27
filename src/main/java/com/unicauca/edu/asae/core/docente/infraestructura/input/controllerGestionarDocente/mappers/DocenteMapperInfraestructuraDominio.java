package com.unicauca.edu.asae.core.docente.infraestructura.input.controllerGestionarDocente.mappers;

import com.unicauca.edu.asae.core.dominio.models.Docente;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DocenteMapperInfraestructuraDominio {
    Docente mappearDePeticionADocente();
}
