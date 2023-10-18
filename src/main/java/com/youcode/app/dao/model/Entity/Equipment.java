package com.youcode.app.dao.model.Entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Equipment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    @Column(unique = true)
    private String name;

    private Date purchaseDate;
    private Date serviceStartDate;
    private String code;




}
