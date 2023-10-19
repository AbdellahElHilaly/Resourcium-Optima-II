package com.youcode.app.dao.enums.Entity;

import com.youcode.utils.db.enums.TaskPriorityEnum;
import jakarta.persistence.*;
import lombok.Getter;

@Entity
public class TaskPriority {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Getter
    @Enumerated(EnumType.STRING)
    @Column(unique = true)
    private TaskPriorityEnum name;



    public TaskPriority() {
    }

    public TaskPriority(TaskPriorityEnum priority) {
        this.name = priority;
    }
}
