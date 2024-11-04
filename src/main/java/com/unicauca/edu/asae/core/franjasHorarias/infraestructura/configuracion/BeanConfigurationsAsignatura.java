package com.unicauca.edu.asae.core.franjasHorarias.infraestructura.configuracion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.unicauca.edu.asae.core.franjasHorarias.aplicacion.output.IAsignaturaFormateadorResultadosPort;
import com.unicauca.edu.asae.core.franjasHorarias.aplicacion.output.IGestionarAsignaturaGatewayPort;
import com.unicauca.edu.asae.core.franjasHorarias.dominio.casosDeUso.GestionarAsignaturaCUAdapter;

@Configuration
public class BeanConfigurationsAsignatura {

    @Bean
    public GestionarAsignaturaCUAdapter crearGestionarAsignaturaCUInt(
            IGestionarAsignaturaGatewayPort objGestionarAsignatura,
            IAsignaturaFormateadorResultadosPort objAsignaturaFormateador
    ){
        GestionarAsignaturaCUAdapter gestionarAsignaturaCUAdapter=new GestionarAsignaturaCUAdapter(objGestionarAsignatura, objAsignaturaFormateador);
        return gestionarAsignaturaCUAdapter;
    }
}
