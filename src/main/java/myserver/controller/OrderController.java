package myserver.controller;

import myserver.dto.OrderDTO;
import myserver.dto.ResponseOrderDTO;
import myserver.model.User;
import myserver.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/order")
public class OrderController {

    @Autowired
    OrderService orderService;

    @GetMapping("/findAllByUserId/{id}")
    public ResponseEntity<List<OrderDTO>> findInUserId(@PathVariable("id") Long id) {
        final List<OrderDTO> orders = orderService.findByUserId(id);
        return new ResponseEntity<>(orders, HttpStatus.OK);
    }

    @GetMapping("/findAll/{page}")
    public ResponseEntity<ResponseOrderDTO> findOrders(@PathVariable("page") int page) {
        final ResponseOrderDTO orderDTO = orderService.findOrders(page);
        return new ResponseEntity<>(orderDTO, HttpStatus.OK);
    }
}
