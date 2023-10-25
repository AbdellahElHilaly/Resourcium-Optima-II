package com.youcode.app.dao.base.repository;

import com.youcode.app.dao.base.model.Entity.Department;
import com.youcode.utils.db.dao.JpaRepository;

public class DepartmentRepository implements JpaRepository<Department> {
    @Override
    public Class<Department> getEntityClass() {
        return Department.class;
    }
}
