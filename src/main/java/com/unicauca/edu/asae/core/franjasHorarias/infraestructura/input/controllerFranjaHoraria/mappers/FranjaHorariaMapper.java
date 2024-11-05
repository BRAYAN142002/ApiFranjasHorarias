package com.unicauca.edu.asae.core.franjasHorarias.infraestructura.input.controllerFranjaHoraria.mappers;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.unicauca.edu.asae.core.franjasHorarias.dominio.modelos.FranjaHoraria;
import com.unicauca.edu.asae.core.franjasHorarias.infraestructura.input.controllerFranjaHoraria.DTOPeticion.FranjaHorarariaDTOPeticion;
import com.unicauca.edu.asae.core.franjasHorarias.infraestructura.input.controllerFranjaHoraria.DTORespuesta.FranjaHorariaDTORespuesta;


@Mapper(componentModel = "spring")
public interface FranjaHorariaMapper {

    @Mapping(target ="objCurso.id", source="idCurso")
    @Mapping(target="objEspacioFisico.id", source="idEspacioFisico")
    FranjaHoraria  mapperPetecionAFranjaHoraria(FranjaHorarariaDTOPeticion peticion);

    FranjaHorariaDTORespuesta mapperFranjaHorariaDTORespuesta(FranjaHoraria franjaHoraria);

    List<FranjaHorariaDTORespuesta> mapperListaFranjaHorariaDTORespuesta(List<FranjaHoraria> listaFranjasHorarias);

}
