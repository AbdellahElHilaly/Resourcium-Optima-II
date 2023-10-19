package com.youcode.app.dao.enums.Entity;

import com.youcode.utils.db.enums.TaskTypeEnum;
import jakarta.persistence.*;
import lombok.Getter;

@Entity
public class TaskType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Getter
    @Enumerated(EnumType.STRING)
    @Column(unique = true)
    private TaskTypeEnum name;

    public TaskType() {
    }

    public TaskType(TaskTypeEnum type) {
        this.name = type;
    }

}
