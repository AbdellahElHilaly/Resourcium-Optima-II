package com.youcode.app.dao.repository;

import com.youcode.app.dao.model.Entity.Enum_Etity.EmployeeRole;
import com.youcode.utils.db.dao.JpaRepository;

public class EmployeeRoleRepository implements JpaRepository<EmployeeRole> {
    @Override
    public Class<EmployeeRole> getEntityClass() {
        return EmployeeRole.class;
    }

}
