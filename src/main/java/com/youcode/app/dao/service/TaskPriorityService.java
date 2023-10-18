package com.youcode.app.dao.service;

import com.youcode.app.dao.model.Entity.Enum_Etity.TaskPriority;
import com.youcode.app.dao.model.Enum.TaskPriorityEnum;

import java.util.List;

public interface TaskPriorityService {
    public void addTaskPriority(TaskPriorityEnum priority);
    public List<TaskPriority> getAllTaskPriority();
}
