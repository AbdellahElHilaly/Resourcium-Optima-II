package com.youcode.app.dao.enums.Service.impl;

import com.youcode.app.dao.enums.Repository.AccountStatusRepository;
import com.youcode.app.dao.enums.Service.AccountStatusService;
import com.youcode.app.dao.enums.Entity.AccountStatus;
import com.youcode.utils.db.enums.AccountStatusEnum;

import java.util.List;

public class AccountStatusServiceImpl implements AccountStatusService {
    private final AccountStatusRepository accountStatusRepository = new AccountStatusRepository();
    @Override
    public void addAccountStatus(AccountStatusEnum status) {
        accountStatusRepository.save(new AccountStatus(status));
    }

    @Override
    public List<AccountStatus> getAllAccountStatus() {
        return accountStatusRepository.selectAll();
    }
}
