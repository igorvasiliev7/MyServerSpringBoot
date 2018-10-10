package myserver.controller;

import myserver.model.User;
import myserver.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedList;
import java.util.List;

@RestController
@RequestMapping("users")
public class UserController {

//    @GetMapping - отримання даних
//    @PostMapping - для збереження
//    @PutMapping - для редагування
//    @DeleteMapping - для видалення

    @Autowired
    private UserService userService;

    @GetMapping
    public ResponseEntity<List<User>> findAll() {
        final List<User> users = userService.findAll();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @GetMapping("/findOne/{id}")
    public ResponseEntity<User> findOne(@PathVariable("id") Long id) {
        System.out.println(id); // GET /api/users/findOne/3
        // GET /api/events/3/attributes
        final User user = new User(id, "Ann", "ann@ukr.net");
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<List<User>> save(@RequestBody User user) {
        List<User> users = new LinkedList<>();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<List<User>> update(@RequestBody User user) {
        List<User> users = new LinkedList<>();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity<List<User>> delete(@RequestParam Long id) {
        System.out.println(id); // DELETE /api/users?id=3&test=34&hfghsf=rf&mrhgrdj
        List<User> users = new LinkedList<>();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }
}
