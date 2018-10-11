package myserver.controller;

import myserver.model.Application;
import myserver.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedList;
import java.util.List;

@RestController
@RequestMapping("api/applications")
public class ApplicationController {
    @Autowired
    private ApplicationService applicationService;

    @GetMapping
    public ResponseEntity<List<Application>> findAll() {
        final List<Application> applications = applicationService.findAll();
        return new ResponseEntity<>(applications, HttpStatus.OK);
    }

    @GetMapping("/findOne/{id}")
    public ResponseEntity<Application> findOne(@PathVariable("id") Long id) {
        System.out.println(id); // GET /api/users/findOne/3
        // GET /api/events/3/attributes
        final Application application = new Application(id,"Viber", 20);
        return new ResponseEntity<>(application, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<List<Application>> save(@RequestBody Application application) {
        List<Application> applications = new LinkedList<>();
        return new ResponseEntity<>(applications, HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<List<Application>> update(@RequestBody Application user) {
        List<Application> applications = new LinkedList<>();
        return new ResponseEntity<>(applications, HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity<List<Application>> delete(@RequestParam Long id) {
        System.out.println(id); // DELETE /api/users?id=3&test=34&hfghsf=rf&mrhgrdj
        List<Application> applications = new LinkedList<>();
        return new ResponseEntity<>(applications, HttpStatus.OK);
    }
}
