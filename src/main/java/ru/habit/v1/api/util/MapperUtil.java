package ru.habit.v1.api.util;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import ru.habit.v1.api.dto.ComplexityDto;
import ru.habit.v1.api.dto.DailyDto;
import ru.habit.v1.api.dto.HabitDto;
import ru.habit.v1.api.dto.TagDto;
import ru.habit.v1.api.dto.TaskDto;
import ru.habit.v1.api.entity.ComplexityEntity;
import ru.habit.v1.api.entity.DailyEntity;
import ru.habit.v1.api.entity.HabitEntity;
import ru.habit.v1.api.entity.TagEntity;
import ru.habit.v1.api.entity.TaskEntity;

@Component
public class MapperUtil {

    public ComplexityDto mapComplexityDto(ComplexityEntity entity){
        return new ComplexityDto(
            entity.getId(),
            entity.getComplexityName()
        );
    }

    public TagDto mapTagDto(TagEntity entity){
        return new TagDto(
            entity.getId(),
            entity.getTagName()
        );
    }

    public DailyDto mapDailyDto(DailyEntity entity){
        return new DailyDto(
            entity.getId(),
            entity.getDailyName(),
            entity.getDailyDescription(),
            mapComplexityDto(entity.getComplexity()),
            mapTagDto(entity.getTag())
        );
    }

    public HabitDto mapHabitDto(HabitEntity entity){
        return new HabitDto(
            entity.getId(),
            entity.getHabitName(),
            entity.getHabitDescription(),
            mapComplexityDto(entity.getComplexity()),
            mapTagDto(entity.getTag())
        );
    }

    public TaskDto mapTaskDto(TaskEntity entity){
        return new TaskDto(
            entity.getId(),
            entity.getTaskName(),
            entity.getTaskDescription(),
            mapComplexityDto(entity.getComplexity()),
            mapTagDto(entity.getTag())
        );
    }

    public ComplexityEntity mapComplexityEntity(ComplexityDto dto){
        return new ComplexityEntity(
            dto.getId(),
            dto.getComplexityName()
        );
    }

    public TagEntity mapTagEntity(TagDto dto){
        return new TagEntity(
            dto.getId(),
            dto.getTagName()
        );
    }

    public DailyEntity mapDailyEntity(DailyDto dto){
        return new DailyEntity(
            dto.getId(),
            dto.getDailyName(),
            dto.getDailyDescription(),
            mapComplexityEntity(dto.getComplexity()),
            mapTagEntity(dto.getTag())
        );
    }

    public HabitEntity mapHabitEntity(HabitDto dto){
        return new HabitEntity(
            dto.getId(),
            dto.getHabitName(),
            dto.getHabitDescription(),
            mapComplexityEntity(dto.getComplexity()),
            mapTagEntity(dto.getTag())
        );
    }

    public TaskEntity mapTaskEntity(TaskDto entity){
        return new TaskEntity(
            entity.getId(),
            entity.getTaskName(),
            entity.getTaskDescription(),
            mapComplexityEntity(entity.getComplexity()),
            mapTagEntity(entity.getTag())
        );
    }

    public List<ComplexityDto> mapListComplexityDto(List<ComplexityEntity> list){
        return list.stream().map(this::mapComplexityDto).collect(Collectors.toList());
    }

    public List<TagDto> mapListTagDto(List<TagEntity> list){
        return list.stream().map(this::mapTagDto).collect(Collectors.toList());
    }

    public List<DailyDto> mapListDailyDto(List<DailyEntity> list){
        return list.stream().map(this::mapDailyDto).collect(Collectors.toList());
    }

    public List<HabitDto> mapListHabitDto(List<HabitEntity> list){
        return list.stream().map(this::mapHabitDto).collect(Collectors.toList());
    }

    public List<TaskDto> mapListTaskDto(List<TaskEntity> list){
        return list.stream().map(this::mapTaskDto).collect(Collectors.toList());
    }
}