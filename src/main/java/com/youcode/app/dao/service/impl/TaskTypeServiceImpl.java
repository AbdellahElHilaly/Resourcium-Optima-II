package com.youcode.app.dao.service.impl;

import com.youcode.app.dao.model.Entity.Enum_Etity.TaskType;
import com.youcode.app.dao.model.Enum.TaskTypeEnum;
import com.youcode.app.dao.repository.TaskTypeRepository;
import com.youcode.app.dao.service.TaskTypeService;

import java.util.List;

public class TaskTypeServiceImpl implements TaskTypeService {
    private  final TaskTypeRepository taskTypeRepository = new TaskTypeRepository();
    @Override
    public void addTaskType(TaskTypeEnum type) {
        taskTypeRepository.save(new TaskType(type));
    }

    @Override
    public List<TaskType> getAllTaskType() {
        return taskTypeRepository.selectAll();
    }
}
