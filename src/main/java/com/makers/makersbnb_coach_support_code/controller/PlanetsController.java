package com.makers.makersbnb_coach_support_code.controller;

import com.makers.makersbnb_coach_support_code.model.Planet;
import com.makers.makersbnb_coach_support_code.repository.PlanetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@RestController
public class PlanetsController {

    @Autowired
    PlanetRepository planetRepository;

    // tell Spring Boot this method handles the 'GET "/"' request
    @GetMapping("/")
    public ModelAndView planetsList() {
        return new ModelAndView("/PlanetsList");
    }

    @GetMapping("/mars")
    public ModelAndView marsInfo() {
        ModelAndView marsInfo = new ModelAndView("/MarsInfo");
        String marsDescription = "The planet Mars is half the size of the Earth.";
        Integer circumference = 21344;
        Planet mars = new Planet(marsDescription, circumference, "Mars");

        marsInfo.addObject("marsDescription", mars.getDescription() );
        marsInfo.addObject("marsCircumference", mars.getCircumference() );
        return marsInfo;
    }

    @GetMapping("/venus")
    public ModelAndView venusInfo() {
        ModelAndView venusInfo = new ModelAndView("/VenusInfo");
        Planet venus = new Planet("And a day on venus is over a year on earth", 10000000, "Venus");
//        planetRepository.save(venus);

        //Planet venusTwo = planetRepository.findByName(venus.getName()).orElseThrow(() -> new RuntimeException("Venus not found"));
        Optional<Planet> venusTwo = planetRepository.findByName(venus.getName());

        if(venusTwo.isPresent()) {
            System.out.println(venusTwo.get().getName());
        }

        return venusInfo;
    }
}
