package com.youcode.app.dao.enums.Service.impl;

import com.youcode.app.dao.enums.Entity.TaskType;
import com.youcode.app.dao.enums.Repository.TaskTypeRepository;
import com.youcode.app.dao.enums.Service.TaskTypeService;
import com.youcode.utils.db.enums.TaskTypeEnum;

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
