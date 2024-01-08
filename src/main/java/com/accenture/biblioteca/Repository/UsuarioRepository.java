package com.accenture.biblioteca.Repository;

import com.accenture.biblioteca.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
     List<Usuario> findAllByNombre(String nombre);
     Usuario findAllByEmailAndPassword(String email, String password);
}
