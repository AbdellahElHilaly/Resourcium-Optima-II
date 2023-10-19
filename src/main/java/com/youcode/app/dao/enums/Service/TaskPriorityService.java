package com.youcode.app.dao.enums.Service;

import com.youcode.app.dao.enums.Entity.TaskPriority;
import com.youcode.utils.db.enums.TaskPriorityEnum;

import java.util.List;

public interface TaskPriorityService {
    public void addTaskPriority(TaskPriorityEnum priority);
    public List<TaskPriority> getAllTaskPriority();
}
