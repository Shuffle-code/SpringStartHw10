package ru.gb.gbrestmart.controller.rest;

import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import ru.gb.gbrestmart.controller.dto.ManufacturerDto;
import ru.gb.gbrestmart.service.ManufacturerApi;
import ru.gb.gbrestmart.service.ManufacturerGateway;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/manufacturer")
public class ManufacturerController {

//    private final ManufacturerGateway manufacturerGateway;
    private final ManufacturerApi manufacturerApi;
    @GetMapping
    public ManufacturerDto create() {
        return manufacturerApi.create(new ManufacturerDto());
    }
}
