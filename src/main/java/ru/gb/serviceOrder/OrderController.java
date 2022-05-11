package ru.gb.serviceOrder;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/order")
public class OrderController {

    private final OrderDto orderDto;

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public OrderDto create(@RequestBody List<Long> productList){

        return OrderDto.builder().orderId(1L).name("user").products(productList).build();
//        return OrderDto.builder().orderId(1L).name("user_user").build();
    }

    @DeleteMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteOrder() {
    }

    @PutMapping("/add" + "/{productId}")
    @ResponseStatus(HttpStatus.OK)
    public OrderDto addProduct(@PathVariable("productId") Long id) {
        orderDto.getProducts().add(id);
        return orderDto;
    }

    @PutMapping("/delete"  + "/{productId}")
    @ResponseStatus(HttpStatus.OK)
    public OrderDto removeProduct(@PathVariable("productId") Long id) {
        orderDto.getProducts().remove(id);
        return orderDto;
    }

//    @GetMapping
//    @ResponseStatus(HttpStatus.OK)
//    public OrderDto getOrderDto() {
//        return orderDto;
//    }

}
