package com.youcode.app.dao.service;

import com.youcode.app.dao.model.Entity.Enum_Etity.AccountStatus;
import com.youcode.app.dao.model.Enum.AccountStatusEnum;

import java.util.List;

public interface AccountStatusService {
    public  void addAccountStatus(AccountStatusEnum status);
    public List<AccountStatus> getAllAccountStatus();


}
