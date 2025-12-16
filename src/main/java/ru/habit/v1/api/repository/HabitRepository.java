package ru.habit.v1.api.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import ru.habit.v1.api.entity.HabitEntity;

public interface HabitRepository extends JpaRepository<UUID, HabitEntity>{}