package com.unicauca.edu.asae.core.franjasHorarias.dominio.casosDeUso;

import java.util.List;

import com.unicauca.edu.asae.core.franjasHorarias.aplicacion.input.IListarFranjaHorariaPorDocenteCUPort;
import com.unicauca.edu.asae.core.franjasHorarias.aplicacion.output.IFranjaHorariaFormateadorResultadosPort;
import com.unicauca.edu.asae.core.franjasHorarias.aplicacion.output.IListarFranjaHorariaPorDocenteGatewayPort;
import com.unicauca.edu.asae.core.franjasHorarias.dominio.modelos.FranjaHoraria;

public class ListarFranjaHorariaPorDocenteService implements IListarFranjaHorariaPorDocenteCUPort{
    private final IListarFranjaHorariaPorDocenteGatewayPort  listarFranjaHorariaPorDocenteGatewayPort;
    private final IFranjaHorariaFormateadorResultadosPort  franjaHorariaFormateadorResultadosPort;

    public ListarFranjaHorariaPorDocenteService(IListarFranjaHorariaPorDocenteGatewayPort listarFranjaHorariaPorDocenteGatewayPort,IFranjaHorariaFormateadorResultadosPort franjaHorariaFormateadorResultadosPort){
        this.listarFranjaHorariaPorDocenteGatewayPort=listarFranjaHorariaPorDocenteGatewayPort;
        this.franjaHorariaFormateadorResultadosPort=franjaHorariaFormateadorResultadosPort;
    }

    @Override
    public List<FranjaHoraria> listarFranjaHorariaPorDOcente(Integer idDocente) {
        return listarFranjaHorariaPorDocenteGatewayPort.listarFranjaHorariaPorDOcente(idDocente);
    }
    
}
