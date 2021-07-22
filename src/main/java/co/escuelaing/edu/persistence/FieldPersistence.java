package co.escuelaing.edu.persistence;


import co.escuelaing.edu.entities.Field;
import co.escuelaing.edu.persistence.repository.IFieldRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

public class FieldPersistence {

    @Autowired
    private IFieldRepository fieldRepository;

    public FieldPersistence() {}

    public static List<Field> getAllField() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    public IFieldRepository getFieldRepository() {
        return fieldRepository;
    }

    public void setfieldRepository(IFieldRepository fieldRepository) {
        this.fieldRepository = fieldRepository;
    }

    public FieldPersistence(IFieldRepository fieldRepository) {
        this.fieldRepository = fieldRepository;
    }

}


