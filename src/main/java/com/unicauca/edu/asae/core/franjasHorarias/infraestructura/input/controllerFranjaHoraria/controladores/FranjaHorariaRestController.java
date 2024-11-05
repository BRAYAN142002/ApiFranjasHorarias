package com.unicauca.edu.asae.core.franjasHorarias.infraestructura.input.controllerFranjaHoraria.controladores;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unicauca.edu.asae.core.franjasHorarias.aplicacion.input.ICrearFranjaHorariaCUPort;
import com.unicauca.edu.asae.core.franjasHorarias.dominio.modelos.FranjaHoraria;
import com.unicauca.edu.asae.core.franjasHorarias.infraestructura.input.controllerFranjaHoraria.DTOPeticion.FranjaHorarariaDTOPeticion;
import com.unicauca.edu.asae.core.franjasHorarias.infraestructura.input.controllerFranjaHoraria.DTORespuesta.FranjaHorariaDTORespuesta;
import com.unicauca.edu.asae.core.franjasHorarias.infraestructura.input.controllerFranjaHoraria.mappers.FranjaHorariaMapper;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("api/franjahoraria")
@RequiredArgsConstructor
@Validated
public class FranjaHorariaRestController {
    private final ICrearFranjaHorariaCUPort crearFranjaHorariaCUPort;
    private final FranjaHorariaMapper objMapper;

    @PostMapping("/create")
    public ResponseEntity<FranjaHorariaDTORespuesta> crearFranjaHoraria(@RequestBody @Valid FranjaHorarariaDTOPeticion peticion) {
        FranjaHoraria obFranjaHoraria=this.objMapper.mapperPetecionAFranjaHoraria(peticion);
        obFranjaHoraria=this.crearFranjaHorariaCUPort.crearFranjaHoraria(obFranjaHoraria);
        ResponseEntity<FranjaHorariaDTORespuesta> objRespuesta=new ResponseEntity<>(objMapper.mapperFranjaHorariaDTORespuesta(obFranjaHoraria),HttpStatus.CREATED);
        return objRespuesta;
    }
    
    

}
