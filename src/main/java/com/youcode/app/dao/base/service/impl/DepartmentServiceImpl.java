package com.youcode.app.dao.base.service.impl;

import com.youcode.app.dao.base.model.Entity.Department;
import com.youcode.app.dao.base.model.Entity.Reservation;
import com.youcode.app.dao.base.repository.DepartmentRepository;
import com.youcode.app.dao.base.service.DepartmentService;
import com.youcode.app.dao.base.service.EquipmentService;
import com.youcode.app.dao.enums.Service.EquipmentPWokPlaceService;
import com.youcode.app.dao.enums.Service.impl.EquipmentPWokPlaceServiceImpl;

import java.util.List;

public class DepartmentServiceImpl implements DepartmentService {
    DepartmentRepository departmentRepository = new DepartmentRepository();
    EquipmentService equipmentService = new EquipmentServiceImpl();
    EquipmentPWokPlaceService equipmentPWokPlaceService = new EquipmentPWokPlaceServiceImpl();
    @Override
    public List<Reservation> getAllReservations() {
        return null;
    }
    @Override
    public Reservation reserveEquipment(Reservation reservation) {
       return null;
    }

    @Override
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }
}
