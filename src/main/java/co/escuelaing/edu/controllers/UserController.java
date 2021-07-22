package co.escuelaing.edu.controllers;



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
@RequestMapping(value = "/users")
@CrossOrigin(origins = "*")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value="/listUser")
    public ResponseEntity<?> getAllUsers() throws ResvaException {
        try{
            return new ResponseEntity<> (userService.getAllUsers(), HttpStatus.ACCEPTED);
        } catch (ResvaException ex){
            throw new ResvaException(ex.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping(value = "/login")
    public ResponseEntity<?> authenticateUser(@RequestParam String user, @RequestParam String paswword) {
        try {
            return new ResponseEntity<>(userService.authenticateUser(user, paswword), HttpStatus.ACCEPTED);
        } catch (ResvaException ex) {
            return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
        }
    }


}
