package com.joboffer.ws.core;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;

public class JobOfferCreatedEvent {

    private String id;
    private String name;
    private List<String> skills; // Stored as a List of Strings
    private String description;
    private String email;
    private Double salary;

    public JobOfferCreatedEvent() {
    }

    public JobOfferCreatedEvent(String id, String name, List<String> skills, String description, String email, Double salary) {
        this.id = id;
        this.name = name;
        this.skills = skills;
        this.description = description;
        this.email = email;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
