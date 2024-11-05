package com.unicauca.edu.asae.core.franjasHorarias.infraestructura.input.controllerFranjaHoraria.controladores;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unicauca.edu.asae.core.franjasHorarias.aplicacion.input.IListarFranjaHorariaPorDocenteCUPort;
import com.unicauca.edu.asae.core.franjasHorarias.dominio.modelos.FranjaHoraria;
import com.unicauca.edu.asae.core.franjasHorarias.infraestructura.input.controllerFranjaHoraria.DTORespuesta.FranjaHorariaDTORespuesta;
import com.unicauca.edu.asae.core.franjasHorarias.infraestructura.input.controllerFranjaHoraria.mappers.FranjaHorariaMapper;

import jakarta.validation.constraints.Min;
import lombok.RequiredArgsConstructor;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/api/franjahoraria")
@RequiredArgsConstructor
public class ListarFranjaHorariaPorDocenteController {
    private final IListarFranjaHorariaPorDocenteCUPort listarFranjaHorariaPorDocenteCUPort;
    private final FranjaHorariaMapper franjaHorariaMapper;

    @GetMapping("/listar/{idDocente}")
    public ResponseEntity<List<FranjaHorariaDTORespuesta>> listarFranjaHorariaPorDocente(@PathVariable @Min(value=1,message="{docente.id.min}")Integer idDocente) {
        List<FranjaHoraria> listFranjaHorarias=this.listarFranjaHorariaPorDocenteCUPort.listarFranjaHorariaPorDOcente(idDocente);
        ResponseEntity<List<FranjaHorariaDTORespuesta>> objRespuesta=new ResponseEntity<>(franjaHorariaMapper.mapperListaFranjaHorariaDTORespuesta( listFranjaHorarias),HttpStatus.OK);
        return objRespuesta;
    }
    

}
