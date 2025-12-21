package ru.habit.v1.api.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ru.habit.v1.api.model.Result;
import ru.habit.v1.api.model.dto.ComplexityDto;
import ru.habit.v1.api.repository.ComplexityRepository;
import ru.habit.v1.api.service.ComplexityService;
import ru.habit.v1.api.util.MapperUtil;

@Service
public class ComplexityServiceImpl implements ComplexityService{

    @Autowired
    private ComplexityRepository repository;
    @Autowired
    private MapperUtil map;

    @Override
    public Result<List<ComplexityDto>> findAllComplexity() {
        try{
            return Result.success(map.mapListComplexityDto(repository.findAll()));
        }catch(Exception e){
            return Result.error(e.getMessage());
        }
    }

    @Override
    public Optional<ComplexityDto> findByIdComplexity(UUID id) {
        return map.mapOptionalComplexityDto(repository.findById(id));        
    }
    
}
