package com.unicauca.edu.asae.core.franjasHorarias.infraestructura.output.controladorExcepciones.estructuraExcepciones;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum CodigoError {

        ERROR_GENERICO("GC-0001", "ERROR GENERICO"),
        ENTIDAD_YA_EXISTE("GC-0002", "ERROR ENTIDAD YA EXISTE"),
        ENTIDAD_NO_ENCONTRADA("GC-0003", "Entidad no encontrada"),
        VIOLACION_REGLA_DE_NEGOCIO("GC-0004", "Regla de negocio violada"),
        CREDENCIALES_INVALIDAS("GC-0005", "Error al iniciar sesión, compruebe sus credenciales y vuelva a intentarlo"),
        USUARIO_DESHABILITADO("GC-0006",
                        "El usuario no ha sido verificado, por favor revise su correo para verificar su cuenta"),
        DOCENTE_OCUPADO("GC-0007","ERROR, Docente ocupado"),
        ESPACIO_OCUPADO("GC-0008","ERROR, Espacio ocupado"),
        CURSO_NOENCONTRADO("GC-0009","ERROR, Curso no encontrado"),
        ESPACIOFISICO_NOENCONTRADO("GC-0010","ERROR, Espacio Fisico no encontrado");

        private final String codigo;
        private final String llaveMensaje;
}
