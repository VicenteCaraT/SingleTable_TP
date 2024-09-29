package com.example.SignleTable_Vicente;

import com.example.SignleTable_Vicente.entidades.Alumno;
import com.example.SignleTable_Vicente.entidades.Profesor;
import com.example.SignleTable_Vicente.enumeraciones.Especialidades;
import com.example.SignleTable_Vicente.enumeraciones.Titulos;
import com.example.SignleTable_Vicente.repositorios.AlumnoRepository;
import com.example.SignleTable_Vicente.repositorios.PersonaRepository;
import com.example.SignleTable_Vicente.repositorios.ProfesorRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.time.LocalDate;

@SpringBootApplication
public class SignleTableVicenteApplication {
	private static final Logger logger = LoggerFactory.getLogger(SignleTableVicenteApplication.class);

	@Autowired
	private PersonaRepository personaRepository;
	@Autowired
	private ProfesorRepository profesorRepository;

	@Autowired
	private AlumnoRepository alumnoRepository;
	public static void main(String[] args) {
		SpringApplication.run(SignleTableVicenteApplication.class, args);

		System.out.println("funcionando");
	}

	@Bean
	@Transactional
	CommandLineRunner init(PersonaRepository personaRepository,
						   AlumnoRepository alumnoRepository,
						   ProfesorRepository profesorRepository) {
		return args -> {
			//Profesores
			Profesor pro1 = Profesor.builder()
					.nombre("Alberto")
					.apellido("Cortez")
					.fechaIngreso(LocalDate.of(2022, 1, 1))
					.cantHijos(2)
					.titulo(Titulos.MASTER)
					.sueldo(new BigDecimal("123.45"))
					.build();

			Profesor pro2 = Profesor.builder()
					.nombre("Rodrigo")
					.apellido("Taza")
					.fechaIngreso(LocalDate.of(2022, 1, 1))
					.cantHijos(1)
					.titulo(Titulos.INGENIERO)
					.sueldo(new BigDecimal("100.00"))
					.build();

			//Alumnos
			Alumno alum1 = Alumno.builder()
					.nombre("Vicente")
					.apellido("Cara")
					.legajo(62098)
					.especialidad(Especialidades.BACHILLER)
					.build();

			Alumno alum2 = Alumno.builder()
					.nombre("Francisco")
					.apellido("Peralta")
					.legajo(63123)
					.especialidad(Especialidades.BACHILLER)
					.build();

			// Lo grabo a través del repositorio de Spring
			profesorRepository.save(pro1);
			profesorRepository.save(pro2);
			alumnoRepository.save(alum1);
			alumnoRepository.save(alum2);
		};
	}
}
