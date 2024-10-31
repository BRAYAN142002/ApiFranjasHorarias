package com.unicauca.edu.asae.core.docente.infraestructura.output.formateador;

import org.springframework.stereotype.Service;

import com.unicauca.edu.asae.core.docente.aplicacion.output.IDocenteFormateadorResultadosPort;

@Service
public class DocenteFormateadorResultadosImplAdapter implements IDocenteFormateadorResultadosPort{

    @Override
    public void retornarRespuestaErrorEntidadExiste(String mensaje) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'retornarRespuestaErrorEntidadExiste'");
    }

    @Override
    public void retornarRespuestaErrorReglaDeNegocio(String mensaje) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'retornarRespuestaErrorReglaDeNegocio'");
    }
}
