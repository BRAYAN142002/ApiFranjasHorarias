package com.unicauca.edu.asae.core.franjasHorarias.infraestructura.output.controladorExcepciones.excepcionesPropias;

import com.unicauca.edu.asae.core.franjasHorarias.infraestructura.output.controladorExcepciones.estructuraExcepciones.CodigoError;

import lombok.Getter;

@Getter
public class EspacioFisicOcupadoException extends RuntimeException{
    private final String llaveMensaje;
  private final String codigo;

  public EspacioFisicOcupadoException(CodigoError code){
    super(code.getCodigo());
    this.llaveMensaje=code.getLlaveMensaje();
    this.codigo=code.getCodigo();
  }
   public EspacioFisicOcupadoException(final String message) {
        super(message);
        this.llaveMensaje = CodigoError.ESPACIO_OCUPADO.getLlaveMensaje();
        this.codigo = CodigoError.ESPACIO_OCUPADO.getCodigo();
    }
}
