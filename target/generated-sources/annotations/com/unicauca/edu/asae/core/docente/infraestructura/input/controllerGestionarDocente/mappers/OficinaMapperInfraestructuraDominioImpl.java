package com.unicauca.edu.asae.core.docente.infraestructura.input.controllerGestionarDocente.mappers;

import com.unicauca.edu.asae.core.docente.dominio.models.Oficina;
import com.unicauca.edu.asae.core.docente.infraestructura.input.controllerGestionarDocente.DTOPeticion.OficinaDTOPeticion;
import com.unicauca.edu.asae.core.docente.infraestructura.input.controllerGestionarDocente.DTORespuesta.OficinaDTORespuesta;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-10-31T19:08:10-0500",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.40.0.z20241023-1306, environment: Java 17.0.13 (Eclipse Adoptium)"
)
@Component
public class OficinaMapperInfraestructuraDominioImpl implements OficinaMapperInfraestructuraDominio {

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

    @Override
    public OficinaDTORespuesta mappearDeOficinaARespuesta(Oficina objOficina) {
        if ( objOficina == null ) {
            return null;
        }

        OficinaDTORespuesta oficinaDTORespuesta = new OficinaDTORespuesta();

        oficinaDTORespuesta.setId( objOficina.getId() );
        oficinaDTORespuesta.setNombre( objOficina.getNombre() );
        oficinaDTORespuesta.setUbicacion( objOficina.getUbicacion() );

        return oficinaDTORespuesta;
    }
}
