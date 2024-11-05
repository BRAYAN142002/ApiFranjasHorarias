package com.unicauca.edu.asae.core.espacioFisico.infraestructura.output.persistencia.gateway;

import java.sql.Time;
import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.unicauca.edu.asae.core.espacioFisico.aplicacion.output.IValidarEspacioFisicoGatewayPort;
import com.unicauca.edu.asae.core.espacioFisico.dominio.modelos.EspacioFisico;
import com.unicauca.edu.asae.core.espacioFisico.infraestructura.output.persistencia.entidades.EspacioFisicoEntity;
import com.unicauca.edu.asae.core.espacioFisico.infraestructura.output.persistencia.repositorios.EspacioFisicoRepository;
@Service
public class ValidarEspacioFisicoAdapter implements IValidarEspacioFisicoGatewayPort{
    private final EspacioFisicoRepository espacioFisicoRepository;
    private final ModelMapper objMapper;
    public ValidarEspacioFisicoAdapter(EspacioFisicoRepository espacioFisicoRepository,@Qualifier("espacioFisicoModelMapper")ModelMapper espacioFisicoMapper){
        this.espacioFisicoRepository=espacioFisicoRepository;
        this.objMapper=espacioFisicoMapper;

    }


    @Override
    public List<EspacioFisico> disponibilidadEspacioFisico(String dia, Time horaInicio, Time horaFin,Integer idEspacioFisico) {
      List<EspacioFisicoEntity> espacioFisicoEntity=this.espacioFisicoRepository.buscarEspacioFisicoDisponible(dia, horaInicio, horaFin, idEspacioFisico);
      return espacioFisicoEntity.stream().map(entity->objMapper.map(espacioFisicoEntity, EspacioFisico.class))
      .collect(Collectors.toList());
 }
    
}
