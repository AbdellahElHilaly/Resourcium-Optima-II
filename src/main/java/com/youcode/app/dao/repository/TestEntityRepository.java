package com.youcode.app.dao.repository;

import com.youcode.app.dao.model.Entity.TestEntity;
import com.youcode.utils.db.dao.JpaRepository;

public class TestEntityRepository implements JpaRepository<TestEntity> {

    @Override
    public Class<TestEntity> getEntityClass() {
        return TestEntity.class;
    }
}
