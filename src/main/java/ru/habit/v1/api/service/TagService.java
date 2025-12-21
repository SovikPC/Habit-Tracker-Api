package ru.habit.v1.api.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import ru.habit.v1.api.model.Result;
import ru.habit.v1.api.model.dto.TagDto;

public interface TagService {

    public Result<List<TagDto>> findAllTag();

    public Optional<TagDto> findByIdTag(UUID id);

    public void saveTag(TagDto tag);

    public void updateTag(UUID id, TagDto dto);

    public void deleteTag(UUID id);
}