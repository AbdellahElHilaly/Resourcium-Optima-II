package com.youcode.app.dao.enums.Entity;

import com.youcode.utils.db.enums.EmployeeRolesEnum;
import jakarta.persistence.*;
import lombok.Getter;

@Entity
public class EmployeeRole {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Getter
    @Enumerated(EnumType.STRING)
    @Column(unique = true)
    private EmployeeRolesEnum name;

    public EmployeeRole() {
    }

    public EmployeeRole(EmployeeRolesEnum role) {
        this.name = role;
    }

}
