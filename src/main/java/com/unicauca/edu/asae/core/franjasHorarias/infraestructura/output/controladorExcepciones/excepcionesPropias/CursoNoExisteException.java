package com.unicauca.edu.asae.core.franjasHorarias.infraestructura.output.controladorExcepciones.excepcionesPropias;

import com.unicauca.edu.asae.core.franjasHorarias.infraestructura.output.controladorExcepciones.estructuraExcepciones.CodigoError;

import lombok.Getter;

@Getter
public class CursoNoExisteException extends RuntimeException {
      
  private final String llaveMensaje;
  private final String codigo;

  public CursoNoExisteException (CodigoError code){
    super(code.getCodigo());
    this.llaveMensaje=code.getLlaveMensaje();
    this.codigo=code.getCodigo();
  }
   public CursoNoExisteException (final String message) {
        super(message);
        this.llaveMensaje = CodigoError.CURSO_NOENCONTRADO.getLlaveMensaje();
        this.codigo = CodigoError.CURSO_NOENCONTRADO.getCodigo();
    }
}
