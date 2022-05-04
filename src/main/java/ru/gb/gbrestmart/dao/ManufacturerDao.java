package ru.gb.gbrestmart.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.gb.gbrestmart.entity.Manufacturer;

import java.util.Optional;

public interface ManufacturerDao extends JpaRepository<Manufacturer, Long> {
    Manufacturer findByNameLike(String name);
    Optional<Manufacturer> findByName(String name);
}
