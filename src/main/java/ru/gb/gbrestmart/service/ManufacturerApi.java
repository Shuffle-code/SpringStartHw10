package ru.gb.gbrestmart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import ru.gb.gbrestmart.controller.dto.ManufacturerDto;

import java.net.URI;

@Component
public class ManufacturerApi {

    public static final String URL = "http://localhost:45732/manufacturer";

    private final RestTemplate restTemplate;

    @Autowired
    public ManufacturerApi(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    public ManufacturerDto create(ManufacturerDto manufacturerDto) {
        return restTemplate.postForObject(URI.create(URL), manufacturerDto, ManufacturerDto.class);
    }
}
