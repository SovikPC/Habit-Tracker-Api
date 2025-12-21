package ru.habit.v1.api.controller;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ru.habit.v1.api.model.Result;
import ru.habit.v1.api.model.dto.ComplexityDto;
import ru.habit.v1.api.service.ComplexityService;


@RestController
@RequestMapping("/v1/complexity/")
public class ComplexityController {

    @Autowired
    private ComplexityService service;

    @GetMapping("all")
    public ResponseEntity<Result<List<ComplexityDto>>> getAllComplexity() {
        return new ResponseEntity<>(service.findAllComplexity(), HttpStatus.OK);
    }

    @GetMapping("{id}")
    public ResponseEntity<Optional<ComplexityDto>> getMethodName(@PathVariable("id") UUID id) {
        return new ResponseEntity<>(service.findByIdComplexity(id), HttpStatus.OK);
    }
    
    
}
