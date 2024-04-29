// Paquete llamado entities
package com.example.solutApi.entities;

//Anotación que se importa
import jakarta.persistence.*;

//Define que esta es una clase es una entidad
@Entity

// La clase Usuario_notificaión
public class Usuario_notificacion {

    //Esta anotación se coloca sobre el campo que actúa como la clave primaria de la entidad en la base de datos
    @Id

    //indica que la generación del valor de la clave primaria se delega a la base de datos
    //y se basa en una columna de identidad (como autoincremento en MySQL) en la tabla de la base de datos
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    // Este código establece relaciones de muchos a uno entre la entidad actual y las entidades Formulario y Alerta en la base de datos

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "Id_usuario",nullable = false)
    private Usuario Id_usuario;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "Id_alerta",nullable = false)
    private Alerta Id_alerta;

    // Atributo de la tabla correo
    @Column(name = "correo", length = 20, nullable = false)
    private String correo;
}

