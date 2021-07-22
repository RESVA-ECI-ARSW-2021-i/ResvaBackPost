package co.escuelaing.edu.services.Impl;

import co.escuelaing.edu.entities.Field;
import co.escuelaing.edu.entities.User;
import co.escuelaing.edu.persistence.UserPersistence;
import co.escuelaing.edu.services.IFieldService;
import co.escuelaing.edu.services.IUserService;
import co.escuelaing.edu.services.ResvaException;
import net.bytebuddy.description.modifier.FieldPersistence;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class FieldService implements IFieldService {

    @Autowired
    FieldPersistence fieldPersistence;

    public FieldService() {
    }


    @Override
    public List<User> getAllField() throws ResvaException {
        return null;
    }
}

