package myserver.service;

import myserver.dto.OrderDTO;
import myserver.dto.ResponseOrderDTO;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface OrderService {

    List<OrderDTO> findByUserId(Long id);

    ResponseOrderDTO findOrders(int page);
}
