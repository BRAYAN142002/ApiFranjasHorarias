package com.unicauca.edu.asae.core.docente.infraestructura.output.persistencia.gateway;

import com.unicauca.edu.asae.core.aplicacion.output.IGestionarDocenteGatewayPort;
import com.unicauca.edu.asae.core.dominio.models.Docente;
import com.unicauca.edu.asae.core.docente.infraestructura.output.persistencia.repositorios.DocenteRepositoryInt;
import org.modelmapper.ModelMapper;

public class GestionarDocenteGatewayImplAdapter implements IGestionarDocenteGatewayPort {

    private final DocenteRepositoryInt objDocenteRepository;

    private final ModelMapper mapper;

    public GestionarDocenteGatewayImplAdapter(DocenteRepositoryInt objDocenteRepository, ModelMapper docenteModelMapper) {
        this.objDocenteRepository = objDocenteRepository;
        this.mapper = docenteModelMapper;
    }

    @Override
    public boolean existeDocentePorId(Integer id) {
        return this.objDocenteRepository.existsById(id);
    }

    @Override
    public Docente guardar(Docente objDocente) {
        return null;
    }
}
