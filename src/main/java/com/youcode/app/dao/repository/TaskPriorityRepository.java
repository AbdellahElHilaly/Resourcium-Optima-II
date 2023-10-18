package com.youcode.app.dao.repository;

import com.youcode.app.dao.model.Entity.Enum_Etity.TaskPriority;
import com.youcode.utils.db.dao.JpaRepository;

public class TaskPriorityRepository implements JpaRepository<TaskPriority>{

    @Override
    public Class<TaskPriority> getEntityClass() {
        return TaskPriority.class;
    }
}
