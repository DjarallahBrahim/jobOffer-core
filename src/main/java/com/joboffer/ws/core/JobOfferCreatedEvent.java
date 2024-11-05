package com.joboffer.ws.core;

import java.math.BigDecimal;

public class JobOfferCreatedEvent {
    private String jobOfferId;
    private String title;
    private String description;
    private Double salary;

    public JobOfferCreatedEvent() {
    }

    public JobOfferCreatedEvent(String jobOfferId, String title, String description, Double salary) {
        this.jobOfferId = jobOfferId;
        this.title = title;
        this.description = description;
        this.salary = salary;
    }

    public String getJobOfferId() {
        return jobOfferId;
    }

    public void setJobOfferId(String jobOfferId) {
        this.jobOfferId = jobOfferId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
