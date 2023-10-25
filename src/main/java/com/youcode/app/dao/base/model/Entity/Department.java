package com.youcode.app.dao.base.model.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    @Column(unique = true)
    private String name;
    private Integer totalPlaces;
    private Integer equipmentNumber;

    @OneToOne
    private Employee headOfDepartment;

    @OneToMany
    private List<Reservation> reservations;


}

