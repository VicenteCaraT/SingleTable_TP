package com.example.SignleTable_Vicente.repositorios;

import com.example.SignleTable_Vicente.entidades.Alumno;
import com.example.SignleTable_Vicente.entidades.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfesorRepository extends JpaRepository <Profesor, Long> {
}
