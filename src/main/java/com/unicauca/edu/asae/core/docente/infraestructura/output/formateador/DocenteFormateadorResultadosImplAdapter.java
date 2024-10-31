package com.unicauca.edu.asae.core.docente.infraestructura.output.formateador;

import org.springframework.stereotype.Service;

import com.unicauca.edu.asae.core.docente.aplicacion.output.IDocenteFormateadorResultadosPort;
import com.unicauca.edu.asae.core.docente.infraestructura.output.controladorExcepciones.excepcionesPropias.EntidadYaExisteException;
import com.unicauca.edu.asae.core.docente.infraestructura.output.controladorExcepciones.excepcionesPropias.ReglaNegocioExcepcion;

@Service
public class DocenteFormateadorResultadosImplAdapter implements IDocenteFormateadorResultadosPort{

    @Override
    public void retornarRespuestaErrorEntidadExiste(String mensaje) {
        EntidadYaExisteException objException = new EntidadYaExisteException(mensaje);
        throw objException;
    }

    @Override
    public void retornarRespuestaErrorReglaDeNegocio(String mensaje) {
        ReglaNegocioExcepcion objException = new ReglaNegocioExcepcion(mensaje);
        throw objException;
    }
}
