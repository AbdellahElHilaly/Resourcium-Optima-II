package com.youcode.app.dao.enums.Repository;

import com.youcode.app.dao.enums.Entity.TaskStatus;
import com.youcode.utils.db.dao.JpaRepository;

public class TskStatusRepository implements JpaRepository<TaskStatus>{
    @Override
    public Class<TaskStatus> getEntityClass() {
        return TaskStatus.class;
    }
}
