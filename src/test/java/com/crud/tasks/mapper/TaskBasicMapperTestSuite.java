package com.crud.tasks.mapper;

import com.crud.tasks.domain.Task;
import com.crud.tasks.domain.TaskDto;
import com.crud.tasks.mapper.TaskMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskBasicMapperTestSuite {
    @Autowired
    TaskMapper taskMapper;

    @Test
    public void mapToTaskTest() {
        // Given
        TaskDto taskDto = new TaskDto(1L, "title","content");

        // When
        Task task = taskMapper.mapToTask(taskDto);

        // Then
        assertEquals(new Task(1L,"title","content").getTitle(), task.getTitle());
    }

    @Test
    public void mapToTaskDtoTest() {
        // Given
        Task task = new Task(1L,"title","content");

        // When
        TaskDto taskDto = taskMapper.mapToTaskDto(task);

        // Then
        assertEquals(new TaskDto(1L,"title","content").getTitle(), taskDto.getTitle());

    }

    @Test
    public void mapToTaskDtoListTest() {
        // Given
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task(1L,"title","content"));
        tasks.add(new Task(2L,"title2","content2"));
        tasks.add(new Task(3L,"title3","content3"));



        List<TaskDto> tasksDto = new ArrayList<>();
        tasksDto.add(new TaskDto(1L,"title","content"));
        tasksDto.add(new TaskDto(2L,"title2","content2"));
        tasksDto.add(new TaskDto(3L,"title3","content3"));

        // When
        List<TaskDto> tasksDtoToCompare = taskMapper.mapToTaskDtoList(tasks);

        // Then
        assertEquals(tasksDto.get(1).getTitle(), tasksDtoToCompare.get(1).getTitle());

    }
}
