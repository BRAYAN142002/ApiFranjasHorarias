package com.unicauca.edu.asae.core.franjasHorarias.infraestructura.configuracion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.unicauca.edu.asae.core.espacioFisico.aplicacion.output.IGestionarEspacioFisicoGatewayPort;
import com.unicauca.edu.asae.core.franjasHorarias.aplicacion.output.ICrearFranjaHorariaGatewayPort;
import com.unicauca.edu.asae.core.franjasHorarias.aplicacion.output.IGestionarCursoGatewayPort;
import com.unicauca.edu.asae.core.franjasHorarias.dominio.casosDeUso.CrearFranjaHorariaService;
import com.unicauca.edu.asae.core.franjasHorarias.dominio.casosDeUso.GestionarCursoService;

@Configuration
public class BeanConfigurationsFranjas {
    @Bean
    public GestionarCursoService crearCursoCUInt(IGestionarCursoGatewayPort gestionarCursoGatewayPort){
        GestionarCursoService gestionarCursoService=new GestionarCursoService(gestionarCursoGatewayPort);
        return gestionarCursoService;
    }
    @Bean
    public CrearFranjaHorariaService crearFranjaHorariaCUInt(ICrearFranjaHorariaGatewayPort crearFranjaHorariaGatewayPort,IGestionarCursoGatewayPort gestionarCursoGatewayPort,IGestionarEspacioFisicoGatewayPort gestionarEspacioFisicoGatewayPort){
        CrearFranjaHorariaService objCrearFranjaHorariaService=new CrearFranjaHorariaService(crearFranjaHorariaGatewayPort,gestionarCursoGatewayPort,gestionarEspacioFisicoGatewayPort);
        return objCrearFranjaHorariaService;
    }
    
}
