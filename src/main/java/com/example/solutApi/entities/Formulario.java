// Paquete llamado entities
package com.example.solutApi.entities;

// Anotaciones que se importan
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.math.BigDecimal;

//Define que esta es una clase es una entidad
@Entity

//Con la dependencia Lombok podemos hacer los Getters y Setters con esta anotación
@Data

//Los constructores para la gestión de depencias, configuración y la inicializacion de los componentes
@AllArgsConstructor
@NoArgsConstructor
@ToString

//La clase Formulario
public class Formulario {

    //Esta anotación se coloca sobre el campo que actúa como la clave primaria de la entidad en la base de datos
    @Id

    //indica que la generación del valor de la clave primaria se delega a la base de datos
    //y se basa en una columna de identidad (como autoincremento en MySQL) en la tabla de la base de datos
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long Id_formulario;

        // Atributos de la tabla Formulario
        @Column(name = "entidad", length = 45, nullable = false)
        private String entidad;

        @Column(name = "tipo", length = 45, nullable = false)
        private String tipo;

        @Column(name = "presupuesto", nullable = false)
        private BigDecimal presupuesto;

        @Column(name = "especificaciones", length = 45, nullable = false)
        private String especificaciones;

        @Column(name = "requerimientos", length = 45, nullable = false)
        private String requerimientos;

        @Column(name = "etapa", length = 45, nullable = false)
        private String etapa;

        @Column(name = "observaciones", length = 45, nullable = false)
        private String observaciones;

        @Column(name = "ubicacion", length = 45, nullable = false)
        private String ubicacion;

        @ManyToOne(fetch = FetchType.EAGER, optional = false)
        @JoinColumn(name = "Id_usuario",nullable = false)
        private Usuario Id_usuario;

}
