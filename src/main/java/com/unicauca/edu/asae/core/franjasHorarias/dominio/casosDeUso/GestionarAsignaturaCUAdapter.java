package com.unicauca.edu.asae.core.franjasHorarias.dominio.casosDeUso;

import com.unicauca.edu.asae.core.franjasHorarias.aplicacion.input.IGestionarAsignaturaCUPort;
import com.unicauca.edu.asae.core.franjasHorarias.aplicacion.output.IAsignaturaFormateadorResultadosPort;
import com.unicauca.edu.asae.core.franjasHorarias.aplicacion.output.IGestionarAsignaturaGatewayPort;
import com.unicauca.edu.asae.core.franjasHorarias.dominio.modelos.Asignatura;

public class GestionarAsignaturaCUAdapter implements IGestionarAsignaturaCUPort {

    private final IGestionarAsignaturaGatewayPort objGestionarAsignaturaGateway;
    private final IAsignaturaFormateadorResultadosPort objAsignaturaFormateadorResultados;

    public GestionarAsignaturaCUAdapter(IGestionarAsignaturaGatewayPort objGestionarAsignaturaGateway,
                                        IAsignaturaFormateadorResultadosPort objAsignaturaFormateadorResultados) {
        this.objGestionarAsignaturaGateway = objGestionarAsignaturaGateway;
        this.objAsignaturaFormateadorResultados = objAsignaturaFormateadorResultados;
    }

    @Override
    public Asignatura crear(Asignatura objAsignatura) {
        Asignatura objAsignaturaCreada = null;
        if (this.objGestionarAsignaturaGateway.existeAsignaturaPorCodigo(objAsignatura.getCodigo())) {
            this.objAsignaturaFormateadorResultados.retornarRespuestaErrorEntidadExiste("Error, se encuentra en el sistema una asignatura con el codigo");
        }else {
            objAsignaturaCreada = this.objGestionarAsignaturaGateway.guardar(objAsignatura);
        }
        return objAsignaturaCreada;
    }
}
