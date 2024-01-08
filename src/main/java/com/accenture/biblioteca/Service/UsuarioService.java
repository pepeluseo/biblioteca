package com.accenture.biblioteca.Service;

import com.accenture.biblioteca.models.Usuario;

import java.util.List;

public interface UsuarioService {
     Usuario nuevoUsuario (Usuario nuevoUsuario);
     Iterable<Usuario> getAll();
     Usuario usuarioModificado(Usuario usuario);
     Boolean esUsuarioBorrado(Long id);
     List<Usuario> obtenerUsuarioPorNombre(String nombre);
     Usuario obtenerUsuarioPorEmailYPassword(String email, String password);
}
