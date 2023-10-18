package com.youcode.app.dao.model.Entity.Enum_Etity;

import com.youcode.app.dao.model.Enum.AccountStatusEnum;
import jakarta.persistence.*;

@Entity
public class AccountStatus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(unique = true)
    private AccountStatusEnum status;

    public AccountStatus() {
    }

    public AccountStatus(AccountStatusEnum status) {
        this.status = status;
    }

    public AccountStatusEnum getStatus() {
        return status;
    }
}
