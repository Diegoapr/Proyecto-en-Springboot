//Paquete llamado controller
package com.example.solutApi.controller;

//Anotaciones que se importan
import com.example.solutApi.entities.Usuario;
import com.example.solutApi.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

// Esta anotación para especificar que este es un controlador
@RestController

// Esta anotación para asignar solicitudes web a clases de controlador especificas o métodos de controlador
@RequestMapping(path = "api/v1/usuarios")

public class UsuarioController {

    // Esto sirve para hacer una inyeccion de dependencias al servicio
    @Autowired

    //LLamamos los servicios que se van utilizar
    private UsuarioService usuarioService;

    //Se hace referncia a los metodos HTTP

    // Se obtendra una ista de todos los usuarios almacenados en la base de datos
    @GetMapping
    public List<Usuario> getAll(){
        return usuarioService.getUsuarios();
    }

    // Aqui sirve para obtener un usuario específico de la aplicación mediante un ID
    @GetMapping("/{usuarioId}")
    public Optional<Usuario> getBId(@PathVariable("usuarioId") Long usuarioId){
        return usuarioService.getUsuario(usuarioId);
    }

    //Hace referncia para crear o actualizar un usuario en la aplicación a través de una solicitud POST HTTP.
    @PostMapping
    public void saveUpdate(@RequestBody Usuario usuario){
        usuarioService.saveOrUpdate(usuario);
    }

    //Aqui es para eliminar un usuario específico de la aplicación mediante su ID, a través de una solicitud DELETE HTTP.
    @DeleteMapping("/{usuarioId}")
    public void saveUpdate(@PathVariable("usuarioId") Long usuarioId){
        usuarioService.delete(usuarioId);
    }
}
