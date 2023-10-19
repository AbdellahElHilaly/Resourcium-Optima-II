package com.youcode.app.dao.enums.Entity;

import com.youcode.utils.db.enums.AccountStatusEnum;
import jakarta.persistence.*;
import lombok.Getter;

@Entity
public class AccountStatus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Getter
    @Enumerated(EnumType.STRING)
    @Column(unique = true)
    private AccountStatusEnum name;

    public AccountStatus() {
    }

    public AccountStatus(AccountStatusEnum status) {
        this.name = status;
    }

}
