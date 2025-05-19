package com.taskify.model;

import jakarta.persistence.*;

@Entity
public class Task {
    @Id @GeneratedValue
    private Long id;
    private String title;
    private String description;
    private String status;
    private String assignedTo;

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getTitle() { return title; }

    public void setTitle(String title) { this.title = title; }

    public String getDescription() { return description; }

    public void setDescription(String description) { this.description = description; }

    public String getStatus() { return status; }

    public void setStatus(String status) { this.status = status; }

    public String getAssignedTo() { return assignedTo; }

    public void setAssignedTo(String assignedTo) { this.assignedTo = assignedTo; }
}
