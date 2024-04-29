//Paquete llamado entities
package com.example.solutApi.entities;

//Anotaciones que se importan
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;

//Define que esta es una clase es una entidad
@Entity

//Con la dependencia Lombok podemos hacer los Getters y Setters con esta anotación
@Data

//La clase alerta
public class Alerta {

    //Esta anotación se coloca sobre el campo que actúa como la clave primaria de la entidad en la base de datos
    @Id

    //indica que la generación del valor de la clave primaria se delega a la base de datos
    //y se basa en una columna de identidad (como autoincremento en MySQL) en la tabla de la base de datos
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long Id_alerta;

    // Atribitos de la tabla alerta

    @Column(name = "titulo", length = 45, nullable = false)
    private String titilo;

    @Column(name = "fecha", nullable = false)
    private LocalDate fecha;

    @Column(name = "hora", nullable = false)
    private LocalTime hora;

    @Column(name = "repetir")
    private String repetir;

    @Column (name = "notas", length = 45, nullable = false )
    private String notas;


}
