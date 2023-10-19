package com.youcode.app.dao.enums.Entity;

import com.youcode.utils.db.enums.TaskDifficultyEnum;
import jakarta.persistence.*;
import lombok.Getter;

@Entity
public class TaskDifficulty {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Getter
    @Enumerated(EnumType.STRING)
    @Column(unique = true)
    private TaskDifficultyEnum name;

    public TaskDifficulty() {
    }


    public TaskDifficulty(TaskDifficultyEnum difficulty) {
        this.name = difficulty;
    }
}
