package ru.gb.serviceOrder;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Component
public class OrderDto {

    @JsonProperty(value = "id")
    private Long orderId;
    private String name;
    private List<Long> products = List.of(2L, 35L, 56L);

}
