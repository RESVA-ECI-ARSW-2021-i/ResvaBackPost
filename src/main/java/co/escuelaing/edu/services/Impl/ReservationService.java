package co.escuelaing.edu.services.Impl;

import co.escuelaing.edu.entities.Reservation;
import co.escuelaing.edu.persistence.ReservationPersistence;
import co.escuelaing.edu.services.IReservationService;
import co.escuelaing.edu.services.ResvaException;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ReservationService implements IReservationService {

    @Autowired
    ReservationPersistence reservationPersistence;

    @Override
    public void reservationcreate(Reservation reservation) throws ResvaException {
        try {
            reservationPersistence.repeatedReservation(reservation.getField(), reservation.getDay(), reservation.getHour(), reservation.getUser());
            reservationPersistence.reservationAdd(reservation);
        } catch (ResvaException ex) {
            throw new ResvaException(ex.getMessage());
        }
    }

    @Override
    public List<Reservation> ReservationConsult() throws ResvaException {
        return reservationPersistence.ReservationConsult();
    }

    @Override
    public void reservationdelete(Integer id) throws ResvaException {
        try {
            reservationPersistence.reservationdelete(id);
        } catch (ResvaException ex) {
            throw new ResvaException(ex.getMessage());
        }


    }
}
