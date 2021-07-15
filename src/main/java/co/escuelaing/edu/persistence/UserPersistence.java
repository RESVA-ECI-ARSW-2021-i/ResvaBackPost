package co.escuelaing.edu.persistence;


import co.escuelaing.edu.entities.User;
import co.escuelaing.edu.persistence.repository.IUserRepository;
import co.escuelaing.edu.services.IUserService;
import co.escuelaing.edu.services.ResvaException;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;@
public class UserPersistence {

    @Autowired
    private IUserRepository usuarioRepository;

    public UserPersistence() {}

    public static List<User> getUsers(){
        return IUserRepository.findAll();
  }

    public List<User> consultarUsuarios() {
        return usuarioRepository.findAll();
    }

    public User autenticarUsuario(String username, String password) throws ResvaException {
        User usuario = usuarioRepository.autenticarUsuario(username, password);
        if (usuario != null) {
            return usuario;
        } else {
            throw new ResvaException("El usuario no existe.");
        }
    }

}
