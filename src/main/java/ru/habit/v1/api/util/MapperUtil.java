package ru.habit.v1.api.util;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import ru.habit.v1.api.model.dto.ComplexityDto;
import ru.habit.v1.api.model.dto.DailyDto;
import ru.habit.v1.api.model.dto.HabitDto;
import ru.habit.v1.api.model.dto.TagDto;
import ru.habit.v1.api.model.dto.TaskDto;
import ru.habit.v1.api.model.entity.ComplexityEntity;
import ru.habit.v1.api.model.entity.DailyEntity;
import ru.habit.v1.api.model.entity.HabitEntity;
import ru.habit.v1.api.model.entity.TagEntity;
import ru.habit.v1.api.model.entity.TaskEntity;

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
            mapListTagDto(entity.getTag())
        );
    }

    public HabitDto mapHabitDto(HabitEntity entity){
        return new HabitDto(
            entity.getId(),
            entity.getHabitName(),
            entity.getHabitDescription(),
            mapComplexityDto(entity.getComplexity()),
            mapListTagDto(entity.getTag())
        );
    }

    public TaskDto mapTaskDto(TaskEntity entity){
        return new TaskDto(
            entity.getId(),
            entity.getTaskName(),
            entity.getTaskDescription(),
            mapComplexityDto(entity.getComplexity()),
            mapListTagDto(entity.getTag())
        );
    }

    public Optional<ComplexityDto> mapOptionalComplexityDto(Optional<ComplexityEntity> entity){
        return entity.map(this::mapComplexityDto);
    }

    public Optional<TagDto> mapOptionalTagDto(Optional<TagEntity> entity){
        return entity.map(this::mapTagDto);
    }

    public Optional<DailyDto> mapOptionalDailyDto(Optional<DailyEntity> entity){
        return entity.map(this::mapDailyDto);
    }

    public Optional<TaskDto> mapOptionalTaskDto(Optional<TaskEntity> entity){
        return entity.map(this::mapTaskDto);
    }

    public Optional<HabitDto> mapOptionalHabitDto(Optional<HabitEntity> entity){
        return entity.map(this::mapHabitDto);
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
            mapListTagEntity(dto.getTag())
        );
    }

    public HabitEntity mapHabitEntity(HabitDto dto){
        return new HabitEntity(
            dto.getId(),
            dto.getHabitName(),
            dto.getHabitDescription(),
            mapComplexityEntity(dto.getComplexity()),
            mapListTagEntity(dto.getTag())
        );
    }

    public TaskEntity mapTaskEntity(TaskDto entity){
        return new TaskEntity(
            entity.getId(),
            entity.getTaskName(),
            entity.getTaskDescription(),
            mapComplexityEntity(entity.getComplexity()),
            mapListTagEntity(entity.getTag())
        );
    }

    public List<ComplexityEntity> mapListComplexityEntity(List<ComplexityDto> list){
        return list.stream().map(this::mapComplexityEntity).collect(Collectors.toList());
    }

    public List<TagEntity> mapListTagEntity(List<TagDto> list){
        return list.stream().map(this::mapTagEntity).collect(Collectors.toList());
    }

    public List<DailyEntity> mapListDailyEntity(List<DailyDto> list){
        return list.stream().map(this::mapDailyEntity).collect(Collectors.toList());
    }

    public List<HabitEntity> mapListHabitEntity(List<HabitDto> list){
        return list.stream().map(this::mapHabitEntity).collect(Collectors.toList());
    }

    public List<TaskEntity> mapListTaskEntity(List<TaskDto> list){
        return list.stream().map(this::mapTaskEntity).collect(Collectors.toList());
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