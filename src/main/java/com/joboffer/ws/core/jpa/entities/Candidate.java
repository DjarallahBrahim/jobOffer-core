package com.joboffer.ws.core.jpa.entities;


import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.List;
import java.util.Random;

@Entity
@Table(name = "candidate")
@Data
public class Candidate implements Serializable {

    private static final long serialVersionUID = new Random().nextLong();

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String phone;

    @Column(columnDefinition = "json")
    private String skills; // Stored as JSON array

    // Getters and setters
    public List<String> getSkills() {
        try {
            // Convert the JSON string of skills into a List
            ObjectMapper objectMapper = new ObjectMapper();
            return objectMapper.readValue(this.skills, List.class);
        } catch (Exception e) {
            e.printStackTrace();
            return List.of();
        }
    }
}