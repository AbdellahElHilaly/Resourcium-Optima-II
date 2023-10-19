package com.youcode.app.dao.enums.Repository;

import com.youcode.app.dao.enums.Entity.TaskDifficulty;
import com.youcode.utils.db.dao.JpaRepository;

public class TaskDifficultyRepository implements JpaRepository<TaskDifficulty> {
    @Override
    public Class<TaskDifficulty> getEntityClass() {
        return TaskDifficulty.class;
    }
}
