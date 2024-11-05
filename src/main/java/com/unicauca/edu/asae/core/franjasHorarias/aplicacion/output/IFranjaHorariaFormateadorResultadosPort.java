package com.unicauca.edu.asae.core.franjasHorarias.aplicacion.output;

public interface IFranjaHorariaFormateadorResultadosPort {
    public void retornarRespuestaErrorEntidadExiste(String mensaje);
    public void retornarRespuestaErrorReglaDeNegocio(String mensaje);
    public void retornarRespuestaErrorEntidadNOExiste(String mensaje);
    public void retornarRespuestaErrorDocenteOcupado(String mensaje);
    public void retornarRepuestaErrorEspacioFisicoOcupado(String mensaje);
    public void retornarRespuestaErrorCursoNoEncontrado(String mensaje);
    public void retornarRespuestaErrorEspacioFisicoNoEncontado(String mensaje);


}
