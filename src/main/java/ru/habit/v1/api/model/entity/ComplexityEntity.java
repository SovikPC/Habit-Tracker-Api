package ru.habit.v1.api.model.entity;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.NoArgsConstructor;

@Entity(name = "Complexity")
@NoArgsConstructor
public class ComplexityEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID complexityId;
    private String complexityName;

    public ComplexityEntity(UUID id, String complexityName) {
        this.complexityId = id;
        this.complexityName = complexityName;
    }

    public UUID getId() {
        return complexityId;
    }

    public void setId(UUID id) {
        this.complexityId = id;
    }

    public String getComplexityName() {
        return complexityName;
    }
    
    public void setComplexityName(String complexityName) {
        this.complexityName = complexityName;
    }
}