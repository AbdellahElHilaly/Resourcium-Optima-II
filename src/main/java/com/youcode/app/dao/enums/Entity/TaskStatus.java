package com.youcode.app.dao.enums.Entity;

import com.youcode.utils.db.enums.TskStatusEnum;
import jakarta.persistence.*;
import lombok.Getter;

@Entity
public class TaskStatus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Getter
    @Enumerated(EnumType.STRING)
    @Column(unique = true)
    private TskStatusEnum name;


    public TaskStatus(TskStatusEnum role) {
        this.name = role;
    }

    public TaskStatus() {

    }
}
