package com.youcode.app.dao.repository;

import com.youcode.app.dao.model.Entity.Enum_Etity.AccountStatus;
import com.youcode.utils.db.dao.JpaRepository;

public class AccountStatusRepository implements JpaRepository<AccountStatus> {
    @Override
    public Class<AccountStatus> getEntityClass() {
        return AccountStatus.class;
    }
}
