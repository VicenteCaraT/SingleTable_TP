package com.example.SignleTable_Vicente.entidades;

import com.example.SignleTable_Vicente.enumeraciones.Especialidades;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@ToString
@Setter
@SuperBuilder
@DiscriminatorValue("A")
public class Alumno extends Persona {
    private int legajo;
    private Especialidades especialidad;
}
