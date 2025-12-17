package ru.habit.v1.api.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import ru.habit.v1.api.dto.TaskDto;

public interface TaskService {

    public List<TaskDto> findAllTask();

    public Optional<TaskDto> findByIdTask(UUID id);

    public void createTask(TaskDto task);

    public void updateTask(TaskDto task);

    public void deleteTask(TaskDto task);
}