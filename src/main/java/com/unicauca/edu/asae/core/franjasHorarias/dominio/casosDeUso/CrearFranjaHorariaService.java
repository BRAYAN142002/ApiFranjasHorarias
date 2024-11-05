package com.unicauca.edu.asae.core.franjasHorarias.dominio.casosDeUso;

import java.util.List;
import java.util.Optional;



import com.unicauca.edu.asae.core.docente.aplicacion.output.IValidarDocenteGatewayPort;
import com.unicauca.edu.asae.core.docente.dominio.models.Docente;
import com.unicauca.edu.asae.core.espacioFisico.aplicacion.output.IGestionarEspacioFisicoGatewayPort;
import com.unicauca.edu.asae.core.espacioFisico.aplicacion.output.IValidarEspacioFisicoGatewayPort;
import com.unicauca.edu.asae.core.espacioFisico.dominio.modelos.EspacioFisico;
import com.unicauca.edu.asae.core.franjasHorarias.aplicacion.input.ICrearFranjaHorariaCUPort;
import com.unicauca.edu.asae.core.franjasHorarias.aplicacion.output.ICrearFranjaHorariaGatewayPort;
import com.unicauca.edu.asae.core.franjasHorarias.aplicacion.output.IFranjaHorariaFormateadorResultadosPort;
import com.unicauca.edu.asae.core.franjasHorarias.aplicacion.output.IGestionarCursoGatewayPort;
import com.unicauca.edu.asae.core.franjasHorarias.dominio.modelos.Curso;
import com.unicauca.edu.asae.core.franjasHorarias.dominio.modelos.FranjaHoraria;

public class CrearFranjaHorariaService implements ICrearFranjaHorariaCUPort{

    private final ICrearFranjaHorariaGatewayPort crearFranjaHorariaGatewayPort;
    private final IGestionarCursoGatewayPort  gestionarCursoGatewayPort;
    private final IGestionarEspacioFisicoGatewayPort gestionarEspacioFisicoGatewayPort;
    private final IFranjaHorariaFormateadorResultadosPort franjaHorariaFormateadorResultadosPort;
    private final IValidarDocenteGatewayPort validarDocenteGatewayPort;
    private final IValidarEspacioFisicoGatewayPort validarEspacioFisicoGatewayPort;

    public CrearFranjaHorariaService(ICrearFranjaHorariaGatewayPort crearFranjaHorariaGatewayPort,IGestionarCursoGatewayPort gestionarCursoGatewayPort,IGestionarEspacioFisicoGatewayPort gestionarEspacioFisicoGatewayPort,IFranjaHorariaFormateadorResultadosPort franjaHorariaFormateadorResultadosPort,IValidarDocenteGatewayPort validarDocenteGatewayPort,IValidarEspacioFisicoGatewayPort validarEspacioFisicoGatewayPort){
        this.crearFranjaHorariaGatewayPort=crearFranjaHorariaGatewayPort;
        this.gestionarCursoGatewayPort=gestionarCursoGatewayPort;
        this.gestionarEspacioFisicoGatewayPort=gestionarEspacioFisicoGatewayPort;
        this.franjaHorariaFormateadorResultadosPort=franjaHorariaFormateadorResultadosPort;
        this.validarDocenteGatewayPort=validarDocenteGatewayPort;
        this.validarEspacioFisicoGatewayPort=validarEspacioFisicoGatewayPort;
    } 

    @Override
    public FranjaHoraria crearFranjaHoraria(FranjaHoraria franjaHoraria) {
        Optional<Curso> objCurso=gestionarCursoGatewayPort.obtenerCursoPorId(franjaHoraria.getObjCurso().getId());

        Optional<EspacioFisico> objEspacioFisico=gestionarEspacioFisicoGatewayPort.obtenerPorId(franjaHoraria.getObjEspacioFisico().getId());


        if(objCurso.isPresent()){
            franjaHoraria.setObjCurso(objCurso.get());

            if(objEspacioFisico.isPresent()){

                List<EspacioFisico> objAux=this.validarEspacioFisicoGatewayPort.disponibilidadEspacioFisico(franjaHoraria.getDia(), franjaHoraria.getHora_inicio(), franjaHoraria.getHora_fin(), franjaHoraria.getObjEspacioFisico().getId());

                if(objAux.size()!=0){
                    this.franjaHorariaFormateadorResultadosPort.retornarRespuestaErrorReglaDeNegocio("Error, el espacio fisico esta ocupado en esa franja horaria");
                }else{
                    if(verificarDocente(franjaHoraria)){

                        franjaHoraria.setObjEspacioFisico(objEspacioFisico.get());
                    }else{
                        this.franjaHorariaFormateadorResultadosPort.retornarRespuestaErrorReglaDeNegocio("Error, El docente esta registrado en otra franja Horaria");
                    }
                }
             

            }else{
                this.franjaHorariaFormateadorResultadosPort.retornarRespuestaErrorEntidadNOExiste("Error, no se encuentra el espacio fisico con ese id");
            }

        }else{
            this.franjaHorariaFormateadorResultadosPort.retornarRespuestaErrorEntidadNOExiste("Error, no se encuentra creado el curso con ese id");
        }
       return this.crearFranjaHorariaGatewayPort.crearFranjaHoraria(franjaHoraria);
    }

    public boolean verificarDocente(FranjaHoraria objFranjaHoraria){
        boolean bandera=true;
        for(Docente objDocente:objFranjaHoraria.getObjCurso().getListaDocentes()){
          if(this.validarDocenteGatewayPort.disponiblidadDocente(objFranjaHoraria.getDia(), objFranjaHoraria.getHora_inicio(), objFranjaHoraria.getHora_fin(), objDocente.getId()).size()!=0){
            bandera=false;
          }
        }
        return bandera;

    }
    
}
