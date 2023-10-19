package com.youcode.app.dao.enums.Entity;

import com.youcode.utils.db.enums.EmployeeStatusEnum;
import jakarta.persistence.*;
import lombok.Getter;


@Entity
public class EmployeeStatus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(unique = true)
    @Getter
    private EmployeeStatusEnum name;

    public EmployeeStatus() {
    }

    public EmployeeStatus(EmployeeStatusEnum status) {
        this.name = status;
    }
}

