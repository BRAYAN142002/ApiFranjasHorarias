package com.unicauca.edu.asae.core.franjasHorarias.infraestructura.input.controllerCurso.controladores;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unicauca.edu.asae.core.franjasHorarias.aplicacion.input.IGestionarCursoCUPort;
import com.unicauca.edu.asae.core.franjasHorarias.dominio.modelos.Curso;
import com.unicauca.edu.asae.core.franjasHorarias.infraestructura.input.controllerCurso.DTOPeticion.CursoDTOPeticion;
import com.unicauca.edu.asae.core.franjasHorarias.infraestructura.input.controllerCurso.DTORespuesta.CursoDTORespuesta;
import com.unicauca.edu.asae.core.franjasHorarias.infraestructura.input.controllerCurso.mappers.CursoMapperInfraestructuraDominio;

import lombok.RequiredArgsConstructor;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/curso")
@RequiredArgsConstructor
public class CursoRestController {
    private  final IGestionarCursoCUPort objGestionarCursoCUPort;
    private final CursoMapperInfraestructuraDominio objMapper;
    
   
    
    @PostMapping("/create")
    public ResponseEntity<CursoDTORespuesta> crearCurso(@RequestBody CursoDTOPeticion cursoDTOPeticion) {
        Curso curso=objMapper.mapperDePeticionACurso(cursoDTOPeticion);
        Curso objCurso=objGestionarCursoCUPort.crear(curso);
        ResponseEntity<CursoDTORespuesta> objRespuesta=new ResponseEntity<CursoDTORespuesta>(objMapper.mapperCursoARespuesta(objCurso),HttpStatus.CREATED);
        return objRespuesta;
    }
    
}
