package com.youcode.app.dao.service.impl;

import com.youcode.app.dao.model.Entity.Enum_Etity.TaskDifficulty;
import com.youcode.app.dao.model.Enum.TaskDifficultyEnum;
import com.youcode.app.dao.repository.TaskDifficultyRepository;
import com.youcode.app.dao.service.TaskDifficultyService;

import java.util.List;

public class TaskDifficultyServiceImpl implements TaskDifficultyService {
    private  final TaskDifficultyRepository taskDifficultyRepository = new TaskDifficultyRepository();
    @Override
    public void addTaskDifficulty(TaskDifficultyEnum difficulty) {
        taskDifficultyRepository.save(new TaskDifficulty(difficulty));
    }

    @Override
    public List<TaskDifficulty> getAllTaskDifficulty() {
        return taskDifficultyRepository.selectAll();
    }
}
