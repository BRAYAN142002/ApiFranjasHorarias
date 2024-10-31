package com.unicauca.edu.asae.core.docente.infraestructura.input.controllerGestionarDocente.mappers;

import com.unicauca.edu.asae.core.docente.dominio.models.Docente;
import com.unicauca.edu.asae.core.docente.dominio.models.Oficina;
import com.unicauca.edu.asae.core.docente.infraestructura.input.controllerGestionarDocente.DTOPeticion.DocenteDTOPeticion;
import com.unicauca.edu.asae.core.docente.infraestructura.input.controllerGestionarDocente.DTOPeticion.OficinaDTOPeticion;
import com.unicauca.edu.asae.core.docente.infraestructura.input.controllerGestionarDocente.DTORespuesta.DocenteDTORespuesta;
import com.unicauca.edu.asae.core.docente.infraestructura.input.controllerGestionarDocente.DTORespuesta.OficinaDTORespuesta;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-10-31T01:04:29-0500",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.40.0.v20240919-1711, environment: Java 17.0.12 (Eclipse Adoptium)"
)
@Component
public class DocenteMapperInfraestructuraDominioImpl implements DocenteMapperInfraestructuraDominio {

    @Override
    public Docente mappearDePeticionADocente(DocenteDTOPeticion objPeticion) {
        if ( objPeticion == null ) {
            return null;
        }

        Docente docente = new Docente();

        docente.setApellido( objPeticion.getApellido() );
        docente.setCorreo( objPeticion.getCorreo() );
        docente.setNombre( objPeticion.getNombre() );
        docente.setOficinaAsignada( mappearDePeticionAOficina( objPeticion.getOficinaAsignada() ) );

        return docente;
    }

    @Override
    public DocenteDTORespuesta mappearDeDocenteARespuesta(Docente objdocente) {
        if ( objdocente == null ) {
            return null;
        }

        DocenteDTORespuesta docenteDTORespuesta = new DocenteDTORespuesta();

        docenteDTORespuesta.setApellido( objdocente.getApellido() );
        docenteDTORespuesta.setCorreo( objdocente.getCorreo() );
        docenteDTORespuesta.setId( objdocente.getId() );
        docenteDTORespuesta.setNombre( objdocente.getNombre() );
        docenteDTORespuesta.setOficinaAsignada( oficinaToOficinaDTORespuesta( objdocente.getOficinaAsignada() ) );

        return docenteDTORespuesta;
    }

    @Override
    public Oficina mappearDePeticionAOficina(OficinaDTOPeticion objOficina) {
        if ( objOficina == null ) {
            return null;
        }

        Oficina oficina = new Oficina();

        oficina.setNombre( objOficina.getNombre() );
        oficina.setUbicacion( objOficina.getUbicacion() );

        return oficina;
    }

    protected OficinaDTORespuesta oficinaToOficinaDTORespuesta(Oficina oficina) {
        if ( oficina == null ) {
            return null;
        }

        OficinaDTORespuesta oficinaDTORespuesta = new OficinaDTORespuesta();

        oficinaDTORespuesta.setId( oficina.getId() );
        oficinaDTORespuesta.setNombre( oficina.getNombre() );
        oficinaDTORespuesta.setUbicacion( oficina.getUbicacion() );

        return oficinaDTORespuesta;
    }
}
