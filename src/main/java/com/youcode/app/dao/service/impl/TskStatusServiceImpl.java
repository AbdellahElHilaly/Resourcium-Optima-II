package com.youcode.app.dao.service.impl;

import com.youcode.app.dao.model.Entity.Enum_Etity.TskStatus;
import com.youcode.app.dao.model.Enum.TskStatusEnum;
import com.youcode.app.dao.repository.TskStatusRepository;
import com.youcode.app.dao.service.TskStatusService;

import java.util.List;

public class TskStatusServiceImpl implements TskStatusService {
    private final TskStatusRepository tskStatusRepository = new TskStatusRepository();
    @Override
    public void addTskStatus(TskStatusEnum status) {
        tskStatusRepository.save(new TskStatus(status));
    }

    @Override
    public List<TskStatus> getAllTskStatus() {
        return tskStatusRepository.selectAll();
    }
}
