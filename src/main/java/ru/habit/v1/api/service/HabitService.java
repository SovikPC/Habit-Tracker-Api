package ru.habit.v1.api.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import ru.habit.v1.api.model.Result;
import ru.habit.v1.api.model.dto.HabitDto;

public interface HabitService {

    public Result<List<HabitDto>> findAllHabit();

    public Optional<HabitDto> findByIdHabit(UUID id);

    public void createHabit(HabitDto habit);

    public void updateHabit(HabitDto habit);

    public void deleteHabit(HabitDto habit);
}