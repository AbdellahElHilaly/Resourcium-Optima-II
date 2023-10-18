package com.youcode.app.dao.model.Entity.Enum_Etity;

import com.youcode.app.dao.model.Enum.TaskTypeEnum;
import jakarta.persistence.*;

@Entity
public class TaskType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(unique = true)
    private TaskTypeEnum type;

    public TaskType() {
    }

    public TaskType(TaskTypeEnum type) {
        this.type = type;
    }

    public TaskTypeEnum getType() {
        return type;
    }
}
