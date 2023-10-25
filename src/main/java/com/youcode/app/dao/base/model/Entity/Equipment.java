package com.youcode.app.dao.base.model.Entity;

import com.youcode.app.dao.enums.Entity.EquipmentHealth;
import com.youcode.app.dao.enums.Entity.EquipmentStatus;
import com.youcode.app.dao.enums.Entity.EquipmentWokPlace;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Equipment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    private String name;

    private Date purchaseDate;
    private Date serviceStartDate;

    @Column(unique = true)
    private String code;
    private Integer quantity;

    @ManyToOne
    private EquipmentWokPlace wokPlace;
    @ManyToOne
    private EquipmentHealth health;
    @ManyToOne
    private EquipmentStatus status;



}
