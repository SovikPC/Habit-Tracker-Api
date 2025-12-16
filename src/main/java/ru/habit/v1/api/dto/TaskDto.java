package ru.habit.v1.api.dto;

import java.util.UUID;

public class TaskDto {

    private UUID id = UUID.randomUUID();
    private String taskName;
    private String taskDescription;
    private ComplexityDto complexity;
    private TagDto tag;

    public TaskDto(UUID id, String taskName, String taskDescription, ComplexityDto complexity, TagDto tag) {
        this.id = id;
        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.complexity = complexity;
        this.tag = tag;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public ComplexityDto getComplexity() {
        return complexity;
    }

    public void setComplexity(ComplexityDto complexity) {
        this.complexity = complexity;
    }

    public TagDto getTag() {
        return tag;
    }

    public void setTag(TagDto tag) {
        this.tag = tag;
    }
}