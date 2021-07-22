package co.escuelaing.edu.services;


import org.springframework.http.HttpStatus;

public class ResvaException extends Throwable {
    public ResvaException(String message) {
        super (message);
    }

    public ResvaException(String message, HttpStatus httpStatus) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}