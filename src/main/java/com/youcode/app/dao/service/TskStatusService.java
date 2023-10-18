package com.youcode.app.dao.service;

import com.youcode.app.dao.model.Entity.Enum_Etity.TskStatus;
import com.youcode.app.dao.model.Enum.TskStatusEnum;

import java.util.List;

public interface TskStatusService {
    public void addTskStatus(TskStatusEnum status);
    public List<TskStatus> getAllTskStatus();
}
