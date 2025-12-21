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
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ru.habit.v1.api.model.Result;
import ru.habit.v1.api.model.dto.TagDto;
import ru.habit.v1.api.service.TagService;




@RestController
@RequestMapping("v1/tag/")
public class TagController {

    @Autowired
    private TagService service;

    @GetMapping("all")
    public ResponseEntity<Result<List<TagDto>>> getAllTags() {
        try{
            return new ResponseEntity<>(service.findAllTag(), HttpStatus.OK);
        }catch(Exception e){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
    
    @GetMapping("{id}")
    public ResponseEntity<Optional<TagDto>> getByIdTag(@PathVariable("id") UUID id) {
        return new ResponseEntity<>(service.findByIdTag(id), HttpStatus.OK);
    }

    @PostMapping("create")
    public ResponseEntity<Void> postTag(@RequestBody TagDto dto) {
        service.saveTag(dto);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> putTag(@PathVariable UUID id, @RequestBody TagDto dto) {
        service.updateTag(id, dto);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTag(@PathVariable UUID id) {
        service.deleteTag(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}