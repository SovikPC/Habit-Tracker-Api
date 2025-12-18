package ru.habit.v1.api.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ru.habit.v1.api.model.Result;
import ru.habit.v1.api.model.dto.TagDto;
import ru.habit.v1.api.repository.TagRepository;
import ru.habit.v1.api.service.TagService;
import ru.habit.v1.api.util.MapperUtil;

@Service
public class TagServiceImpl implements TagService{

    @Autowired
    private TagRepository repository;

    private MapperUtil map;

    @Override
    public Result<List<TagDto>> findAllTag() {
        try{
            return Result.success(map.mapListTagDto(repository.findAll()));
        }catch(Exception e){
            return Result.error(e.getMessage());
        }
    }

    @Override
    public Optional<TagDto> findByIdTag(UUID id) {
        return map.mapOptionalTagDto(repository.findById(id));
    }

    @Override
    public void createTag(TagDto tag) {
        repository.save(map.mapTagEntity(tag));
    }

    @Override
    public void updateTag(TagDto tag) {
        repository.save(map.mapTagEntity(tag));
    }

    @Override
    public void deleteTag(TagDto tag) {
        repository.delete(map.mapTagEntity(tag));
    }

    
}