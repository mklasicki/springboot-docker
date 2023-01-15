package pl.klasicki.springbootdoker.user;

import java.util.ArrayList;
import java.util.List;


import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
@RequestMapping("/users")
@CrossOrigin
public class UserController {


    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<User>> getAll() {
        List<User> users = userService.getAll();
//          users.add(new User(1221L, "Marcin", "Klasicki"));
//          users.add(new User(1223L, "Rafix", "Klasicki"));
//          users.add(new User(1323L, "Stefix", "Klasicki"));
        return ResponseEntity.ok().body(users);
    }

}
