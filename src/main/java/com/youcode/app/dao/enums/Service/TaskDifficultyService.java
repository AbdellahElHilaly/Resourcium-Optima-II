package com.youcode.app.dao.enums.Service;

import com.youcode.app.dao.enums.Entity.TaskDifficulty;
import com.youcode.utils.db.enums.TaskDifficultyEnum;

import java.util.List;

public interface TaskDifficultyService {
    public void addTaskDifficulty(TaskDifficultyEnum difficulty);
    public List<TaskDifficulty> getAllTaskDifficulty();
}
