package ru.habit.v1.api.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import ru.habit.v1.api.dto.HabitDto;

public interface HabitService {

    public List<HabitDto> findAllHabit();

    public Optional<HabitDto> findByIdHabit(UUID id);

    public void createHabit(HabitDto habit);

    public void updateHabit(HabitDto habit);

    public void deleteHabit(HabitDto habit);
}