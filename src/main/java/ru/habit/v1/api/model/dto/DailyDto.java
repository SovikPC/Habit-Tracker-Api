package ru.habit.v1.api.model.dto;

import java.util.List;
import java.util.UUID;

public class DailyDto {

    private UUID id;
    private String dailyName;
    private String dailyDescription;
    private ComplexityDto complexity;
    private List<TagDto> tag;

    public DailyDto(UUID id, String dailyName, String dailyDescription, ComplexityDto complexity, List<TagDto> tag) {
        this.id = id;
        this.dailyName = dailyName;
        this.dailyDescription = dailyDescription;
        this.complexity = complexity;
        this.tag = tag;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getDailyName() {
        return dailyName;
    }

    public void setDailyName(String dailyName) {
        this.dailyName = dailyName;
    }

    public String getDailyDescription() {
        return dailyDescription;
    }

    public void setDailyDescription(String dailyDescription) {
        this.dailyDescription = dailyDescription;
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