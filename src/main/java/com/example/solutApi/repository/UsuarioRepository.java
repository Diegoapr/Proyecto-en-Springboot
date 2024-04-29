// Paquete llamado repository
package com.example.solutApi.repository;

//Anatociónes que se importan
import com.example.solutApi.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//Anotación Repository para indicar que este un repositorio
@Repository

// Esta interfaz UsuarioRepository proporciona un conjunto de métodos predefinidos para realizar operaciones
// de persistencia en la base de datos relacionadas con la entidad Usuario, como
// guardar, actualizar, eliminar y buscar usuarios, utilizando Spring Data JPA


public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
