package com.youcode.app.dao.model.Entity.Enum_Etity;

import com.youcode.app.dao.model.Enum.EmployeeRolesEnum;
import com.youcode.app.dao.model.Enum.TaskPriorityEnum;
import jakarta.persistence.*;

@Entity
public class TaskPriority {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(unique = true)
    private TaskPriorityEnum priority;

    public TaskPriority() {
    }

    public TaskPriorityEnum getPriority() {
        return priority;
    }

    public TaskPriority(TaskPriorityEnum priority) {
        this.priority = priority;
    }
}
