package com.youcode.app.dao.repository;

import com.youcode.app.dao.model.Entity.Enum_Etity.TaskDifficulty;
import com.youcode.utils.db.dao.JpaRepository;

public class TaskDifficultyRepository implements JpaRepository<TaskDifficulty> {
    @Override
    public Class<TaskDifficulty> getEntityClass() {
        return TaskDifficulty.class;
    }
}
