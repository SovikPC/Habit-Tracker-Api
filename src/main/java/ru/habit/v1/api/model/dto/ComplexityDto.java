package ru.habit.v1.api.model.dto;

import java.util.UUID;

public class ComplexityDto {
    
    private UUID complexityId;
    private String complexityName;

    public ComplexityDto(UUID id, String complexityName) {
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