//Esta es la página principal donde correra la aplicación

//Este es paquete se creo automaticamente al crear el la aplicación
package com.example.solutApi;

//Anotaciones que se importan
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//Es una anotación que proporciona configuración y funcionalidad preconfigurada para una aplicación Spring Boot
@SpringBootApplication

//La clase SolutApiApplication
public class SolutApiApplication {

	//Realiza la configuración automática basada en las dependencias y componentes presentes en el classpath,
	// y finalmente inicia la aplicación,
	public static void main(String[] args) {
		SpringApplication.run(SolutApiApplication.class, args);
	}

}
