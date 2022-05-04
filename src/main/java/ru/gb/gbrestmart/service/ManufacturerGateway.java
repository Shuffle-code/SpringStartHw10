package ru.gb.gbrestmart.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import ru.gb.gbrestmart.controller.dto.ManufacturerDto;

import java.awt.*;

@FeignClient(url = "localhost:45732/manufacturer", value = "manufacturerGateway")
public interface ManufacturerGateway {

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE,
    consumes = MediaType.APPLICATION_JSON_VALUE)
    ManufacturerDto create(@RequestBody ManufacturerDto manufacturerDto);
}
