package com.youcode.app.dao.enums.Repository;

import com.youcode.app.dao.enums.Entity.EmployeeRole;
import com.youcode.utils.db.dao.JpaRepository;

public class EmployeeRoleRepository implements JpaRepository<EmployeeRole> {
    @Override
    public Class<EmployeeRole> getEntityClass() {
        return EmployeeRole.class;
    }

}
