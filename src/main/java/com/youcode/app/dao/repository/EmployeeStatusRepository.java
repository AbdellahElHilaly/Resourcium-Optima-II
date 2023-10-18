package com.youcode.app.dao.repository;

import com.youcode.app.dao.model.Entity.Enum_Etity.EmployeeStatus;
import com.youcode.utils.db.dao.JpaRepository;

public class EmployeeStatusRepository implements JpaRepository<EmployeeStatus> {

    @Override
    public Class<EmployeeStatus> getEntityClass() {
        return EmployeeStatus.class;
    }

}
