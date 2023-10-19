package com.youcode.app.dao.enums.Repository;

import com.youcode.app.dao.enums.Entity.TaskType;
import com.youcode.utils.db.dao.JpaRepository;

public class TaskTypeRepository implements JpaRepository<TaskType> {
    @Override
    public Class<TaskType> getEntityClass() {
        return TaskType.class;
    }
}
