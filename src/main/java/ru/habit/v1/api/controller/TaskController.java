package ru.habit.v1.api.controller;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ru.habit.v1.api.model.Result;
import ru.habit.v1.api.model.dto.TaskDto;
import ru.habit.v1.api.service.TaskService;




@RestController
@RequestMapping("v1/task/")
public class TaskController {

    @Autowired
    private TaskService service;

    @GetMapping("all")
    public ResponseEntity<Result<List<TaskDto>>> getAllTask() {
        return new ResponseEntity<>(service.findAllTask(), HttpStatus.OK);
    }

    @GetMapping("{id}")
    public ResponseEntity<Optional<TaskDto>> getByIdTask(@PathVariable("id") UUID id) {
        return new ResponseEntity<>(service.findByIdTask(id), HttpStatus.OK);
    }
    

    @PostMapping("create")
    public ResponseEntity<TaskDto> postTask(@RequestBody TaskDto dto) {
        service.createTask(dto);
        return new ResponseEntity<>(dto, HttpStatus.OK);
    }
    

}
