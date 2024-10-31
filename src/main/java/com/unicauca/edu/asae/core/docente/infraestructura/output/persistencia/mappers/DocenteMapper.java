package com.unicauca.edu.asae.core.docente.infraestructura.output.persistencia.mappers;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DocenteMapper {
    
    @Bean
    public ModelMapper crearProductoMapper() {
        return new ModelMapper();
    }
}
