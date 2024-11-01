package com.unicauca.edu.asae.core.docente.infraestructura.input.controllerGestionarDocente.mappers;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.unicauca.edu.asae.core.docente.dominio.models.Docente;
import com.unicauca.edu.asae.core.docente.infraestructura.input.controllerGestionarDocente.DTOPeticion.DocenteDTOPeticion;
import com.unicauca.edu.asae.core.docente.infraestructura.input.controllerGestionarDocente.DTORespuesta.DocenteDTORespuesta;

@Mapper(componentModel = "spring", uses = {OficinaMapperInfraestructuraDominio.class})
public interface DocenteMapperInfraestructuraDominio {

    DocenteMapperInfraestructuraDominio INSTANCE = Mappers.getMapper(DocenteMapperInfraestructuraDominio.class);

    Docente mappearDePeticionADocente(DocenteDTOPeticion objPeticion);

    DocenteDTORespuesta mappearDeDocenteARespuesta(Docente objdocente);
}
