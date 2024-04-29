//Paquete llamado entities
package com.example.solutApi.entities;

// Anotaciones que se importan
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

//Define que esta es una clase es una entidad
@Entity

//Con la dependencia Lombok podemos hacer los Getters y Setters con esta anotación
@Data

//Los constructores para la gestión de depencias, configuración y la inicializacion de los componentes
@AllArgsConstructor
@NoArgsConstructor
@ToString

//La clase usuario
public class Usuario {

    //Esta anotación se coloca sobre el campo que actúa como la clave primaria de la entidad en la base de datos
    @Id

    //indica que la generación del valor de la clave primaria se delega a la base de datos
    //y se basa en una columna de identidad (como autoincremento en MySQL) en la tabla de la base de datos
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long Id_usuario;

    // Atributos de la tabla Usuario

    @Column(name = "nombre", length = 45, nullable = false)
    private String nombre;

    @Column(name = "apellido1", length = 45, nullable = false)
    private String apellido1;

    @Column(name = "apellido2", length = 45, nullable = false)
    private String apellido2;

    @Column(name = "correo", length = 20, nullable = false)
    private String correo;

    @Column(name = "contraseña", length = 45, nullable = false)
    private String contraseña;
}
