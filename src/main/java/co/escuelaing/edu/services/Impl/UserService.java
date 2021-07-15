package co.escuelaing.edu.services.Impl;

import co.escuelaing.edu.entities.User;
import co.escuelaing.edu.persistence.UserPersistence;
import co.escuelaing.edu.services.IUserService;
import co.escuelaing.edu.services.ResvaException;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public class UserService implements IUserService {

    @Override
    public List<User> getUsers() throws ResvaException {
        return UserPersistence.getUsers();


    }
}
