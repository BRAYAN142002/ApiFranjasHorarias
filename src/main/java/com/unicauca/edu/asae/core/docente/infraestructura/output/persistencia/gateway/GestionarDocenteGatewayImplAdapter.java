package com.unicauca.edu.asae.core.docente.infraestructura.output.persistencia.gateway;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.unicauca.edu.asae.core.docente.aplicacion.output.IGestionarDocenteGatewayPort;
import com.unicauca.edu.asae.core.docente.dominio.models.Docente;
import com.unicauca.edu.asae.core.docente.infraestructura.output.persistencia.entidades.DocenteEntity;
import com.unicauca.edu.asae.core.docente.infraestructura.output.persistencia.repositorios.DocenteRepositoryInt;

@Service
public class GestionarDocenteGatewayImplAdapter implements IGestionarDocenteGatewayPort {


    private final DocenteRepositoryInt objDocenteRepository;

    private final ModelMapper mapper;

    public GestionarDocenteGatewayImplAdapter(DocenteRepositoryInt objDocenteRepository, ModelMapper docenteModelMapper) {
        this.objDocenteRepository = objDocenteRepository;
        this.mapper = docenteModelMapper;
    }

    @Override
    public Docente guardar(Docente objDocente) {
        DocenteEntity objDocenteEntity = this.mapper.map(objDocente, DocenteEntity.class);
        DocenteEntity objDocenteEntityRegistrado = this.objDocenteRepository.save(objDocenteEntity);
        Docente objDocenteRespuesta = this.mapper.map(objDocenteEntityRegistrado, Docente.class);

        return objDocenteRespuesta;
    }

    @Override
    public boolean existeDocentePorCorreo(String correo) {
        return this.objDocenteRepository.existsByCorreo(correo);
    }


}
