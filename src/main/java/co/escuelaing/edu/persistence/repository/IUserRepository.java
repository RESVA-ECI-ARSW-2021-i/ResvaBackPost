package co.escuelaing.edu.persistence.repository;


import co.escuelaing.edu.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface IUserRepository extends JpaRepository<User, Integer> {

    @Query("SELECT u FROM User u WHERE u.username =?1 AND u.password = ?2")
    User authenticateUser(String usuario, String password);

    @Query("SELECT u FROM User u WHERE u.username = ?1")
    User findUsername(String username);

}

