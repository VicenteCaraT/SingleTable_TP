package com.example.SignleTable_Vicente.repositorios;

import com.example.SignleTable_Vicente.entidades.Alumno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlumnoRepository extends JpaRepository <Alumno, Long> {
}
