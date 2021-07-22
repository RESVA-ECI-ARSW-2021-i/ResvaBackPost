package co.escuelaing.edu.services;

import co.escuelaing.edu.entities.User;

import java.util.List;

public interface IUserService {

    List<User> getAllUsers() throws ResvaException;

    User authenticateUser(String username, String password) throws ResvaException;

    User findUsername(String username) throws ResvaException;

}
