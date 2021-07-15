package co.escuelaing.edu.controllers;



import co.escuelaing.edu.entities.User;
import co.escuelaing.edu.services.Impl.UserService;
import co.escuelaing.edu.services.ResvaException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/users")
@CrossOrigin(origins = "*")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value="/listUsers")
    public ResponseEntity<?> getUsers(){
        return new ResponseEntity<> (UserService.getUsers(), HttpStatus.ACCEPTED)
    }

    @GetMapping(value = "/login")
    public ResponseEntity<?> autenticarUsuario(@RequestParam String usr, @RequestParam String pwd) {
        try {
            return new ResponseEntity<>(userService.autenticarUsuario(usr, pwd), HttpStatus.ACCEPTED);
        } catch (ResvaException ex) {
            return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
        }
    }



}
