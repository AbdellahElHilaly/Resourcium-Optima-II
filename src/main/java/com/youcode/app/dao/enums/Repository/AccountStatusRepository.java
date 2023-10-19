package com.youcode.app.dao.enums.Repository;

import com.youcode.app.dao.enums.Entity.AccountStatus;
import com.youcode.utils.db.dao.JpaRepository;

public class AccountStatusRepository implements JpaRepository<AccountStatus> {
    @Override
    public Class<AccountStatus> getEntityClass() {
        return AccountStatus.class;
    }
}
