package ru.habit.v1.api.entity;

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
public class DailyEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String dailyName;
    private String dailyDescription;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "complexityId", unique = true)
    private ComplexityEntity complexity;
    @OneToMany
    @JoinColumn(name = "tagId")
    private TagEntity tag;

    public DailyEntity(UUID id, String dailyName, String dailyDescription, ComplexityEntity complexity, TagEntity tag) {
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

    public ComplexityEntity getComplexity() {
        return complexity;
    }

    public void setComplexity(ComplexityEntity complexity) {
        this.complexity = complexity;
    }

    public TagEntity getTag() {
        return tag;
    }

    public void setTag(TagEntity tag) {
        this.tag = tag;
    }
}