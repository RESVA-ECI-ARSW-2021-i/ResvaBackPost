package co.escuelaing.edu.services;

import co.escuelaing.edu.entities.User;

import java.util.List;

public interface IFieldService {

    List<User> getAllField() throws ResvaException;
}
