package com.makers.makersbnb_coach_support_code.repository;

import com.makers.makersbnb_coach_support_code.model.Planet;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface PlanetRepository extends CrudRepository<Planet, Long> {
    public Optional<Planet> findByName(String name);
}
