package co.escuelaing.edu.persistence.repository;

import co.escuelaing.edu.entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface IReservationRepository extends JpaRepository<Reservation, Integer> {

    @Query("SELECT r FROM Reservation r WHERE r.field = ?1 AND r.day = ?2 AND r.hour = ?3 AND r.user=?4")
    Reservation reservationValidate(String field, String day, String hour, String user);
}

