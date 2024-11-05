package com.unicauca.edu.asae.core.franjasHorarias.infraestructura.output.formateador;

import org.springframework.stereotype.Service;

import com.unicauca.edu.asae.core.franjasHorarias.aplicacion.output.IAsignaturaFormateadorResultadosPort;
import com.unicauca.edu.asae.core.franjasHorarias.infraestructura.output.controladorExcepciones.excepcionesPropias.EntidadYaExisteException;
import com.unicauca.edu.asae.core.franjasHorarias.infraestructura.output.controladorExcepciones.excepcionesPropias.ReglaNegocioExcepcion;

@Service
public class AsignaturaFormateadorResultadosImplAdapter implements IAsignaturaFormateadorResultadosPort{

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
