package com.unicauca.edu.asae.core.docente.aplicacion.output;

public interface IDocenteFormateadorResultadosPort {

    public void retornarRespuestaErrorEntidadExiste(String mensaje);

    public void retornarRespuestaErrorReglaDeNegocio(String mensaje);
}
