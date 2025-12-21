package ru.habit.v1.api.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import ru.habit.v1.api.model.Result;
import ru.habit.v1.api.model.dto.ComplexityDto;

public interface ComplexityService{

    public Result<List<ComplexityDto>> findAllComplexity();

    public Optional<ComplexityDto> findByIdComplexity(UUID id);
    
}
