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

@Entity
public class HabitEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String habitName;

    private String habitDescription;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "complexityId", unique = false)
    private ComplexityEntity complexity;
    @OneToMany
    @JoinColumn(name = "tagId", unique = false)
    private List<TagEntity> tag;

    public HabitEntity(UUID id, String habitName, String habitDescription, ComplexityEntity complexity, List<TagEntity> tag) {
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

    public ComplexityEntity getComplexity() {
        return complexity;
    }

    public void setComplexity(ComplexityEntity complexity) {
        this.complexity = complexity;
    }

    public List<TagEntity> getTag() {
        return tag;
    }

    public void setTag(List<TagEntity> tag) {
        this.tag = tag;
    }
}