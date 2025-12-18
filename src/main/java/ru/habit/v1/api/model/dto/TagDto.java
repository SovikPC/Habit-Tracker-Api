package ru.habit.v1.api.model.dto;

import java.util.UUID;

public class TagDto {
    
    private UUID tagId;
    private String tagName;

    public TagDto(UUID id, String tagName) {
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