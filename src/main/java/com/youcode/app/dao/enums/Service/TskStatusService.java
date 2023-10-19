package com.youcode.app.dao.enums.Service;

import com.youcode.app.dao.enums.Entity.TaskStatus;
import com.youcode.utils.db.enums.TskStatusEnum;

import java.util.List;

public interface TskStatusService {
    public void addTskStatus(TskStatusEnum status);
    public List<TaskStatus> getAllTskStatus();
}
