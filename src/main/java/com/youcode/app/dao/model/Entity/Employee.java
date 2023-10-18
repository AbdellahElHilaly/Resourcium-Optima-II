package com.youcode.app.dao.model.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;


    private  String name;
    private  String email;
    private  String password;
    private  String phone;
    private String image;


//    @OneToOne
//    private EmployeeRole role;
//    private Department department;
//    private EmployeeStatus status;
//    private AccountStatus accountStatus;

}
