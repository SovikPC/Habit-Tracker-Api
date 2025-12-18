package ru.habit.v1.api.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ru.habit.v1.api.model.Result;
import ru.habit.v1.api.model.dto.DailyDto;
import ru.habit.v1.api.repository.DailyRepository;
import ru.habit.v1.api.service.DailyService;
import ru.habit.v1.api.util.MapperUtil;

@Service
public class DailyServiceImpl implements DailyService{

    @Autowired
    private DailyRepository repository;

    private MapperUtil map;

    @Override
    public Result<List<DailyDto>> findAllDaily() {
        try{
            return Result.success(map.mapListDailyDto(repository.findAll()));
        }catch(Exception e){
            return Result.error(e.getMessage());
        }
    }

    @Override
    public Optional<DailyDto> findByIdDaily(UUID id) {
        return map.mapOptionalDailyDto(repository.findById(id));
    }

    @Override
    public void createDaily(DailyDto daily) {
        repository.save(map.mapDailyEntity(daily));
    }

    @Override
    public void updateDaily(DailyDto daily) {
        repository.save(map.mapDailyEntity(daily));
    }

    @Override
    public void deleteDaily(DailyDto daily) {
        repository.delete(map.mapDailyEntity(daily));
    }

    
}