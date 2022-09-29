package com.example.Ejercicio03datajpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Ejercicio03DatajpaApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(Ejercicio03DatajpaApplication.class, args);
		PacienteRepository repository = context.getBean(PacienteRepository.class);

		System.out.println("El número en la base de datos es: " + repository.count());

		Paciente a001 = new Paciente(null, "Raul", "Gutierrez", 1990 ,"Medular" );
		Paciente a002 = new Paciente(null, "María Antonia", "Rodriguez", 1986 ,"Esguince tobillo" );
		Paciente a003 = new Paciente(null, "Horacio", "Mamaní", 1967 ,"Rect. cervical" );
		repository.save(a001);
		repository.save(a002);
		repository.save(a003);

		System.out.println("El número en la base de datos es: " + repository.count());
		System.out.println(repository.findAll());



	}

}
