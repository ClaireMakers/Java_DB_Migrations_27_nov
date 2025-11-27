package com.makers.makersbnb_coach_support_code.controller;

import com.makers.makersbnb_coach_support_code.model.Planet;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class PlanetsController {
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
        Planet mars = new Planet(marsDescription, circumference);

        marsInfo.addObject("marsDescription", mars.getDescription() );
        marsInfo.addObject("marsCircumference", mars.getCircumference() );
        return marsInfo;
    }
}
