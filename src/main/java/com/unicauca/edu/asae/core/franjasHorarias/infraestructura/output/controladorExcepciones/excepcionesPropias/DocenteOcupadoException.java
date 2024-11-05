package com.unicauca.edu.asae.core.franjasHorarias.infraestructura.output.controladorExcepciones.excepcionesPropias;



import com.unicauca.edu.asae.core.franjasHorarias.infraestructura.output.controladorExcepciones.estructuraExcepciones.CodigoError;

import lombok.Getter;

@Getter
public class DocenteOcupadoException extends RuntimeException{
    
  private final String llaveMensaje;
  private final String codigo;

  public DocenteOcupadoException(CodigoError code){
    super(code.getCodigo());
    this.llaveMensaje=code.getLlaveMensaje();
    this.codigo=code.getCodigo();
  }
   public DocenteOcupadoException(final String message) {
        super(message);
        this.llaveMensaje = CodigoError.DOCENTE_OCUPADO.getLlaveMensaje();
        this.codigo = CodigoError.DOCENTE_OCUPADO.getCodigo();
    }

}
