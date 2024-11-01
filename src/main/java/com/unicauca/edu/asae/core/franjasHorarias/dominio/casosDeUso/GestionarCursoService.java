package com.unicauca.edu.asae.core.franjasHorarias.dominio.casosDeUso;

import com.unicauca.edu.asae.core.franjasHorarias.aplicacion.input.IGestionarCursoCUPort;
import com.unicauca.edu.asae.core.franjasHorarias.aplicacion.output.IGestionarCursoGatewayPort;
import com.unicauca.edu.asae.core.franjasHorarias.dominio.modelos.Curso;

public class GestionarCursoService implements IGestionarCursoCUPort {

    private final IGestionarCursoGatewayPort gestionarCursoGatewayPort;

    public GestionarCursoService(IGestionarCursoGatewayPort gestionarCursoGatewayPort){
        this.gestionarCursoGatewayPort=gestionarCursoGatewayPort;
    }
    @Override
    public Curso crear(Curso curso) {
        return gestionarCursoGatewayPort.crear(curso);
    }
    
}
