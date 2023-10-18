package com.youcode.app.dao.model.Entity.Enum_Etity;


import com.youcode.app.dao.model.Enum.EquipmentWokPlaceEnum;
import jakarta.persistence.*;

@Entity
public class EquipmentWokPlace {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(unique = true)
    private EquipmentWokPlaceEnum place;


    public EquipmentWokPlace() {
    }

    public EquipmentWokPlace(EquipmentWokPlaceEnum place) {
        this.place = place;
    }

    public EquipmentWokPlaceEnum getPlace() {
        return place;
    }
}
