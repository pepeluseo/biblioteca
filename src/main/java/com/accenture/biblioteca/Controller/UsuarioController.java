package com.accenture.biblioteca.Controller;

import com.accenture.biblioteca.Service.UsuarioService;
import com.accenture.biblioteca.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/usuario")
public class UsuarioController{
    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/nuevo")
    public Usuario nuevoUsuario(@RequestBody Usuario nuevoUsuario){
        return this.usuarioService.nuevoUsuario(nuevoUsuario);
    }
    @GetMapping("/mostrar")
    public Iterable<Usuario> getAll(){
        return usuarioService.getAll();
    }
    @PutMapping("/update")
    public Usuario usuarioModificado(@RequestBody Usuario usuario){
        return this.usuarioService.usuarioModificado(usuario);
    }
    @DeleteMapping(value = "/{id}")
    public Boolean esUsuarioBorrado(@PathVariable(value = "id") Long id){
        return this.usuarioService.esUsuarioBorrado(id);
    }
}
