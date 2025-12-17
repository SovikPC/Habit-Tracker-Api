package ru.habit.v1.api.controller;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ru.habit.v1.api.dto.DailyDto;
import ru.habit.v1.api.service.DailyService;
import org.springframework.web.bind.annotation.PutMapping;





@RestController
@RequestMapping("v1/daily/")
public class DailyController {

    @Autowired
    private DailyService service;

    @GetMapping("all")
    public ResponseEntity<List<DailyDto>> getAllDaily() {
        return new ResponseEntity<>(service.findAllDaily(), HttpStatus.OK);
    }

    @GetMapping("{id}")
    public ResponseEntity<Optional<DailyDto>> getMethodName(@PathVariable("id") UUID id) {
        return new ResponseEntity<>(service.findByIdDaily(id), HttpStatus.OK);
    }

    @PostMapping("create")
    public ResponseEntity<DailyDto> postMethodName(@RequestBody DailyDto daily) {
        service.createDaily(daily);
        return new ResponseEntity<>(daily, HttpStatus.OK) ;
    }

    // @PutMapping("update/{id}")
    // public String putMethodName(@PathVariable String id, @RequestBody String entity) {
    //     return entity;
    // }
    
    // @DeleteMapping("delete"){

    // }
    
    
}