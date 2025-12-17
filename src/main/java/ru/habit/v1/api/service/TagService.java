package ru.habit.v1.api.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import ru.habit.v1.api.dto.TagDto;

public interface TagService {

    public List<TagDto> findAllTag();

    public Optional<TagDto> findByIdTag(UUID id);

    public void createTag(TagDto tag);

    public void updateTag(TagDto tag);

    public void deleteTag(TagDto tag);
}