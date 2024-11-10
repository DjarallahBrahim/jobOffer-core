package com.joboffer.ws.core.jpa.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.Random;
import java.util.UUID;

@Entity
@Table(name = "apply_action_history")
@Data
public class ApplyActionHistory implements Serializable {

    private static final long serialVersionUID = new Random().nextLong();

    @Id
    @Column(columnDefinition = "CHAR(36)")
    private String id = UUID.randomUUID().toString();

    @Column(name = "job_offer_id", columnDefinition = "CHAR(36)", nullable = false)
    private String jobOfferId; // Foreign key to JobOffer's ID

    @Column(name = "candidate_id", nullable = false)
    private Long candidateId; // Foreign key to Candidate's ID

    // Optional: Define a relationship to JobOffer if you need it as an entity relationship
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "job_offer_id", referencedColumnName = "id", insertable = false, updatable = false)
    private JobOffer jobOffer;

    // Define a relationship to Candidate entity
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "candidate_id", referencedColumnName = "id", insertable = false, updatable = false)
    private Candidate candidate;
}