package com.unicauca.edu.asae.core.franjasHorarias.infraestructura.output.controladorExcepciones.excepcionesPropias;

import com.unicauca.edu.asae.core.franjasHorarias.infraestructura.output.controladorExcepciones.estructuraExcepciones.CodigoError;

import lombok.Getter;

@Getter
public class EspacioFisicoNoExisteException extends RuntimeException{
    
  private final String llaveMensaje;
  private final String codigo;

  public EspacioFisicoNoExisteException (CodigoError code){
    super(code.getCodigo());
    this.llaveMensaje=code.getLlaveMensaje();
    this.codigo=code.getCodigo();
  }
   public EspacioFisicoNoExisteException (final String message) {
        super(message);
        this.llaveMensaje = CodigoError.ESPACIOFISICO_NOENCONTRADO.getLlaveMensaje();
        this.codigo = CodigoError.ESPACIOFISICO_NOENCONTRADO.getCodigo();
    }
}
