package com.youcode.app.dao.model.Entity;


import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    private String name;
    private Boolean isAssigned;
    private String description;
    private Date deadline;

}
