package ru.habit.v1.api.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import ru.habit.v1.api.model.Result;
import ru.habit.v1.api.model.dto.DailyDto;

public interface DailyService {

    public Result<List<DailyDto>> findAllDaily();

    public Optional<DailyDto> findByIdDaily(UUID id);

    public void createDaily(DailyDto daily);

    public void updateDaily(DailyDto daily);

    public void deleteDaily(DailyDto daily);
}