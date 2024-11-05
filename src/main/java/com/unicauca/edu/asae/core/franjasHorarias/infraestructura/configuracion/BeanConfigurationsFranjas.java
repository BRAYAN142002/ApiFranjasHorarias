package com.unicauca.edu.asae.core.franjasHorarias.infraestructura.configuracion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.unicauca.edu.asae.core.docente.aplicacion.output.IValidarDocenteGatewayPort;
import com.unicauca.edu.asae.core.espacioFisico.aplicacion.output.IGestionarEspacioFisicoGatewayPort;
import com.unicauca.edu.asae.core.espacioFisico.aplicacion.output.IValidarEspacioFisicoGatewayPort;
import com.unicauca.edu.asae.core.franjasHorarias.aplicacion.output.ICrearFranjaHorariaGatewayPort;
import com.unicauca.edu.asae.core.franjasHorarias.aplicacion.output.IFranjaHorariaFormateadorResultadosPort;
import com.unicauca.edu.asae.core.franjasHorarias.aplicacion.output.IGestionarCursoGatewayPort;
import com.unicauca.edu.asae.core.franjasHorarias.aplicacion.output.IListarFranjaHorariaPorDocenteGatewayPort;
import com.unicauca.edu.asae.core.franjasHorarias.dominio.casosDeUso.CrearFranjaHorariaService;
import com.unicauca.edu.asae.core.franjasHorarias.dominio.casosDeUso.GestionarCursoService;
import com.unicauca.edu.asae.core.franjasHorarias.dominio.casosDeUso.ListarFranjaHorariaPorDocenteService;

@Configuration
public class BeanConfigurationsFranjas {
    @Bean
    public GestionarCursoService crearCursoCUInt(IGestionarCursoGatewayPort gestionarCursoGatewayPort){
        GestionarCursoService gestionarCursoService=new GestionarCursoService(gestionarCursoGatewayPort);
        return gestionarCursoService;
    }
    @Bean
    public CrearFranjaHorariaService crearFranjaHorariaCUInt(ICrearFranjaHorariaGatewayPort crearFranjaHorariaGatewayPort,IGestionarCursoGatewayPort gestionarCursoGatewayPort,IGestionarEspacioFisicoGatewayPort gestionarEspacioFisicoGatewayPort,IFranjaHorariaFormateadorResultadosPort franjaHorariaFormateadorResultadosPort,IValidarDocenteGatewayPort validarDocenteGatewayPort,IValidarEspacioFisicoGatewayPort validarEspacioFisicoGatewayPort){
        CrearFranjaHorariaService objCrearFranjaHorariaService=new CrearFranjaHorariaService(crearFranjaHorariaGatewayPort,gestionarCursoGatewayPort,gestionarEspacioFisicoGatewayPort,franjaHorariaFormateadorResultadosPort,validarDocenteGatewayPort,validarEspacioFisicoGatewayPort);
        return objCrearFranjaHorariaService;
    }

    @Bean 
    public ListarFranjaHorariaPorDocenteService listarFranjaHorariaPorDocente(IListarFranjaHorariaPorDocenteGatewayPort ListarFranjaHorariaPorDocenteGatewayPort, IFranjaHorariaFormateadorResultadosPort franjaHorariaFormateadorResultadosPort){
        ListarFranjaHorariaPorDocenteService obFranjaHorariaPorDocente=new ListarFranjaHorariaPorDocenteService(ListarFranjaHorariaPorDocenteGatewayPort, franjaHorariaFormateadorResultadosPort);
        return obFranjaHorariaPorDocente;
    }

    
}
