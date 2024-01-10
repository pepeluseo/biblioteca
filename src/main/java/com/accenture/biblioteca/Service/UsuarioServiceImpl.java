package com.accenture.biblioteca.Service;

import com.accenture.biblioteca.Repository.UsuarioRepository;
import com.accenture.biblioteca.models.Usuario;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioServiceImpl implements UsuarioService{

    private final UsuarioRepository usuarioRepository;

    public UsuarioServiceImpl(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public Usuario nuevoUsuario(Usuario nuevoUsuario) {
        Optional<Usuario> usuarioExistente = usuarioRepository.findById(nuevoUsuario.getId());
        if (usuarioExistente.isPresent()){
            // La ID del nuevo usuario ya existe, no se puede crear un usuario con una ID existente.
            // En este caso, se devuelve null
            return null;
        }
            //la ID del nuevo usuario es única y podemos guardarlo.
        return usuarioRepository.save(nuevoUsuario);
    }

    @Override
    public Iterable<Usuario> getAll() {
        return this.usuarioRepository.findAll();
    }

    @Override
    public Usuario usuarioModificado(Usuario usuario) {
        Optional<Usuario> usuarioEncontrado= this.usuarioRepository.findById(usuario.getId());
        if(usuarioEncontrado.isPresent()){
            Usuario usuarioExistente = usuarioEncontrado.get();
            if (!usuarioExistente.getId().equals(usuario.getId())) {
                // El ID del usuario que estás tratando de modificar no coincide con el ID de otro usuario existente.
                // se devuelve null
                return null;
            }

            usuarioExistente.setNombre(usuario.getNombre());
            usuarioExistente.setDireccion(usuario.getDireccion());
            usuarioExistente.setTelefono(usuario.getTelefono());
            usuarioExistente.setEmail(usuario.getEmail());
            return this.usuarioRepository.save(usuarioExistente);
        }
        return null;
    }

    @Override
    public Boolean esUsuarioBorrado(Long id) {
        Optional<Usuario> usuarioOptional = usuarioRepository.findById(id);

        if (usuarioOptional.isPresent()) {
            usuarioRepository.deleteById(id);
            return true;
        } else {
            return false; // Usuario no encontrado, no se realiza la eliminación.
        }
    }

    @Override
    public List<Usuario> obtenerUsuarioPorNombre(String nombre) {
        return usuarioRepository.findAllByNombre(nombre);
    }

    @Override
    public Usuario obtenerUsuarioPorEmailYPassword(String email, String password) {
        return usuarioRepository.findAllByEmailAndPassword(email, password);
    }
}
