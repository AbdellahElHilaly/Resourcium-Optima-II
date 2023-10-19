package com.youcode.app.dao.enums.Service.impl;

import com.youcode.app.dao.enums.Entity.TaskDifficulty;
import com.youcode.utils.db.enums.TaskDifficultyEnum;
import com.youcode.app.dao.enums.Repository.TaskDifficultyRepository;
import com.youcode.app.dao.enums.Service.TaskDifficultyService;

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
