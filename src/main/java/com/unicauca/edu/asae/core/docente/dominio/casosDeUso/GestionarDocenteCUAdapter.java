package com.unicauca.edu.asae.core.docente.dominio.casosDeUso;

import com.unicauca.edu.asae.core.docente.aplicacion.input.IGestionarDocenteCUPort;
import com.unicauca.edu.asae.core.docente.aplicacion.output.IDocenteFormateadorResultadosPort;
import com.unicauca.edu.asae.core.docente.aplicacion.output.IGestionarDocenteGatewayPort;
import com.unicauca.edu.asae.core.docente.dominio.models.Docente;

public class GestionarDocenteCUAdapter implements IGestionarDocenteCUPort {

    private final IGestionarDocenteGatewayPort objGestionarDocenteGateway;

    private final IDocenteFormateadorResultadosPort objDocenteFormateadorResultados;

    public GestionarDocenteCUAdapter(IGestionarDocenteGatewayPort objGestionarDocenteGateway, IDocenteFormateadorResultadosPort objDocenteFormateadorResultados) {
        this.objGestionarDocenteGateway = objGestionarDocenteGateway;
        this.objDocenteFormateadorResultados = objDocenteFormateadorResultados;
    }

    @Override
    public Docente crear(Docente objDocente) {
        Docente objDocenteCreado = null;
        if (this.objGestionarDocenteGateway.existeDocentePorId(objDocente.getId())){
            this.objDocenteFormateadorResultados.retornarRespuestaErrorEntidadExiste("Error, el docente ya se encuentra registrado en el sistema");
        } else {
            objDocenteCreado = this.objGestionarDocenteGateway.guardar(objDocente);
        }
        return objDocenteCreado;
    }
}
