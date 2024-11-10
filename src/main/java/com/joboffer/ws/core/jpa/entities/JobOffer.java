package com.joboffer.ws.core.jpa.entities;

import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.List;
import java.util.Random;
import java.util.UUID;

@Entity
@Table(name = "job_offer")
@Data
public class JobOffer implements Serializable {

    private static final long serialVersionUID = new Random().nextLong();

    @Id
    @Column(columnDefinition = "CHAR(36)")
    private String id = UUID.randomUUID().toString();

    private String name;

    @Column(columnDefinition = "json")
    private String skills; // Stored as JSON array

    private String description;

    private String email;

    private Double salary;

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
