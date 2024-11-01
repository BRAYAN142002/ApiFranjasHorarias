package com.unicauca.edu.asae.core.franjasHorarias.dominio.casosDeUso;

import java.util.Optional;

import com.unicauca.edu.asae.core.espacioFisico.aplicacion.output.IGestionarEspacioFisicoGatewayPort;
import com.unicauca.edu.asae.core.espacioFisico.dominio.modelos.EspacioFisico;
import com.unicauca.edu.asae.core.franjasHorarias.aplicacion.input.ICrearFranjaHorariaCUPort;
import com.unicauca.edu.asae.core.franjasHorarias.aplicacion.output.ICrearFranjaHorariaGatewayPort;
import com.unicauca.edu.asae.core.franjasHorarias.aplicacion.output.IGestionarCursoGatewayPort;
import com.unicauca.edu.asae.core.franjasHorarias.dominio.modelos.Curso;
import com.unicauca.edu.asae.core.franjasHorarias.dominio.modelos.FranjaHoraria;

public class CrearFranjaHorariaService implements ICrearFranjaHorariaCUPort{

    private final ICrearFranjaHorariaGatewayPort crearFranjaHorariaGatewayPort;
    private final IGestionarCursoGatewayPort  gestionarCursoGatewayPort;
    private final IGestionarEspacioFisicoGatewayPort gestionarEspacioFisicoGatewayPort;

    public CrearFranjaHorariaService(ICrearFranjaHorariaGatewayPort crearFranjaHorariaGatewayPort,IGestionarCursoGatewayPort gestionarCursoGatewayPort,IGestionarEspacioFisicoGatewayPort gestionarEspacioFisicoGatewayPort){
        this.crearFranjaHorariaGatewayPort=crearFranjaHorariaGatewayPort;
        this.gestionarCursoGatewayPort=gestionarCursoGatewayPort;
        this.gestionarEspacioFisicoGatewayPort=gestionarEspacioFisicoGatewayPort;
    } 

    @Override
    public FranjaHoraria crearFranjaHoraria(FranjaHoraria franjaHoraria) {
        Optional<Curso> objCurso=gestionarCursoGatewayPort.obtenerCursoPorId(franjaHoraria.getObjCurso().getId());

        Optional<EspacioFisico> objEspacioFisico=gestionarEspacioFisicoGatewayPort.obtenerPorId(franjaHoraria.getObjEspacioFisico().getId());

       // franjaHoraria.setObjCurso(objCurso);

       return null;
    }
    
}
