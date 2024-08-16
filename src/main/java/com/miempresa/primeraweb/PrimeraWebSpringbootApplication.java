package com.miempresa.primeraweb;


import com.miempresa.primeraweb.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLOutput;
import java.util.List;

@SpringBootApplication
public class PrimeraWebSpringbootApplication {
	@Autowired
	private PersonaService personaService;
	public static void main(String[] args) {
		SpringApplication.run(PrimeraWebSpringbootApplication.class, args);
	}

	/*@Override
	public void run(String... args) throws Exception {
		personaService.crearPersona(new Persona(11L,"Gonzales",29));
		personaService.crearPersona(new Persona(12L,"Cardenas",50));
		personaService.crearPersona(new Persona(13L,"Tello1",32));
		personaService.crearPersona(new Persona(14L,"Tello2",8));
		personaService.crearPersona(new Persona(15L,"Tello3",34));

		System.out.println("Número de personas de la tabla: "+personaService.contarPersonas());

		List<Persona> personas=personaService.obtenerTodas();
		personas.forEach(p-> System.out.println("Nombre de persona : "+p.getNombre()));
	}*/
}
