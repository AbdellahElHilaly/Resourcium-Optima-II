package com.youcode.app.dao.service;

import com.youcode.app.dao.model.Entity.Enum_Etity.TaskDifficulty;
import com.youcode.app.dao.model.Enum.TaskDifficultyEnum;

import java.util.List;

public interface TaskDifficultyService {
    public void addTaskDifficulty(TaskDifficultyEnum difficulty);
    public List<TaskDifficulty> getAllTaskDifficulty();
}
