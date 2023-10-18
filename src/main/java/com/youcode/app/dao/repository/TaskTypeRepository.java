package com.youcode.app.dao.repository;

import com.youcode.app.dao.model.Entity.Enum_Etity.TaskType;
import com.youcode.utils.db.dao.JpaRepository;

public class TaskTypeRepository implements JpaRepository<TaskType> {
    @Override
    public Class<TaskType> getEntityClass() {
        return TaskType.class;
    }
}
