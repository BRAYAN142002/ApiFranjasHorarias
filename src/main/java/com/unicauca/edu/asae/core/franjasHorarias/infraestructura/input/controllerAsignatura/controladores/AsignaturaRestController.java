package com.unicauca.edu.asae.core.franjasHorarias.infraestructura.input.controllerAsignatura.controladores;

import com.unicauca.edu.asae.core.franjasHorarias.aplicacion.input.IGestionarAsignaturaCUPort;
import com.unicauca.edu.asae.core.franjasHorarias.dominio.modelos.Asignatura;
import com.unicauca.edu.asae.core.franjasHorarias.infraestructura.input.controllerAsignatura.DTOPeticion.AsignaturaDTOPeticion;
import com.unicauca.edu.asae.core.franjasHorarias.infraestructura.input.controllerAsignatura.DTORespuesta.AsignaturaDTORespuesta;
import com.unicauca.edu.asae.core.franjasHorarias.infraestructura.input.controllerAsignatura.mappers.AsignaturaMapperInfraestructuraDominio;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class AsignaturaRestController {

    private final IGestionarAsignaturaCUPort objGestionarAsignaturaCU;
    private final AsignaturaMapperInfraestructuraDominio objMapeador;

    @PostMapping("/asignaturas")
    public ResponseEntity<AsignaturaDTORespuesta> crear(@RequestBody @Valid AsignaturaDTOPeticion objAsignatura){
        Asignatura objAsignaturaCrear = objMapeador.mappearDePeticionAAsignatura(objAsignatura);
        Asignatura objAsignaturaCreada = objGestionarAsignaturaCU.crear(objAsignaturaCrear);
        ResponseEntity<AsignaturaDTORespuesta> objRespuesta = new ResponseEntity<AsignaturaDTORespuesta>(
                objMapeador.mappearDeAsignaturaARespuesta(objAsignaturaCreada),
                HttpStatus.CREATED
        );
        return objRespuesta;
    }


}
