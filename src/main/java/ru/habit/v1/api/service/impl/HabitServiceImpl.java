package ru.habit.v1.api.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ru.habit.v1.api.model.Result;
import ru.habit.v1.api.model.dto.HabitDto;
import ru.habit.v1.api.repository.HabitRepository;
import ru.habit.v1.api.service.HabitService;
import ru.habit.v1.api.util.MapperUtil;

@Service
public class HabitServiceImpl implements HabitService{

    @Autowired
    private HabitRepository repository;

    private MapperUtil map;

    @Override
    public Result<List<HabitDto>> findAllHabit() {
        try{
            return Result.success(map.mapListHabitDto(repository.findAll()));
        }catch(Exception e){
            return Result.error(e.getMessage());
        }
    }

    @Override
    public Optional<HabitDto> findByIdHabit(UUID id) {
        return map.mapOptionalHabitDto(repository.findById(id));
    }

    @Override
    public void createHabit(HabitDto habit) {
        repository.save(map.mapHabitEntity(habit));
    }

    @Override
    public void updateHabit(HabitDto habit) {
        repository.save(map.mapHabitEntity(habit));
    }

    @Override
    public void deleteHabit(HabitDto habit) {
        repository.delete(map.mapHabitEntity(habit));
    }

    
}