package com.youcode.app.dao.base.service;

import com.youcode.app.dao.base.model.Entity.Department;
import com.youcode.app.dao.base.model.Entity.Reservation;

import java.util.List;

public interface DepartmentService {
    public List<Reservation> getAllReservations();
    public Reservation reserveEquipment(Reservation reservation);
    public Department saveDepartment(Department department);
}
