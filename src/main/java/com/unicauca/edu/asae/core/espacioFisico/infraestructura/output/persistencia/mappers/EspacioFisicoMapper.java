package com.unicauca.edu.asae.core.espacioFisico.infraestructura.output.persistencia.mappers;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EspacioFisicoMapper {
    @Bean(name = "espacioFisicoModelMapper")
    public ModelMapper crearEspacioFisico(){
        return new ModelMapper();
    }

}
