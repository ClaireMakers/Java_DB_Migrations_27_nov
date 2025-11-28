package com.makers.makersbnb_coach_support_code.model;

import jakarta.persistence.*;

@Entity
@Table(name="planets")
public class Planet {

    @Id
    // the value of id is generated automatically
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;
    private Integer circumference;
    private String name;

    // No argument constructor so that the database management programme can
    // save the data from the db in our programme.
    public Planet() {}

    public Planet(String description, Integer circumference, String name) {
        this.description = description;
        this.circumference = circumference;
        this.name = name;
    }

    public String getDescription() { return this.description; }
    public void setDescription(String description) { this.description = description; }

    public Number getCircumference() { return this.circumference; }
    public void setCircumference(Integer circumference) { this.circumference = circumference; }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
