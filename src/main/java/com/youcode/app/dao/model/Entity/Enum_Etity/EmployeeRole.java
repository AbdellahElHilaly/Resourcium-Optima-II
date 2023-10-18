package com.youcode.app.dao.model.Entity.Enum_Etity;

import com.youcode.app.dao.model.Enum.EmployeeRolesEnum;
import jakarta.persistence.*;

@Entity
public class EmployeeRole {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(unique = true)
    private EmployeeRolesEnum role;

    public EmployeeRole() {
    }

    public EmployeeRole(EmployeeRolesEnum role) {
        this.role = role;
    }

    public EmployeeRolesEnum getRole() {
        return role;
    }
}
