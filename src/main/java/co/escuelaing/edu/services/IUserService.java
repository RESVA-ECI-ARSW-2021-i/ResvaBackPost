package co.escuelaing.edu.services;

import co.escuelaing.edu.entities.User;

import java.util.List;

public interface IUserService {

    List<User> getUsers() throws ResvaException;

    @Override
    public String toString();

    @Override
    public boolean equals(Object obj);

    @Override
    public int hashCode();


}
