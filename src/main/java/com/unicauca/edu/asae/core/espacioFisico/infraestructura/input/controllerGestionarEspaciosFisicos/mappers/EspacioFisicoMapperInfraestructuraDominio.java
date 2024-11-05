package com.unicauca.edu.asae.core.espacioFisico.infraestructura.input.controllerGestionarEspaciosFisicos.mappers;

import java.util.List;

import org.mapstruct.Mapper;

import com.unicauca.edu.asae.core.espacioFisico.dominio.modelos.EspacioFisico;
import com.unicauca.edu.asae.core.espacioFisico.infraestructura.input.controllerGestionarEspaciosFisicos.DTOPeticion.EspacioFisicoDTOPeticion;
import com.unicauca.edu.asae.core.espacioFisico.infraestructura.input.controllerGestionarEspaciosFisicos.DTORespuesta.EspacioFIsicoDTORespuesta;

@Mapper(componentModel = "spring")
public interface  EspacioFisicoMapperInfraestructuraDominio {
    EspacioFisico mapperPeticionAEspacioFisico(EspacioFisicoDTOPeticion peticion);

    EspacioFIsicoDTORespuesta mappearEspacioFisicoARespuesta(EspacioFisico espacioFisico);

    List<EspacioFIsicoDTORespuesta> mappearEspaciosFisicosARespuesta(List<EspacioFisico> espacioFisicos);
}
