package com.unicauca.edu.asae.core.docente.infraestructura.configuracion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.unicauca.edu.asae.core.docente.aplicacion.output.IDocenteFormateadorResultadosPort;
import com.unicauca.edu.asae.core.docente.aplicacion.output.IGestionarDocenteGatewayPort;
import com.unicauca.edu.asae.core.docente.dominio.casosDeUso.GestionarDocenteCUAdapter;

@Configuration
public class BeanConfigurations {

    @Bean
    public GestionarDocenteCUAdapter crearGestionarDocenteCUInt(
            IGestionarDocenteGatewayPort objGestionarDocenteGateway,
            IDocenteFormateadorResultadosPort objDocenteFormateadorResultados
    ){
        GestionarDocenteCUAdapter objGestionarDocenteCU = new GestionarDocenteCUAdapter(objGestionarDocenteGateway, objDocenteFormateadorResultados);
        return objGestionarDocenteCU;
    }
}
