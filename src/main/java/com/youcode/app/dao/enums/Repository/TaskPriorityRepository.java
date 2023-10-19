package com.youcode.app.dao.enums.Repository;

import com.youcode.app.dao.enums.Entity.TaskPriority;
import com.youcode.utils.db.dao.JpaRepository;

public class TaskPriorityRepository implements JpaRepository<TaskPriority>{

    @Override
    public Class<TaskPriority> getEntityClass() {
        return TaskPriority.class;
    }
}
