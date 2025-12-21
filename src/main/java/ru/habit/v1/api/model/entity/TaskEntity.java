package ru.habit.v1.api.model.entity;

import java.util.List;
import java.util.UUID;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity(
    name="Task"
)
public class TaskEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String taskName;
    private String taskDescription;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "complexityId", unique = false)
    private ComplexityEntity complexity;
    // @OneToMany(mappedBy = "tagId", cascade = CascadeType.ALL, orphanRemoval = true)
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "tagId", unique = false)
    private List<TagEntity> tags;

    public TaskEntity(UUID id, String taskName, String taskDescription, ComplexityEntity complexity, List<TagEntity> tags) {
        this.id = id;
        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.complexity = complexity;
        this.tags = tags;
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

    public ComplexityEntity getComplexity() {
        return complexity;
    }

    public void setComplexity(ComplexityEntity complexity) {
        this.complexity = complexity;
    }

    public List<TagEntity> getTag() {
        return tags;
    }

    public void setTag(List<TagEntity> tags) {
        this.tags = tags;
    }
}