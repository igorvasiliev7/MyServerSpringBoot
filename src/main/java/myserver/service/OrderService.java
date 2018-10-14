package myserver.service;

import myserver.dto.OrderDTO;

import java.util.List;

public interface OrderService {

    List<OrderDTO> findByUserId(Long id);

    List<OrderDTO> findAll();
}
