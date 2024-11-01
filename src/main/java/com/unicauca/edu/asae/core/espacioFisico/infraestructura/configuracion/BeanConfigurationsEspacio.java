package com.unicauca.edu.asae.core.espacioFisico.infraestructura.configuracion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.unicauca.edu.asae.core.espacioFisico.aplicacion.output.IGestionarEspacioFisicoGatewayPort;
import com.unicauca.edu.asae.core.espacioFisico.dominio.casoDeUso.GestionarEspacioFisicoService;

@Configuration
public class BeanConfigurationsEspacio {

    @Bean
    public GestionarEspacioFisicoService crearEspacioFisico(IGestionarEspacioFisicoGatewayPort gestionarEspacioFisicoGatewayPort){
        GestionarEspacioFisicoService objGestionarEspacioFisico=new GestionarEspacioFisicoService(gestionarEspacioFisicoGatewayPort);
        return objGestionarEspacioFisico;

    }
}
