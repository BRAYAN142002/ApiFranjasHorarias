package com.unicauca.edu.asae.core.espacioFisico.dominio.casoDeUso;


import java.util.List;

import com.unicauca.edu.asae.core.espacioFisico.aplicacion.input.IGestionarEspacioFisicoCUPort;
import com.unicauca.edu.asae.core.espacioFisico.aplicacion.output.IGestionarEspacioFisicoGatewayPort;
import com.unicauca.edu.asae.core.espacioFisico.dominio.modelos.EspacioFisico;


public class GestionarEspacioFisicoService implements IGestionarEspacioFisicoCUPort{

    private final IGestionarEspacioFisicoGatewayPort gestionarEspacioFisicoGatewayPort;

    public GestionarEspacioFisicoService(IGestionarEspacioFisicoGatewayPort gestionarEspacioFisicoGatewayPort){
        this.gestionarEspacioFisicoGatewayPort=gestionarEspacioFisicoGatewayPort;
    }

    @Override
    public EspacioFisico crear(EspacioFisico espacioFisico) {
        return gestionarEspacioFisicoGatewayPort.crear(espacioFisico);
    }

    @Override
    public List<EspacioFisico> listarEspaciosFisicos(String nombre, Integer capacidad) {
        return this.gestionarEspacioFisicoGatewayPort.listarEspaciosFisicos(nombre, capacidad);
    }
    
   
    
}
