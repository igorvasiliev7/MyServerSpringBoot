package myserver.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class ResponseOrderDTO {
    private List<OrderDTO> orders;
    private long count;
}
