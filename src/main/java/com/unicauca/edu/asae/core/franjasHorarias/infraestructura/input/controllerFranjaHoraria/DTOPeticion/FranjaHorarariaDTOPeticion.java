package com.unicauca.edu.asae.core.franjasHorarias.infraestructura.input.controllerFranjaHoraria.DTOPeticion;


import java.sql.Time;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class FranjaHorarariaDTOPeticion {
    @NotNull(message = "{franja.dia.emply}")
    @NotEmpty(message = "{franja.dia.emply}")
    @Size(min = 5, max =10,message = "{franja.tipo.size}")
    private  String dia;
    @NotNull(message = "{franja.horainicio.emply}")
    private Time hora_inicio;
    @NotNull(message = "{franja.horafin.emply}")
    private Time hora_fin;
    @NotNull(message = "{franja.idcurso.emply}")
    @Positive(message = "{franja.valor.positive}")
    private Integer idCurso;
    @NotNull(message = "{franja.idespaciofisico.emply}")
    @Positive(message = "{franja.valor.positive}")
    private Integer idEspacioFisico;
    
}
