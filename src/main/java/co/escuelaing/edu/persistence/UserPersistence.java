package co.escuelaing.edu.persistence;


import co.escuelaing.edu.entities.User;
import co.escuelaing.edu.persistence.repository.IUserRepository;
import co.escuelaing.edu.services.IUserService;
import co.escuelaing.edu.services.ResvaException;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
public class UserPersistence {
    @Autowired
    private IUserRepository usuarioRepository;

    public UserPersistence() {}

    public static List<User> getAllUsers() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public User authenticateUser(String username, String password) throws ResvaException{
        User user = usuarioRepository.authenticateUser(username, password);
        if (user != null) {
            return user;
        } else {
            throw new ResvaException("El usuario no existe.");
        }
    }
    public User findUsername(String username) throws ResvaException{
        User user = usuarioRepository.findUsername(username);
        if (user != null) {
            return user;
        } else {
            throw new ResvaException("User is not exist");
        }
    }

    public IUserRepository getUsuarioRepository() {
        return usuarioRepository;
    }

    public void setUsuarioRepository(IUserRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public UserPersistence(IUserRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

}

