//Paquete llamado usuario
package com.example.solutApi.service;

//Anotaciones que se importan
import com.example.solutApi.entities.Usuario;
import com.example.solutApi.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

//Anotación para inidcar que este es un servicio
@Service

//La clase UsuarioService
public class UsuarioService {

    //Anotación para hacer una inyección y llamar al repositortio UsuarioRepository
    @Autowired
    UsuarioRepository usuarioRepository;


    // Aqui se van a crear los servicios

    // Aqui se va a devolver una lista de usuarios
    public List<Usuario> getUsuarios(){
        return usuarioRepository.findAll();
    }

    //Aqui busca un usuario en la base de datos utilizando el ID proporcionado como parámetro y devuelve un Optional
    // que puede contener el usuario si se encuentra, o estará vacío si no se encuentra ningún usuario con el ID especificado
    public Optional<Usuario> getUsuario(Long id){
            return usuarioRepository.findById(id);
    }

    // Aqui se va hacer el método guardar y actualizar
    public void saveOrUpdate(Usuario usuario){
        usuarioRepository.save(usuario);
    }

    //Aqui se va hacer el metodo eliminar
    public void delete(Long id){
        usuarioRepository.deleteById(id);
    }
}
