package com.example.resumewebapp.model;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.Instant;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "resume_items")

public class resumeItem implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String skills;
    private String education;
    private Instant createdAt;
    private Instant updatedAt;

    @Override
    public String toString(){
        return String.format("resumeItem{id = %d, name = %s, skills = %s, education = %s, createdAt = %s, updatedAt = '%s'}",
                              id, name, skills, education, createdAt, updatedAt);
    }
}
