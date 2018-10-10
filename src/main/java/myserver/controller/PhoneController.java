package myserver.controller;

import myserver.model.Phone;
import myserver.service.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedList;
import java.util.List;

@RestController
@RequestMapping("phone")
public class PhoneController {

    @Autowired
    private PhoneService phoneService;

    @GetMapping
    public ResponseEntity<List<Phone>> findAll() {
        final List<Phone> phones = phoneService.findAll();
        return new ResponseEntity<>(phones, HttpStatus.OK);
    }

    @GetMapping("/findOne/{id}")
    public ResponseEntity<Phone> findOne(@PathVariable("id") Long id) {
        System.out.println(id); // GET /api/phones/findOne/3
        // GET /api/events/3/attributes
        final Phone phone = new Phone(id, "Samsung", "Android", 15000);
        return new ResponseEntity<>(phone, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<List<Phone>> save(@RequestBody Phone phone) {
        List<Phone> phones = new LinkedList<>();
        return new ResponseEntity<>(phones, HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<List<Phone>> update(@RequestBody Phone phone) {
        List<Phone> phones = new LinkedList<>();
        return new ResponseEntity<>(phones, HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity<List<Phone>> delete(@RequestParam Long id) {
        System.out.println(id); // DELETE /api/phones?id=3&test=34&hfghsf=rf&mrhgrdj
        List<Phone> phones = new LinkedList<>();
        return new ResponseEntity<>(phones, HttpStatus.OK);
    }
}
