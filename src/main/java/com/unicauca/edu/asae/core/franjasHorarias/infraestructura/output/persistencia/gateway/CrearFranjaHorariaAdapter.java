package com.unicauca.edu.asae.core.franjasHorarias.infraestructura.output.persistencia.gateway;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.unicauca.edu.asae.core.franjasHorarias.aplicacion.output.ICrearFranjaHorariaGatewayPort;
import com.unicauca.edu.asae.core.franjasHorarias.dominio.modelos.FranjaHoraria;
import com.unicauca.edu.asae.core.franjasHorarias.infraestructura.output.persistencia.entidades.FranjaHorariaEntity;
import com.unicauca.edu.asae.core.franjasHorarias.infraestructura.output.persistencia.repositorios.FranjaHorariaRepository;


@Service
public class CrearFranjaHorariaAdapter implements ICrearFranjaHorariaGatewayPort {
    private final FranjaHorariaRepository franjaHorariaRepository;
    
    private final ModelMapper franjaHorariaMapper;

    public CrearFranjaHorariaAdapter(FranjaHorariaRepository franjaHorariaRepository,@Qualifier("modelMapper")ModelMapper modelMapper){
        this.franjaHorariaRepository=franjaHorariaRepository;
        this.franjaHorariaMapper=modelMapper;
    }

    @Override
    public FranjaHoraria crearFranjaHoraria(FranjaHoraria franjaHoraria) {
        FranjaHorariaEntity franjaHorariaEntity=franjaHorariaMapper.map(franjaHoraria, FranjaHorariaEntity.class);
        franjaHorariaEntity=franjaHorariaRepository.save(franjaHorariaEntity);
        return franjaHorariaMapper.map(franjaHorariaEntity, FranjaHoraria.class);

    }
    
}
