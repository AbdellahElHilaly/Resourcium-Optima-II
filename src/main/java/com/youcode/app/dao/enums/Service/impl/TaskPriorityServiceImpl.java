package com.youcode.app.dao.enums.Service.impl;

import com.youcode.app.dao.enums.Entity.TaskPriority;
import com.youcode.app.dao.enums.Repository.TaskPriorityRepository;
import com.youcode.app.dao.enums.Service.TaskPriorityService;
import com.youcode.utils.db.enums.TaskPriorityEnum;

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
