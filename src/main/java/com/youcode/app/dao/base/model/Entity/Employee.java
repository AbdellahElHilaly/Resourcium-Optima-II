package com.youcode.app.dao.base.model.Entity;


import com.youcode.app.dao.enums.Entity.AccountStatus;
import com.youcode.app.dao.enums.Entity.EmployeeRole;
import com.youcode.app.dao.enums.Entity.EmployeeStatus;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;



@Data
@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String firstName;
    private String lastName;
    @Column(unique = true)
    private String email;
    private String password;
    private String phone;
    private String image;


    @ManyToOne
    private Department department;
    @ManyToMany
    private List<Task> tasks;

    @ManyToOne
    private EmployeeRole role;
    @ManyToOne
    private EmployeeStatus status;
    @ManyToOne
    private AccountStatus accountStatus;

}
