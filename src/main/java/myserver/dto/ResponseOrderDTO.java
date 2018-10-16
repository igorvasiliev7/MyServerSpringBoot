package myserver.dto;

import java.util.List;

public class ResponseOrderDTO {
    private List<OrderDTO> orders;
    private long count;

    public ResponseOrderDTO(List<OrderDTO> orders, long count) {
        this.orders = orders;
        this.count = count;
    }

    public List<OrderDTO> getOrders() {
        return orders;
    }

    public void setOrders(List<OrderDTO> orders) {
        this.orders = orders;
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }
}
