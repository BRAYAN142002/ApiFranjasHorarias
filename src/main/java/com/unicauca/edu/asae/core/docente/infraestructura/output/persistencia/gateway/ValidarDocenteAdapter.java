package com.unicauca.edu.asae.core.docente.infraestructura.output.persistencia.gateway;

import java.sql.Time;
import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.unicauca.edu.asae.core.docente.aplicacion.output.IValidarDocenteGatewayPort;
import com.unicauca.edu.asae.core.docente.dominio.models.Docente;
import com.unicauca.edu.asae.core.docente.infraestructura.output.persistencia.entidades.DocenteEntity;
import com.unicauca.edu.asae.core.docente.infraestructura.output.persistencia.repositorios.DocenteRepositoryInt;

@Service
public class ValidarDocenteAdapter implements IValidarDocenteGatewayPort {
    private final DocenteRepositoryInt docenteRepositoryInt;
    private final ModelMapper objMapper;
    public ValidarDocenteAdapter(DocenteRepositoryInt docenteRepositoryInt,@Qualifier("docenteModelMapper")ModelMapper objMapper){
        this.docenteRepositoryInt=docenteRepositoryInt;
        this.objMapper=objMapper;
    }


    @Override
    public List<Docente> disponiblidadDocente(String dia, Time horaInicio, Time horaFin, Integer idDocente) {
        List<DocenteEntity> docenteEntity=this.docenteRepositoryInt.verificarDisponibilidadDocente(dia,horaInicio,horaFin,idDocente);
        return docenteEntity.stream().map(entity->objMapper.map(docenteEntity, Docente.class))
        .collect(Collectors.toList());
    }
    
}
