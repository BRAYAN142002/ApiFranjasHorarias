package com.unicauca.edu.asae.core.docente.infraestructura.input.controllerGestionarDocente.mappers;
import org.mapstruct.Mapper;

import com.unicauca.edu.asae.core.docente.dominio.models.Docente;
import com.unicauca.edu.asae.core.docente.dominio.models.Oficina;
import com.unicauca.edu.asae.core.docente.infraestructura.input.controllerGestionarDocente.DTOPeticion.DocenteDTOPeticion;
import com.unicauca.edu.asae.core.docente.infraestructura.input.controllerGestionarDocente.DTOPeticion.OficinaDTOPeticion;
import com.unicauca.edu.asae.core.docente.infraestructura.input.controllerGestionarDocente.DTORespuesta.DocenteDTORespuesta;

@Mapper(componentModel = "spring")
public interface DocenteMapperInfraestructuraDominio {
    Docente mappearDePeticionADocente(DocenteDTOPeticion objPeticion);
    DocenteDTORespuesta mappearDeDocenteARespuesta(Docente objdocente);
    Oficina mappearDePeticionAOficina(OficinaDTOPeticion objOficina);
}
