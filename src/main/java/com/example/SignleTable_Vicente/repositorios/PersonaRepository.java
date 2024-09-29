package com.example.SignleTable_Vicente.repositorios;

import com.example.SignleTable_Vicente.entidades.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository extends JpaRepository <Persona, Long> {
}
