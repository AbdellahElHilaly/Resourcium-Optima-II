package com.youcode.app.dao.model.Entity.Enum_Etity;

import com.youcode.app.dao.model.Enum.TaskDifficultyEnum;
import jakarta.persistence.*;

@Entity
public class TaskDifficulty {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(unique = true)
    private TaskDifficultyEnum difficulty;

    public TaskDifficulty() {
    }


    public TaskDifficultyEnum getDifficulty() {
        return difficulty;
    }


    public TaskDifficulty(TaskDifficultyEnum difficulty) {
        this.difficulty = difficulty;
    }
}
