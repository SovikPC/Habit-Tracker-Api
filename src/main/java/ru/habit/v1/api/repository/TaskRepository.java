package ru.habit.v1.api.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import ru.habit.v1.api.model.entity.TaskEntity;

public interface TaskRepository extends JpaRepository<TaskEntity, UUID>{}