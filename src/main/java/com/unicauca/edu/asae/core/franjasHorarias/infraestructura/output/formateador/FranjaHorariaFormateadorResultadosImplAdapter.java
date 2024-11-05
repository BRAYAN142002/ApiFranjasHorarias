package com.unicauca.edu.asae.core.franjasHorarias.infraestructura.output.formateador;

import org.springframework.stereotype.Service;

import com.unicauca.edu.asae.core.docente.infraestructura.output.controladorExcepciones.excepcionesPropias.EntidadNoExisteException;
import com.unicauca.edu.asae.core.docente.infraestructura.output.controladorExcepciones.excepcionesPropias.ReglaNegocioExcepcion;
import com.unicauca.edu.asae.core.franjasHorarias.aplicacion.output.IFranjaHorariaFormateadorResultadosPort;
import com.unicauca.edu.asae.core.franjasHorarias.infraestructura.output.controladorExcepciones.excepcionesPropias.EntidadYaExisteException;



@Service
public class FranjaHorariaFormateadorResultadosImplAdapter implements IFranjaHorariaFormateadorResultadosPort {

    @Override
    public void retornarRespuestaErrorEntidadExiste(String mensaje) {
        EntidadYaExisteException objException=new EntidadYaExisteException(mensaje);
        throw objException;
    }

    @Override
    public void retornarRespuestaErrorReglaDeNegocio(String mensaje) {
       ReglaNegocioExcepcion objException =new ReglaNegocioExcepcion(mensaje);
       throw objException;
    }

    @Override
    public void retornarRespuestaErrorEntidadNOExiste(String mensaje) {
      EntidadNoExisteException objException=new EntidadNoExisteException(mensaje);
      throw objException;
    }
    
}
