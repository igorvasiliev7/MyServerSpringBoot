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
@RequestMapping("/api/users")
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
        // GET /api/users/findOne/3
        // GET /api/events/3/attributes
        final User user = userService.findOne(id);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<User> save(@RequestBody User user) {
        final User savedUser = userService.save(user);
        return new ResponseEntity<>(savedUser, HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<User> update(@RequestBody User user) {
        final User updatedUser = userService.update(user);
        return new ResponseEntity<>(updatedUser, HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity<Boolean> delete(@RequestParam Long id) {
        System.out.println(id); // DELETE /api/users?id=3&test=34&hfghsf=rf&mrhgrdj
        final boolean isDeleted = userService.delete(id);
        return new ResponseEntity<>(isDeleted, HttpStatus.OK);
    }
}
