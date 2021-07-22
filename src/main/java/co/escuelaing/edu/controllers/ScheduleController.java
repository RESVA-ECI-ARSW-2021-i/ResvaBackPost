package co.escuelaing.edu.controllers;


import co.escuelaing.edu.services.Impl.FieldService;
import co.escuelaing.edu.services.Impl.ScheduleService;
import co.escuelaing.edu.services.ResvaException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/schedule")
@CrossOrigin(origins = "*")

public class ScheduleController {

    @Autowired
    private ScheduleService scheduleService;

    @GetMapping(value = "/listSchedule")
    public ResponseEntity<?> getAllSchedule() throws ResvaException {
        try {
            return new ResponseEntity<>(scheduleService.getAllSchedule(), HttpStatus.ACCEPTED);
        } catch (ResvaException ex) {
            throw new ResvaException(ex.getMessage(), HttpStatus.NOT_FOUND);
        }

    }

}
