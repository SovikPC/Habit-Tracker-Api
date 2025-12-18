package ru.habit.v1.api.model.dto;

import java.util.List;
import java.util.UUID;

public class HabitDto {

    private UUID id;
    private String habitName;
    private String habitDescription;
    private ComplexityDto complexity;
    private List<TagDto> tag;

    public HabitDto(UUID id, String habitName, String habitDescription, ComplexityDto complexity, List<TagDto> tag) {
        this.id = id;
        this.habitName = habitDescription;
        this.habitDescription = habitDescription;
        this.complexity = complexity;
        this.tag = tag;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getHabitName() {
        return habitName;
    }

    public void setHabitName(String habitName) {
        this.habitName = habitName;
    }

    public String getHabitDescription() {
        return habitDescription;
    }

    public void setHabitDescription(String habitDescription) {
        this.habitDescription = habitDescription;
    }

    public ComplexityDto getComplexity() {
        return complexity;
    }

    public void setComplexity(ComplexityDto complexity) {
        this.complexity = complexity;
    }

    public List<TagDto> getTag() {
        return tag;
    }

    public void setTag(List<TagDto> tag) {
        this.tag = tag;
    }
}