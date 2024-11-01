package com.unicauca.edu.asae.core.franjasHorarias.infraestructura.output.persistencia.gateway;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.unicauca.edu.asae.core.franjasHorarias.aplicacion.output.IGestionarCursoGatewayPort;
import com.unicauca.edu.asae.core.franjasHorarias.dominio.modelos.Curso;
import com.unicauca.edu.asae.core.franjasHorarias.infraestructura.output.persistencia.entidades.CursoEntity;
import com.unicauca.edu.asae.core.franjasHorarias.infraestructura.output.persistencia.repositorios.CursoRepository;

import java.util.Optional;

import org.modelmapper.ModelMapper;;

@Service
public class GestionarCursoAdapter implements IGestionarCursoGatewayPort{

    private final CursoRepository cursoRepository;
   
   private final ModelMapper cursoModelMapper;

   public  GestionarCursoAdapter(CursoRepository cursoRepository,@Qualifier( "modelMapper")ModelMapper cursoMapper){
    this.cursoModelMapper=cursoMapper;
    this.cursoRepository=cursoRepository;
   }

   @Override
    public Curso crear(Curso curso) {
        CursoEntity cursoEntity=this.cursoModelMapper.map(curso, CursoEntity.class);
        CursoEntity objCursoEntity=cursoRepository.save(cursoEntity);
        return cursoModelMapper.map(objCursoEntity, Curso.class);
    }
    @Override
    public Optional<Curso> obtenerCursoPorId(Integer id){
         Optional<CursoEntity> cursoEntity=cursoRepository.findById(id);
         return cursoEntity.map(entity -> cursoModelMapper.map(entity, Curso.class));
    }
    
}
