package com.youcode.app.dao.base.model.Entity;


import com.youcode.app.dao.enums.Entity.TaskDifficulty;
import com.youcode.app.dao.enums.Entity.TaskPriority;
import com.youcode.app.dao.enums.Entity.TaskStatus;
import com.youcode.app.dao.enums.Entity.TaskType;
import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    private String name;
    private Boolean isAssigned;
    private String description;
    private Date deadline;

    @ManyToOne
    private Employee assignedBy;
    @OneToMany
    private List<Equipment> equipments;

    @ManyToOne
    private TaskPriority priority;
    @ManyToOne
    private TaskStatus status;
    @ManyToOne
    private TaskType type;
    @ManyToOne
    private TaskDifficulty difficulty;
    @ManyToOne
    private Department department;

}
