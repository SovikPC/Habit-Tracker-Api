package ru.habit.v1.api.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import ru.habit.v1.api.entity.DailyEntity;

public interface DailyRepository extends JpaRepository<DailyEntity, UUID>{}