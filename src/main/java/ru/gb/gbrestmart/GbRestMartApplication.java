package ru.gb.gbrestmart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import ru.gb.gbrestmart.dao.ManufacturerDao;
import ru.gb.gbrestmart.dao.ProductDao;
import ru.gb.gbrestmart.entity.Manufacturer;
import ru.gb.gbrestmart.entity.Product;
import ru.gb.gbrestmart.service.ProductService;

import java.util.HashSet;

@SpringBootApplication
public class GbRestMartApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(GbRestMartApplication.class, args);
//        context.getBean(ProductService.class).init();
    }

}
