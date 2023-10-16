package com.youcode.app.dao.service.impl;

import come.youcode.model.Entity.TestEntity;
import come.youcode.repository.TestEntityRepository;
import come.youcode.service.TestEntityService;

import java.util.List;

public class TestEntityServiceImpl implements TestEntityService {

    private final TestEntityRepository testEntityRepository = new TestEntityRepository();
    @Override
    public TestEntity save(TestEntity testEntity) {
        return testEntityRepository.save(testEntity);
    }

    @Override
    public TestEntity update(TestEntity testEntity) {
        return testEntityRepository.update(testEntity);
    }

    @Override
    public TestEntity getById(Long id) {
        return testEntityRepository.getById(id);
    }

    @Override
    public void delete(TestEntity testEntity) {
        testEntityRepository.delete(testEntity);
    }

    @Override
    public List<TestEntity> getAll() {
        return testEntityRepository.getAll();
    }
}
