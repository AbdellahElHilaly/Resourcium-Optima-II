package com.youcode.app.dao.model.Entity.Enum_Etity;

import com.youcode.app.dao.model.Enum.EmployeeStatusEnum;
import jakarta.persistence.*;


@Entity
public class EmployeeStatus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(unique = true)
    private EmployeeStatusEnum status;

    public EmployeeStatus() {
    }

    public EmployeeStatus(EmployeeStatusEnum status) {
        this.status = status;
    }

    public EmployeeStatusEnum getStatus() {
        return status;
    }
}

