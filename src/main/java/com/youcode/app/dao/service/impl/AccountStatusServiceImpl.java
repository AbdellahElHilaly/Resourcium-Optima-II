package com.youcode.app.dao.service.impl;

import com.youcode.app.dao.model.Entity.Enum_Etity.AccountStatus;
import com.youcode.app.dao.model.Enum.AccountStatusEnum;
import com.youcode.app.dao.repository.AccountStatusRepository;
import com.youcode.app.dao.service.AccountStatusService;

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
