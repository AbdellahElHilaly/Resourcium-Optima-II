package com.youcode.app.dao.enums.Service;

import com.youcode.app.dao.enums.Entity.AccountStatus;
import com.youcode.utils.db.enums.AccountStatusEnum;

import java.util.List;

public interface AccountStatusService {
    public  void addAccountStatus(AccountStatusEnum status);
    public List<AccountStatus> getAllAccountStatus();


}
