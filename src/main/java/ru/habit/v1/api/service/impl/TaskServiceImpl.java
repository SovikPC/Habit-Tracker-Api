package ru.habit.v1.api.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ru.habit.v1.api.model.Result;
import ru.habit.v1.api.model.dto.TaskDto;
import ru.habit.v1.api.repository.TaskRepository;
import ru.habit.v1.api.service.TaskService;
import ru.habit.v1.api.util.MapperUtil;

@Service
public class TaskServiceImpl implements TaskService{

    @Autowired
    private TaskRepository repository;

    private MapperUtil map;

    @Override
    public Result<List<TaskDto>> findAllTask() {
        try{
            return Result.success(map.mapListTaskDto(repository.findAll()));
        }catch(Exception e){
            return Result.error(e.getMessage());
        }
    }

    @Override
    public Optional<TaskDto> findByIdTask(UUID id) {
        return map.mapOptionalTaskDto(repository.findById(id));
    }

    @Override
    public void createTask(TaskDto task) {
        repository.save(map.mapTaskEntity(task));
    }

    @Override
    public void updateTask(TaskDto task) {
        repository.save(map.mapTaskEntity(task));
    }

    @Override
    public void deleteTask(TaskDto task) {
        repository.delete(map.mapTaskEntity(task));
    }

    
}