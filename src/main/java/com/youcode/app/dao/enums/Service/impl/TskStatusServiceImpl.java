package com.youcode.app.dao.enums.Service.impl;

import com.youcode.app.dao.enums.Entity.TaskStatus;
import com.youcode.app.dao.enums.Repository.TskStatusRepository;
import com.youcode.app.dao.enums.Service.TskStatusService;
import com.youcode.utils.db.enums.TskStatusEnum;

import java.util.List;

public class TskStatusServiceImpl implements TskStatusService {
    private final TskStatusRepository tskStatusRepository = new TskStatusRepository();
    @Override
    public void addTskStatus(TskStatusEnum status) {
        tskStatusRepository.save(new TaskStatus(status));
    }

    @Override
    public List<TaskStatus> getAllTskStatus() {
        return tskStatusRepository.selectAll();
    }
}
