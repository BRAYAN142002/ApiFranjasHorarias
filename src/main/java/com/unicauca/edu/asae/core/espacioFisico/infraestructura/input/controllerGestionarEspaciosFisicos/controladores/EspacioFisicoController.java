package com.unicauca.edu.asae.core.espacioFisico.infraestructura.input.controllerGestionarEspaciosFisicos.controladores;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unicauca.edu.asae.core.espacioFisico.aplicacion.input.IGestionarEspacioFisicoCUPort;
import com.unicauca.edu.asae.core.espacioFisico.dominio.modelos.EspacioFisico;
import com.unicauca.edu.asae.core.espacioFisico.infraestructura.input.controllerGestionarEspaciosFisicos.DTOPeticion.EspacioFisicoDTOPeticion;
import com.unicauca.edu.asae.core.espacioFisico.infraestructura.input.controllerGestionarEspaciosFisicos.DTORespuesta.EspacioFIsicoDTORespuesta;
import com.unicauca.edu.asae.core.espacioFisico.infraestructura.input.controllerGestionarEspaciosFisicos.mappers.EspacioFisicoMapperInfraestructuraDominio;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/espaciofisico")

public class EspacioFisicoController {
    
    private final IGestionarEspacioFisicoCUPort gestionarEspacioFisicoCUPort;
    private final EspacioFisicoMapperInfraestructuraDominio objMapper;

    public EspacioFisicoController(IGestionarEspacioFisicoCUPort gestionarEspacioFisicoCUPort,EspacioFisicoMapperInfraestructuraDominio espacioFisicoMapperInfraestructuraDominio){
            this.gestionarEspacioFisicoCUPort=gestionarEspacioFisicoCUPort;
            this.objMapper=espacioFisicoMapperInfraestructuraDominio;
    }
    @PostMapping("/create")
    public ResponseEntity<EspacioFIsicoDTORespuesta> postMethodName(@RequestBody EspacioFisicoDTOPeticion peticion) {
        EspacioFisico espacioFisico=objMapper.mapperPeticionAEspacioFisico(peticion);
        espacioFisico=gestionarEspacioFisicoCUPort.crear(espacioFisico);
       ResponseEntity<EspacioFIsicoDTORespuesta>objRespuesta=new ResponseEntity<EspacioFIsicoDTORespuesta>(objMapper.mappearEspacioFisicoARespuesta(espacioFisico),HttpStatus.CREATED);
        return objRespuesta;
    }
    
}