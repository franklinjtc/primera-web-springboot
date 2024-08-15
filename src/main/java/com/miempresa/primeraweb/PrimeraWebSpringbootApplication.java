package com.miempresa.primeraweb;

import com.miempresa.primeraweb.entities.Persona;
import com.miempresa.primeraweb.repository.PersonaRepository;
import com.miempresa.primeraweb.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLOutput;
import java.util.List;

@SpringBootApplication
public class PrimeraWebSpringbootApplication implements CommandLineRunner {
	@Autowired
	private PersonaService personaService;
	public static void main(String[] args) {
		SpringApplication.run(PrimeraWebSpringbootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		personaService.crearPersona(new Persona(6L,"Xiomara Gonzales",29));
		personaService.crearPersona(new Persona(7L,"Rosario Cardenas",50));
		personaService.crearPersona(new Persona(8L,"Enzo Tello",32));
		personaService.crearPersona(new Persona(9L,"Gaetano Tello",8));
		personaService.crearPersona(new Persona(10L,"Franklin Tello",34));

		System.out.println("Número de personas de la tabla: "+personaService.contarPersonas());

		List<Persona> personas=personaService.obtenerTodas();
		personas.forEach(p-> System.out.println("Nombre de persona : "+p.getNombre()));
	}
}
