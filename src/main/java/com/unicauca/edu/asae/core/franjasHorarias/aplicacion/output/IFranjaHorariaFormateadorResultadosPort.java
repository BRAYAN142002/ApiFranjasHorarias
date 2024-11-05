package com.unicauca.edu.asae.core.franjasHorarias.aplicacion.output;

public interface IFranjaHorariaFormateadorResultadosPort {
    public void retornarRespuestaErrorEntidadExiste(String mensaje);
    public void retornarRespuestaErrorReglaDeNegocio(String mensaje);
    public void retornarRespuestaErrorEntidadNOExiste(String mensaje);

}
