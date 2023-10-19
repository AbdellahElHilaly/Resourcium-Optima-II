package com.youcode.app.dao.enums.Entity;


import com.youcode.utils.db.enums.EquipmentWokPlaceEnum;
import jakarta.persistence.*;
import lombok.Getter;

@Entity
public class EquipmentWokPlace {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Getter
    @Enumerated(EnumType.STRING)
    @Column(unique = true)
    private EquipmentWokPlaceEnum name;


    public EquipmentWokPlace() {
    }

    public EquipmentWokPlace(EquipmentWokPlaceEnum place) {
        this.name = place;
    }

}
