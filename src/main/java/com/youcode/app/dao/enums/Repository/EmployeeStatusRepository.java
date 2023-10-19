package com.youcode.app.dao.enums.Repository;

import com.youcode.app.dao.enums.Entity.EmployeeStatus;
import com.youcode.utils.db.dao.JpaRepository;

public class EmployeeStatusRepository implements JpaRepository<EmployeeStatus> {

    @Override
    public Class<EmployeeStatus> getEntityClass() {
        return EmployeeStatus.class;
    }

}
