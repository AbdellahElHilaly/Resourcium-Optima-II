package com.youcode.app.dao.enums.Service;

import com.youcode.app.dao.enums.Entity.TaskType;
import com.youcode.utils.db.enums.TaskTypeEnum;

import java.util.List;

public interface TaskTypeService {
    public void addTaskType(TaskTypeEnum type);
    public List<TaskType> getAllTaskType();
}
