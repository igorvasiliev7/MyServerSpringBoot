package myserver.service.impl;

import myserver.dto.OrderDTO;
import myserver.dto.ResponseOrderDTO;
import myserver.repository.OrderRepository;
import myserver.repository.PhoneRepository;
import myserver.repository.UserRepository;
import myserver.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    private static final int LIMIT = 12;

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public List<OrderDTO> findByUserId(Long id) {
        return orderRepository.findInUserId(id, PageRequest.of(0, LIMIT)).getContent();
    }

    @Override
    public ResponseOrderDTO findOrders(int page) {
        final List<OrderDTO> orders = orderRepository.findOrders(PageRequest.of(page, LIMIT, new Sort(Sort.Direction.DESC, "id"))).getContent();
        final long count = orderRepository.count();
        return new ResponseOrderDTO(orders, count);
    }
}
