package com.youcode.app.dao.service;

import com.youcode.app.dao.model.Entity.Enum_Etity.TaskType;
import com.youcode.app.dao.model.Enum.TaskTypeEnum;

import java.util.List;

public interface TaskTypeService {
    public void addTaskType(TaskTypeEnum type);
    public List<TaskType> getAllTaskType();
}
