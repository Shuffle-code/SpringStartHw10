package ru.gb.gbrestmart.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import ru.gb.gbrestmart.controller.dto.OrderDto;
import ru.gb.gbrestmart.controller.dto.ProductDto;

import java.util.List;

@FeignClient(url = "localhost:45733/order", value = "orderGateway")
public interface OrderGateway {

    @DeleteMapping
    void deleteOrder();

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE,
    consumes = MediaType.APPLICATION_JSON_VALUE)
    OrderDto create(@RequestBody List<Long> productList);

    @PutMapping("/add" + "/{productId}")
    OrderDto addProduct(@PathVariable("productId") Long id);

    @PutMapping("/delete"  + "/{productId}")
    OrderDto removeProduct(@PathVariable("productId") Long id);

//    @GetMapping
//    OrderDto getOrder();

}
