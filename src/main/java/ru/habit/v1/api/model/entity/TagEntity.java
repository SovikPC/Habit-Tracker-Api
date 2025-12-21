package ru.habit.v1.api.model.entity;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.NoArgsConstructor;

@Entity(name = "Tags")
@NoArgsConstructor
public class TagEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID tagId;
    private String tagName;

    public TagEntity(UUID id, String tagName) {
        this.tagId = id;
        this.tagName = tagName;
    }

    public UUID getId() {
        return tagId;
    }

    public void setId(UUID id) {
        this.tagId = id;
    }

    public String getTagName() {
        return tagName;
    }
    
    public void setTagName(String tagName) {
        this.tagName = tagName;
    }
}