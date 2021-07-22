package co.escuelaing.edu.controllers;


import co.escuelaing.edu.entities.Reservation;
import co.escuelaing.edu.services.Impl.ReservationService;
import co.escuelaing.edu.services.Impl.UserService;
import co.escuelaing.edu.services.ResvaException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/reservation")
@CrossOrigin(origins = "*")
public class ReservationController {

    @Autowired
    private ReservationService reservationService;

    @GetMapping(value="/listReservation")
    public ResponseEntity<?> ReservationConsult() throws ResvaException {
        try{
            return new ResponseEntity<> (reservationService.ReservationConsult(), HttpStatus.ACCEPTED);
        } catch (ResvaException ex){
            throw new ResvaException(ex.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping(value = "/createReservation")
    public synchronized ResponseEntity<?> reservationcreate(@RequestBody Reservation reservation) {
        try {
            reservationService.reservationcreate(reservation);
            return new ResponseEntity<>("Reserva creada satisfactoriamente.", HttpStatus.CREATED);
        } catch (ResvaException ex) {
            return new ResponseEntity<>(ex.getMessage(), HttpStatus.CONFLICT);
        }
    }

    @DeleteMapping("/eliminar")
    public ResponseEntity<?> reservationdelete(@RequestParam Integer id) {
        try {
            reservationService.reservationdelete(id);
            return new ResponseEntity<>("Reserva eliminada satisfactoriamente.", HttpStatus.CREATED);
        } catch (ResvaException ex) {
            return new ResponseEntity<>(ex.getMessage(), HttpStatus.CONFLICT);
        }
    }

}
