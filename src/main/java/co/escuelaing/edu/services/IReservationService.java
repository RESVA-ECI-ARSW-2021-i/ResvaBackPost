package co.escuelaing.edu.services;

import co.escuelaing.edu.entities.Reservation;

import java.util.List;

public interface IReservationService {

    void reservationcreate(Reservation reservation) throws ResvaException;

    List<Reservation> ReservationConsult() throws ResvaException;

    void reservationdelete(Integer id) throws ResvaException;

}
