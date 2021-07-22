package co.escuelaing.edu.controllers;

import co.escuelaing.edu.services.Impl.FieldService;
import co.escuelaing.edu.services.Impl.UserService;
import co.escuelaing.edu.services.ResvaException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/fields")
@CrossOrigin(origins = "*")
public class FieldController {
    @Autowired
    private FieldService fieldService;

    @GetMapping(value = "/listField")
    public ResponseEntity<?> getAllField() throws ResvaException {
        try {
            return new ResponseEntity<>(fieldService.getAllField(), HttpStatus.ACCEPTED);
        } catch (ResvaException ex) {
            throw new ResvaException(ex.getMessage(), HttpStatus.NOT_FOUND);
        }

    }
}


