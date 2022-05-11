package ru.gb.gbrestmart.controller.rest;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import ru.gb.gbrestmart.controller.dto.OrderDto;
import ru.gb.gbrestmart.controller.dto.ProductDto;
import ru.gb.gbrestmart.entity.Product;
import ru.gb.gbrestmart.service.OrderGateway;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/order")
public class OrderController {

    private final OrderGateway orderGateway;
//    private final Product product;

//    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE,
//            consumes = MediaType.APPLICATION_JSON_VALUE)
//    OrderDto create(){
//}

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public OrderDto create() {
        List<Long> productsId = List.of(1L, 34L, 54L);
        System.out.println(productsId);
        return orderGateway.create(productsId);
    }

//    @GetMapping
//    OrderDto create(){
//        List<Long> productsId = List.of(1L, 34L, 54L);
//        return orderGateway.create(productsId);
//    }

    @DeleteMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteOrder() {
        orderGateway.deleteOrder();
    }

    @PutMapping("/add" + "/{productId}")
    @ResponseStatus(HttpStatus.OK)
    public OrderDto addProduct(@PathVariable("productId") Long id) {
        return orderGateway.addProduct(id);
    }

    @PutMapping("/delete" + "/{productId}")
    @ResponseStatus(HttpStatus.OK)
    public OrderDto removeProduct(@PathVariable("productId") Long id) {
        return orderGateway.removeProduct(id);
    }

//    @GetMapping
//    @ResponseStatus(HttpStatus.OK)
//    public OrderDto getOrder() {
//        return orderGateway.getOrder();
//    }

}
