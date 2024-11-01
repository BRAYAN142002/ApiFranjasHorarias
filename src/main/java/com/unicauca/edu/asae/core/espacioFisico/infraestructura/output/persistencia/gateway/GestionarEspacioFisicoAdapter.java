package com.unicauca.edu.asae.core.espacioFisico.infraestructura.output.persistencia.gateway;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.unicauca.edu.asae.core.espacioFisico.aplicacion.output.IGestionarEspacioFisicoGatewayPort;
import com.unicauca.edu.asae.core.espacioFisico.dominio.modelos.EspacioFisico;
import com.unicauca.edu.asae.core.espacioFisico.infraestructura.output.persistencia.entidades.EspacioFisicoEntity;
import com.unicauca.edu.asae.core.espacioFisico.infraestructura.output.persistencia.repositorios.EspacioFisicoRepository;

@Service
public class GestionarEspacioFisicoAdapter implements IGestionarEspacioFisicoGatewayPort {
  
    private final EspacioFisicoRepository espacioFisicoRepository;
    
   
    private final ModelMapper espacioFisicoModelMapper;


    public GestionarEspacioFisicoAdapter(EspacioFisicoRepository espacioFisicoRepository, @Qualifier("espacioFisicoModelMapper")ModelMapper espacioFisicModelMapper){
        this.espacioFisicoRepository=espacioFisicoRepository;
        this.espacioFisicoModelMapper=espacioFisicModelMapper;
    }

    @Override
    public EspacioFisico crear(EspacioFisico espacioFisico) {
        EspacioFisicoEntity espacioFisicoEntity=espacioFisicoModelMapper.map(espacioFisico, EspacioFisicoEntity.class);
        EspacioFisicoEntity objEspacioFisicoEntity=espacioFisicoRepository.save(espacioFisicoEntity);

        return espacioFisicoModelMapper.map(objEspacioFisicoEntity, EspacioFisico.class);
    }
    @Override
    public Optional<EspacioFisico> obtenerPorId(Integer id){
        Optional<EspacioFisicoEntity>espacioFisicoEntity=espacioFisicoRepository.findById(id);
        return espacioFisicoEntity.map(entity->espacioFisicoModelMapper.map(entity, EspacioFisico.class));
    }
   
    
}
