package com.youcode.app.dao.service.impl;

import com.youcode.app.dao.model.Entity.Enum_Etity.TaskPriority;
import com.youcode.app.dao.model.Enum.TaskPriorityEnum;
import com.youcode.app.dao.repository.TaskPriorityRepository;
import com.youcode.app.dao.service.TaskPriorityService;

import java.util.List;

public class TaskPriorityServiceImpl implements TaskPriorityService {
    private final TaskPriorityRepository taskPriorityRepository = new TaskPriorityRepository();
    @Override
    public void addTaskPriority(TaskPriorityEnum priority) {
        taskPriorityRepository.save(new TaskPriority(priority));
    }

    @Override
    public List<TaskPriority> getAllTaskPriority() {
        return taskPriorityRepository.selectAll();
    }
}
