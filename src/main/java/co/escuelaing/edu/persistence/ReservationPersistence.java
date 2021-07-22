package co.escuelaing.edu.persistence;

import co.escuelaing.edu.entities.Reservation;
import co.escuelaing.edu.persistence.repository.IReservationRepository;
import co.escuelaing.edu.services.ResvaException;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ReservationPersistence {

    @Autowired
    private IReservationRepository reservationRepository;

    public void reservationAdd(Reservation reservation) throws ResvaException {
        reservationRepository.save(reservation);
    }

    public List<Reservation> ReservationConsult() {
        return reservationRepository.findAll();
    }

    public void reservationdelete(Integer id) throws ResvaException {
        reservationRepository.deleteById(id);
    }

    public void repeatedReservation(String field, String day, String hour, String user) throws ResvaException {
        if(reservationRepository.reservationValidate(field, day, hour,user) != null) {
            throw new ResvaException("Error: ya está reservada la cancha.");
        }

    }
}

