package com.youcode.app.dao.model.Entity.Enum_Etity;

import com.youcode.app.dao.model.Enum.TskStatusEnum;
import jakarta.persistence.*;

@Entity
public class TskStatus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(unique = true)
    private TskStatusEnum status;


    public TskStatusEnum getStatus() {
        return status;
    }

    public TskStatus(TskStatusEnum role) {
        this.status = role;
    }

    public TskStatus() {

    }
}
