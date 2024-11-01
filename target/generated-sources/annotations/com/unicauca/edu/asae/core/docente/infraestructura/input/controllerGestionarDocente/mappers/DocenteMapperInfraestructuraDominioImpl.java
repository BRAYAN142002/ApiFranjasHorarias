package com.unicauca.edu.asae.core.docente.infraestructura.input.controllerGestionarDocente.mappers;

import com.unicauca.edu.asae.core.docente.dominio.models.Docente;
import com.unicauca.edu.asae.core.docente.infraestructura.input.controllerGestionarDocente.DTOPeticion.DocenteDTOPeticion;
import com.unicauca.edu.asae.core.docente.infraestructura.input.controllerGestionarDocente.DTORespuesta.DocenteDTORespuesta;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-11-01T10:20:58-0500",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.40.0.z20241023-1306, environment: Java 17.0.13 (Eclipse Adoptium)"
)
@Component
public class DocenteMapperInfraestructuraDominioImpl implements DocenteMapperInfraestructuraDominio {

    @Autowired
    private OficinaMapperInfraestructuraDominio oficinaMapperInfraestructuraDominio;

    @Override
    public Docente mappearDePeticionADocente(DocenteDTOPeticion objPeticion) {
        if ( objPeticion == null ) {
            return null;
        }

        Docente docente = new Docente();

        docente.setApellido( objPeticion.getApellido() );
        docente.setCorreo( objPeticion.getCorreo() );
        docente.setNombre( objPeticion.getNombre() );
        docente.setOficinaAsignada( oficinaMapperInfraestructuraDominio.mappearDePeticionAOficina( objPeticion.getOficinaAsignada() ) );

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
        docenteDTORespuesta.setOficinaAsignada( oficinaMapperInfraestructuraDominio.mappearDeOficinaARespuesta( objdocente.getOficinaAsignada() ) );

        return docenteDTORespuesta;
    }
}
