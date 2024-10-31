package com.unicauca.edu.asae.core.docente.infraestructura.input.controllerGestionarDocente.controladores;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unicauca.edu.asae.core.docente.aplicacion.input.IGestionarDocenteCUPort;
import com.unicauca.edu.asae.core.docente.dominio.models.Docente;
import com.unicauca.edu.asae.core.docente.infraestructura.input.controllerGestionarDocente.DTOPeticion.DocenteDTOPeticion;
import com.unicauca.edu.asae.core.docente.infraestructura.input.controllerGestionarDocente.DTORespuesta.DocenteDTORespuesta;
import com.unicauca.edu.asae.core.docente.infraestructura.input.controllerGestionarDocente.mappers.DocenteMapperInfraestructuraDominio;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class DocenteRestController {

    private final IGestionarDocenteCUPort objGestionarDocenteCUInt;

    private final DocenteMapperInfraestructuraDominio objMapper;

    @RequestMapping("/docentes")
    public ResponseEntity<DocenteDTORespuesta> crearDocente(@RequestBody @Valid DocenteDTOPeticion objDocente) {
        Docente objDocenteCrear = this.objMapper.mappearDePeticionADocente(objDocente);
        Docente objDocenteCreado = this.objGestionarDocenteCUInt.crear(objDocenteCrear);
        ResponseEntity<DocenteDTORespuesta> docenteRespuesta = new ResponseEntity<DocenteDTORespuesta>(
                this.objMapper.mappearDeDocenteARespuesta(objDocenteCreado), HttpStatus.CREATED
        );
        return docenteRespuesta;
    } 

}