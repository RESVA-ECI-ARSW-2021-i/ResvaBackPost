package co.escuelaing.edu.services.Impl;

import co.escuelaing.edu.entities.User;
import co.escuelaing.edu.persistence.UserPersistence;
import co.escuelaing.edu.services.IUserService;
import co.escuelaing.edu.services.ResvaException;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public class UserService implements IUserService {
    @Autowired
    UserPersistence userPersistence;
    public UserService() {
    }

    @Override
    public List<User> getAllUsers() throws ResvaException {
        return UserPersistence.getAllUsers();


    }

    @Override
    public User authenticateUser(String username, String password) throws ResvaException {
        try {
            return userPersistence.authenticateUser(username, password);
        } catch (ResvaException ex) {
            throw new ResvaException(ex.getMessage());
        }
    }

    @Override
    public User findUsername(String username) throws ResvaException {
        try {
            return userPersistence.findUsername(username);
        } catch (ResvaException ex) {
            throw new ResvaException(ex.getMessage());
        }
    }

}
