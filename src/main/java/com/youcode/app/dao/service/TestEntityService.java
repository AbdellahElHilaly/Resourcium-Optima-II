package com.youcode.app.dao.service;

import come.youcode.model.Entity.TestEntity;

import java.util.List;

public interface TestEntityService {
    public TestEntity save(TestEntity testEntity);
    public TestEntity update(TestEntity testEntity);
    public TestEntity getById(Long id);
    public void delete(TestEntity testEntity);
    public List<TestEntity> getAll();
}
