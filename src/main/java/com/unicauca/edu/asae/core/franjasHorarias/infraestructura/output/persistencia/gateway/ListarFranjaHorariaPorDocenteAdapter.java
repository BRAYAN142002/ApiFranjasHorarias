package com.unicauca.edu.asae.core.franjasHorarias.infraestructura.output.persistencia.gateway;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.unicauca.edu.asae.core.franjasHorarias.aplicacion.output.IListarFranjaHorariaPorDocenteGatewayPort;
import com.unicauca.edu.asae.core.franjasHorarias.dominio.modelos.FranjaHoraria;
import com.unicauca.edu.asae.core.franjasHorarias.infraestructura.output.persistencia.entidades.FranjaHorariaEntity;
import com.unicauca.edu.asae.core.franjasHorarias.infraestructura.output.persistencia.repositorios.FranjaHorariaRepository;
import org.springframework.beans.factory.annotation.Qualifier;


@Service
public class ListarFranjaHorariaPorDocenteAdapter implements IListarFranjaHorariaPorDocenteGatewayPort {
    
    private final FranjaHorariaRepository franjaHorariaRepository;
    private final ModelMapper objMapper;

    public ListarFranjaHorariaPorDocenteAdapter(FranjaHorariaRepository franjaHorariaRepository, @Qualifier("modelMapper")ModelMapper objMapper){
        this.franjaHorariaRepository=franjaHorariaRepository;
        this.objMapper=objMapper;
    }
    @Override
    public List<FranjaHoraria> listarFranjaHorariaPorDOcente(Integer idDocente) {
        List<FranjaHorariaEntity> listaFranjaHoraria=this.franjaHorariaRepository.listarPorDocente(idDocente);

        return listaFranjaHoraria.stream().map(entity->objMapper.map(entity, FranjaHoraria.class))
        .collect(Collectors.toList());
    }



}
