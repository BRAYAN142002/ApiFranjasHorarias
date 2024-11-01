package com.unicauca.edu.asae.core.docente.infraestructura.input.controllerGestionarDocente.mappers;

import org.mapstruct.Mapper;

import com.unicauca.edu.asae.core.docente.dominio.models.Oficina;
import com.unicauca.edu.asae.core.docente.infraestructura.input.controllerGestionarDocente.DTOPeticion.OficinaDTOPeticion;
import com.unicauca.edu.asae.core.docente.infraestructura.input.controllerGestionarDocente.DTORespuesta.OficinaDTORespuesta;

@Mapper(componentModel = "spring")
public interface OficinaMapperInfraestructuraDominio {

    Oficina mappearDePeticionAOficina(OficinaDTOPeticion objOficina);

    OficinaDTORespuesta mappearDeOficinaARespuesta(Oficina objOficina);

}
