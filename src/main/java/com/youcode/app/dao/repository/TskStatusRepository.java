package com.youcode.app.dao.repository;

import com.youcode.app.dao.model.Entity.Enum_Etity.TskStatus;
import com.youcode.utils.db.dao.JpaRepository;

public class TskStatusRepository implements JpaRepository<TskStatus>{
    @Override
    public Class<TskStatus> getEntityClass() {
        return TskStatus.class;
    }
}
