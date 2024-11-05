package com.unicauca.edu.asae.core.franjasHorarias.infraestructura.output.persistencia.gateway;

import com.unicauca.edu.asae.core.franjasHorarias.aplicacion.output.IGestionarAsignaturaGatewayPort;
import com.unicauca.edu.asae.core.franjasHorarias.dominio.modelos.Asignatura;
import com.unicauca.edu.asae.core.franjasHorarias.infraestructura.output.persistencia.entidades.AsignaturaEntity;
import com.unicauca.edu.asae.core.franjasHorarias.infraestructura.output.persistencia.repositorios.AsignaturaRepositoryInt;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class GestionarAsignaturaGatewayImplAdapter implements IGestionarAsignaturaGatewayPort {

    private final AsignaturaRepositoryInt objAsignaturaRepository;
    private final ModelMapper asignaturaModelMapper;

    public GestionarAsignaturaGatewayImplAdapter(AsignaturaRepositoryInt objAsignaturaRepository,@Qualifier( "modelMapper") ModelMapper asignaturaModelMapper) {
        this.objAsignaturaRepository = objAsignaturaRepository;
        this.asignaturaModelMapper = asignaturaModelMapper;
    }

    @Override
    public boolean existeAsignaturaPorCodigo(String codigo) {
        return this.objAsignaturaRepository.existsByCodigo(codigo);
    }

    @Override
    public Asignatura guardar(Asignatura objAsignatura) {
        AsignaturaEntity objAsignaturaEntity = this.asignaturaModelMapper.map(objAsignatura, AsignaturaEntity.class);
        AsignaturaEntity objAsignaturaEntityRegistrada = this.objAsignaturaRepository.save(objAsignaturaEntity);
        Asignatura objAsignaturaRespuesta = this.asignaturaModelMapper.map(objAsignaturaEntityRegistrada, Asignatura.class);
        return objAsignaturaRespuesta;
    }
}
