package com.unicauca.edu.asae.core.franjasHorarias.infraestructura.output.persistencia.mappers;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Mapper {
    @Bean(name = "modelMapper")
    public ModelMapper franjaHorariaMapper(){
        return new ModelMapper();
    }
}
